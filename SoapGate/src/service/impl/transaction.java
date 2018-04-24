package service.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;



public class transaction {
	long stan;
	String transactionDate;
	String rrn;
	String authorisationId;
	long processingCode;
	long amount;
	
	private static String SQL_INSERT = "INSERT INTO data(STAN,TRANSACTIONDATE,RRN,AUTHORISATIONID,PROCESSINGCODE,AMOUNT) values(?,?,?,?,?,?)";
	private static String SQL_SELECT = "SELECT STAN,TRANSACTIONDATE,RRN,AUTHORISATIONID,PROCESSINGCODE,AMOUNT FROM data WHERE id=?";
	private static String SQL_COUNT = "SELECT count(*) FROM data";
	
	public boolean load(long id){
		boolean result=false;
		stan=0;
		transactionDate="";
		rrn="";
		authorisationId="";
		amount=0;
		
		Context ctx = null;
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:jboss/datasources/ReverseDS");
			con = ds.getConnection();
			stmt = con.prepareStatement(SQL_SELECT);
			stmt.setLong(1, id);
			rs=stmt.executeQuery();
			if (rs.next()) {
				stan=rs.getLong(1);
				transactionDate=rs.getString(2);
				rrn=rs.getString(3);
				authorisationId=rs.getString(4);
				processingCode=rs.getLong(5);
				amount=rs.getLong(6);
				result=true;
			}
			else{
				throw new SQLException("Transaction with ID="+id+" not found");
			}
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
				ctx.close();
			} catch (SQLException | NamingException e) {
				System.out.println("Exception in closing Context");
			}
		}
		
		return result;
	}
	
	public long save(){
		long newID=-1;
		
		Context ctx = null;
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:jboss/datasources/ReverseDS");
			con = ds.getConnection();
			stmt = con.prepareStatement(SQL_INSERT,Statement.RETURN_GENERATED_KEYS);
			//stmt = con.prepareStatement(SQL_INSERT,new String[] { "ID" });
			stmt.setLong(1, stan);
			stmt.setString(2, transactionDate);
			stmt.setString(3, rrn);
			stmt.setString(4, authorisationId);
			stmt.setLong(5, processingCode);
			stmt.setLong(6, amount);
			
			int affectedRows = stmt.executeUpdate();

	        if (affectedRows == 0) {
	            throw new SQLException("Creating user failed, no rows affected.");
	        }

	        try (ResultSet rs = stmt.getGeneratedKeys()) {
	            if (rs.next()) {
	            	newID=rs.getLong(1);
	            }
	            else {
	                throw new SQLException("Creating user failed, no ID obtained.");
	            }
	        }
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
				ctx.close();
			} catch (SQLException | NamingException e) {
				System.out.println("Exception in closing Context");
			}
		}
		return newID;
	}
	
	public static long count(){
		
		long count=-1;
		
		Context ctx = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:jboss/datasources/ReverseDS");
			con = ds.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL_COUNT);
			while (rs.next()) {
				count = Integer.valueOf(rs.getString(1));
			}
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
				ctx.close();
			} catch (SQLException | NamingException e) {
				System.out.println("Exception in closing Context");
			}
		}
		return count;
	}
	
	public long getStan() {
		return stan;
	}
	public void setStan(long stan) {
		this.stan = stan;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
	public String getAuthorisationId() {
		return authorisationId;
	}
	public void setAuthorisationId(String authorisationId) {
		this.authorisationId = authorisationId;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getProcessingCode() {
		return processingCode;
	}

	public void setProcessingCode(long processingCode) {
		this.processingCode = processingCode;
	}
	
	
}

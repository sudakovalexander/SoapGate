package service.impl;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import payment.*; 

/*
import ctxdbo.CTXDBO;
import ctxdbo.CTXDBOPortType;
import ctxdbo.Rate;
*/

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        //String path=this.getServletContext().getRealPath()
        //System.out.println("HelloServlet create");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet begin");
		//String path=this.getServletContext().getRealPath("");
		//System.out.println(path);
		
		response.setCharacterEncoding("UTF-8");
		
		/*
        OpServiceService service1 = new OpServiceService();
        //System.out.println("Create Web Service...");
        OpService port1 = service1.getOpServicePort();
        String sresp;
        sresp=Double.toString(port1.getMult(2,3));
        response.getWriter().append("2*3 = ").append(sresp).append("\n");
        sresp=Double.toString(port1.getSum(2,3));
        response.getWriter().append("2+3 = ").append(sresp).append("\n");
        sresp=Double.toString(port1.getDiv(2,3));
        response.getWriter().append("2/3 = ").append(sresp).append("\n");
        sresp=Double.toString(port1.getDiff(2,3));
        response.getWriter().append("2-3 = ").append(sresp).append("\n");
        */
		/*
        CTXDBO service1 = new CTXDBO();
        CTXDBOPortType port1 = service1.getHTTPEndpoint();
        try {
        	List<Rate> crr=port1.getCurrencyRate("643","840");
        	for (Rate rr : crr)
        		response.getWriter().append("getCurrencyRate ").append(rr.toString()).append("\n");
		} catch (DataServiceFault_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
        	List<Rate> crr=port1.getCurrencyRate("643","978");
        	for (Rate rr : crr)
        		response.getWriter().append("getCurrencyRate ").append(rr.toString()).append("\n");
		} catch (DataServiceFault_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*
		String et="1480971599000";
		Date dt=new Date(Long.parseLong(et));
		SimpleDateFormat frm= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
		response.getWriter().append("Date: ").append(frm.format(dt)).append("\n");
		
		Calendar cln=Calendar.getInstance();
		cln.setTime(dt);
		cln.add(Calendar.DATE,14);
		response.getWriter().append("Date: ").append(frm.format(cln.getTime())).append("\n");
		
		String ep14=String.valueOf(cln.getTime().getTime());
		response.getWriter().append("Date +14 epoch: ").append(ep14).append("\n");
		
		Date dt14=new Date(Long.parseLong(ep14));
		response.getWriter().append("Date +14: ").append(frm.format(dt14)).append("\n");
	*/
		/*
		String tlogid="25387264";
		String RRN="?";
		
        CTXDBO service1 = new CTXDBO();
        CTXDBOPortType port1 = service1.getHTTPEndpoint();
        try {
        	Entry ent=port1.getRRN(tlogid).get(0);
        	RRN=ent.getRRN();
		} catch (DataServiceFault_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        */
		/*
		String RejMsg="?";
		Payment service1 = new Payment();
		PaymentPortType port1 = service1.getPaymentHttpport();
        	
    	ObjectFactory of = new ObjectFactory();
    	ReversePaymentReqstInfo param0 = of.createReversePaymentReqstInfo();
    	param0.setAmttxn(of.createReversePaymentReqstInfoAmttxn(100.));
    	param0.setCardExpiry(of.createReversePaymentReqstInfoCardExpiry("1802"));
    	param0.setCurtxn(of.createReversePaymentReqstInfoCurtxn("643"));
    	param0.setDateLocal(of.createReversePaymentReqstInfoDateLocal("20161209"));
    	param0.setInstcode(of.createReversePaymentReqstInfoInstcode("FORA"));
    	param0.setMrchNo(of.createReversePaymentReqstInfoMrchNo("410104"));
    	param0.setPan(of.createReversePaymentReqstInfoPan("4256901_9834"));
    	param0.setRrn(of.createReversePaymentReqstInfoRrn("123"));
    	param0.setSeqno(of.createReversePaymentReqstInfoSeqno("0"));
    	param0.setTimeLocal(of.createReversePaymentReqstInfoTimeLocal("130000"));
    	ReversePaymentRspsInfo rpri=port1.reversePayment(param0);
    	RejMsg=rpri.getRejMsg().getValue();
		
		response.getWriter().append("RejMsg: ").append(RejMsg).append("\n");
        //System.out.println("Server said: " + port4.getRRN(null));
		*/
		/*
        PortTypeDepositsServiceService service1 = new PortTypeDepositsServiceService();
        PortTypeDepositsService port1 = service1.getPortTypeDepositsServicePort();
        
        ObjectFactory of = new ObjectFactory();
        GetDepositsListReqType depreq=of.createGetDepositsListReqType();
                
        DepositsFindListResType depresp;
		try {
			DepositListFindByClientType fbc=of.createDepositListFindByClientType();
			fbc.setClientShortName("Шардакова Л. Н.");
			depreq.getFindByClientList().add(fbc);
			depresp = port1.getDepositsList(depreq);
	        List<DepositBasicInfoType> deplist=depresp.getDepositsList();
	        int index=0;
	        //ByteArrayOutputStream baos = new ByteArrayOutputStream(1024); 
	    	for (DepositBasicInfoType deposit : deplist){
	    		//baos.write(deposit.getDepositProductName().getBytes());
	    		response.getWriter().append("deposit [").append(Integer.toString(++index)).append("]: ").append(deposit.getDepositProductName()).append("\n");
	    	}
		} catch (MsgFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.getWriter().append("e.getMessage() ").append(e.getMessage()).append("\n");
			ru.unitarius.integration.schema.common.FaultType ft=e.getFaultInfo();
			response.getWriter().append("ft.getErrorSource() ").append(ft.getErrorSource()).append("\n");
			response.getWriter().append("ft.getErrorCode() ").append(ft.getErrorCode()).append("\n");
			response.getWriter().append("ft.getErrorMessage() ").append(ft.getErrorMessage()).append("\n");
		}
		*/
		System.out.println("doGet end");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		doGet(request, response);
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, res);
		PrintWriter pw = res.getWriter();
		pw.write("<html><head><title>H2 test</title></head>");
		pw.write("<body>");
		pw.write("SoapGate server running");
		
		/*
		transaction tr= new transaction();
		tr.setAmount(12300);
		tr.setStan(645321);
		tr.setRrn("rrn1");
		tr.setAuthorisationId("123456");
		tr.setProcessingCode(270000);
		tr.setTransactionDate("2018-04-18");
		
		long newId=tr.save();
		pw.write("insert: "+newId+"<br/>");
		
		transaction tr2= new transaction();
		pw.write("load("+newId+"): "+tr2.load(newId)+"<br/>");
		pw.write("tr.rrn: "+tr2.getRrn()+"<br/>");
		newId--;
		pw.write("load("+newId+"): "+tr2.load(newId)+"<br/>");
		pw.write("tr.rrn: "+tr2.getRrn()+"<br/>");
		*/
		//pw.write("transaction.count: "+transaction.count()+"<br/>");
		pw.write("</body>");
	}	
	
}

package service.impl;

import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;  

public class MailAlert {
	static public void alert(String subject,String message){
		  String host="10.3.32.12";  
		  final String user="sudakov@yar.forabank.ru";  
		  final String password="4.710.solaa";  
		  String to="dbo@forabank.ru";  
	  
	   //Get the session object  
		  Properties props = new Properties();  
		  props.put("mail.smtp.host",host);
		  props.put("mail.smtp.port","25");
		  props.put("mail.smtp.auth", "true");
		  props.put("mail.smtp.starttls.enable", "true");
	     
	   //javax.mail.Session session = Session.getInstance(props, null);
	   
	   //getDefaultInstance
		  Session session = Session.getInstance(props,new javax.mail.Authenticator() {
			   protected PasswordAuthentication getPasswordAuthentication() { return new PasswordAuthentication(user,password);}  
		    }
		  );
	     
	   //Compose the message  
		    try {  
			    MimeMessage mm = new MimeMessage(session);
			     
			    mm.setFrom(new InternetAddress(user));  
			    mm.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
			    mm.setSubject(subject);
			    mm.setText(message);  
			    //send the message  
			    Transport.send(mm);  
			    System.out.println("message sent successfully...");  
		    } catch (MessagingException e) {e.printStackTrace();}  
		
	}

}

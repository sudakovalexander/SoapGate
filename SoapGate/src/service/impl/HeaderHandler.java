package service.impl;

import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
 
/**
 *
 * @author www.javadb.com
 */
public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {
 
    public boolean handleMessage(SOAPMessageContext smc) {
 
        Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
 
        if (outboundProperty.booleanValue()) {
 
            
 
            try {
            	SOAPMessage message = smc.getMessage();
                SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
                SOAPHeader header = null;
                header=envelope.getHeader();
                if (header==null)
                	header=envelope.addHeader();
                //SOAPHeader header = envelope.
 
                SOAPElement security =
                        header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
 
                SOAPElement usernameToken = security.addChildElement("UsernameToken", "wsse");
                usernameToken.addAttribute(new QName("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
 
                SOAPElement username = usernameToken.addChildElement("Username", "wsse");
                username.addTextNode("gisadmin2");
 
                SOAPElement password =
                        usernameToken.addChildElement("Password", "wsse");
                password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
            	password.addTextNode("6tQs6a");
 
                //Print out the outbound SOAP message to System.out
                //message.writeTo(System.out);
                //System.out.println("");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
 
        } else {
            try {
                
                //This handler does nothing with the response from the Web Service so
                //we just print out the SOAP message.
                SOAPMessage message = smc.getMessage();
                message.writeTo(System.out);
                System.out.println("");
 
            } catch (Exception ex) {
                ex.printStackTrace();
            } 
        }
 
 
        return outboundProperty;
 
    }
 
    public boolean handleFault(SOAPMessageContext context) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }
 
    public void close(MessageContext context) {
    //throw new UnsupportedOperationException("Not supported yet.");
    }

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}
}
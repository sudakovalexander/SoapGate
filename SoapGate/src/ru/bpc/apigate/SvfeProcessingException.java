
package ru.bpc.apigate;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4.redhat-1
 * 2018-03-16T11:47:29.463+03:00
 * Generated source version: 3.1.4.redhat-1
 */

@WebFault(name = "svfeProcessingFault", targetNamespace = "http://www.bpc.ru/apigate/errors/")
public class SvfeProcessingException extends Exception {
    
    private ru.bpc.apigate.errors.SvfeProcessingFaultType svfeProcessingFault;

    public SvfeProcessingException() {
        super();
    }
    
    public SvfeProcessingException(String message) {
        super(message);
    }
    
    public SvfeProcessingException(String message, Throwable cause) {
        super(message, cause);
    }

    public SvfeProcessingException(String message, ru.bpc.apigate.errors.SvfeProcessingFaultType svfeProcessingFault) {
        super(message);
        this.svfeProcessingFault = svfeProcessingFault;
    }

    public SvfeProcessingException(String message, ru.bpc.apigate.errors.SvfeProcessingFaultType svfeProcessingFault, Throwable cause) {
        super(message, cause);
        this.svfeProcessingFault = svfeProcessingFault;
    }

    public ru.bpc.apigate.errors.SvfeProcessingFaultType getFaultInfo() {
        return this.svfeProcessingFault;
    }
}

package com.custsystems.integration.abs.absinterface;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4.redhat-1
 * 2017-07-07T13:25:08.461+03:00
 * Generated source version: 3.1.4.redhat-1
 */

@WebFault(name = "ErrorElement", targetNamespace = "http://custsystems.com/integration/abs/ABSInterface")
public class PlatporFaultMsg extends Exception {
    
    private com.custsystems.integration.abs.absinterface.ErrorElement errorElement;

    public PlatporFaultMsg() {
        super();
    }
    
    public PlatporFaultMsg(String message) {
        super(message);
    }
    
    public PlatporFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public PlatporFaultMsg(String message, com.custsystems.integration.abs.absinterface.ErrorElement errorElement) {
        super(message);
        this.errorElement = errorElement;
    }

    public PlatporFaultMsg(String message, com.custsystems.integration.abs.absinterface.ErrorElement errorElement, Throwable cause) {
        super(message, cause);
        this.errorElement = errorElement;
    }

    public com.custsystems.integration.abs.absinterface.ErrorElement getFaultInfo() {
        return this.errorElement;
    }
}

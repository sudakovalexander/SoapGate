
package com.custsystems.integration.abs.absinterface;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4.redhat-1
 * 2017-07-07T13:25:08.464+03:00
 * Generated source version: 3.1.4.redhat-1
 */

@WebFault(name = "ErrorElement", targetNamespace = "http://custsystems.com/integration/abs/ABSInterface")
public class DealPassContractFaultMsg extends Exception {
    
    private com.custsystems.integration.abs.absinterface.ErrorElement errorElement;

    public DealPassContractFaultMsg() {
        super();
    }
    
    public DealPassContractFaultMsg(String message) {
        super(message);
    }
    
    public DealPassContractFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public DealPassContractFaultMsg(String message, com.custsystems.integration.abs.absinterface.ErrorElement errorElement) {
        super(message);
        this.errorElement = errorElement;
    }

    public DealPassContractFaultMsg(String message, com.custsystems.integration.abs.absinterface.ErrorElement errorElement, Throwable cause) {
        super(message, cause);
        this.errorElement = errorElement;
    }

    public com.custsystems.integration.abs.absinterface.ErrorElement getFaultInfo() {
        return this.errorElement;
    }
}

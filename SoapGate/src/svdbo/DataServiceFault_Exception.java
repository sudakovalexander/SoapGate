
package svdbo;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.4.redhat-1
 * 2018-02-13T12:30:38.906+03:00
 * Generated source version: 3.1.4.redhat-1
 */

@WebFault(name = "DataServiceFault", targetNamespace = "http://ws.wso2.org/dataservice")
public class DataServiceFault_Exception extends Exception {
    
    private svdbo.DataServiceFault dataServiceFault;

    public DataServiceFault_Exception() {
        super();
    }
    
    public DataServiceFault_Exception(String message) {
        super(message);
    }
    
    public DataServiceFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public DataServiceFault_Exception(String message, svdbo.DataServiceFault dataServiceFault) {
        super(message);
        this.dataServiceFault = dataServiceFault;
    }

    public DataServiceFault_Exception(String message, svdbo.DataServiceFault dataServiceFault, Throwable cause) {
        super(message, cause);
        this.dataServiceFault = dataServiceFault;
    }

    public svdbo.DataServiceFault getFaultInfo() {
        return this.dataServiceFault;
    }
}

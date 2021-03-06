package ru.unitarius.integration.service.loans;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.4.redhat-1
 * 2016-12-20T12:11:33.464+03:00
 * Generated source version: 3.1.4.redhat-1
 * 
 */
@WebServiceClient(name = "PortTypeLoansServiceService", 
                  wsdlLocation = "http://10.1.204.51:8184/cxf/loans?wsdl",
                  targetNamespace = "http://unitarius.ru/integration/service/loans") 
public class PortTypeLoansServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://unitarius.ru/integration/service/loans", "PortTypeLoansServiceService");
    public final static QName PortTypeLoansServicePort = new QName("http://unitarius.ru/integration/service/loans", "PortTypeLoansServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.1.204.51:8184/cxf/loans?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PortTypeLoansServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://10.1.204.51:8184/cxf/loans?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PortTypeLoansServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PortTypeLoansServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PortTypeLoansServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public PortTypeLoansServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PortTypeLoansServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PortTypeLoansServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns PortTypeLoansService
     */
    @WebEndpoint(name = "PortTypeLoansServicePort")
    public PortTypeLoansService getPortTypeLoansServicePort() {
        return super.getPort(PortTypeLoansServicePort, PortTypeLoansService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PortTypeLoansService
     */
    @WebEndpoint(name = "PortTypeLoansServicePort")
    public PortTypeLoansService getPortTypeLoansServicePort(WebServiceFeature... features) {
        return super.getPort(PortTypeLoansServicePort, PortTypeLoansService.class, features);
    }

}

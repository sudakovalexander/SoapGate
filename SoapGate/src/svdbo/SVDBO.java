package svdbo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.4.redhat-1
 * 2018-02-13T12:30:39.020+03:00
 * Generated source version: 3.1.4.redhat-1
 * 
 */
@WebServiceClient(name = "SV_DBO", 
                  wsdlLocation = "http://192.168.77.109:9763/services/SV_DBO?wsdl",
                  targetNamespace = "http://ws.wso2.org/dataservice") 
public class SVDBO extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.wso2.org/dataservice", "SV_DBO");
    public final static QName SecureSOAP11Endpoint = new QName("http://ws.wso2.org/dataservice", "SecureSOAP11Endpoint");
    public final static QName SecureHTTPEndpoint = new QName("http://ws.wso2.org/dataservice", "SecureHTTPEndpoint");
    public final static QName SOAP11Endpoint = new QName("http://ws.wso2.org/dataservice", "SOAP11Endpoint");
    public final static QName SecureSOAP12Endpoint = new QName("http://ws.wso2.org/dataservice", "SecureSOAP12Endpoint");
    public final static QName HTTPEndpoint = new QName("http://ws.wso2.org/dataservice", "HTTPEndpoint");
    public final static QName SOAP12Endpoint = new QName("http://ws.wso2.org/dataservice", "SOAP12Endpoint");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.77.109:9763/services/SV_DBO?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SVDBO.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.77.109:9763/services/SV_DBO?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SVDBO(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SVDBO(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SVDBO() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SVDBO(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SVDBO(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SVDBO(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SVDBOPortType
     */
    @WebEndpoint(name = "SecureSOAP11Endpoint")
    public SVDBOPortType getSecureSOAP11Endpoint() {
        return super.getPort(SecureSOAP11Endpoint, SVDBOPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SVDBOPortType
     */
    @WebEndpoint(name = "SecureSOAP11Endpoint")
    public SVDBOPortType getSecureSOAP11Endpoint(WebServiceFeature... features) {
        return super.getPort(SecureSOAP11Endpoint, SVDBOPortType.class, features);
    }


    /**
     *
     * @return
     *     returns SVDBOPortType
     */
    @WebEndpoint(name = "SecureHTTPEndpoint")
    public SVDBOPortType getSecureHTTPEndpoint() {
        return super.getPort(SecureHTTPEndpoint, SVDBOPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SVDBOPortType
     */
    @WebEndpoint(name = "SecureHTTPEndpoint")
    public SVDBOPortType getSecureHTTPEndpoint(WebServiceFeature... features) {
        return super.getPort(SecureHTTPEndpoint, SVDBOPortType.class, features);
    }


    /**
     *
     * @return
     *     returns SVDBOPortType
     */
    @WebEndpoint(name = "SOAP11Endpoint")
    public SVDBOPortType getSOAP11Endpoint() {
        return super.getPort(SOAP11Endpoint, SVDBOPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SVDBOPortType
     */
    @WebEndpoint(name = "SOAP11Endpoint")
    public SVDBOPortType getSOAP11Endpoint(WebServiceFeature... features) {
        return super.getPort(SOAP11Endpoint, SVDBOPortType.class, features);
    }


    /**
     *
     * @return
     *     returns SVDBOPortType
     */
    @WebEndpoint(name = "SecureSOAP12Endpoint")
    public SVDBOPortType getSecureSOAP12Endpoint() {
        return super.getPort(SecureSOAP12Endpoint, SVDBOPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SVDBOPortType
     */
    @WebEndpoint(name = "SecureSOAP12Endpoint")
    public SVDBOPortType getSecureSOAP12Endpoint(WebServiceFeature... features) {
        return super.getPort(SecureSOAP12Endpoint, SVDBOPortType.class, features);
    }


    /**
     *
     * @return
     *     returns SVDBOPortType
     */
    @WebEndpoint(name = "HTTPEndpoint")
    public SVDBOPortType getHTTPEndpoint() {
        return super.getPort(HTTPEndpoint, SVDBOPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SVDBOPortType
     */
    @WebEndpoint(name = "HTTPEndpoint")
    public SVDBOPortType getHTTPEndpoint(WebServiceFeature... features) {
        return super.getPort(HTTPEndpoint, SVDBOPortType.class, features);
    }


    /**
     *
     * @return
     *     returns SVDBOPortType
     */
    @WebEndpoint(name = "SOAP12Endpoint")
    public SVDBOPortType getSOAP12Endpoint() {
        return super.getPort(SOAP12Endpoint, SVDBOPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SVDBOPortType
     */
    @WebEndpoint(name = "SOAP12Endpoint")
    public SVDBOPortType getSOAP12Endpoint(WebServiceFeature... features) {
        return super.getPort(SOAP12Endpoint, SVDBOPortType.class, features);
    }

}

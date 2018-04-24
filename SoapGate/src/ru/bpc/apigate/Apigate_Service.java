package ru.bpc.apigate;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * Веб-сервис, предоставляющий интерфейс для взаимодействия внешних систем с системой SmartVista.
 *
 * This class was generated by Apache CXF 3.1.4.redhat-1
 * 2018-03-16T11:47:29.515+03:00
 * Generated source version: 3.1.4.redhat-1
 * 
 */

/*
 * "http://192.168.87.46:7007/apigate/ws/soap?wsdl" - Тестовый
 * "http://192.168.77.46:7007/apigate/ws/soap?wsdl" - Рабочий
 * 
 * */
@WebServiceClient(name = "apigate", 
                  wsdlLocation = "http://192.168.87.46:7007/apigate/ws/soap?wsdl",
                  targetNamespace = "http://www.bpc.ru/apigate/") 
public class Apigate_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.bpc.ru/apigate/", "apigate");
    public final static QName Apigate = new QName("http://www.bpc.ru/apigate/", "apigate");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.87.46:7007/apigate/ws/soap?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Apigate_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.87.46:7007/apigate/ws/soap?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Apigate_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Apigate_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Apigate_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public Apigate_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Apigate_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Apigate_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     * Общий набор команд.
     *
     * @return
     *     returns Apigate
     */
    @WebEndpoint(name = "apigate")
    public Apigate getApigate() {
        return super.getPort(Apigate, Apigate.class);
    }

    /**
     * Общий набор команд.
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Apigate
     */
    @WebEndpoint(name = "apigate")
    public Apigate getApigate(WebServiceFeature... features) {
        return super.getPort(Apigate, Apigate.class, features);
    }

}

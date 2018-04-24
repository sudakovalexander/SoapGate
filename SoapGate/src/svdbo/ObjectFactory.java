
package svdbo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the svdbo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _REQUESTSTATUS_QNAME = new QName("http://ws.wso2.org/dataservice", "REQUEST_STATUS");
    private final static QName _GetCurrencyRateResponse_QNAME = new QName("http://ws.wso2.org/dataservice", "getCurrencyRateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: svdbo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataServiceFault }
     * 
     */
    public DataServiceFault createDataServiceFault() {
        return new DataServiceFault();
    }

    /**
     * Create an instance of {@link DataServiceFault.SourceDataService }
     * 
     */
    public DataServiceFault.SourceDataService createDataServiceFaultSourceDataService() {
        return new DataServiceFault.SourceDataService();
    }

    /**
     * Create an instance of {@link DATASERVICERESPONSE }
     * 
     */
    public DATASERVICERESPONSE createDATASERVICERESPONSE() {
        return new DATASERVICERESPONSE();
    }

    /**
     * Create an instance of {@link GetCurrencyRate }
     * 
     */
    public GetCurrencyRate createGetCurrencyRate() {
        return new GetCurrencyRate();
    }

    /**
     * Create an instance of {@link GetCurrencyRateResponse }
     * 
     */
    public GetCurrencyRateResponse createGetCurrencyRateResponse() {
        return new GetCurrencyRateResponse();
    }

    /**
     * Create an instance of {@link Return }
     * 
     */
    public Return createReturn() {
        return new Return();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "REQUEST_STATUS")
    public JAXBElement<String> createREQUESTSTATUS(String value) {
        return new JAXBElement<String>(_REQUESTSTATUS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "getCurrencyRateResponse")
    public JAXBElement<GetCurrencyRateResponse> createGetCurrencyRateResponse(GetCurrencyRateResponse value) {
        return new JAXBElement<GetCurrencyRateResponse>(_GetCurrencyRateResponse_QNAME, GetCurrencyRateResponse.class, null, value);
    }

}

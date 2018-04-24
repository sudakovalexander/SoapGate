
package org.wso2.ws.dataservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.wso2.ws.dataservice package. 
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
    private final static QName _Entries_QNAME = new QName("http://ws.wso2.org/dataservice", "Entries");
    private final static QName _CardSettlements_QNAME = new QName("http://ws.wso2.org/dataservice", "CardSettlements");
    private final static QName _GetBalanceResponse_QNAME = new QName("http://ws.wso2.org/dataservice", "getBalanceResponse");
    private final static QName _GetCurrencyRateResponse_QNAME = new QName("http://ws.wso2.org/dataservice", "getCurrencyRateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.wso2.ws.dataservice
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
     * Create an instance of {@link GetRRN }
     * 
     */
    public GetRRN createGetRRN() {
        return new GetRRN();
    }

    /**
     * Create an instance of {@link Entries }
     * 
     */
    public Entries createEntries() {
        return new Entries();
    }

    /**
     * Create an instance of {@link GetCardSettlement }
     * 
     */
    public GetCardSettlement createGetCardSettlement() {
        return new GetCardSettlement();
    }

    /**
     * Create an instance of {@link CardSettlements }
     * 
     */
    public CardSettlements createCardSettlements() {
        return new CardSettlements();
    }

    /**
     * Create an instance of {@link GetBalance }
     * 
     */
    public GetBalance createGetBalance() {
        return new GetBalance();
    }

    /**
     * Create an instance of {@link GetBalanceResponse }
     * 
     */
    public GetBalanceResponse createGetBalanceResponse() {
        return new GetBalanceResponse();
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
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link CardSettlement }
     * 
     */
    public CardSettlement createCardSettlement() {
        return new CardSettlement();
    }

    /**
     * Create an instance of {@link Return }
     * 
     */
    public Return createReturn() {
        return new Return();
    }

    /**
     * Create an instance of {@link Return2 }
     * 
     */
    public Return2 createReturn2() {
        return new Return2();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Entries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "Entries")
    public JAXBElement<Entries> createEntries(Entries value) {
        return new JAXBElement<Entries>(_Entries_QNAME, Entries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardSettlements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "CardSettlements")
    public JAXBElement<CardSettlements> createCardSettlements(CardSettlements value) {
        return new JAXBElement<CardSettlements>(_CardSettlements_QNAME, CardSettlements.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wso2.org/dataservice", name = "getBalanceResponse")
    public JAXBElement<GetBalanceResponse> createGetBalanceResponse(GetBalanceResponse value) {
        return new JAXBElement<GetBalanceResponse>(_GetBalanceResponse_QNAME, GetBalanceResponse.class, null, value);
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

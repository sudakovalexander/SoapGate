
package lv.d8.cortexws.card.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import lv.d8.cortexws.card.valueobj.xsd.GetBalanceRqstInfo;
import lv.d8.cortexws.card.valueobj.xsd.GetBalanceRspsInfo;
import lv.d8.cortexws.card.valueobj.xsd.GetStatusRqstInfo;
import lv.d8.cortexws.card.valueobj.xsd.GetStatusRspsInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lv.d8.cortexws.card.service package. 
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

    private final static QName _GetBalanceParam0_QNAME = new QName("http://service.card.cortexws.d8.lv", "param0");
    private final static QName _GetBalanceResponseReturn_QNAME = new QName("http://service.card.cortexws.d8.lv", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lv.d8.cortexws.card.service
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /*
    public NewStatus createNewStatus() {
        return new NewStatus();
    }

    public NewStatusResponse createNewStatusResponse() {
        return new NewStatusResponse();
    }
    */

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceRqstInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.card.cortexws.d8.lv", name = "param0", scope = GetBalance.class)
    public JAXBElement<GetBalanceRqstInfo> createGetBalanceParam0(GetBalanceRqstInfo value) {
        return new JAXBElement<GetBalanceRqstInfo>(_GetBalanceParam0_QNAME, GetBalanceRqstInfo.class, GetBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceRspsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.card.cortexws.d8.lv", name = "return", scope = GetBalanceResponse.class)
    public JAXBElement<GetBalanceRspsInfo> createGetBalanceResponseReturn(GetBalanceRspsInfo value) {
        return new JAXBElement<GetBalanceRspsInfo>(_GetBalanceResponseReturn_QNAME, GetBalanceRspsInfo.class, GetBalanceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusRqstInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.card.cortexws.d8.lv", name = "param0", scope = GetStatus.class)
    public JAXBElement<GetStatusRqstInfo> createGetStatusParam0(GetStatusRqstInfo value) {
        return new JAXBElement<GetStatusRqstInfo>(_GetBalanceParam0_QNAME, GetStatusRqstInfo.class, GetStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusRspsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.card.cortexws.d8.lv", name = "return", scope = GetStatusResponse.class)
    public JAXBElement<GetStatusRspsInfo> createGetStatusResponseReturn(GetStatusRspsInfo value) {
        return new JAXBElement<GetStatusRspsInfo>(_GetBalanceResponseReturn_QNAME, GetStatusRspsInfo.class, GetStatusResponse.class, value);
    }

    /*
    @XmlElementDecl(namespace = "http://service.card.cortexws.d8.lv", name = "param0", scope = NewStatus.class)
    public JAXBElement<NewStatusRqstInfo> createNewStatusParam0(NewStatusRqstInfo value) {
        return new JAXBElement<NewStatusRqstInfo>(_GetBalanceParam0_QNAME, NewStatusRqstInfo.class, NewStatus.class, value);
    }

    @XmlElementDecl(namespace = "http://service.card.cortexws.d8.lv", name = "return", scope = NewStatusResponse.class)
    public JAXBElement<NewStatusRspsInfo> createNewStatusResponseReturn(NewStatusRspsInfo value) {
        return new JAXBElement<NewStatusRspsInfo>(_GetBalanceResponseReturn_QNAME, NewStatusRspsInfo.class, NewStatusResponse.class, value);
    }
    */

}

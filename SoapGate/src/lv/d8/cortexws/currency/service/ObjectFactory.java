
package lv.d8.cortexws.currency.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import lv.d8.cortexws.currency.valueobj.xsd.GetAddCurrencyRateRqstInfo;
import lv.d8.cortexws.currency.valueobj.xsd.GetAddCurrencyRateRspsInfo;
import lv.d8.cortexws.currency.valueobj.xsd.GetCurrenciesRqstInfo;
import lv.d8.cortexws.currency.valueobj.xsd.GetCurrenciesRspsInfo;
import lv.d8.cortexws.currency.valueobj.xsd.GetGetCurrencyAlphaRqstInfo;
import lv.d8.cortexws.currency.valueobj.xsd.GetGetCurrencyAlphaRspsInfo;
import lv.d8.cortexws.currency.valueobj.xsd.GetGetCurrencyNumRqstInfo;
import lv.d8.cortexws.currency.valueobj.xsd.GetGetCurrencyNumRspsInfo;
import lv.d8.cortexws.currency.valueobj.xsd.GetGetCurrencyRateRqstInfo;
import lv.d8.cortexws.currency.valueobj.xsd.GetGetCurrencyRateRspsInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lv.d8.cortexws.currency.service package. 
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

    private final static QName _AddCurrencyRateParam0_QNAME = new QName("http://service.currency.cortexws.d8.lv", "param0");
    private final static QName _AddCurrencyRateResponseReturn_QNAME = new QName("http://service.currency.cortexws.d8.lv", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lv.d8.cortexws.currency.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCurrencyRate }
     * 
     */
    public AddCurrencyRate createAddCurrencyRate() {
        return new AddCurrencyRate();
    }

    /**
     * Create an instance of {@link AddCurrencyRateResponse }
     * 
     */
    public AddCurrencyRateResponse createAddCurrencyRateResponse() {
        return new AddCurrencyRateResponse();
    }

    /**
     * Create an instance of {@link GetCurrencies }
     * 
     */
    public GetCurrencies createGetCurrencies() {
        return new GetCurrencies();
    }

    /**
     * Create an instance of {@link GetCurrenciesResponse }
     * 
     */
    public GetCurrenciesResponse createGetCurrenciesResponse() {
        return new GetCurrenciesResponse();
    }

    /**
     * Create an instance of {@link GetCurrencyAlpha }
     * 
     */
    public GetCurrencyAlpha createGetCurrencyAlpha() {
        return new GetCurrencyAlpha();
    }

    /**
     * Create an instance of {@link GetCurrencyAlphaResponse }
     * 
     */
    public GetCurrencyAlphaResponse createGetCurrencyAlphaResponse() {
        return new GetCurrencyAlphaResponse();
    }

    /**
     * Create an instance of {@link GetCurrencyNum }
     * 
     */
    public GetCurrencyNum createGetCurrencyNum() {
        return new GetCurrencyNum();
    }

    /**
     * Create an instance of {@link GetCurrencyNumResponse }
     * 
     */
    public GetCurrencyNumResponse createGetCurrencyNumResponse() {
        return new GetCurrencyNumResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddCurrencyRateRqstInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.currency.cortexws.d8.lv", name = "param0", scope = AddCurrencyRate.class)
    public JAXBElement<GetAddCurrencyRateRqstInfo> createAddCurrencyRateParam0(GetAddCurrencyRateRqstInfo value) {
        return new JAXBElement<GetAddCurrencyRateRqstInfo>(_AddCurrencyRateParam0_QNAME, GetAddCurrencyRateRqstInfo.class, AddCurrencyRate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddCurrencyRateRspsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.currency.cortexws.d8.lv", name = "return", scope = AddCurrencyRateResponse.class)
    public JAXBElement<GetAddCurrencyRateRspsInfo> createAddCurrencyRateResponseReturn(GetAddCurrencyRateRspsInfo value) {
        return new JAXBElement<GetAddCurrencyRateRspsInfo>(_AddCurrencyRateResponseReturn_QNAME, GetAddCurrencyRateRspsInfo.class, AddCurrencyRateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrenciesRqstInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.currency.cortexws.d8.lv", name = "param0", scope = GetCurrencies.class)
    public JAXBElement<GetCurrenciesRqstInfo> createGetCurrenciesParam0(GetCurrenciesRqstInfo value) {
        return new JAXBElement<GetCurrenciesRqstInfo>(_AddCurrencyRateParam0_QNAME, GetCurrenciesRqstInfo.class, GetCurrencies.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrenciesRspsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.currency.cortexws.d8.lv", name = "return", scope = GetCurrenciesResponse.class)
    public JAXBElement<GetCurrenciesRspsInfo> createGetCurrenciesResponseReturn(GetCurrenciesRspsInfo value) {
        return new JAXBElement<GetCurrenciesRspsInfo>(_AddCurrencyRateResponseReturn_QNAME, GetCurrenciesRspsInfo.class, GetCurrenciesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGetCurrencyAlphaRqstInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.currency.cortexws.d8.lv", name = "param0", scope = GetCurrencyAlpha.class)
    public JAXBElement<GetGetCurrencyAlphaRqstInfo> createGetCurrencyAlphaParam0(GetGetCurrencyAlphaRqstInfo value) {
        return new JAXBElement<GetGetCurrencyAlphaRqstInfo>(_AddCurrencyRateParam0_QNAME, GetGetCurrencyAlphaRqstInfo.class, GetCurrencyAlpha.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGetCurrencyAlphaRspsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.currency.cortexws.d8.lv", name = "return", scope = GetCurrencyAlphaResponse.class)
    public JAXBElement<GetGetCurrencyAlphaRspsInfo> createGetCurrencyAlphaResponseReturn(GetGetCurrencyAlphaRspsInfo value) {
        return new JAXBElement<GetGetCurrencyAlphaRspsInfo>(_AddCurrencyRateResponseReturn_QNAME, GetGetCurrencyAlphaRspsInfo.class, GetCurrencyAlphaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGetCurrencyNumRqstInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.currency.cortexws.d8.lv", name = "param0", scope = GetCurrencyNum.class)
    public JAXBElement<GetGetCurrencyNumRqstInfo> createGetCurrencyNumParam0(GetGetCurrencyNumRqstInfo value) {
        return new JAXBElement<GetGetCurrencyNumRqstInfo>(_AddCurrencyRateParam0_QNAME, GetGetCurrencyNumRqstInfo.class, GetCurrencyNum.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGetCurrencyNumRspsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.currency.cortexws.d8.lv", name = "return", scope = GetCurrencyNumResponse.class)
    public JAXBElement<GetGetCurrencyNumRspsInfo> createGetCurrencyNumResponseReturn(GetGetCurrencyNumRspsInfo value) {
        return new JAXBElement<GetGetCurrencyNumRspsInfo>(_AddCurrencyRateResponseReturn_QNAME, GetGetCurrencyNumRspsInfo.class, GetCurrencyNumResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGetCurrencyRateRqstInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.currency.cortexws.d8.lv", name = "param0", scope = GetCurrencyRate.class)
    public JAXBElement<GetGetCurrencyRateRqstInfo> createGetCurrencyRateParam0(GetGetCurrencyRateRqstInfo value) {
        return new JAXBElement<GetGetCurrencyRateRqstInfo>(_AddCurrencyRateParam0_QNAME, GetGetCurrencyRateRqstInfo.class, GetCurrencyRate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGetCurrencyRateRspsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.currency.cortexws.d8.lv", name = "return", scope = GetCurrencyRateResponse.class)
    public JAXBElement<GetGetCurrencyRateRspsInfo> createGetCurrencyRateResponseReturn(GetGetCurrencyRateRspsInfo value) {
        return new JAXBElement<GetGetCurrencyRateRspsInfo>(_AddCurrencyRateResponseReturn_QNAME, GetGetCurrencyRateRspsInfo.class, GetCurrencyRateResponse.class, value);
    }

}

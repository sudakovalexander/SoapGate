
package currency;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the currency package. 
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
    private final static QName _CurrencyAlphacode_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "alphacode");
    private final static QName _CurrencyCurcode_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "curcode");
    private final static QName _CurrencyDecplaces_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "decplaces");
    private final static QName _BaseRspsInfoAction_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "action");
    private final static QName _BaseRspsInfoActioncode_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "actioncode");
    private final static QName _BaseRspsInfoActionmessage_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "actionmessage");
    private final static QName _GetGetCurrencyRateRspsInfoBasecurcode_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "basecurcode");
    private final static QName _GetGetCurrencyRateRspsInfoBuyrate_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "buyrate");
    private final static QName _GetGetCurrencyRateRspsInfoEnddate_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "enddate");
    private final static QName _GetGetCurrencyRateRspsInfoSellrate_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "sellrate");
    private final static QName _GetGetCurrencyRateRspsInfoStartdate_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "startdate");
    private final static QName _GetGetCurrencyRateRqstInfoDate_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "date");
    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: curdel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCurrencyRate }
     * 
     */
    public GetCurrencyRate createGetCurrencyRate() {
        return new GetCurrencyRate();
    }

    /**
     * Create an instance of {@link GetGetCurrencyRateRqstInfo }
     * 
     */
    public GetGetCurrencyRateRqstInfo createGetGetCurrencyRateRqstInfo() {
        return new GetGetCurrencyRateRqstInfo();
    }

    /**
     * Create an instance of {@link GetCurrencyRateResponse }
     * 
     */
    public GetCurrencyRateResponse createGetCurrencyRateResponse() {
        return new GetCurrencyRateResponse();
    }

    /**
     * Create an instance of {@link GetGetCurrencyRateRspsInfo }
     * 
     */
    public GetGetCurrencyRateRspsInfo createGetGetCurrencyRateRspsInfo() {
        return new GetGetCurrencyRateRspsInfo();
    }

    /**
     * Create an instance of {@link CommonInfo }
     * 
     */
    public CommonInfo createCommonInfo() {
        return new CommonInfo();
    }

    /**
     * Create an instance of {@link CommonWSInfo }
     * 
     */
    public CommonWSInfo createCommonWSInfo() {
        return new CommonWSInfo();
    }

    /**
     * Create an instance of {@link CommonRqstInfo }
     * 
     */
    public CommonRqstInfo createCommonRqstInfo() {
        return new CommonRqstInfo();
    }

    /**
     * Create an instance of {@link CommonRspsInfo }
     * 
     */
    public CommonRspsInfo createCommonRspsInfo() {
        return new CommonRspsInfo();
    }

    /**
     * Create an instance of {@link CortexWSRqstInfo }
     * 
     */
    public CortexWSRqstInfo createCortexWSRqstInfo() {
        return new CortexWSRqstInfo();
    }

    /**
     * Create an instance of {@link CortexWSRspsInfo }
     * 
     */
    public CortexWSRspsInfo createCortexWSRspsInfo() {
        return new CortexWSRspsInfo();
    }

    /**
     * Create an instance of {@link BaseRqstInfo }
     * 
     */
    public BaseRqstInfo createBaseRqstInfo() {
        return new BaseRqstInfo();
    }

    /**
     * Create an instance of {@link BaseRspsInfo }
     * 
     */
    public BaseRspsInfo createBaseRspsInfo() {
        return new BaseRspsInfo();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "alphacode", scope = Currency.class)
    public JAXBElement<String> createCurrencyAlphacode(String value) {
        return new JAXBElement<String>(_CurrencyAlphacode_QNAME, String.class, Currency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "curcode", scope = Currency.class)
    public JAXBElement<String> createCurrencyCurcode(String value) {
        return new JAXBElement<String>(_CurrencyCurcode_QNAME, String.class, Currency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "decplaces", scope = Currency.class)
    public JAXBElement<String> createCurrencyDecplaces(String value) {
        return new JAXBElement<String>(_CurrencyDecplaces_QNAME, String.class, Currency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "action", scope = BaseRspsInfo.class)
    public JAXBElement<String> createBaseRspsInfoAction(String value) {
        return new JAXBElement<String>(_BaseRspsInfoAction_QNAME, String.class, BaseRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "actioncode", scope = BaseRspsInfo.class)
    public JAXBElement<String> createBaseRspsInfoActioncode(String value) {
        return new JAXBElement<String>(_BaseRspsInfoActioncode_QNAME, String.class, BaseRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "actionmessage", scope = BaseRspsInfo.class)
    public JAXBElement<String> createBaseRspsInfoActionmessage(String value) {
        return new JAXBElement<String>(_BaseRspsInfoActionmessage_QNAME, String.class, BaseRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "basecurcode", scope = GetGetCurrencyRateRspsInfo.class)
    public JAXBElement<String> createGetGetCurrencyRateRspsInfoBasecurcode(String value) {
        return new JAXBElement<String>(_GetGetCurrencyRateRspsInfoBasecurcode_QNAME, String.class, GetGetCurrencyRateRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "buyrate", scope = GetGetCurrencyRateRspsInfo.class)
    public JAXBElement<String> createGetGetCurrencyRateRspsInfoBuyrate(String value) {
        return new JAXBElement<String>(_GetGetCurrencyRateRspsInfoBuyrate_QNAME, String.class, GetGetCurrencyRateRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "curcode", scope = GetGetCurrencyRateRspsInfo.class)
    public JAXBElement<String> createGetGetCurrencyRateRspsInfoCurcode(String value) {
        return new JAXBElement<String>(_CurrencyCurcode_QNAME, String.class, GetGetCurrencyRateRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "enddate", scope = GetGetCurrencyRateRspsInfo.class)
    public JAXBElement<String> createGetGetCurrencyRateRspsInfoEnddate(String value) {
        return new JAXBElement<String>(_GetGetCurrencyRateRspsInfoEnddate_QNAME, String.class, GetGetCurrencyRateRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "sellrate", scope = GetGetCurrencyRateRspsInfo.class)
    public JAXBElement<String> createGetGetCurrencyRateRspsInfoSellrate(String value) {
        return new JAXBElement<String>(_GetGetCurrencyRateRspsInfoSellrate_QNAME, String.class, GetGetCurrencyRateRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "startdate", scope = GetGetCurrencyRateRspsInfo.class)
    public JAXBElement<String> createGetGetCurrencyRateRspsInfoStartdate(String value) {
        return new JAXBElement<String>(_GetGetCurrencyRateRspsInfoStartdate_QNAME, String.class, GetGetCurrencyRateRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "basecurcode", scope = GetGetCurrencyRateRqstInfo.class)
    public JAXBElement<String> createGetGetCurrencyRateRqstInfoBasecurcode(String value) {
        return new JAXBElement<String>(_GetGetCurrencyRateRspsInfoBasecurcode_QNAME, String.class, GetGetCurrencyRateRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "curcode", scope = GetGetCurrencyRateRqstInfo.class)
    public JAXBElement<String> createGetGetCurrencyRateRqstInfoCurcode(String value) {
        return new JAXBElement<String>(_CurrencyCurcode_QNAME, String.class, GetGetCurrencyRateRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "date", scope = GetGetCurrencyRateRqstInfo.class)
    public JAXBElement<String> createGetGetCurrencyRateRqstInfoDate(String value) {
        return new JAXBElement<String>(_GetGetCurrencyRateRqstInfoDate_QNAME, String.class, GetGetCurrencyRateRqstInfo.class, value);
    }

}

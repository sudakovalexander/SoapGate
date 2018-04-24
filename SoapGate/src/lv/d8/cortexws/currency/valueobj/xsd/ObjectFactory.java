
package lv.d8.cortexws.currency.valueobj.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lv.d8.cortexws.currency.valueobj.xsd package. 
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
    private final static QName _GetGetCurrencyNumRspsInfoCurrency_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "currency");
    private final static QName _GetGetCurrencyNumRqstInfoNumCode_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "numCode");
    private final static QName _GetGetCurrencyAlphaRqstInfoAlphaCode_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "alphaCode");
    private final static QName _GetAddCurrencyRateRqstInfoCrdproduct_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "crdproduct");
    private final static QName _GetAddCurrencyRateRqstInfoEffdate_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "effdate");
    private final static QName _GetAddCurrencyRateRqstInfoEfftime_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "efftime");
    private final static QName _GetAddCurrencyRateRqstInfoExpdate_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "expdate");
    private final static QName _GetAddCurrencyRateRqstInfoExptime_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "exptime");
    private final static QName _GetAddCurrencyRateRqstInfoInstcode_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "instcode");
    private final static QName _GetAddCurrencyRateRqstInfoMultiplier_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "multiplier");
    private final static QName _GetAddCurrencyRateRqstInfoQuote_QNAME = new QName("http://valueobj.currency.cortexws.d8.lv/xsd", "quote");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lv.d8.cortexws.currency.valueobj.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAddCurrencyRateRqstInfo }
     * 
     */
    public GetAddCurrencyRateRqstInfo createGetAddCurrencyRateRqstInfo() {
        return new GetAddCurrencyRateRqstInfo();
    }

    /**
     * Create an instance of {@link GetAddCurrencyRateRspsInfo }
     * 
     */
    public GetAddCurrencyRateRspsInfo createGetAddCurrencyRateRspsInfo() {
        return new GetAddCurrencyRateRspsInfo();
    }

    /**
     * Create an instance of {@link GetCurrenciesRqstInfo }
     * 
     */
    public GetCurrenciesRqstInfo createGetCurrenciesRqstInfo() {
        return new GetCurrenciesRqstInfo();
    }

    /**
     * Create an instance of {@link GetCurrenciesRspsInfo }
     * 
     */
    public GetCurrenciesRspsInfo createGetCurrenciesRspsInfo() {
        return new GetCurrenciesRspsInfo();
    }

    /**
     * Create an instance of {@link GetGetCurrencyAlphaRqstInfo }
     * 
     */
    public GetGetCurrencyAlphaRqstInfo createGetGetCurrencyAlphaRqstInfo() {
        return new GetGetCurrencyAlphaRqstInfo();
    }

    /**
     * Create an instance of {@link GetGetCurrencyAlphaRspsInfo }
     * 
     */
    public GetGetCurrencyAlphaRspsInfo createGetGetCurrencyAlphaRspsInfo() {
        return new GetGetCurrencyAlphaRspsInfo();
    }

    /**
     * Create an instance of {@link GetGetCurrencyNumRqstInfo }
     * 
     */
    public GetGetCurrencyNumRqstInfo createGetGetCurrencyNumRqstInfo() {
        return new GetGetCurrencyNumRqstInfo();
    }

    /**
     * Create an instance of {@link GetGetCurrencyNumRspsInfo }
     * 
     */
    public GetGetCurrencyNumRspsInfo createGetGetCurrencyNumRspsInfo() {
        return new GetGetCurrencyNumRspsInfo();
    }

    /**
     * Create an instance of {@link GetGetCurrencyRateRqstInfo }
     * 
     */
    public GetGetCurrencyRateRqstInfo createGetGetCurrencyRateRqstInfo() {
        return new GetGetCurrencyRateRqstInfo();
    }

    /**
     * Create an instance of {@link GetGetCurrencyRateRspsInfo }
     * 
     */
    public GetGetCurrencyRateRspsInfo createGetGetCurrencyRateRspsInfo() {
        return new GetGetCurrencyRateRspsInfo();
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "currency", scope = GetGetCurrencyNumRspsInfo.class)
    public JAXBElement<Currency> createGetGetCurrencyNumRspsInfoCurrency(Currency value) {
        return new JAXBElement<Currency>(_GetGetCurrencyNumRspsInfoCurrency_QNAME, Currency.class, GetGetCurrencyNumRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "numCode", scope = GetGetCurrencyNumRqstInfo.class)
    public JAXBElement<String> createGetGetCurrencyNumRqstInfoNumCode(String value) {
        return new JAXBElement<String>(_GetGetCurrencyNumRqstInfoNumCode_QNAME, String.class, GetGetCurrencyNumRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "currency", scope = GetGetCurrencyAlphaRspsInfo.class)
    public JAXBElement<Currency> createGetGetCurrencyAlphaRspsInfoCurrency(Currency value) {
        return new JAXBElement<Currency>(_GetGetCurrencyNumRspsInfoCurrency_QNAME, Currency.class, GetGetCurrencyAlphaRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "alphaCode", scope = GetGetCurrencyAlphaRqstInfo.class)
    public JAXBElement<String> createGetGetCurrencyAlphaRqstInfoAlphaCode(String value) {
        return new JAXBElement<String>(_GetGetCurrencyAlphaRqstInfoAlphaCode_QNAME, String.class, GetGetCurrencyAlphaRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "basecurcode", scope = GetAddCurrencyRateRqstInfo.class)
    public JAXBElement<String> createGetAddCurrencyRateRqstInfoBasecurcode(String value) {
        return new JAXBElement<String>(_GetGetCurrencyRateRspsInfoBasecurcode_QNAME, String.class, GetAddCurrencyRateRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "buyrate", scope = GetAddCurrencyRateRqstInfo.class)
    public JAXBElement<String> createGetAddCurrencyRateRqstInfoBuyrate(String value) {
        return new JAXBElement<String>(_GetGetCurrencyRateRspsInfoBuyrate_QNAME, String.class, GetAddCurrencyRateRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "crdproduct", scope = GetAddCurrencyRateRqstInfo.class)
    public JAXBElement<String> createGetAddCurrencyRateRqstInfoCrdproduct(String value) {
        return new JAXBElement<String>(_GetAddCurrencyRateRqstInfoCrdproduct_QNAME, String.class, GetAddCurrencyRateRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "curcode", scope = GetAddCurrencyRateRqstInfo.class)
    public JAXBElement<String> createGetAddCurrencyRateRqstInfoCurcode(String value) {
        return new JAXBElement<String>(_CurrencyCurcode_QNAME, String.class, GetAddCurrencyRateRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "effdate", scope = GetAddCurrencyRateRqstInfo.class)
    public JAXBElement<String> createGetAddCurrencyRateRqstInfoEffdate(String value) {
        return new JAXBElement<String>(_GetAddCurrencyRateRqstInfoEffdate_QNAME, String.class, GetAddCurrencyRateRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "efftime", scope = GetAddCurrencyRateRqstInfo.class)
    public JAXBElement<String> createGetAddCurrencyRateRqstInfoEfftime(String value) {
        return new JAXBElement<String>(_GetAddCurrencyRateRqstInfoEfftime_QNAME, String.class, GetAddCurrencyRateRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "expdate", scope = GetAddCurrencyRateRqstInfo.class)
    public JAXBElement<String> createGetAddCurrencyRateRqstInfoExpdate(String value) {
        return new JAXBElement<String>(_GetAddCurrencyRateRqstInfoExpdate_QNAME, String.class, GetAddCurrencyRateRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "exptime", scope = GetAddCurrencyRateRqstInfo.class)
    public JAXBElement<String> createGetAddCurrencyRateRqstInfoExptime(String value) {
        return new JAXBElement<String>(_GetAddCurrencyRateRqstInfoExptime_QNAME, String.class, GetAddCurrencyRateRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "instcode", scope = GetAddCurrencyRateRqstInfo.class)
    public JAXBElement<String> createGetAddCurrencyRateRqstInfoInstcode(String value) {
        return new JAXBElement<String>(_GetAddCurrencyRateRqstInfoInstcode_QNAME, String.class, GetAddCurrencyRateRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "multiplier", scope = GetAddCurrencyRateRqstInfo.class)
    public JAXBElement<String> createGetAddCurrencyRateRqstInfoMultiplier(String value) {
        return new JAXBElement<String>(_GetAddCurrencyRateRqstInfoMultiplier_QNAME, String.class, GetAddCurrencyRateRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "quote", scope = GetAddCurrencyRateRqstInfo.class)
    public JAXBElement<String> createGetAddCurrencyRateRqstInfoQuote(String value) {
        return new JAXBElement<String>(_GetAddCurrencyRateRqstInfoQuote_QNAME, String.class, GetAddCurrencyRateRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", name = "sellrate", scope = GetAddCurrencyRateRqstInfo.class)
    public JAXBElement<String> createGetAddCurrencyRateRqstInfoSellrate(String value) {
        return new JAXBElement<String>(_GetGetCurrencyRateRspsInfoSellrate_QNAME, String.class, GetAddCurrencyRateRqstInfo.class, value);
    }

}

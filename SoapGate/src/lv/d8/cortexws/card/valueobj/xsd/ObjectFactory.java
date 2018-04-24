
package lv.d8.cortexws.card.valueobj.xsd;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lv.d8.cortexws.card.valueobj.xsd package. 
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

    private final static QName _NewStatusRspsInfoAction_QNAME = new QName("http://valueobj.card.cortexws.d8.lv/xsd", "action");
    private final static QName _NewStatusRspsInfoActioncode_QNAME = new QName("http://valueobj.card.cortexws.d8.lv/xsd", "actioncode");
    private final static QName _NewStatusRspsInfoActionmessage_QNAME = new QName("http://valueobj.card.cortexws.d8.lv/xsd", "actionmessage");
    private final static QName _NewStatusRspsInfoPan_QNAME = new QName("http://valueobj.card.cortexws.d8.lv/xsd", "pan");
    private final static QName _NewStatusRqstInfoInstcode_QNAME = new QName("http://valueobj.card.cortexws.d8.lv/xsd", "instcode");
    private final static QName _NewStatusRqstInfoNewstatcode_QNAME = new QName("http://valueobj.card.cortexws.d8.lv/xsd", "newstatcode");
    private final static QName _NewStatusRqstInfoSeqno_QNAME = new QName("http://valueobj.card.cortexws.d8.lv/xsd", "seqno");
    private final static QName _NewStatusRqstInfoWhoset_QNAME = new QName("http://valueobj.card.cortexws.d8.lv/xsd", "whoset");
    private final static QName _NewStatusRqstInfoWhyset_QNAME = new QName("http://valueobj.card.cortexws.d8.lv/xsd", "whyset");
    private final static QName _GetStatusRspsInfoStatcode_QNAME = new QName("http://valueobj.card.cortexws.d8.lv/xsd", "statcode");
    private final static QName _GetBalanceRspsInfoAccno_QNAME = new QName("http://valueobj.card.cortexws.d8.lv/xsd", "accno");
    private final static QName _GetBalanceRspsInfoAvlbal_QNAME = new QName("http://valueobj.card.cortexws.d8.lv/xsd", "avlbal");
    private final static QName _GetBalanceRspsInfoBlkamt_QNAME = new QName("http://valueobj.card.cortexws.d8.lv/xsd", "blkamt");
    private final static QName _GetBalanceRspsInfoCurrcode_QNAME = new QName("http://valueobj.card.cortexws.d8.lv/xsd", "currcode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lv.d8.cortexws.card.valueobj.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBalanceRqstInfo }
     * 
     */
    public GetBalanceRqstInfo createGetBalanceRqstInfo() {
        return new GetBalanceRqstInfo();
    }

    /**
     * Create an instance of {@link GetBalanceRspsInfo }
     * 
     */
    public GetBalanceRspsInfo createGetBalanceRspsInfo() {
        return new GetBalanceRspsInfo();
    }

    /**
     * Create an instance of {@link GetStatusRqstInfo }
     * 
     */
    public GetStatusRqstInfo createGetStatusRqstInfo() {
        return new GetStatusRqstInfo();
    }

    /**
     * Create an instance of {@link GetStatusRspsInfo }
     * 
     */
    public GetStatusRspsInfo createGetStatusRspsInfo() {
        return new GetStatusRspsInfo();
    }

    /**
     * Create an instance of {@link NewStatusRqstInfo }
     * 
     */
    public NewStatusRqstInfo createNewStatusRqstInfo() {
        return new NewStatusRqstInfo();
    }

    /**
     * Create an instance of {@link NewStatusRspsInfo }
     * 
     */
    public NewStatusRspsInfo createNewStatusRspsInfo() {
        return new NewStatusRspsInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "action", scope = NewStatusRspsInfo.class)
    public JAXBElement<String> createNewStatusRspsInfoAction(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoAction_QNAME, String.class, NewStatusRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "actioncode", scope = NewStatusRspsInfo.class)
    public JAXBElement<String> createNewStatusRspsInfoActioncode(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoActioncode_QNAME, String.class, NewStatusRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "actionmessage", scope = NewStatusRspsInfo.class)
    public JAXBElement<String> createNewStatusRspsInfoActionmessage(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoActionmessage_QNAME, String.class, NewStatusRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "pan", scope = NewStatusRspsInfo.class)
    public JAXBElement<String> createNewStatusRspsInfoPan(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoPan_QNAME, String.class, NewStatusRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "action", scope = NewStatusRqstInfo.class)
    public JAXBElement<String> createNewStatusRqstInfoAction(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoAction_QNAME, String.class, NewStatusRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "instcode", scope = NewStatusRqstInfo.class)
    public JAXBElement<String> createNewStatusRqstInfoInstcode(String value) {
        return new JAXBElement<String>(_NewStatusRqstInfoInstcode_QNAME, String.class, NewStatusRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "newstatcode", scope = NewStatusRqstInfo.class)
    public JAXBElement<String> createNewStatusRqstInfoNewstatcode(String value) {
        return new JAXBElement<String>(_NewStatusRqstInfoNewstatcode_QNAME, String.class, NewStatusRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "pan", scope = NewStatusRqstInfo.class)
    public JAXBElement<String> createNewStatusRqstInfoPan(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoPan_QNAME, String.class, NewStatusRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "seqno", scope = NewStatusRqstInfo.class)
    public JAXBElement<String> createNewStatusRqstInfoSeqno(String value) {
        return new JAXBElement<String>(_NewStatusRqstInfoSeqno_QNAME, String.class, NewStatusRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "whoset", scope = NewStatusRqstInfo.class)
    public JAXBElement<String> createNewStatusRqstInfoWhoset(String value) {
        return new JAXBElement<String>(_NewStatusRqstInfoWhoset_QNAME, String.class, NewStatusRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "whyset", scope = NewStatusRqstInfo.class)
    public JAXBElement<String> createNewStatusRqstInfoWhyset(String value) {
        return new JAXBElement<String>(_NewStatusRqstInfoWhyset_QNAME, String.class, NewStatusRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "action", scope = GetStatusRspsInfo.class)
    public JAXBElement<String> createGetStatusRspsInfoAction(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoAction_QNAME, String.class, GetStatusRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "actioncode", scope = GetStatusRspsInfo.class)
    public JAXBElement<String> createGetStatusRspsInfoActioncode(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoActioncode_QNAME, String.class, GetStatusRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "actionmessage", scope = GetStatusRspsInfo.class)
    public JAXBElement<String> createGetStatusRspsInfoActionmessage(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoActionmessage_QNAME, String.class, GetStatusRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "pan", scope = GetStatusRspsInfo.class)
    public JAXBElement<String> createGetStatusRspsInfoPan(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoPan_QNAME, String.class, GetStatusRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "statcode", scope = GetStatusRspsInfo.class)
    public JAXBElement<String> createGetStatusRspsInfoStatcode(String value) {
        return new JAXBElement<String>(_GetStatusRspsInfoStatcode_QNAME, String.class, GetStatusRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "action", scope = GetStatusRqstInfo.class)
    public JAXBElement<String> createGetStatusRqstInfoAction(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoAction_QNAME, String.class, GetStatusRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "instcode", scope = GetStatusRqstInfo.class)
    public JAXBElement<String> createGetStatusRqstInfoInstcode(String value) {
        return new JAXBElement<String>(_NewStatusRqstInfoInstcode_QNAME, String.class, GetStatusRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "pan", scope = GetStatusRqstInfo.class)
    public JAXBElement<String> createGetStatusRqstInfoPan(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoPan_QNAME, String.class, GetStatusRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "seqno", scope = GetStatusRqstInfo.class)
    public JAXBElement<String> createGetStatusRqstInfoSeqno(String value) {
        return new JAXBElement<String>(_NewStatusRqstInfoSeqno_QNAME, String.class, GetStatusRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "accno", scope = GetBalanceRspsInfo.class)
    public JAXBElement<String> createGetBalanceRspsInfoAccno(String value) {
        return new JAXBElement<String>(_GetBalanceRspsInfoAccno_QNAME, String.class, GetBalanceRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "action", scope = GetBalanceRspsInfo.class)
    public JAXBElement<String> createGetBalanceRspsInfoAction(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoAction_QNAME, String.class, GetBalanceRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "actioncode", scope = GetBalanceRspsInfo.class)
    public JAXBElement<String> createGetBalanceRspsInfoActioncode(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoActioncode_QNAME, String.class, GetBalanceRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "actionmessage", scope = GetBalanceRspsInfo.class)
    public JAXBElement<String> createGetBalanceRspsInfoActionmessage(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoActionmessage_QNAME, String.class, GetBalanceRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "avlbal", scope = GetBalanceRspsInfo.class)
    public JAXBElement<BigDecimal> createGetBalanceRspsInfoAvlbal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetBalanceRspsInfoAvlbal_QNAME, BigDecimal.class, GetBalanceRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "blkamt", scope = GetBalanceRspsInfo.class)
    public JAXBElement<BigDecimal> createGetBalanceRspsInfoBlkamt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetBalanceRspsInfoBlkamt_QNAME, BigDecimal.class, GetBalanceRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "currcode", scope = GetBalanceRspsInfo.class)
    public JAXBElement<String> createGetBalanceRspsInfoCurrcode(String value) {
        return new JAXBElement<String>(_GetBalanceRspsInfoCurrcode_QNAME, String.class, GetBalanceRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "pan", scope = GetBalanceRspsInfo.class)
    public JAXBElement<String> createGetBalanceRspsInfoPan(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoPan_QNAME, String.class, GetBalanceRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "action", scope = GetBalanceRqstInfo.class)
    public JAXBElement<String> createGetBalanceRqstInfoAction(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoAction_QNAME, String.class, GetBalanceRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "instcode", scope = GetBalanceRqstInfo.class)
    public JAXBElement<String> createGetBalanceRqstInfoInstcode(String value) {
        return new JAXBElement<String>(_NewStatusRqstInfoInstcode_QNAME, String.class, GetBalanceRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "pan", scope = GetBalanceRqstInfo.class)
    public JAXBElement<String> createGetBalanceRqstInfoPan(String value) {
        return new JAXBElement<String>(_NewStatusRspsInfoPan_QNAME, String.class, GetBalanceRqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.card.cortexws.d8.lv/xsd", name = "seqno", scope = GetBalanceRqstInfo.class)
    public JAXBElement<String> createGetBalanceRqstInfoSeqno(String value) {
        return new JAXBElement<String>(_NewStatusRqstInfoSeqno_QNAME, String.class, GetBalanceRqstInfo.class, value);
    }

}

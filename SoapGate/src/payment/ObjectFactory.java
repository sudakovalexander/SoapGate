
package payment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the payment package. 
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

    private final static QName _MakeCRD2CRDParam0_QNAME = new QName("http://service.transaction.cortexws.d8.lv", "param0");
    private final static QName _MakeCRD2CRDResponseReturn_QNAME = new QName("http://service.transaction.cortexws.d8.lv", "return");
    private final static QName _ReversePaymentRspsInfoAuthcode_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "authcode");
    private final static QName _ReversePaymentRspsInfoRejMsg_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "rejMsg");
    private final static QName _ReversePaymentRspsInfoRspcode_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "rspcode");
    private final static QName _ReversePaymentRspsInfoStan_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "stan");
    private final static QName _ReversePaymentRspsInfoTlogid_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "tlogid");
    private final static QName _ReversePaymentReqstInfoAmttxn_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "amttxn");
    private final static QName _ReversePaymentReqstInfoCardExpiry_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "cardExpiry");
    private final static QName _ReversePaymentReqstInfoCurtxn_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "curtxn");
    private final static QName _ReversePaymentReqstInfoDateLocal_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "dateLocal");
    private final static QName _ReversePaymentReqstInfoInstcode_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "instcode");
    private final static QName _ReversePaymentReqstInfoMrchNo_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "mrchNo");
    private final static QName _ReversePaymentReqstInfoPan_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "pan");
    private final static QName _ReversePaymentReqstInfoRrn_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "rrn");
    private final static QName _ReversePaymentReqstInfoSeqno_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "seqno");
    private final static QName _ReversePaymentReqstInfoTimeLocal_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "timeLocal");
    private final static QName _MakePaymentReqstInfoAdddata_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "adddata");
    private final static QName _MakePaymentReqstInfoFromAcc_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "fromAcc");
    private final static QName _MakePaymentReqstInfoTermCode_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "termCode");
    private final static QName _MakePaymentReqstInfoToAcc_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "toAcc");
    private final static QName _CRD2CRDPaymentReqstInfoClearRecipientPan_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "clearRecipientPan");
    private final static QName _CRD2CRDPaymentReqstInfoClearSenderPan_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "clearSenderPan");
    private final static QName _CRD2CRDPaymentReqstInfoCryptedRecipientPan_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "cryptedRecipientPan");
    private final static QName _CRD2CRDPaymentReqstInfoCryptedSenderPan_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "cryptedSenderPan");
    private final static QName _CRD2CRDPaymentReqstInfoDisplayRecipientPan_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "displayRecipientPan");
    private final static QName _CRD2CRDPaymentReqstInfoDisplaySenderPan_QNAME = new QName("http://valueobj.transaction.cortexws.d8.lv/xsd", "displaySenderPan");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: payment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MakeCRD2CRD }
     * 
     */
    public MakeCRD2CRD createMakeCRD2CRD() {
        return new MakeCRD2CRD();
    }

    /**
     * Create an instance of {@link CRD2CRDPaymentReqstInfo }
     * 
     */
    public CRD2CRDPaymentReqstInfo createCRD2CRDPaymentReqstInfo() {
        return new CRD2CRDPaymentReqstInfo();
    }

    /**
     * Create an instance of {@link MakeCRD2CRDResponse }
     * 
     */
    public MakeCRD2CRDResponse createMakeCRD2CRDResponse() {
        return new MakeCRD2CRDResponse();
    }

    /**
     * Create an instance of {@link CRD2CRDPaymentRspsInfo }
     * 
     */
    public CRD2CRDPaymentRspsInfo createCRD2CRDPaymentRspsInfo() {
        return new CRD2CRDPaymentRspsInfo();
    }

    /**
     * Create an instance of {@link MakePayment }
     * 
     */
    public MakePayment createMakePayment() {
        return new MakePayment();
    }

    /**
     * Create an instance of {@link MakePaymentReqstInfo }
     * 
     */
    public MakePaymentReqstInfo createMakePaymentReqstInfo() {
        return new MakePaymentReqstInfo();
    }

    /**
     * Create an instance of {@link MakePaymentResponse }
     * 
     */
    public MakePaymentResponse createMakePaymentResponse() {
        return new MakePaymentResponse();
    }

    /**
     * Create an instance of {@link MakePaymentRspsInfo }
     * 
     */
    public MakePaymentRspsInfo createMakePaymentRspsInfo() {
        return new MakePaymentRspsInfo();
    }

    /**
     * Create an instance of {@link ReversePayment }
     * 
     */
    public ReversePayment createReversePayment() {
        return new ReversePayment();
    }

    /**
     * Create an instance of {@link ReversePaymentReqstInfo }
     * 
     */
    public ReversePaymentReqstInfo createReversePaymentReqstInfo() {
        return new ReversePaymentReqstInfo();
    }

    /**
     * Create an instance of {@link ReversePaymentResponse }
     * 
     */
    public ReversePaymentResponse createReversePaymentResponse() {
        return new ReversePaymentResponse();
    }

    /**
     * Create an instance of {@link ReversePaymentRspsInfo }
     * 
     */
    public ReversePaymentRspsInfo createReversePaymentRspsInfo() {
        return new ReversePaymentRspsInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRD2CRDPaymentReqstInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.transaction.cortexws.d8.lv", name = "param0", scope = MakeCRD2CRD.class)
    public JAXBElement<CRD2CRDPaymentReqstInfo> createMakeCRD2CRDParam0(CRD2CRDPaymentReqstInfo value) {
        return new JAXBElement<CRD2CRDPaymentReqstInfo>(_MakeCRD2CRDParam0_QNAME, CRD2CRDPaymentReqstInfo.class, MakeCRD2CRD.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRD2CRDPaymentRspsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.transaction.cortexws.d8.lv", name = "return", scope = MakeCRD2CRDResponse.class)
    public JAXBElement<CRD2CRDPaymentRspsInfo> createMakeCRD2CRDResponseReturn(CRD2CRDPaymentRspsInfo value) {
        return new JAXBElement<CRD2CRDPaymentRspsInfo>(_MakeCRD2CRDResponseReturn_QNAME, CRD2CRDPaymentRspsInfo.class, MakeCRD2CRDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakePaymentReqstInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.transaction.cortexws.d8.lv", name = "param0", scope = MakePayment.class)
    public JAXBElement<MakePaymentReqstInfo> createMakePaymentParam0(MakePaymentReqstInfo value) {
        return new JAXBElement<MakePaymentReqstInfo>(_MakeCRD2CRDParam0_QNAME, MakePaymentReqstInfo.class, MakePayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakePaymentRspsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.transaction.cortexws.d8.lv", name = "return", scope = MakePaymentResponse.class)
    public JAXBElement<MakePaymentRspsInfo> createMakePaymentResponseReturn(MakePaymentRspsInfo value) {
        return new JAXBElement<MakePaymentRspsInfo>(_MakeCRD2CRDResponseReturn_QNAME, MakePaymentRspsInfo.class, MakePaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReversePaymentReqstInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.transaction.cortexws.d8.lv", name = "param0", scope = ReversePayment.class)
    public JAXBElement<ReversePaymentReqstInfo> createReversePaymentParam0(ReversePaymentReqstInfo value) {
        return new JAXBElement<ReversePaymentReqstInfo>(_MakeCRD2CRDParam0_QNAME, ReversePaymentReqstInfo.class, ReversePayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReversePaymentRspsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.transaction.cortexws.d8.lv", name = "return", scope = ReversePaymentResponse.class)
    public JAXBElement<ReversePaymentRspsInfo> createReversePaymentResponseReturn(ReversePaymentRspsInfo value) {
        return new JAXBElement<ReversePaymentRspsInfo>(_MakeCRD2CRDResponseReturn_QNAME, ReversePaymentRspsInfo.class, ReversePaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "authcode", scope = ReversePaymentRspsInfo.class)
    public JAXBElement<String> createReversePaymentRspsInfoAuthcode(String value) {
        return new JAXBElement<String>(_ReversePaymentRspsInfoAuthcode_QNAME, String.class, ReversePaymentRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "rejMsg", scope = ReversePaymentRspsInfo.class)
    public JAXBElement<String> createReversePaymentRspsInfoRejMsg(String value) {
        return new JAXBElement<String>(_ReversePaymentRspsInfoRejMsg_QNAME, String.class, ReversePaymentRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "rspcode", scope = ReversePaymentRspsInfo.class)
    public JAXBElement<String> createReversePaymentRspsInfoRspcode(String value) {
        return new JAXBElement<String>(_ReversePaymentRspsInfoRspcode_QNAME, String.class, ReversePaymentRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "stan", scope = ReversePaymentRspsInfo.class)
    public JAXBElement<String> createReversePaymentRspsInfoStan(String value) {
        return new JAXBElement<String>(_ReversePaymentRspsInfoStan_QNAME, String.class, ReversePaymentRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "tlogid", scope = ReversePaymentRspsInfo.class)
    public JAXBElement<Long> createReversePaymentRspsInfoTlogid(Long value) {
        return new JAXBElement<Long>(_ReversePaymentRspsInfoTlogid_QNAME, Long.class, ReversePaymentRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "amttxn", scope = ReversePaymentReqstInfo.class)
    public JAXBElement<Double> createReversePaymentReqstInfoAmttxn(Double value) {
        return new JAXBElement<Double>(_ReversePaymentReqstInfoAmttxn_QNAME, Double.class, ReversePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "cardExpiry", scope = ReversePaymentReqstInfo.class)
    public JAXBElement<String> createReversePaymentReqstInfoCardExpiry(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoCardExpiry_QNAME, String.class, ReversePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "curtxn", scope = ReversePaymentReqstInfo.class)
    public JAXBElement<String> createReversePaymentReqstInfoCurtxn(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoCurtxn_QNAME, String.class, ReversePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "dateLocal", scope = ReversePaymentReqstInfo.class)
    public JAXBElement<String> createReversePaymentReqstInfoDateLocal(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoDateLocal_QNAME, String.class, ReversePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "instcode", scope = ReversePaymentReqstInfo.class)
    public JAXBElement<String> createReversePaymentReqstInfoInstcode(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoInstcode_QNAME, String.class, ReversePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "mrchNo", scope = ReversePaymentReqstInfo.class)
    public JAXBElement<String> createReversePaymentReqstInfoMrchNo(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoMrchNo_QNAME, String.class, ReversePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "pan", scope = ReversePaymentReqstInfo.class)
    public JAXBElement<String> createReversePaymentReqstInfoPan(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoPan_QNAME, String.class, ReversePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "rrn", scope = ReversePaymentReqstInfo.class)
    public JAXBElement<String> createReversePaymentReqstInfoRrn(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoRrn_QNAME, String.class, ReversePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "seqno", scope = ReversePaymentReqstInfo.class)
    public JAXBElement<String> createReversePaymentReqstInfoSeqno(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoSeqno_QNAME, String.class, ReversePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "timeLocal", scope = ReversePaymentReqstInfo.class)
    public JAXBElement<String> createReversePaymentReqstInfoTimeLocal(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoTimeLocal_QNAME, String.class, ReversePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "authcode", scope = MakePaymentRspsInfo.class)
    public JAXBElement<String> createMakePaymentRspsInfoAuthcode(String value) {
        return new JAXBElement<String>(_ReversePaymentRspsInfoAuthcode_QNAME, String.class, MakePaymentRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "rejMsg", scope = MakePaymentRspsInfo.class)
    public JAXBElement<String> createMakePaymentRspsInfoRejMsg(String value) {
        return new JAXBElement<String>(_ReversePaymentRspsInfoRejMsg_QNAME, String.class, MakePaymentRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "rspcode", scope = MakePaymentRspsInfo.class)
    public JAXBElement<String> createMakePaymentRspsInfoRspcode(String value) {
        return new JAXBElement<String>(_ReversePaymentRspsInfoRspcode_QNAME, String.class, MakePaymentRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "stan", scope = MakePaymentRspsInfo.class)
    public JAXBElement<String> createMakePaymentRspsInfoStan(String value) {
        return new JAXBElement<String>(_ReversePaymentRspsInfoStan_QNAME, String.class, MakePaymentRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "tlogid", scope = MakePaymentRspsInfo.class)
    public JAXBElement<Long> createMakePaymentRspsInfoTlogid(Long value) {
        return new JAXBElement<Long>(_ReversePaymentRspsInfoTlogid_QNAME, Long.class, MakePaymentRspsInfo.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "adddata", scope = MakePaymentReqstInfo.class)
    public JAXBElement<String> createMakePaymentReqstInfoAdddata(String value) {
        return new JAXBElement<String>(_MakePaymentReqstInfoAdddata_QNAME, String.class, MakePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "amttxn", scope = MakePaymentReqstInfo.class)
    public JAXBElement<Double> createMakePaymentReqstInfoAmttxn(Double value) {
        return new JAXBElement<Double>(_ReversePaymentReqstInfoAmttxn_QNAME, Double.class, MakePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "cardExpiry", scope = MakePaymentReqstInfo.class)
    public JAXBElement<String> createMakePaymentReqstInfoCardExpiry(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoCardExpiry_QNAME, String.class, MakePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "curtxn", scope = MakePaymentReqstInfo.class)
    public JAXBElement<String> createMakePaymentReqstInfoCurtxn(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoCurtxn_QNAME, String.class, MakePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "dateLocal", scope = MakePaymentReqstInfo.class)
    public JAXBElement<String> createMakePaymentReqstInfoDateLocal(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoDateLocal_QNAME, String.class, MakePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "fromAcc", scope = MakePaymentReqstInfo.class)
    public JAXBElement<String> createMakePaymentReqstInfoFromAcc(String value) {
        return new JAXBElement<String>(_MakePaymentReqstInfoFromAcc_QNAME, String.class, MakePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "instcode", scope = MakePaymentReqstInfo.class)
    public JAXBElement<String> createMakePaymentReqstInfoInstcode(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoInstcode_QNAME, String.class, MakePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "mrchNo", scope = MakePaymentReqstInfo.class)
    public JAXBElement<String> createMakePaymentReqstInfoMrchNo(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoMrchNo_QNAME, String.class, MakePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "pan", scope = MakePaymentReqstInfo.class)
    public JAXBElement<String> createMakePaymentReqstInfoPan(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoPan_QNAME, String.class, MakePaymentReqstInfo.class, value);
    }

    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "rrn", scope = MakePaymentReqstInfo.class)
    public JAXBElement<String> createMakePaymentReqstInfoRrn(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoRrn_QNAME, String.class, MakePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "seqno", scope = MakePaymentReqstInfo.class)
    public JAXBElement<String> createMakePaymentReqstInfoSeqno(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoSeqno_QNAME, String.class, MakePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "termCode", scope = MakePaymentReqstInfo.class)
    public JAXBElement<String> createMakePaymentReqstInfoTermCode(String value) {
        return new JAXBElement<String>(_MakePaymentReqstInfoTermCode_QNAME, String.class, MakePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "timeLocal", scope = MakePaymentReqstInfo.class)
    public JAXBElement<String> createMakePaymentReqstInfoTimeLocal(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoTimeLocal_QNAME, String.class, MakePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "toAcc", scope = MakePaymentReqstInfo.class)
    public JAXBElement<String> createMakePaymentReqstInfoToAcc(String value) {
        return new JAXBElement<String>(_MakePaymentReqstInfoToAcc_QNAME, String.class, MakePaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "rejMsg", scope = CRD2CRDPaymentRspsInfo.class)
    public JAXBElement<String> createCRD2CRDPaymentRspsInfoRejMsg(String value) {
        return new JAXBElement<String>(_ReversePaymentRspsInfoRejMsg_QNAME, String.class, CRD2CRDPaymentRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "rspcode", scope = CRD2CRDPaymentRspsInfo.class)
    public JAXBElement<String> createCRD2CRDPaymentRspsInfoRspcode(String value) {
        return new JAXBElement<String>(_ReversePaymentRspsInfoRspcode_QNAME, String.class, CRD2CRDPaymentRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "tlogid", scope = CRD2CRDPaymentRspsInfo.class)
    public JAXBElement<Long> createCRD2CRDPaymentRspsInfoTlogid(Long value) {
        return new JAXBElement<Long>(_ReversePaymentRspsInfoTlogid_QNAME, Long.class, CRD2CRDPaymentRspsInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "amttxn", scope = CRD2CRDPaymentReqstInfo.class)
    public JAXBElement<Double> createCRD2CRDPaymentReqstInfoAmttxn(Double value) {
        return new JAXBElement<Double>(_ReversePaymentReqstInfoAmttxn_QNAME, Double.class, CRD2CRDPaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "cardExpiry", scope = CRD2CRDPaymentReqstInfo.class)
    public JAXBElement<String> createCRD2CRDPaymentReqstInfoCardExpiry(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoCardExpiry_QNAME, String.class, CRD2CRDPaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "clearRecipientPan", scope = CRD2CRDPaymentReqstInfo.class)
    public JAXBElement<String> createCRD2CRDPaymentReqstInfoClearRecipientPan(String value) {
        return new JAXBElement<String>(_CRD2CRDPaymentReqstInfoClearRecipientPan_QNAME, String.class, CRD2CRDPaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "clearSenderPan", scope = CRD2CRDPaymentReqstInfo.class)
    public JAXBElement<String> createCRD2CRDPaymentReqstInfoClearSenderPan(String value) {
        return new JAXBElement<String>(_CRD2CRDPaymentReqstInfoClearSenderPan_QNAME, String.class, CRD2CRDPaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "cryptedRecipientPan", scope = CRD2CRDPaymentReqstInfo.class)
    public JAXBElement<String> createCRD2CRDPaymentReqstInfoCryptedRecipientPan(String value) {
        return new JAXBElement<String>(_CRD2CRDPaymentReqstInfoCryptedRecipientPan_QNAME, String.class, CRD2CRDPaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "cryptedSenderPan", scope = CRD2CRDPaymentReqstInfo.class)
    public JAXBElement<String> createCRD2CRDPaymentReqstInfoCryptedSenderPan(String value) {
        return new JAXBElement<String>(_CRD2CRDPaymentReqstInfoCryptedSenderPan_QNAME, String.class, CRD2CRDPaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "curtxn", scope = CRD2CRDPaymentReqstInfo.class)
    public JAXBElement<String> createCRD2CRDPaymentReqstInfoCurtxn(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoCurtxn_QNAME, String.class, CRD2CRDPaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "dateLocal", scope = CRD2CRDPaymentReqstInfo.class)
    public JAXBElement<String> createCRD2CRDPaymentReqstInfoDateLocal(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoDateLocal_QNAME, String.class, CRD2CRDPaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "displayRecipientPan", scope = CRD2CRDPaymentReqstInfo.class)
    public JAXBElement<String> createCRD2CRDPaymentReqstInfoDisplayRecipientPan(String value) {
        return new JAXBElement<String>(_CRD2CRDPaymentReqstInfoDisplayRecipientPan_QNAME, String.class, CRD2CRDPaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "displaySenderPan", scope = CRD2CRDPaymentReqstInfo.class)
    public JAXBElement<String> createCRD2CRDPaymentReqstInfoDisplaySenderPan(String value) {
        return new JAXBElement<String>(_CRD2CRDPaymentReqstInfoDisplaySenderPan_QNAME, String.class, CRD2CRDPaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "termCode", scope = CRD2CRDPaymentReqstInfo.class)
    public JAXBElement<String> createCRD2CRDPaymentReqstInfoTermCode(String value) {
        return new JAXBElement<String>(_MakePaymentReqstInfoTermCode_QNAME, String.class, CRD2CRDPaymentReqstInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", name = "timeLocal", scope = CRD2CRDPaymentReqstInfo.class)
    public JAXBElement<String> createCRD2CRDPaymentReqstInfoTimeLocal(String value) {
        return new JAXBElement<String>(_ReversePaymentReqstInfoTimeLocal_QNAME, String.class, CRD2CRDPaymentReqstInfo.class, value);
    }

}

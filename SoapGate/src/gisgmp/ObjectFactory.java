
package gisgmp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gisgmp package. 
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

    private final static QName _DSCALLRESPONSE_QNAME = new QName("http://support.diasoft.ru", "DSCALLRESPONSE");
    private final static QName _DSCALL_QNAME = new QName("http://support.diasoft.ru", "DSCALL");
    private final static QName _DSCALLFAULT_QNAME = new QName("http://support.diasoft.ru", "DSCALLFAULT");
    private final static QName _DSCALLASYNC_QNAME = new QName("http://support.diasoft.ru", "DSCALLASYNC");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gisgmp
     * 
     */
    public ObjectFactory() {
    }

    public DSCALLRESPONSE createDSCALLRESPONSE() {
        return new DSCALLRESPONSE();
    }

    public DSCALL createDSCALL() {
        return new DSCALL();
    }

    public DSCALLFAULT createDSCALLFAULT() {
        return new DSCALLFAULT();
    }

    public DSCALLASYNC createDSCALLASYNC() {
        return new DSCALLASYNC();
    }

    public DsGMPPaymentNotificationInsertReq createDsGMPPaymentNotificationInsertReq() {
        return new DsGMPPaymentNotificationInsertReq();
    }

    public PaymentInfoTypeType createPaymentInfoTypeType() {
        return new PaymentInfoTypeType();
    }

    public DsGMPPaymentNotificationInsertResp createDsGMPPaymentNotificationInsertResp() {
        return new DsGMPPaymentNotificationInsertResp();
    }

    public DsGMPChargeFindListByParamReq createDsGMPChargeFindListByParamReq() {
        return new DsGMPChargeFindListByParamReq();
    }

    /**
     * Create an instance of {@link DataRequestType }
     * 
     */
    public DataRequestType createDataRequestType() {
        return new DataRequestType();
    }

    /**
     * Create an instance of {@link SupplierBillIDListType }
     * 
     */
    public SupplierBillIDListType createSupplierBillIDListType() {
        return new SupplierBillIDListType();
    }

    /**
     * Create an instance of {@link PayerListType }
     * 
     */
    public PayerListType createPayerListType() {
        return new PayerListType();
    }

    /**
     * Create an instance of {@link ExtApplicationIDListType }
     * 
     */
    public ExtApplicationIDListType createExtApplicationIDListType() {
        return new ExtApplicationIDListType();
    }

    /**
     * Create an instance of {@link DsGMPChargeFindListByParamResp }
     * 
     */
    public DsGMPChargeFindListByParamResp createDsGMPChargeFindListByParamResp() {
        return new DsGMPChargeFindListByParamResp();
    }

    /**
     * Create an instance of {@link ExportChargesResponseType }
     * 
     */
    public ExportChargesResponseType createExportChargesResponseType() {
        return new ExportChargesResponseType();
    }

    /**
     * Create an instance of {@link ChargeListType }
     * 
     */
    public ChargeListType createChargeListType() {
        return new ChargeListType();
    }

    /**
     * Create an instance of {@link NotificationListType }
     * 
     */
    public NotificationListType createNotificationListType() {
        return new NotificationListType();
    }

    /**
     * Create an instance of {@link DsGMPPaymentNotificationModifyReq }
     * 
     */
    public DsGMPPaymentNotificationModifyReq createDsGMPPaymentNotificationModifyReq() {
        return new DsGMPPaymentNotificationModifyReq();
    }

    /**
     * Create an instance of {@link DsGMPPaymentNotificationModifyResp }
     * 
     */
    public DsGMPPaymentNotificationModifyResp createDsGMPPaymentNotificationModifyResp() {
        return new DsGMPPaymentNotificationModifyResp();
    }

    public DsGMPPaymentNotificationInsertAsyncReq createDsGMPPaymentNotificationInsertAsyncReq() {
        return new DsGMPPaymentNotificationInsertAsyncReq();
    }

    public DsGMPPaymentNotificationInsertAsyncResp createDsGMPPaymentNotificationInsertAsyncResp() {
        return new DsGMPPaymentNotificationInsertAsyncResp();
    }

    /**
     * Create an instance of {@link DsGMPPaymentNotificationInsertAsyncGetByIDReq }
     * 
     */
    public DsGMPPaymentNotificationInsertAsyncGetByIDReq createDsGMPPaymentNotificationInsertAsyncGetByIDReq() {
        return new DsGMPPaymentNotificationInsertAsyncGetByIDReq();
    }

    /**
     * Create an instance of {@link DsGMPPaymentNotificationInsertAsyncGetByIDResp }
     * 
     */
    public DsGMPPaymentNotificationInsertAsyncGetByIDResp createDsGMPPaymentNotificationInsertAsyncGetByIDResp() {
        return new DsGMPPaymentNotificationInsertAsyncGetByIDResp();
    }

    /**
     * Create an instance of {@link DsGMPImportCertificateRequestReq }
     * 
     */
    public DsGMPImportCertificateRequestReq createDsGMPImportCertificateRequestReq() {
        return new DsGMPImportCertificateRequestReq();
    }

    /**
     * Create an instance of {@link PayerInstitutionAddressType }
     * 
     */
    public PayerInstitutionAddressType createPayerInstitutionAddressType() {
        return new PayerInstitutionAddressType();
    }

    /**
     * Create an instance of {@link ContactInstitutionList }
     * 
     */
    public ContactInstitutionList createContactInstitutionList() {
        return new ContactInstitutionList();
    }

    /**
     * Create an instance of {@link BankType }
     * 
     */
    public BankType createBankType() {
        return new BankType();
    }

    /**
     * Create an instance of {@link PaymentIdentificationDataType }
     * 
     */
    public PaymentIdentificationDataType createPaymentIdentificationDataType() {
        return new PaymentIdentificationDataType();
    }

    /**
     * Create an instance of {@link BudgetIndex }
     * 
     */
    public BudgetIndex createBudgetIndex() {
        return new BudgetIndex();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link PostBlockType }
     * 
     */
    public PostBlockType createPostBlockType() {
        return new PostBlockType();
    }

    /**
     * Create an instance of {@link PayerListElementType }
     * 
     */
    public PayerListElementType createPayerListElementType() {
        return new PayerListElementType();
    }

    /**
     * Create an instance of {@link NotificationType }
     * 
     */
    public NotificationType createNotificationType() {
        return new NotificationType();
    }

    /**
     * Create an instance of {@link GMPChargeAdditionalDataListElementType }
     * 
     */
    public GMPChargeAdditionalDataListElementType createGMPChargeAdditionalDataListElementType() {
        return new GMPChargeAdditionalDataListElementType();
    }

    /**
     * Create an instance of {@link GMPChargeAdditionalDataListType }
     * 
     */
    public GMPChargeAdditionalDataListType createGMPChargeAdditionalDataListType() {
        return new GMPChargeAdditionalDataListType();
    }

    /**
     * Create an instance of {@link PayeeContactListElementType }
     * 
     */
    public PayeeContactListElementType createPayeeContactListElementType() {
        return new PayeeContactListElementType();
    }

    /**
     * Create an instance of {@link PayeeContactListType }
     * 
     */
    public PayeeContactListType createPayeeContactListType() {
        return new PayeeContactListType();
    }

    /**
     * Create an instance of {@link ChargeElementType }
     * 
     */
    public ChargeElementType createChargeElementType() {
        return new ChargeElementType();
    }

    /**
     * Create an instance of {@link PayeeAddressListElementType }
     * 
     */
    public PayeeAddressListElementType createPayeeAddressListElementType() {
        return new PayeeAddressListElementType();
    }

    /**
     * Create an instance of {@link PayeeAddressListType }
     * 
     */
    public PayeeAddressListType createPayeeAddressListType() {
        return new PayeeAddressListType();
    }

    /**
     * Create an instance of {@link PayeeInstitutionContactType }
     * 
     */
    public PayeeInstitutionContactType createPayeeInstitutionContactType() {
        return new PayeeInstitutionContactType();
    }

    /**
     * Create an instance of {@link PayeeInstitutionContactsType }
     * 
     */
    public PayeeInstitutionContactsType createPayeeInstitutionContactsType() {
        return new PayeeInstitutionContactsType();
    }

    /**
     * Create an instance of {@link PayeeInstitutionAddressFieldType }
     * 
     */
    public PayeeInstitutionAddressFieldType createPayeeInstitutionAddressFieldType() {
        return new PayeeInstitutionAddressFieldType();
    }

    /**
     * Create an instance of {@link PayeeInstitutionAddressDataType }
     * 
     */
    public PayeeInstitutionAddressDataType createPayeeInstitutionAddressDataType() {
        return new PayeeInstitutionAddressDataType();
    }

    /**
     * Create an instance of {@link PayeeBankType }
     * 
     */
    public PayeeBankType createPayeeBankType() {
        return new PayeeBankType();
    }

    /**
     * Create an instance of {@link PayeeAccountListElementType }
     * 
     */
    public PayeeAccountListElementType createPayeeAccountListElementType() {
        return new PayeeAccountListElementType();
    }

    /**
     * Create an instance of {@link PayeeAccountListType }
     * 
     */
    public PayeeAccountListType createPayeeAccountListType() {
        return new PayeeAccountListType();
    }

    /**
     * Create an instance of {@link BudgetIndexType }
     * 
     */
    public BudgetIndexType createBudgetIndexType() {
        return new BudgetIndexType();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link BillType }
     * 
     */
    public BillType createBillType() {
        return new BillType();
    }

    /**
     * Create an instance of {@link GMPChargeMainListElementType }
     * 
     */
    public GMPChargeMainListElementType createGMPChargeMainListElementType() {
        return new GMPChargeMainListElementType();
    }

    /**
     * Create an instance of {@link GMPChargeMainListType }
     * 
     */
    public GMPChargeMainListType createGMPChargeMainListType() {
        return new GMPChargeMainListType();
    }

    /**
     * Create an instance of {@link RequestProcessResultType }
     * 
     */
    public RequestProcessResultType createRequestProcessResultType() {
        return new RequestProcessResultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSCALLRESPONSE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://support.diasoft.ru", name = "DSCALLRESPONSE")
    public JAXBElement<DSCALLRESPONSE> createDSCALLRESPONSE(DSCALLRESPONSE value) {
        return new JAXBElement<DSCALLRESPONSE>(_DSCALLRESPONSE_QNAME, DSCALLRESPONSE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSCALL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://support.diasoft.ru", name = "DSCALL")
    public JAXBElement<DSCALL> createDSCALL(DSCALL value) {
        return new JAXBElement<DSCALL>(_DSCALL_QNAME, DSCALL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSCALLFAULT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://support.diasoft.ru", name = "DSCALLFAULT")
    public JAXBElement<DSCALLFAULT> createDSCALLFAULT(DSCALLFAULT value) {
        return new JAXBElement<DSCALLFAULT>(_DSCALLFAULT_QNAME, DSCALLFAULT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSCALLASYNC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://support.diasoft.ru", name = "DSCALLASYNC")
    public JAXBElement<DSCALLASYNC> createDSCALLASYNC(DSCALLASYNC value) {
        return new JAXBElement<DSCALLASYNC>(_DSCALLASYNC_QNAME, DSCALLASYNC.class, null, value);
    }

}

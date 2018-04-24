
package giszhkh;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dsGISZHKHSinglePaymentNotificationInsertAsyncReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsGISZHKHSinglePaymentNotificationInsertAsyncReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://support.ftgiszhkhreqprocws.V01.diasoft.ru}dsLoggerParams"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInformation_RecipientINN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInformation_RecipientKPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInformation_BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInformation_PaymentRecipient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInformation_BankBIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInformation_operatingAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInformation_CorrespondentBankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_OrderDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_OrderNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_PaymentPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_PaymentDocumentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_ServiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_UnifiedAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_Year" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_Month" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_PaymentDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_FIASHouseGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_Apartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_Placement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_AddressAndConsumer_Ind_Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_AddressAndConsumer_Ind_FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_AddressAndConsumer_Ind_Patronymic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_AddressAndConsumer_INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderInfo_Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SupplierInfo_SupplierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SupplierInfo_SupplierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipientInfo_INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipientInfo_KPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipientInfo_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChangeStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Flag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ParentDocumentID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dsGISZHKHSinglePaymentNotificationInsertAsyncReq", namespace = "http://support.ftgiszhkhreqprocws.V01.diasoft.ru", propOrder = {
    "paymentOrderID",
    "paymentInformationRecipientINN",
    "paymentInformationRecipientKPP",
    "paymentInformationBankName",
    "paymentInformationPaymentRecipient",
    "paymentInformationBankBIK",
    "paymentInformationOperatingAccountNumber",
    "paymentInformationCorrespondentBankAccount",
    "orderInfoOrderDate",
    "orderInfoOrderNum",
    "orderInfoAmount",
    "orderInfoPaymentPurpose",
    "orderInfoOrderID",
    "orderInfoPaymentDocumentID",
    "orderInfoServiceID",
    "orderInfoUnifiedAccountNumber",
    "orderInfoYear",
    "orderInfoMonth",
    "orderInfoPaymentDocumentNumber",
    "orderInfoAccountNumber",
    "orderInfoFIASHouseGuid",
    "orderInfoApartment",
    "orderInfoPlacement",
    "orderInfoAddressAndConsumerIndSurname",
    "orderInfoAddressAndConsumerIndFirstName",
    "orderInfoAddressAndConsumerIndPatronymic",
    "orderInfoAddressAndConsumerINN",
    "consumerFullName",
    "orderInfoComment",
    "supplierInfoSupplierID",
    "supplierInfoSupplierName",
    "recipientInfoINN",
    "recipientInfoKPP",
    "recipientInfoName",
    "changeStatus",
    "flag",
    "parentDocumentID",
    "note",
    "branchCode"
})
public class DsGISZHKHSinglePaymentNotificationInsertAsyncReq
    extends DsLoggerParams
{

    @XmlElement(name = "PaymentOrderID")
    protected String paymentOrderID;
    @XmlElement(name = "PaymentInformation_RecipientINN")
    protected String paymentInformationRecipientINN;
    @XmlElement(name = "PaymentInformation_RecipientKPP")
    protected String paymentInformationRecipientKPP;
    @XmlElement(name = "PaymentInformation_BankName")
    protected String paymentInformationBankName;
    @XmlElement(name = "PaymentInformation_PaymentRecipient")
    protected String paymentInformationPaymentRecipient;
    @XmlElement(name = "PaymentInformation_BankBIK")
    protected String paymentInformationBankBIK;
    @XmlElement(name = "PaymentInformation_operatingAccountNumber")
    protected String paymentInformationOperatingAccountNumber;
    @XmlElement(name = "PaymentInformation_CorrespondentBankAccount")
    protected String paymentInformationCorrespondentBankAccount;
    @XmlElement(name = "OrderInfo_OrderDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderInfoOrderDate;
    @XmlElement(name = "OrderInfo_OrderNum")
    protected String orderInfoOrderNum;
    @XmlElement(name = "OrderInfo_Amount")
    protected BigDecimal orderInfoAmount;
    @XmlElement(name = "OrderInfo_PaymentPurpose")
    protected String orderInfoPaymentPurpose;
    @XmlElement(name = "OrderInfo_OrderID")
    protected String orderInfoOrderID;
    @XmlElement(name = "OrderInfo_PaymentDocumentID")
    protected String orderInfoPaymentDocumentID;
    @XmlElement(name = "OrderInfo_ServiceID")
    protected String orderInfoServiceID;
    @XmlElement(name = "OrderInfo_UnifiedAccountNumber")
    protected String orderInfoUnifiedAccountNumber;
    @XmlElement(name = "OrderInfo_Year")
    protected Short orderInfoYear;
    @XmlElement(name = "OrderInfo_Month")
    protected Integer orderInfoMonth;
    @XmlElement(name = "OrderInfo_PaymentDocumentNumber")
    protected String orderInfoPaymentDocumentNumber;
    @XmlElement(name = "OrderInfo_AccountNumber")
    protected String orderInfoAccountNumber;
    @XmlElement(name = "OrderInfo_FIASHouseGuid")
    protected String orderInfoFIASHouseGuid;
    @XmlElement(name = "OrderInfo_Apartment")
    protected String orderInfoApartment;
    @XmlElement(name = "OrderInfo_Placement")
    protected String orderInfoPlacement;
    @XmlElement(name = "OrderInfo_AddressAndConsumer_Ind_Surname")
    protected String orderInfoAddressAndConsumerIndSurname;
    @XmlElement(name = "OrderInfo_AddressAndConsumer_Ind_FirstName")
    protected String orderInfoAddressAndConsumerIndFirstName;
    @XmlElement(name = "OrderInfo_AddressAndConsumer_Ind_Patronymic")
    protected String orderInfoAddressAndConsumerIndPatronymic;
    @XmlElement(name = "OrderInfo_AddressAndConsumer_INN")
    protected String orderInfoAddressAndConsumerINN;
    @XmlElement(name = "ConsumerFullName")
    protected String consumerFullName;
    @XmlElement(name = "OrderInfo_Comment")
    protected String orderInfoComment;
    @XmlElement(name = "SupplierInfo_SupplierID")
    protected String supplierInfoSupplierID;
    @XmlElement(name = "SupplierInfo_SupplierName")
    protected String supplierInfoSupplierName;
    @XmlElement(name = "RecipientInfo_INN")
    protected String recipientInfoINN;
    @XmlElement(name = "RecipientInfo_KPP")
    protected String recipientInfoKPP;
    @XmlElement(name = "RecipientInfo_Name")
    protected String recipientInfoName;
    @XmlElement(name = "ChangeStatus")
    protected Integer changeStatus;
    @XmlElement(name = "Flag")
    protected Integer flag;
    @XmlElement(name = "ParentDocumentID")
    protected Long parentDocumentID;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "BranchCode")
    protected String branchCode;

    /**
     * Gets the value of the paymentOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrderID() {
        return paymentOrderID;
    }

    /**
     * Sets the value of the paymentOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrderID(String value) {
        this.paymentOrderID = value;
    }

    /**
     * Gets the value of the paymentInformationRecipientINN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInformationRecipientINN() {
        return paymentInformationRecipientINN;
    }

    /**
     * Sets the value of the paymentInformationRecipientINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInformationRecipientINN(String value) {
        this.paymentInformationRecipientINN = value;
    }

    /**
     * Gets the value of the paymentInformationRecipientKPP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInformationRecipientKPP() {
        return paymentInformationRecipientKPP;
    }

    /**
     * Sets the value of the paymentInformationRecipientKPP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInformationRecipientKPP(String value) {
        this.paymentInformationRecipientKPP = value;
    }

    /**
     * Gets the value of the paymentInformationBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInformationBankName() {
        return paymentInformationBankName;
    }

    /**
     * Sets the value of the paymentInformationBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInformationBankName(String value) {
        this.paymentInformationBankName = value;
    }

    /**
     * Gets the value of the paymentInformationPaymentRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInformationPaymentRecipient() {
        return paymentInformationPaymentRecipient;
    }

    /**
     * Sets the value of the paymentInformationPaymentRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInformationPaymentRecipient(String value) {
        this.paymentInformationPaymentRecipient = value;
    }

    /**
     * Gets the value of the paymentInformationBankBIK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInformationBankBIK() {
        return paymentInformationBankBIK;
    }

    /**
     * Sets the value of the paymentInformationBankBIK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInformationBankBIK(String value) {
        this.paymentInformationBankBIK = value;
    }

    /**
     * Gets the value of the paymentInformationOperatingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInformationOperatingAccountNumber() {
        return paymentInformationOperatingAccountNumber;
    }

    /**
     * Sets the value of the paymentInformationOperatingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInformationOperatingAccountNumber(String value) {
        this.paymentInformationOperatingAccountNumber = value;
    }

    /**
     * Gets the value of the paymentInformationCorrespondentBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInformationCorrespondentBankAccount() {
        return paymentInformationCorrespondentBankAccount;
    }

    /**
     * Sets the value of the paymentInformationCorrespondentBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInformationCorrespondentBankAccount(String value) {
        this.paymentInformationCorrespondentBankAccount = value;
    }

    /**
     * Gets the value of the orderInfoOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderInfoOrderDate() {
        return orderInfoOrderDate;
    }

    /**
     * Sets the value of the orderInfoOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderInfoOrderDate(XMLGregorianCalendar value) {
        this.orderInfoOrderDate = value;
    }

    /**
     * Gets the value of the orderInfoOrderNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoOrderNum() {
        return orderInfoOrderNum;
    }

    /**
     * Sets the value of the orderInfoOrderNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoOrderNum(String value) {
        this.orderInfoOrderNum = value;
    }

    /**
     * Gets the value of the orderInfoAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderInfoAmount() {
        return orderInfoAmount;
    }

    /**
     * Sets the value of the orderInfoAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderInfoAmount(BigDecimal value) {
        this.orderInfoAmount = value;
    }

    /**
     * Gets the value of the orderInfoPaymentPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoPaymentPurpose() {
        return orderInfoPaymentPurpose;
    }

    /**
     * Sets the value of the orderInfoPaymentPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoPaymentPurpose(String value) {
        this.orderInfoPaymentPurpose = value;
    }

    /**
     * Gets the value of the orderInfoOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoOrderID() {
        return orderInfoOrderID;
    }

    /**
     * Sets the value of the orderInfoOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoOrderID(String value) {
        this.orderInfoOrderID = value;
    }

    /**
     * Gets the value of the orderInfoPaymentDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoPaymentDocumentID() {
        return orderInfoPaymentDocumentID;
    }

    /**
     * Sets the value of the orderInfoPaymentDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoPaymentDocumentID(String value) {
        this.orderInfoPaymentDocumentID = value;
    }

    /**
     * Gets the value of the orderInfoServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoServiceID() {
        return orderInfoServiceID;
    }

    /**
     * Sets the value of the orderInfoServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoServiceID(String value) {
        this.orderInfoServiceID = value;
    }

    /**
     * Gets the value of the orderInfoUnifiedAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoUnifiedAccountNumber() {
        return orderInfoUnifiedAccountNumber;
    }

    /**
     * Sets the value of the orderInfoUnifiedAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoUnifiedAccountNumber(String value) {
        this.orderInfoUnifiedAccountNumber = value;
    }

    /**
     * Gets the value of the orderInfoYear property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOrderInfoYear() {
        return orderInfoYear;
    }

    /**
     * Sets the value of the orderInfoYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOrderInfoYear(Short value) {
        this.orderInfoYear = value;
    }

    /**
     * Gets the value of the orderInfoMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderInfoMonth() {
        return orderInfoMonth;
    }

    /**
     * Sets the value of the orderInfoMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderInfoMonth(Integer value) {
        this.orderInfoMonth = value;
    }

    /**
     * Gets the value of the orderInfoPaymentDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoPaymentDocumentNumber() {
        return orderInfoPaymentDocumentNumber;
    }

    /**
     * Sets the value of the orderInfoPaymentDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoPaymentDocumentNumber(String value) {
        this.orderInfoPaymentDocumentNumber = value;
    }

    /**
     * Gets the value of the orderInfoAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoAccountNumber() {
        return orderInfoAccountNumber;
    }

    /**
     * Sets the value of the orderInfoAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoAccountNumber(String value) {
        this.orderInfoAccountNumber = value;
    }

    /**
     * Gets the value of the orderInfoFIASHouseGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoFIASHouseGuid() {
        return orderInfoFIASHouseGuid;
    }

    /**
     * Sets the value of the orderInfoFIASHouseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoFIASHouseGuid(String value) {
        this.orderInfoFIASHouseGuid = value;
    }

    /**
     * Gets the value of the orderInfoApartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoApartment() {
        return orderInfoApartment;
    }

    /**
     * Sets the value of the orderInfoApartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoApartment(String value) {
        this.orderInfoApartment = value;
    }

    /**
     * Gets the value of the orderInfoPlacement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoPlacement() {
        return orderInfoPlacement;
    }

    /**
     * Sets the value of the orderInfoPlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoPlacement(String value) {
        this.orderInfoPlacement = value;
    }

    /**
     * Gets the value of the orderInfoAddressAndConsumerIndSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoAddressAndConsumerIndSurname() {
        return orderInfoAddressAndConsumerIndSurname;
    }

    /**
     * Sets the value of the orderInfoAddressAndConsumerIndSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoAddressAndConsumerIndSurname(String value) {
        this.orderInfoAddressAndConsumerIndSurname = value;
    }

    /**
     * Gets the value of the orderInfoAddressAndConsumerIndFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoAddressAndConsumerIndFirstName() {
        return orderInfoAddressAndConsumerIndFirstName;
    }

    /**
     * Sets the value of the orderInfoAddressAndConsumerIndFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoAddressAndConsumerIndFirstName(String value) {
        this.orderInfoAddressAndConsumerIndFirstName = value;
    }

    /**
     * Gets the value of the orderInfoAddressAndConsumerIndPatronymic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoAddressAndConsumerIndPatronymic() {
        return orderInfoAddressAndConsumerIndPatronymic;
    }

    /**
     * Sets the value of the orderInfoAddressAndConsumerIndPatronymic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoAddressAndConsumerIndPatronymic(String value) {
        this.orderInfoAddressAndConsumerIndPatronymic = value;
    }

    /**
     * Gets the value of the orderInfoAddressAndConsumerINN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoAddressAndConsumerINN() {
        return orderInfoAddressAndConsumerINN;
    }

    /**
     * Sets the value of the orderInfoAddressAndConsumerINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoAddressAndConsumerINN(String value) {
        this.orderInfoAddressAndConsumerINN = value;
    }

    /**
     * Gets the value of the consumerFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerFullName() {
        return consumerFullName;
    }

    /**
     * Sets the value of the consumerFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerFullName(String value) {
        this.consumerFullName = value;
    }

    /**
     * Gets the value of the orderInfoComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoComment() {
        return orderInfoComment;
    }

    /**
     * Sets the value of the orderInfoComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoComment(String value) {
        this.orderInfoComment = value;
    }

    /**
     * Gets the value of the supplierInfoSupplierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierInfoSupplierID() {
        return supplierInfoSupplierID;
    }

    /**
     * Sets the value of the supplierInfoSupplierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierInfoSupplierID(String value) {
        this.supplierInfoSupplierID = value;
    }

    /**
     * Gets the value of the supplierInfoSupplierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierInfoSupplierName() {
        return supplierInfoSupplierName;
    }

    /**
     * Sets the value of the supplierInfoSupplierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierInfoSupplierName(String value) {
        this.supplierInfoSupplierName = value;
    }

    /**
     * Gets the value of the recipientInfoINN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientInfoINN() {
        return recipientInfoINN;
    }

    /**
     * Sets the value of the recipientInfoINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientInfoINN(String value) {
        this.recipientInfoINN = value;
    }

    /**
     * Gets the value of the recipientInfoKPP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientInfoKPP() {
        return recipientInfoKPP;
    }

    /**
     * Sets the value of the recipientInfoKPP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientInfoKPP(String value) {
        this.recipientInfoKPP = value;
    }

    /**
     * Gets the value of the recipientInfoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientInfoName() {
        return recipientInfoName;
    }

    /**
     * Sets the value of the recipientInfoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientInfoName(String value) {
        this.recipientInfoName = value;
    }

    /**
     * Gets the value of the changeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChangeStatus() {
        return changeStatus;
    }

    /**
     * Sets the value of the changeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChangeStatus(Integer value) {
        this.changeStatus = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlag(Integer value) {
        this.flag = value;
    }

    /**
     * Gets the value of the parentDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentDocumentID() {
        return parentDocumentID;
    }

    /**
     * Sets the value of the parentDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentDocumentID(Long value) {
        this.parentDocumentID = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

}

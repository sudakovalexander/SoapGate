
package gisgmp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentInfoTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInfoTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecipientServicesIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipientServicesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipientServicesTypeBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipientServicesResidentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecipientServicesSNILSNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="RecipientServicesINN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipientServicesKPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipientServicesDocumentTypeBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipientServicesDocumentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipientServicesDocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipientServicesDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipientServicesCitizenCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecipientServicesCitizenCountryBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChangeStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ChangeStatusReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PayeeINN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PayeeKPP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BudgetClassifierCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OKATO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInfoType" type="{http://support.diasoft.ru}PaymentType" minOccurs="0"/&gt;
 *         &lt;element name="PayeeAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeSubAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeInstitutionBIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInfoTypeType", propOrder = {
    "recipientServicesIdentifier",
    "recipientServicesType",
    "recipientServicesTypeBrief",
    "recipientServicesResidentFlag",
    "recipientServicesSNILSNumber",
    "recipientServicesINN",
    "recipientServicesKPP",
    "recipientServicesDocumentTypeBrief",
    "recipientServicesDocumentTypeCode",
    "recipientServicesDocumentSeries",
    "recipientServicesDocumentNumber",
    "recipientServicesCitizenCountryCode",
    "recipientServicesCitizenCountryBrief",
    "changeStatus",
    "changeStatusReason",
    "payeeINN",
    "payeeKPP",
    "budgetClassifierCode",
    "okato",
    "version",
    "paymentInfoType",
    "payeeAccountType",
    "payeeAccount",
    "payeeSubAccountNumber",
    "payeeInstitutionBIC",
    "payeeName"
})
public class PaymentInfoTypeType {

    @XmlElement(name = "RecipientServicesIdentifier")
    protected String recipientServicesIdentifier;
    @XmlElement(name = "RecipientServicesType")
    protected String recipientServicesType;
    @XmlElement(name = "RecipientServicesTypeBrief")
    protected String recipientServicesTypeBrief;
    @XmlElement(name = "RecipientServicesResidentFlag")
    protected Boolean recipientServicesResidentFlag;
    @XmlElement(name = "RecipientServicesSNILSNumber")
    protected BigInteger recipientServicesSNILSNumber;
    @XmlElement(name = "RecipientServicesINN")
    protected String recipientServicesINN;
    @XmlElement(name = "RecipientServicesKPP")
    protected String recipientServicesKPP;
    @XmlElement(name = "RecipientServicesDocumentTypeBrief")
    protected String recipientServicesDocumentTypeBrief;
    @XmlElement(name = "RecipientServicesDocumentTypeCode")
    protected String recipientServicesDocumentTypeCode;
    @XmlElement(name = "RecipientServicesDocumentSeries")
    protected String recipientServicesDocumentSeries;
    @XmlElement(name = "RecipientServicesDocumentNumber")
    protected String recipientServicesDocumentNumber;
    @XmlElement(name = "RecipientServicesCitizenCountryCode")
    protected String recipientServicesCitizenCountryCode;
    @XmlElement(name = "RecipientServicesCitizenCountryBrief")
    protected String recipientServicesCitizenCountryBrief;
    @XmlElement(name = "ChangeStatus", required = true)
    protected String changeStatus;
    @XmlElement(name = "ChangeStatusReason", required = true)
    protected String changeStatusReason;
    @XmlElement(name = "PayeeINN", required = true)
    protected String payeeINN;
    @XmlElement(name = "PayeeKPP", required = true)
    protected String payeeKPP;
    @XmlElement(name = "BudgetClassifierCode", required = true)
    protected String budgetClassifierCode;
    @XmlElement(name = "OKATO", required = true)
    protected String okato;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "PaymentInfoType")
    protected PaymentType paymentInfoType;
    @XmlElement(name = "PayeeAccountType")
    protected String payeeAccountType;
    @XmlElement(name = "PayeeAccount")
    protected String payeeAccount;
    @XmlElement(name = "PayeeSubAccountNumber")
    protected String payeeSubAccountNumber;
    @XmlElement(name = "PayeeInstitutionBIC")
    protected String payeeInstitutionBIC;
    @XmlElement(name = "PayeeName")
    protected String payeeName;

    /**
     * Gets the value of the recipientServicesIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientServicesIdentifier() {
        return recipientServicesIdentifier;
    }

    /**
     * Sets the value of the recipientServicesIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientServicesIdentifier(String value) {
        this.recipientServicesIdentifier = value;
    }

    /**
     * Gets the value of the recipientServicesType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientServicesType() {
        return recipientServicesType;
    }

    /**
     * Sets the value of the recipientServicesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientServicesType(String value) {
        this.recipientServicesType = value;
    }

    /**
     * Gets the value of the recipientServicesTypeBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientServicesTypeBrief() {
        return recipientServicesTypeBrief;
    }

    /**
     * Sets the value of the recipientServicesTypeBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientServicesTypeBrief(String value) {
        this.recipientServicesTypeBrief = value;
    }

    /**
     * Gets the value of the recipientServicesResidentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecipientServicesResidentFlag() {
        return recipientServicesResidentFlag;
    }

    /**
     * Sets the value of the recipientServicesResidentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecipientServicesResidentFlag(Boolean value) {
        this.recipientServicesResidentFlag = value;
    }

    /**
     * Gets the value of the recipientServicesSNILSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecipientServicesSNILSNumber() {
        return recipientServicesSNILSNumber;
    }

    /**
     * Sets the value of the recipientServicesSNILSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecipientServicesSNILSNumber(BigInteger value) {
        this.recipientServicesSNILSNumber = value;
    }

    /**
     * Gets the value of the recipientServicesINN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientServicesINN() {
        return recipientServicesINN;
    }

    /**
     * Sets the value of the recipientServicesINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientServicesINN(String value) {
        this.recipientServicesINN = value;
    }

    /**
     * Gets the value of the recipientServicesKPP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientServicesKPP() {
        return recipientServicesKPP;
    }

    /**
     * Sets the value of the recipientServicesKPP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientServicesKPP(String value) {
        this.recipientServicesKPP = value;
    }

    /**
     * Gets the value of the recipientServicesDocumentTypeBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientServicesDocumentTypeBrief() {
        return recipientServicesDocumentTypeBrief;
    }

    /**
     * Sets the value of the recipientServicesDocumentTypeBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientServicesDocumentTypeBrief(String value) {
        this.recipientServicesDocumentTypeBrief = value;
    }

    /**
     * Gets the value of the recipientServicesDocumentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientServicesDocumentTypeCode() {
        return recipientServicesDocumentTypeCode;
    }

    /**
     * Sets the value of the recipientServicesDocumentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientServicesDocumentTypeCode(String value) {
        this.recipientServicesDocumentTypeCode = value;
    }

    /**
     * Gets the value of the recipientServicesDocumentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientServicesDocumentSeries() {
        return recipientServicesDocumentSeries;
    }

    /**
     * Sets the value of the recipientServicesDocumentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientServicesDocumentSeries(String value) {
        this.recipientServicesDocumentSeries = value;
    }

    /**
     * Gets the value of the recipientServicesDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientServicesDocumentNumber() {
        return recipientServicesDocumentNumber;
    }

    /**
     * Sets the value of the recipientServicesDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientServicesDocumentNumber(String value) {
        this.recipientServicesDocumentNumber = value;
    }

    /**
     * Gets the value of the recipientServicesCitizenCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientServicesCitizenCountryCode() {
        return recipientServicesCitizenCountryCode;
    }

    /**
     * Sets the value of the recipientServicesCitizenCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientServicesCitizenCountryCode(String value) {
        this.recipientServicesCitizenCountryCode = value;
    }

    /**
     * Gets the value of the recipientServicesCitizenCountryBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientServicesCitizenCountryBrief() {
        return recipientServicesCitizenCountryBrief;
    }

    /**
     * Sets the value of the recipientServicesCitizenCountryBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientServicesCitizenCountryBrief(String value) {
        this.recipientServicesCitizenCountryBrief = value;
    }

    /**
     * Gets the value of the changeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeStatus() {
        return changeStatus;
    }

    /**
     * Sets the value of the changeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeStatus(String value) {
        this.changeStatus = value;
    }

    /**
     * Gets the value of the changeStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeStatusReason() {
        return changeStatusReason;
    }

    /**
     * Sets the value of the changeStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeStatusReason(String value) {
        this.changeStatusReason = value;
    }

    /**
     * Gets the value of the payeeINN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeINN() {
        return payeeINN;
    }

    /**
     * Sets the value of the payeeINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeINN(String value) {
        this.payeeINN = value;
    }

    /**
     * Gets the value of the payeeKPP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeKPP() {
        return payeeKPP;
    }

    /**
     * Sets the value of the payeeKPP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeKPP(String value) {
        this.payeeKPP = value;
    }

    /**
     * Gets the value of the budgetClassifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetClassifierCode() {
        return budgetClassifierCode;
    }

    /**
     * Sets the value of the budgetClassifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBudgetClassifierCode(String value) {
        this.budgetClassifierCode = value;
    }

    /**
     * Gets the value of the okato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKATO() {
        return okato;
    }

    /**
     * Sets the value of the okato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKATO(String value) {
        this.okato = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the paymentInfoType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentInfoType() {
        return paymentInfoType;
    }

    /**
     * Sets the value of the paymentInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentInfoType(PaymentType value) {
        this.paymentInfoType = value;
    }

    /**
     * Gets the value of the payeeAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeAccountType() {
        return payeeAccountType;
    }

    /**
     * Sets the value of the payeeAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeAccountType(String value) {
        this.payeeAccountType = value;
    }

    /**
     * Gets the value of the payeeAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeAccount() {
        return payeeAccount;
    }

    /**
     * Sets the value of the payeeAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeAccount(String value) {
        this.payeeAccount = value;
    }

    /**
     * Gets the value of the payeeSubAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeSubAccountNumber() {
        return payeeSubAccountNumber;
    }

    /**
     * Sets the value of the payeeSubAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeSubAccountNumber(String value) {
        this.payeeSubAccountNumber = value;
    }

    /**
     * Gets the value of the payeeInstitutionBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionBIC() {
        return payeeInstitutionBIC;
    }

    /**
     * Sets the value of the payeeInstitutionBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionBIC(String value) {
        this.payeeInstitutionBIC = value;
    }

    /**
     * Gets the value of the payeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeName(String value) {
        this.payeeName = value;
    }

}

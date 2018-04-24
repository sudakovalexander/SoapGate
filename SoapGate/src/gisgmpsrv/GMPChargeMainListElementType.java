
package gisgmpsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GMPChargeMainListElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMPChargeMainListElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="AmountToPay" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ChargeType" type="{http://support.diasoft.ru}BillType"/&gt;
 *         &lt;element name="ChargeChangeStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TreasureBranch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BudgetClassifierCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OKATO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BudgetIndex" type="{http://support.diasoft.ru}BudgetIndexType"/&gt;
 *         &lt;element name="ExtApplicationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnifiedPayerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerTypeBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerResidentFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerSNILSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerINN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerKPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AltPayerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerDocumentTypeBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerDocumentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerDocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerCitizenCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerCitizenCountryBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMPChargeMainListElementType", propOrder = {
    "linkID",
    "amountToPay",
    "chargeType",
    "chargeChangeStatus",
    "treasureBranch",
    "budgetClassifierCode",
    "okato",
    "budgetIndex",
    "extApplicationID",
    "unifiedPayerIdentifier",
    "payerType",
    "payerTypeBrief",
    "payerResidentFlag",
    "payerSNILSNumber",
    "payerINN",
    "payerKPP",
    "altPayerIdentifier",
    "payerDocumentTypeBrief",
    "payerDocumentTypeCode",
    "payerDocumentSeries",
    "payerDocumentNumber",
    "payerCitizenCountryCode",
    "payerCitizenCountryBrief"
})
public class GMPChargeMainListElementType {

    @XmlElement(name = "LinkID")
    protected long linkID;
    @XmlElement(name = "AmountToPay")
    protected long amountToPay;
    @XmlElement(name = "ChargeType", required = true)
    protected BillType chargeType;
    @XmlElement(name = "ChargeChangeStatus", required = true)
    protected String chargeChangeStatus;
    @XmlElement(name = "TreasureBranch", required = true)
    protected String treasureBranch;
    @XmlElement(name = "BudgetClassifierCode", required = true)
    protected String budgetClassifierCode;
    @XmlElement(name = "OKATO", required = true)
    protected String okato;
    @XmlElement(name = "BudgetIndex", required = true)
    protected BudgetIndexType budgetIndex;
    @XmlElement(name = "ExtApplicationID")
    protected String extApplicationID;
    @XmlElement(name = "UnifiedPayerIdentifier")
    protected String unifiedPayerIdentifier;
    @XmlElement(name = "PayerType")
    protected String payerType;
    @XmlElement(name = "PayerTypeBrief")
    protected String payerTypeBrief;
    @XmlElement(name = "PayerResidentFlag")
    protected String payerResidentFlag;
    @XmlElement(name = "PayerSNILSNumber")
    protected String payerSNILSNumber;
    @XmlElement(name = "PayerINN")
    protected String payerINN;
    @XmlElement(name = "PayerKPP")
    protected String payerKPP;
    @XmlElement(name = "AltPayerIdentifier")
    protected String altPayerIdentifier;
    @XmlElement(name = "PayerDocumentTypeBrief")
    protected String payerDocumentTypeBrief;
    @XmlElement(name = "PayerDocumentTypeCode")
    protected String payerDocumentTypeCode;
    @XmlElement(name = "PayerDocumentSeries")
    protected String payerDocumentSeries;
    @XmlElement(name = "PayerDocumentNumber")
    protected String payerDocumentNumber;
    @XmlElement(name = "PayerCitizenCountryCode")
    protected String payerCitizenCountryCode;
    @XmlElement(name = "PayerCitizenCountryBrief")
    protected String payerCitizenCountryBrief;

    /**
     * Gets the value of the linkID property.
     * 
     */
    public long getLinkID() {
        return linkID;
    }

    /**
     * Sets the value of the linkID property.
     * 
     */
    public void setLinkID(long value) {
        this.linkID = value;
    }

    /**
     * Gets the value of the amountToPay property.
     * 
     */
    public long getAmountToPay() {
        return amountToPay;
    }

    /**
     * Sets the value of the amountToPay property.
     * 
     */
    public void setAmountToPay(long value) {
        this.amountToPay = value;
    }

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link BillType }
     *     
     */
    public BillType getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillType }
     *     
     */
    public void setChargeType(BillType value) {
        this.chargeType = value;
    }

    /**
     * Gets the value of the chargeChangeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeChangeStatus() {
        return chargeChangeStatus;
    }

    /**
     * Sets the value of the chargeChangeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeChangeStatus(String value) {
        this.chargeChangeStatus = value;
    }

    /**
     * Gets the value of the treasureBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreasureBranch() {
        return treasureBranch;
    }

    /**
     * Sets the value of the treasureBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreasureBranch(String value) {
        this.treasureBranch = value;
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
     * Gets the value of the budgetIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetIndexType }
     *     
     */
    public BudgetIndexType getBudgetIndex() {
        return budgetIndex;
    }

    /**
     * Sets the value of the budgetIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetIndexType }
     *     
     */
    public void setBudgetIndex(BudgetIndexType value) {
        this.budgetIndex = value;
    }

    /**
     * Gets the value of the extApplicationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtApplicationID() {
        return extApplicationID;
    }

    /**
     * Sets the value of the extApplicationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtApplicationID(String value) {
        this.extApplicationID = value;
    }

    /**
     * Gets the value of the unifiedPayerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnifiedPayerIdentifier() {
        return unifiedPayerIdentifier;
    }

    /**
     * Sets the value of the unifiedPayerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnifiedPayerIdentifier(String value) {
        this.unifiedPayerIdentifier = value;
    }

    /**
     * Gets the value of the payerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerType() {
        return payerType;
    }

    /**
     * Sets the value of the payerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerType(String value) {
        this.payerType = value;
    }

    /**
     * Gets the value of the payerTypeBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerTypeBrief() {
        return payerTypeBrief;
    }

    /**
     * Sets the value of the payerTypeBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerTypeBrief(String value) {
        this.payerTypeBrief = value;
    }

    /**
     * Gets the value of the payerResidentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerResidentFlag() {
        return payerResidentFlag;
    }

    /**
     * Sets the value of the payerResidentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerResidentFlag(String value) {
        this.payerResidentFlag = value;
    }

    /**
     * Gets the value of the payerSNILSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerSNILSNumber() {
        return payerSNILSNumber;
    }

    /**
     * Sets the value of the payerSNILSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerSNILSNumber(String value) {
        this.payerSNILSNumber = value;
    }

    /**
     * Gets the value of the payerINN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerINN() {
        return payerINN;
    }

    /**
     * Sets the value of the payerINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerINN(String value) {
        this.payerINN = value;
    }

    /**
     * Gets the value of the payerKPP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerKPP() {
        return payerKPP;
    }

    /**
     * Sets the value of the payerKPP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerKPP(String value) {
        this.payerKPP = value;
    }

    /**
     * Gets the value of the altPayerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltPayerIdentifier() {
        return altPayerIdentifier;
    }

    /**
     * Sets the value of the altPayerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltPayerIdentifier(String value) {
        this.altPayerIdentifier = value;
    }

    /**
     * Gets the value of the payerDocumentTypeBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerDocumentTypeBrief() {
        return payerDocumentTypeBrief;
    }

    /**
     * Sets the value of the payerDocumentTypeBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerDocumentTypeBrief(String value) {
        this.payerDocumentTypeBrief = value;
    }

    /**
     * Gets the value of the payerDocumentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerDocumentTypeCode() {
        return payerDocumentTypeCode;
    }

    /**
     * Sets the value of the payerDocumentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerDocumentTypeCode(String value) {
        this.payerDocumentTypeCode = value;
    }

    /**
     * Gets the value of the payerDocumentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerDocumentSeries() {
        return payerDocumentSeries;
    }

    /**
     * Sets the value of the payerDocumentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerDocumentSeries(String value) {
        this.payerDocumentSeries = value;
    }

    /**
     * Gets the value of the payerDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerDocumentNumber() {
        return payerDocumentNumber;
    }

    /**
     * Sets the value of the payerDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerDocumentNumber(String value) {
        this.payerDocumentNumber = value;
    }

    /**
     * Gets the value of the payerCitizenCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerCitizenCountryCode() {
        return payerCitizenCountryCode;
    }

    /**
     * Sets the value of the payerCitizenCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerCitizenCountryCode(String value) {
        this.payerCitizenCountryCode = value;
    }

    /**
     * Gets the value of the payerCitizenCountryBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerCitizenCountryBrief() {
        return payerCitizenCountryBrief;
    }

    /**
     * Sets the value of the payerCitizenCountryBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerCitizenCountryBrief(String value) {
        this.payerCitizenCountryBrief = value;
    }

}

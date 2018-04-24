
package gisgmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayerListElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayerListElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerTypeBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerResidentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PayerSNILSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerINN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerKPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PayerListElementType", propOrder = {
    "payerIdentifier",
    "payerType",
    "payerTypeBrief",
    "payerResidentFlag",
    "payerSNILSNumber",
    "payerINN",
    "payerKPP",
    "payerDocumentTypeBrief",
    "payerDocumentTypeCode",
    "payerDocumentSeries",
    "payerDocumentNumber",
    "payerCitizenCountryCode",
    "payerCitizenCountryBrief"
})
public class PayerListElementType {

    @XmlElement(name = "PayerIdentifier")
    protected String payerIdentifier;
    @XmlElement(name = "PayerType")
    protected String payerType;
    @XmlElement(name = "PayerTypeBrief")
    protected String payerTypeBrief;
    @XmlElement(name = "PayerResidentFlag")
    protected Boolean payerResidentFlag;
    @XmlElement(name = "PayerSNILSNumber")
    protected String payerSNILSNumber;
    @XmlElement(name = "PayerINN")
    protected String payerINN;
    @XmlElement(name = "PayerKPP")
    protected String payerKPP;
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
     * Gets the value of the payerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerIdentifier() {
        return payerIdentifier;
    }

    /**
     * Sets the value of the payerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerIdentifier(String value) {
        this.payerIdentifier = value;
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
     *     {@link Boolean }
     *     
     */
    public Boolean isPayerResidentFlag() {
        return payerResidentFlag;
    }

    /**
     * Sets the value of the payerResidentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayerResidentFlag(Boolean value) {
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

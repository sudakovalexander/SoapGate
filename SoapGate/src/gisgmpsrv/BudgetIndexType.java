
package gisgmpsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetIndexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetIndexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayerStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaxPaymentReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaxPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaxDocNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TaxDocDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetIndexType", propOrder = {
    "payerStatus",
    "paymentType",
    "taxPaymentReason",
    "taxPeriod",
    "taxDocNumber",
    "taxDocDate"
})
public class BudgetIndexType {

    @XmlElement(name = "PayerStatus", required = true)
    protected String payerStatus;
    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "TaxPaymentReason", required = true)
    protected String taxPaymentReason;
    @XmlElement(name = "TaxPeriod", required = true)
    protected String taxPeriod;
    @XmlElement(name = "TaxDocNumber", required = true)
    protected String taxDocNumber;
    @XmlElement(name = "TaxDocDate", required = true)
    protected String taxDocDate;

    /**
     * Gets the value of the payerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerStatus() {
        return payerStatus;
    }

    /**
     * Sets the value of the payerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerStatus(String value) {
        this.payerStatus = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the taxPaymentReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPaymentReason() {
        return taxPaymentReason;
    }

    /**
     * Sets the value of the taxPaymentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPaymentReason(String value) {
        this.taxPaymentReason = value;
    }

    /**
     * Gets the value of the taxPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPeriod() {
        return taxPeriod;
    }

    /**
     * Sets the value of the taxPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPeriod(String value) {
        this.taxPeriod = value;
    }

    /**
     * Gets the value of the taxDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDocNumber() {
        return taxDocNumber;
    }

    /**
     * Sets the value of the taxDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDocNumber(String value) {
        this.taxDocNumber = value;
    }

    /**
     * Gets the value of the taxDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDocDate() {
        return taxDocDate;
    }

    /**
     * Sets the value of the taxDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDocDate(String value) {
        this.taxDocDate = value;
    }

}

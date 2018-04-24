
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditReceipt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditReceipt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beneficiaryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beneficiaryCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isCreditAmount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="creditAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="creditPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditReceipt", propOrder = {
    "beneficiaryName",
    "beneficiaryCountryCode",
    "isCreditAmount",
    "creditAmount",
    "creditPercent"
})
public class CreditReceipt {

    @XmlElement(required = true)
    protected String beneficiaryName;
    @XmlElement(required = true)
    protected String beneficiaryCountryCode;
    protected boolean isCreditAmount;
    @XmlElement(required = true)
    protected BigDecimal creditAmount;
    @XmlElement(required = true)
    protected BigDecimal creditPercent;

    /**
     * Gets the value of the beneficiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    /**
     * Sets the value of the beneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryName(String value) {
        this.beneficiaryName = value;
    }

    /**
     * Gets the value of the beneficiaryCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryCountryCode() {
        return beneficiaryCountryCode;
    }

    /**
     * Sets the value of the beneficiaryCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryCountryCode(String value) {
        this.beneficiaryCountryCode = value;
    }

    /**
     * Gets the value of the isCreditAmount property.
     * 
     */
    public boolean isIsCreditAmount() {
        return isCreditAmount;
    }

    /**
     * Sets the value of the isCreditAmount property.
     * 
     */
    public void setIsCreditAmount(boolean value) {
        this.isCreditAmount = value;
    }

    /**
     * Gets the value of the creditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    /**
     * Sets the value of the creditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditAmount(BigDecimal value) {
        this.creditAmount = value;
    }

    /**
     * Gets the value of the creditPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditPercent() {
        return creditPercent;
    }

    /**
     * Sets the value of the creditPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditPercent(BigDecimal value) {
        this.creditPercent = value;
    }

}

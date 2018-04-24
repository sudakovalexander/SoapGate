
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for confDocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="confDocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberLine" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="docTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deliveryFlag" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="expectDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="totalAmountDocCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="amountDocCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="docCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="totalAmountContractCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="amountContractCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="contractCurrecyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confDocType", propOrder = {
    "numberLine",
    "docNumber",
    "docDate",
    "docTypeCode",
    "deliveryFlag",
    "expectDate",
    "totalAmountDocCurrency",
    "amountDocCurrency",
    "docCurrencyCode",
    "totalAmountContractCurrency",
    "amountContractCurrency",
    "contractCurrecyCode",
    "countryCode",
    "remark"
})
public class ConfDocType {

    @XmlElement(required = true)
    protected BigInteger numberLine;
    protected String docNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDate;
    @XmlElement(required = true)
    protected String docTypeCode;
    @XmlElement(required = true)
    protected BigInteger deliveryFlag;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectDate;
    @XmlElement(required = true)
    protected BigDecimal totalAmountDocCurrency;
    protected BigDecimal amountDocCurrency;
    @XmlElement(required = true)
    protected String docCurrencyCode;
    protected BigDecimal totalAmountContractCurrency;
    protected BigDecimal amountContractCurrency;
    protected String contractCurrecyCode;
    protected String countryCode;
    protected String remark;

    /**
     * Gets the value of the numberLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberLine() {
        return numberLine;
    }

    /**
     * Sets the value of the numberLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberLine(BigInteger value) {
        this.numberLine = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the docTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTypeCode() {
        return docTypeCode;
    }

    /**
     * Sets the value of the docTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTypeCode(String value) {
        this.docTypeCode = value;
    }

    /**
     * Gets the value of the deliveryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeliveryFlag() {
        return deliveryFlag;
    }

    /**
     * Sets the value of the deliveryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeliveryFlag(BigInteger value) {
        this.deliveryFlag = value;
    }

    /**
     * Gets the value of the expectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectDate() {
        return expectDate;
    }

    /**
     * Sets the value of the expectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectDate(XMLGregorianCalendar value) {
        this.expectDate = value;
    }

    /**
     * Gets the value of the totalAmountDocCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmountDocCurrency() {
        return totalAmountDocCurrency;
    }

    /**
     * Sets the value of the totalAmountDocCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmountDocCurrency(BigDecimal value) {
        this.totalAmountDocCurrency = value;
    }

    /**
     * Gets the value of the amountDocCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountDocCurrency() {
        return amountDocCurrency;
    }

    /**
     * Sets the value of the amountDocCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountDocCurrency(BigDecimal value) {
        this.amountDocCurrency = value;
    }

    /**
     * Gets the value of the docCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocCurrencyCode() {
        return docCurrencyCode;
    }

    /**
     * Sets the value of the docCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocCurrencyCode(String value) {
        this.docCurrencyCode = value;
    }

    /**
     * Gets the value of the totalAmountContractCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmountContractCurrency() {
        return totalAmountContractCurrency;
    }

    /**
     * Sets the value of the totalAmountContractCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmountContractCurrency(BigDecimal value) {
        this.totalAmountContractCurrency = value;
    }

    /**
     * Gets the value of the amountContractCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountContractCurrency() {
        return amountContractCurrency;
    }

    /**
     * Sets the value of the amountContractCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountContractCurrency(BigDecimal value) {
        this.amountContractCurrency = value;
    }

    /**
     * Gets the value of the contractCurrecyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractCurrecyCode() {
        return contractCurrecyCode;
    }

    /**
     * Sets the value of the contractCurrecyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractCurrecyCode(String value) {
        this.contractCurrecyCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}

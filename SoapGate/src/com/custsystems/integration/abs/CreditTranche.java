
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditTranche complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditTranche"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tranPayPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiptDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="trancheAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTranche", propOrder = {
    "tranPayPeriod",
    "receiptDate",
    "trancheAmount"
})
public class CreditTranche {

    @XmlElement(required = true)
    protected String tranPayPeriod;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiptDate;
    @XmlElement(required = true)
    protected BigDecimal trancheAmount;

    /**
     * Gets the value of the tranPayPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranPayPeriod() {
        return tranPayPeriod;
    }

    /**
     * Sets the value of the tranPayPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranPayPeriod(String value) {
        this.tranPayPeriod = value;
    }

    /**
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the trancheAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrancheAmount() {
        return trancheAmount;
    }

    /**
     * Sets the value of the trancheAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrancheAmount(BigDecimal value) {
        this.trancheAmount = value;
    }

}

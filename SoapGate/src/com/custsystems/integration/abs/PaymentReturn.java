
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentReturn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="percentPayDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="percentPayAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="creditPayDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="creditPayAmount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paySpecConditions" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReturn", propOrder = {
    "percentPayDate",
    "percentPayAmount",
    "creditPayDate",
    "creditPayAmount",
    "paySpecConditions"
})
public class PaymentReturn {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar percentPayDate;
    @XmlElement(required = true)
    protected BigDecimal percentPayAmount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creditPayDate;
    @XmlElement(required = true)
    protected String creditPayAmount;
    @XmlElement(required = true)
    protected String paySpecConditions;

    /**
     * Gets the value of the percentPayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPercentPayDate() {
        return percentPayDate;
    }

    /**
     * Sets the value of the percentPayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPercentPayDate(XMLGregorianCalendar value) {
        this.percentPayDate = value;
    }

    /**
     * Gets the value of the percentPayAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentPayAmount() {
        return percentPayAmount;
    }

    /**
     * Sets the value of the percentPayAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentPayAmount(BigDecimal value) {
        this.percentPayAmount = value;
    }

    /**
     * Gets the value of the creditPayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditPayDate() {
        return creditPayDate;
    }

    /**
     * Sets the value of the creditPayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditPayDate(XMLGregorianCalendar value) {
        this.creditPayDate = value;
    }

    /**
     * Gets the value of the creditPayAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditPayAmount() {
        return creditPayAmount;
    }

    /**
     * Sets the value of the creditPayAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditPayAmount(String value) {
        this.creditPayAmount = value;
    }

    /**
     * Gets the value of the paySpecConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaySpecConditions() {
        return paySpecConditions;
    }

    /**
     * Sets the value of the paySpecConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaySpecConditions(String value) {
        this.paySpecConditions = value;
    }

}

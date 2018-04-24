
package com.custsystems.integration.abs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DealpassNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealpassNumberType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dealPassportNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dealPassportDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealpassNumberType", propOrder = {
    "dealPassportNumber",
    "dealPassportDate"
})
public class DealpassNumberType {

    @XmlElement(required = true)
    protected String dealPassportNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dealPassportDate;

    /**
     * Gets the value of the dealPassportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealPassportNumber() {
        return dealPassportNumber;
    }

    /**
     * Sets the value of the dealPassportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealPassportNumber(String value) {
        this.dealPassportNumber = value;
    }

    /**
     * Gets the value of the dealPassportDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDealPassportDate() {
        return dealPassportDate;
    }

    /**
     * Sets the value of the dealPassportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDealPassportDate(XMLGregorianCalendar value) {
        this.dealPassportDate = value;
    }

}

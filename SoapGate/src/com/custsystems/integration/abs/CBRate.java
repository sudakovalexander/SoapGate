
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CBRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CBRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BEG" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="END" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SCALE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="R" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CBRate", propOrder = {
    "c",
    "crc",
    "crb",
    "beg",
    "end",
    "scale",
    "r",
    "type"
})
public class CBRate {

    @XmlElement(name = "C")
    protected String c;
    @XmlElement(name = "CRC")
    protected String crc;
    @XmlElement(name = "CRB")
    protected String crb;
    @XmlElement(name = "BEG")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beg;
    @XmlElement(name = "END")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar end;
    @XmlElement(name = "SCALE")
    protected BigDecimal scale;
    @XmlElement(name = "R")
    protected BigDecimal r;
    @XmlElement(name = "TYPE")
    protected String type;

    /**
     * Gets the value of the c property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC(String value) {
        this.c = value;
    }

    /**
     * Gets the value of the crc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRC() {
        return crc;
    }

    /**
     * Sets the value of the crc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRC(String value) {
        this.crc = value;
    }

    /**
     * Gets the value of the crb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRB() {
        return crb;
    }

    /**
     * Sets the value of the crb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRB(String value) {
        this.crb = value;
    }

    /**
     * Gets the value of the beg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBEG() {
        return beg;
    }

    /**
     * Sets the value of the beg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBEG(XMLGregorianCalendar value) {
        this.beg = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEND() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEND(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSCALE() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSCALE(BigDecimal value) {
        this.scale = value;
    }

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setR(BigDecimal value) {
        this.r = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

}

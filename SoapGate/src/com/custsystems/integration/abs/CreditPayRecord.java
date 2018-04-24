
package com.custsystems.integration.abs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditPayRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditPayRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="A" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Prc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Commis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="R" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditPayRecord", propOrder = {
    "d",
    "a",
    "cp",
    "prc",
    "commis",
    "r"
})
public class CreditPayRecord {

    @XmlElement(name = "D")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar d;
    @XmlElement(name = "A")
    protected String a;
    @XmlElement(name = "CP")
    protected String cp;
    @XmlElement(name = "Prc")
    protected String prc;
    @XmlElement(name = "Commis")
    protected String commis;
    @XmlElement(name = "R")
    protected String r;

    /**
     * Gets the value of the d property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setD(XMLGregorianCalendar value) {
        this.d = value;
    }

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setA(String value) {
        this.a = value;
    }

    /**
     * Gets the value of the cp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP() {
        return cp;
    }

    /**
     * Sets the value of the cp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP(String value) {
        this.cp = value;
    }

    /**
     * Gets the value of the prc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrc() {
        return prc;
    }

    /**
     * Sets the value of the prc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrc(String value) {
        this.prc = value;
    }

    /**
     * Gets the value of the commis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommis() {
        return commis;
    }

    /**
     * Sets the value of the commis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommis(String value) {
        this.commis = value;
    }

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR(String value) {
        this.r = value;
    }

}


package com.custsystems.integration.abs;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DpInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DpInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberLine" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="regNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="closeDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="groundCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DpInfo", propOrder = {
    "numberLine",
    "regNum",
    "receiveDate",
    "closeDate",
    "groundCode"
})
public class DpInfo {

    @XmlElement(required = true)
    protected BigInteger numberLine;
    @XmlElement(required = true)
    protected String regNum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receiveDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closeDate;
    @XmlElement(required = true)
    protected String groundCode;

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
     * Gets the value of the regNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * Sets the value of the regNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNum(String value) {
        this.regNum = value;
    }

    /**
     * Gets the value of the receiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiveDate() {
        return receiveDate;
    }

    /**
     * Sets the value of the receiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiveDate(XMLGregorianCalendar value) {
        this.receiveDate = value;
    }

    /**
     * Gets the value of the closeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDate() {
        return closeDate;
    }

    /**
     * Sets the value of the closeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDate(XMLGregorianCalendar value) {
        this.closeDate = value;
    }

    /**
     * Gets the value of the groundCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroundCode() {
        return groundCode;
    }

    /**
     * Sets the value of the groundCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroundCode(String value) {
        this.groundCode = value;
    }

}

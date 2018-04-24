
package com.custsystems.integration.abs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DpReissueInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DpReissueInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reissueDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="groundDocDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="groundDocNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DpReissueInfo", propOrder = {
    "reissueDate",
    "groundDocDate",
    "groundDocNum"
})
public class DpReissueInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reissueDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar groundDocDate;
    @XmlElement(required = true)
    protected String groundDocNum;

    /**
     * Gets the value of the reissueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReissueDate() {
        return reissueDate;
    }

    /**
     * Sets the value of the reissueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReissueDate(XMLGregorianCalendar value) {
        this.reissueDate = value;
    }

    /**
     * Gets the value of the groundDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGroundDocDate() {
        return groundDocDate;
    }

    /**
     * Sets the value of the groundDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGroundDocDate(XMLGregorianCalendar value) {
        this.groundDocDate = value;
    }

    /**
     * Gets the value of the groundDocNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroundDocNum() {
        return groundDocNum;
    }

    /**
     * Sets the value of the groundDocNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroundDocNum(String value) {
        this.groundDocNum = value;
    }

}

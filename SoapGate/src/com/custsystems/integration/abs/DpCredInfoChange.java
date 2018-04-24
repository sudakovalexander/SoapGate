
package com.custsystems.integration.abs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dpCredInfoChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dpCredInfoChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="credSectionDp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="credItemSectionDp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="credSubitemSectionDp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="credCurrentValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="credNewValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="credDocInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="credRecord" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dpCredInfoChange", propOrder = {
    "credSectionDp",
    "credItemSectionDp",
    "credSubitemSectionDp",
    "credCurrentValue",
    "credNewValue",
    "credDocInfo",
    "credRecord"
})
public class DpCredInfoChange {

    @XmlElement(required = true)
    protected String credSectionDp;
    @XmlElement(required = true)
    protected String credItemSectionDp;
    @XmlElement(required = true)
    protected String credSubitemSectionDp;
    @XmlElement(required = true)
    protected String credCurrentValue;
    @XmlElement(required = true)
    protected String credNewValue;
    @XmlElement(required = true)
    protected String credDocInfo;
    @XmlElement(required = true)
    protected String credRecord;

    /**
     * Gets the value of the credSectionDp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredSectionDp() {
        return credSectionDp;
    }

    /**
     * Sets the value of the credSectionDp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredSectionDp(String value) {
        this.credSectionDp = value;
    }

    /**
     * Gets the value of the credItemSectionDp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredItemSectionDp() {
        return credItemSectionDp;
    }

    /**
     * Sets the value of the credItemSectionDp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredItemSectionDp(String value) {
        this.credItemSectionDp = value;
    }

    /**
     * Gets the value of the credSubitemSectionDp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredSubitemSectionDp() {
        return credSubitemSectionDp;
    }

    /**
     * Sets the value of the credSubitemSectionDp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredSubitemSectionDp(String value) {
        this.credSubitemSectionDp = value;
    }

    /**
     * Gets the value of the credCurrentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredCurrentValue() {
        return credCurrentValue;
    }

    /**
     * Sets the value of the credCurrentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredCurrentValue(String value) {
        this.credCurrentValue = value;
    }

    /**
     * Gets the value of the credNewValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredNewValue() {
        return credNewValue;
    }

    /**
     * Sets the value of the credNewValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredNewValue(String value) {
        this.credNewValue = value;
    }

    /**
     * Gets the value of the credDocInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredDocInfo() {
        return credDocInfo;
    }

    /**
     * Sets the value of the credDocInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredDocInfo(String value) {
        this.credDocInfo = value;
    }

    /**
     * Gets the value of the credRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredRecord() {
        return credRecord;
    }

    /**
     * Sets the value of the credRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredRecord(String value) {
        this.credRecord = value;
    }

}

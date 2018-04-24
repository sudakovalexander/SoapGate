
package com.custsystems.integration.abs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dpContrInfoChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dpContrInfoChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contrSectionDp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contrItemSectionDp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contrCurrentValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contrNewValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contrDocInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contrRecord" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dpContrInfoChange", propOrder = {
    "contrSectionDp",
    "contrItemSectionDp",
    "contrCurrentValue",
    "contrNewValue",
    "contrDocInfo",
    "contrRecord"
})
public class DpContrInfoChange {

    @XmlElement(required = true)
    protected String contrSectionDp;
    @XmlElement(required = true)
    protected String contrItemSectionDp;
    @XmlElement(required = true)
    protected String contrCurrentValue;
    @XmlElement(required = true)
    protected String contrNewValue;
    @XmlElement(required = true)
    protected String contrDocInfo;
    @XmlElement(required = true)
    protected String contrRecord;

    /**
     * Gets the value of the contrSectionDp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrSectionDp() {
        return contrSectionDp;
    }

    /**
     * Sets the value of the contrSectionDp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrSectionDp(String value) {
        this.contrSectionDp = value;
    }

    /**
     * Gets the value of the contrItemSectionDp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrItemSectionDp() {
        return contrItemSectionDp;
    }

    /**
     * Sets the value of the contrItemSectionDp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrItemSectionDp(String value) {
        this.contrItemSectionDp = value;
    }

    /**
     * Gets the value of the contrCurrentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrCurrentValue() {
        return contrCurrentValue;
    }

    /**
     * Sets the value of the contrCurrentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrCurrentValue(String value) {
        this.contrCurrentValue = value;
    }

    /**
     * Gets the value of the contrNewValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrNewValue() {
        return contrNewValue;
    }

    /**
     * Sets the value of the contrNewValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrNewValue(String value) {
        this.contrNewValue = value;
    }

    /**
     * Gets the value of the contrDocInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrDocInfo() {
        return contrDocInfo;
    }

    /**
     * Sets the value of the contrDocInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrDocInfo(String value) {
        this.contrDocInfo = value;
    }

    /**
     * Gets the value of the contrRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrRecord() {
        return contrRecord;
    }

    /**
     * Sets the value of the contrRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrRecord(String value) {
        this.contrRecord = value;
    }

}

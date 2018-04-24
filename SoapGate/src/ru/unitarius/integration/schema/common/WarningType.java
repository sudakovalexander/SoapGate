
package ru.unitarius.integration.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarningType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WarningSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WarningCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WarningMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarningType", propOrder = {
    "warningSource",
    "warningCode",
    "warningMessage"
})
public class WarningType {

    @XmlElement(name = "WarningSource")
    protected String warningSource;
    @XmlElement(name = "WarningCode")
    protected String warningCode;
    @XmlElement(name = "WarningMessage", required = true)
    protected String warningMessage;

    /**
     * Gets the value of the warningSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningSource() {
        return warningSource;
    }

    /**
     * Sets the value of the warningSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningSource(String value) {
        this.warningSource = value;
    }

    /**
     * Gets the value of the warningCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningCode() {
        return warningCode;
    }

    /**
     * Sets the value of the warningCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningCode(String value) {
        this.warningCode = value;
    }

    /**
     * Gets the value of the warningMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningMessage() {
        return warningMessage;
    }

    /**
     * Sets the value of the warningMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningMessage(String value) {
        this.warningMessage = value;
    }

}

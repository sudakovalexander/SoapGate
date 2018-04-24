
package ru.unitarius.integration.schema.cards;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractPaymentScheduleEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractPaymentScheduleEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionTypeCode" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="ActionTypeBrief" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActionType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractPaymentScheduleEntryType", propOrder = {
    "actionTypeCode",
    "actionTypeBrief",
    "actionType"
})
@XmlSeeAlso({
    DetailedPaymentScheduleType.class
})
public abstract class AbstractPaymentScheduleEntryType {

    @XmlElement(name = "ActionTypeCode")
    protected short actionTypeCode;
    @XmlElement(name = "ActionTypeBrief", required = true)
    protected String actionTypeBrief;
    @XmlElement(name = "ActionType", required = true)
    protected String actionType;

    /**
     * Gets the value of the actionTypeCode property.
     * 
     */
    public short getActionTypeCode() {
        return actionTypeCode;
    }

    /**
     * Sets the value of the actionTypeCode property.
     * 
     */
    public void setActionTypeCode(short value) {
        this.actionTypeCode = value;
    }

    /**
     * Gets the value of the actionTypeBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTypeBrief() {
        return actionTypeBrief;
    }

    /**
     * Sets the value of the actionTypeBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTypeBrief(String value) {
        this.actionTypeBrief = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

}

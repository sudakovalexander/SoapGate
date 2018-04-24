
package ru.unitarius.integration.schema.loans;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FactPaymentScheduleEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FactPaymentScheduleEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionTypeCode" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="ActionTypeBrief" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActionType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DateStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DateEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PayDateStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PayDateEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ActualPayDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ActualAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ActualTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PaymentID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FactPaymentScheduleEntryType", propOrder = {
    "actionTypeCode",
    "actionTypeBrief",
    "actionType",
    "dateStart",
    "dateEnd",
    "payDateStart",
    "payDateEnd",
    "actualPayDate",
    "actualAmount",
    "actualTotalAmount",
    "paymentID"
})
public class FactPaymentScheduleEntryType {

    @XmlElement(name = "ActionTypeCode")
    protected short actionTypeCode;
    @XmlElement(name = "ActionTypeBrief", required = true)
    protected String actionTypeBrief;
    @XmlElement(name = "ActionType", required = true)
    protected String actionType;
    @XmlElement(name = "DateStart")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateStart;
    @XmlElement(name = "DateEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEnd;
    @XmlElement(name = "PayDateStart")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar payDateStart;
    @XmlElement(name = "PayDateEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar payDateEnd;
    @XmlElement(name = "ActualPayDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualPayDate;
    @XmlElement(name = "ActualAmount")
    protected BigDecimal actualAmount;
    @XmlElement(name = "ActualTotalAmount")
    protected BigDecimal actualTotalAmount;
    @XmlElement(name = "PaymentID")
    protected Long paymentID;

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

    /**
     * Gets the value of the dateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateStart() {
        return dateStart;
    }

    /**
     * Sets the value of the dateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateStart(XMLGregorianCalendar value) {
        this.dateStart = value;
    }

    /**
     * Gets the value of the dateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the value of the dateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEnd(XMLGregorianCalendar value) {
        this.dateEnd = value;
    }

    /**
     * Gets the value of the payDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDateStart() {
        return payDateStart;
    }

    /**
     * Sets the value of the payDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDateStart(XMLGregorianCalendar value) {
        this.payDateStart = value;
    }

    /**
     * Gets the value of the payDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDateEnd() {
        return payDateEnd;
    }

    /**
     * Sets the value of the payDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDateEnd(XMLGregorianCalendar value) {
        this.payDateEnd = value;
    }

    /**
     * Gets the value of the actualPayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualPayDate() {
        return actualPayDate;
    }

    /**
     * Sets the value of the actualPayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualPayDate(XMLGregorianCalendar value) {
        this.actualPayDate = value;
    }

    /**
     * Gets the value of the actualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * Sets the value of the actualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualAmount(BigDecimal value) {
        this.actualAmount = value;
    }

    /**
     * Gets the value of the actualTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualTotalAmount() {
        return actualTotalAmount;
    }

    /**
     * Sets the value of the actualTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualTotalAmount(BigDecimal value) {
        this.actualTotalAmount = value;
    }

    /**
     * Gets the value of the paymentID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentID(Long value) {
        this.paymentID = value;
    }

}

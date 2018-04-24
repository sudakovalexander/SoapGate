
package ru.unitarius.integration.schema.loans;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PlanPaymentScheduleEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanPaymentScheduleEntryType"&gt;
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
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ActualSubTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Rest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PaymentID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsDelinquency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCurrencyID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanPaymentScheduleEntryType", propOrder = {
    "actionTypeCode",
    "actionTypeBrief",
    "actionType",
    "dateStart",
    "dateEnd",
    "payDateStart",
    "payDateEnd",
    "amount",
    "actualSubTotalAmount",
    "rest",
    "totalAmount",
    "paymentID",
    "paymentStatus",
    "isDelinquency",
    "paymentCurrencyID"
})
public class PlanPaymentScheduleEntryType {

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
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "ActualSubTotalAmount")
    protected BigDecimal actualSubTotalAmount;
    @XmlElement(name = "Rest")
    protected BigDecimal rest;
    @XmlElement(name = "TotalAmount")
    protected BigDecimal totalAmount;
    @XmlElement(name = "PaymentID")
    protected Long paymentID;
    @XmlElement(name = "PaymentStatus")
    protected String paymentStatus;
    @XmlElement(name = "IsDelinquency")
    protected Boolean isDelinquency;
    @XmlElement(name = "PaymentCurrencyID")
    protected Long paymentCurrencyID;

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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the actualSubTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualSubTotalAmount() {
        return actualSubTotalAmount;
    }

    /**
     * Sets the value of the actualSubTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualSubTotalAmount(BigDecimal value) {
        this.actualSubTotalAmount = value;
    }

    /**
     * Gets the value of the rest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRest() {
        return rest;
    }

    /**
     * Sets the value of the rest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRest(BigDecimal value) {
        this.rest = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
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

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the isDelinquency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDelinquency() {
        return isDelinquency;
    }

    /**
     * Sets the value of the isDelinquency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDelinquency(Boolean value) {
        this.isDelinquency = value;
    }

    /**
     * Gets the value of the paymentCurrencyID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentCurrencyID() {
        return paymentCurrencyID;
    }

    /**
     * Sets the value of the paymentCurrencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentCurrencyID(Long value) {
        this.paymentCurrencyID = value;
    }

}


package ru.unitarius.integration.schema.cards;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DetailedPaymentScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedPaymentScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://unitarius.ru/integration/schema/cards}AbstractPaymentScheduleEntryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DateEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PayDateStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PayDateEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ActualAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ActualTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedPaymentScheduleType", propOrder = {
    "dateStart",
    "dateEnd",
    "payDateStart",
    "payDateEnd",
    "actualAmount",
    "actualTotalAmount"
})
public class DetailedPaymentScheduleType
    extends AbstractPaymentScheduleEntryType
{

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
    @XmlElement(name = "ActualAmount")
    protected BigDecimal actualAmount;
    @XmlElement(name = "ActualTotalAmount")
    protected BigDecimal actualTotalAmount;

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

}

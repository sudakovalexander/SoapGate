
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Основные параметры лимита.
 * 
 * <p>Java class for limitBaseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="limitBaseDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.bpc.ru/apigate/general/}limitNameType"/&gt;
 *         &lt;element name="startDate" type="{http://www.bpc.ru/apigate/general/}limitEdgeDateType" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.bpc.ru/apigate/general/}limitEdgeDateType" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.bpc.ru/apigate/general/}limitValueType"/&gt;
 *         &lt;element name="cycleType" type="{http://www.bpc.ru/apigate/general/}limitCycleTypeType" minOccurs="0"/&gt;
 *         &lt;element name="cycleLength" type="{http://www.bpc.ru/apigate/general/}limitCycleLengthType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.bpc.ru/apigate/general/}currencyN3CodeType" minOccurs="0"/&gt;
 *         &lt;element name="currentValue" type="{http://www.bpc.ru/apigate/general/}limitTdyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "limitBaseDataType", propOrder = {
    "name",
    "startDate",
    "endDate",
    "value",
    "cycleType",
    "cycleLength",
    "currency",
    "currentValue"
})
@XmlSeeAlso({
    LimitFullDataType.class
})
public class LimitBaseDataType {

    @XmlElement(required = true)
    protected String name;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlSchemaType(name = "unsignedLong")
    protected long value;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer cycleType;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer cycleLength;
    protected Integer currency;
    @XmlSchemaType(name = "unsignedLong")
    protected Long currentValue;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(long value) {
        this.value = value;
    }

    /**
     * Gets the value of the cycleType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCycleType() {
        return cycleType;
    }

    /**
     * Sets the value of the cycleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCycleType(Integer value) {
        this.cycleType = value;
    }

    /**
     * Gets the value of the cycleLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCycleLength() {
        return cycleLength;
    }

    /**
     * Sets the value of the cycleLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCycleLength(Integer value) {
        this.cycleLength = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrency(Integer value) {
        this.currency = value;
    }

    /**
     * Gets the value of the currentValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentValue() {
        return currentValue;
    }

    /**
     * Sets the value of the currentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentValue(Long value) {
        this.currentValue = value;
    }

}

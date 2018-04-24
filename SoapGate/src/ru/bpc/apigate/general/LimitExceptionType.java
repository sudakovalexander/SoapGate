
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Параметры исключения лимита.
 * 
 * <p>Java class for limitExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="limitExceptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="limitName" type="{http://www.bpc.ru/apigate/general/}limitNameType"/&gt;
 *         &lt;element name="startDate" type="{http://www.bpc.ru/apigate/general/}limitEdgeDateType"/&gt;
 *         &lt;element name="endDate" type="{http://www.bpc.ru/apigate/general/}limitEdgeDateType"/&gt;
 *         &lt;element name="value" type="{http://www.bpc.ru/apigate/general/}limitValueType"/&gt;
 *         &lt;element name="cycleType" type="{http://www.bpc.ru/apigate/general/}limitCycleTypeType" minOccurs="0"/&gt;
 *         &lt;element name="cycleLength" type="{http://www.bpc.ru/apigate/general/}limitCycleLengthType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "limitExceptionType", propOrder = {
    "limitName",
    "startDate",
    "endDate",
    "value",
    "cycleType",
    "cycleLength"
})
public class LimitExceptionType {

    @XmlElement(required = true)
    protected String limitName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlSchemaType(name = "unsignedLong")
    protected long value;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer cycleType;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer cycleLength;

    /**
     * Gets the value of the limitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitName() {
        return limitName;
    }

    /**
     * Sets the value of the limitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitName(String value) {
        this.limitName = value;
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

}

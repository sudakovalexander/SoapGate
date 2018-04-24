
package ru.unitarius.integration.schema.loans;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InterestRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestRateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InterestRateTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InterestRateBrief" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InterestRateType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRateType", propOrder = {
    "interestRateTypeCode",
    "interestRateBrief",
    "interestRateType",
    "date",
    "value"
})
public class InterestRateType {

    @XmlElement(name = "InterestRateTypeCode")
    protected int interestRateTypeCode;
    @XmlElement(name = "InterestRateBrief", required = true)
    protected String interestRateBrief;
    @XmlElement(name = "InterestRateType", required = true)
    protected String interestRateType;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Value", required = true)
    protected BigDecimal value;

    /**
     * Gets the value of the interestRateTypeCode property.
     * 
     */
    public int getInterestRateTypeCode() {
        return interestRateTypeCode;
    }

    /**
     * Sets the value of the interestRateTypeCode property.
     * 
     */
    public void setInterestRateTypeCode(int value) {
        this.interestRateTypeCode = value;
    }

    /**
     * Gets the value of the interestRateBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRateBrief() {
        return interestRateBrief;
    }

    /**
     * Sets the value of the interestRateBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRateBrief(String value) {
        this.interestRateBrief = value;
    }

    /**
     * Gets the value of the interestRateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRateType() {
        return interestRateType;
    }

    /**
     * Sets the value of the interestRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRateType(String value) {
        this.interestRateType = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

}

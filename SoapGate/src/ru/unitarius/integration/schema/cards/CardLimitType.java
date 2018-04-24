
package ru.unitarius.integration.schema.cards;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardLimitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardLimitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CardNumber" type="{http://unitarius.ru/integration/schema/cards}CardNumberType"/&gt;
 *         &lt;element name="LimitTypeID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="LimitTypebBrief" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LimitTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LimitCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LimitValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardLimitType", propOrder = {
    "cardID",
    "cardNumber",
    "limitTypeID",
    "limitTypebBrief",
    "limitTypeName",
    "limitCurrency",
    "limitValue"
})
public class CardLimitType {

    @XmlElement(name = "CardID")
    protected long cardID;
    @XmlElement(name = "CardNumber", required = true)
    protected CardNumberType cardNumber;
    @XmlElement(name = "LimitTypeID")
    protected long limitTypeID;
    @XmlElement(name = "LimitTypebBrief", required = true)
    protected String limitTypebBrief;
    @XmlElement(name = "LimitTypeName")
    protected String limitTypeName;
    @XmlElement(name = "LimitCurrency")
    protected String limitCurrency;
    @XmlElement(name = "LimitValue")
    protected BigDecimal limitValue;

    /**
     * Gets the value of the cardID property.
     * 
     */
    public long getCardID() {
        return cardID;
    }

    /**
     * Sets the value of the cardID property.
     * 
     */
    public void setCardID(long value) {
        this.cardID = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CardNumberType }
     *     
     */
    public CardNumberType getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardNumberType }
     *     
     */
    public void setCardNumber(CardNumberType value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the limitTypeID property.
     * 
     */
    public long getLimitTypeID() {
        return limitTypeID;
    }

    /**
     * Sets the value of the limitTypeID property.
     * 
     */
    public void setLimitTypeID(long value) {
        this.limitTypeID = value;
    }

    /**
     * Gets the value of the limitTypebBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitTypebBrief() {
        return limitTypebBrief;
    }

    /**
     * Sets the value of the limitTypebBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitTypebBrief(String value) {
        this.limitTypebBrief = value;
    }

    /**
     * Gets the value of the limitTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitTypeName() {
        return limitTypeName;
    }

    /**
     * Sets the value of the limitTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitTypeName(String value) {
        this.limitTypeName = value;
    }

    /**
     * Gets the value of the limitCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitCurrency() {
        return limitCurrency;
    }

    /**
     * Sets the value of the limitCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitCurrency(String value) {
        this.limitCurrency = value;
    }

    /**
     * Gets the value of the limitValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLimitValue() {
        return limitValue;
    }

    /**
     * Sets the value of the limitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLimitValue(BigDecimal value) {
        this.limitValue = value;
    }

}

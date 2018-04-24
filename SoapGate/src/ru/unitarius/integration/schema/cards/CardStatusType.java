
package ru.unitarius.integration.schema.cards;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardNumber" type="{http://unitarius.ru/integration/schema/cards}CardNumberType"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProcessingAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="AvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="HoldAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardStatusType", propOrder = {
    "cardNumber",
    "status",
    "processingAccountNumber",
    "currencyCode",
    "availableBalance",
    "holdAmount"
})
public class CardStatusType {

    @XmlElement(name = "CardNumber", required = true)
    protected CardNumberType cardNumber;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "ProcessingAccountNumber")
    protected String processingAccountNumber;
    @XmlElement(name = "CurrencyCode")
    protected BigInteger currencyCode;
    @XmlElement(name = "AvailableBalance")
    protected BigDecimal availableBalance;
    @XmlElement(name = "HoldAmount")
    protected BigDecimal holdAmount;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the processingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingAccountNumber() {
        return processingAccountNumber;
    }

    /**
     * Sets the value of the processingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingAccountNumber(String value) {
        this.processingAccountNumber = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrencyCode(BigInteger value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the availableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Sets the value of the availableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailableBalance(BigDecimal value) {
        this.availableBalance = value;
    }

    /**
     * Gets the value of the holdAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHoldAmount() {
        return holdAmount;
    }

    /**
     * Sets the value of the holdAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHoldAmount(BigDecimal value) {
        this.holdAmount = value;
    }

}

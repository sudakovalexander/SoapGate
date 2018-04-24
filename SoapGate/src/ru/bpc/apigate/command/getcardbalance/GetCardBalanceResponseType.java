
package ru.bpc.apigate.command.getcardbalance;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.bpc.apigate.general.CardIdentificationType;


/**
 * <p>Java class for getCardBalanceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCardBalanceResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardIdentification" type="{http://www.bpc.ru/apigate/general/}cardIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="balance" type="{http://www.bpc.ru/apigate/general/}amountType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.bpc.ru/apigate/general/}currencyN3CodeType" minOccurs="0"/&gt;
 *         &lt;element name="availableExceedLimit" type="{http://www.bpc.ru/apigate/general/}amountType" minOccurs="0"/&gt;
 *         &lt;element name="availableExceedLimitCurrency" type="{http://www.bpc.ru/apigate/general/}currencyN3CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ownFunds" type="{http://www.bpc.ru/apigate/general/}amountType" minOccurs="0"/&gt;
 *         &lt;element name="ownFundsCurrency" type="{http://www.bpc.ru/apigate/general/}currencyN3CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCardBalanceResponseType", propOrder = {
    "cardIdentification",
    "balance",
    "currency",
    "availableExceedLimit",
    "availableExceedLimitCurrency",
    "ownFunds",
    "ownFundsCurrency"
})
public class GetCardBalanceResponseType {

    protected CardIdentificationType cardIdentification;
    protected BigInteger balance;
    protected Integer currency;
    protected BigInteger availableExceedLimit;
    protected Integer availableExceedLimitCurrency;
    protected BigInteger ownFunds;
    protected Integer ownFundsCurrency;

    /**
     * Gets the value of the cardIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link CardIdentificationType }
     *     
     */
    public CardIdentificationType getCardIdentification() {
        return cardIdentification;
    }

    /**
     * Sets the value of the cardIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIdentificationType }
     *     
     */
    public void setCardIdentification(CardIdentificationType value) {
        this.cardIdentification = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBalance(BigInteger value) {
        this.balance = value;
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
     * Gets the value of the availableExceedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableExceedLimit() {
        return availableExceedLimit;
    }

    /**
     * Sets the value of the availableExceedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableExceedLimit(BigInteger value) {
        this.availableExceedLimit = value;
    }

    /**
     * Gets the value of the availableExceedLimitCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableExceedLimitCurrency() {
        return availableExceedLimitCurrency;
    }

    /**
     * Sets the value of the availableExceedLimitCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableExceedLimitCurrency(Integer value) {
        this.availableExceedLimitCurrency = value;
    }

    /**
     * Gets the value of the ownFunds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwnFunds() {
        return ownFunds;
    }

    /**
     * Sets the value of the ownFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwnFunds(BigInteger value) {
        this.ownFunds = value;
    }

    /**
     * Gets the value of the ownFundsCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOwnFundsCurrency() {
        return ownFundsCurrency;
    }

    /**
     * Sets the value of the ownFundsCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOwnFundsCurrency(Integer value) {
        this.ownFundsCurrency = value;
    }

}

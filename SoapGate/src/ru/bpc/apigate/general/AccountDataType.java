
package ru.bpc.apigate.general;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Параметры счета.
 * 
 * <p>Java class for accountDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="number" type="{http://www.bpc.ru/apigate/general/}accountNumberType"/&gt;
 *         &lt;element name="currency" type="{http://www.bpc.ru/apigate/general/}currencyN3CodeType"/&gt;
 *         &lt;element name="balance" type="{http://www.bpc.ru/apigate/general/}amountType"/&gt;
 *         &lt;element name="customerId" type="{http://www.bpc.ru/apigate/general/}customerIdType"/&gt;
 *         &lt;element name="defaultAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountDataType", propOrder = {
    "number",
    "currency",
    "balance",
    "customerId",
    "defaultAccount"
})
@XmlSeeAlso({
    AccountDataDetailedType.class
})
public class AccountDataType {

    @XmlElement(required = true)
    protected String number;
    protected int currency;
    @XmlElement(required = true)
    protected BigInteger balance;
    @XmlElement(required = true)
    protected String customerId;
    protected Boolean defaultAccount;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     */
    public int getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     */
    public void setCurrency(int value) {
        this.currency = value;
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
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the defaultAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultAccount() {
        return defaultAccount;
    }

    /**
     * Sets the value of the defaultAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultAccount(Boolean value) {
        this.defaultAccount = value;
    }

}

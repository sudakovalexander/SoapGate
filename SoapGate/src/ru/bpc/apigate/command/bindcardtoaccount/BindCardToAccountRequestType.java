
package ru.bpc.apigate.command.bindcardtoaccount;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.bpc.apigate.general.AccountTypeType;
import ru.bpc.apigate.general.CardAcceptorParametersType;
import ru.bpc.apigate.general.CardIdentificationType;
import ru.bpc.apigate.general.PersonalDataType;


/**
 * <p>Java class for bindCardToAccountRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bindCardToAccountRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardIdentification" type="{http://www.bpc.ru/apigate/general/}cardIdentificationType"/&gt;
 *         &lt;element name="accountNumber" type="{http://www.bpc.ru/apigate/general/}accountNumberType"/&gt;
 *         &lt;element name="accountType" type="{http://www.bpc.ru/apigate/general/}accountTypeType"/&gt;
 *         &lt;element name="accountCurrency" type="{http://www.bpc.ru/apigate/general/}currencyN3CodeType" minOccurs="0"/&gt;
 *         &lt;element name="personalData" type="{http://www.bpc.ru/apigate/general/}personalDataType" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.bpc.ru/apigate/general/}customerIdType" minOccurs="0"/&gt;
 *         &lt;element name="cardAcceptorParameters" type="{http://www.bpc.ru/apigate/general/}cardAcceptorParametersType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bindCardToAccountRequestType", propOrder = {
    "cardIdentification",
    "accountNumber",
    "accountType",
    "accountCurrency",
    "personalData",
    "customerId",
    "cardAcceptorParameters"
})
public class BindCardToAccountRequestType {

    @XmlElement(required = true)
    protected CardIdentificationType cardIdentification;
    @XmlElement(required = true)
    protected String accountNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AccountTypeType accountType;
    protected Integer accountCurrency;
    protected PersonalDataType personalData;
    protected String customerId;
    protected CardAcceptorParametersType cardAcceptorParameters;

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
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTypeType }
     *     
     */
    public AccountTypeType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTypeType }
     *     
     */
    public void setAccountType(AccountTypeType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountCurrency() {
        return accountCurrency;
    }

    /**
     * Sets the value of the accountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountCurrency(Integer value) {
        this.accountCurrency = value;
    }

    /**
     * Gets the value of the personalData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalDataType }
     *     
     */
    public PersonalDataType getPersonalData() {
        return personalData;
    }

    /**
     * Sets the value of the personalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalDataType }
     *     
     */
    public void setPersonalData(PersonalDataType value) {
        this.personalData = value;
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
     * Gets the value of the cardAcceptorParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcceptorParametersType }
     *     
     */
    public CardAcceptorParametersType getCardAcceptorParameters() {
        return cardAcceptorParameters;
    }

    /**
     * Sets the value of the cardAcceptorParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcceptorParametersType }
     *     
     */
    public void setCardAcceptorParameters(CardAcceptorParametersType value) {
        this.cardAcceptorParameters = value;
    }

}

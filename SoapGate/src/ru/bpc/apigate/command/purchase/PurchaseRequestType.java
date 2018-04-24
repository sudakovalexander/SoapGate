
package ru.bpc.apigate.command.purchase;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.bpc.apigate.general.AccountTypeType;
import ru.bpc.apigate.general.CardAcceptorParametersType;
import ru.bpc.apigate.general.CardIdentificationType;
import ru.bpc.apigate.general.SenderReceiverInfoType;
import ru.bpc.apigate.general.TdsType;


/**
 * <p>Java class for purchaseRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardIdentification" type="{http://www.bpc.ru/apigate/general/}cardIdentificationType"/&gt;
 *         &lt;element name="amount" type="{http://www.bpc.ru/apigate/general/}amountType"/&gt;
 *         &lt;element name="currency" type="{http://www.bpc.ru/apigate/general/}currencyN3CodeType"/&gt;
 *         &lt;element name="accountType" type="{http://www.bpc.ru/apigate/general/}accountTypeType" minOccurs="0"/&gt;
 *         &lt;element name="accountNumber" type="{http://www.bpc.ru/apigate/general/}accountNumberType" minOccurs="0"/&gt;
 *         &lt;element name="tds" type="{http://www.bpc.ru/apigate/general/}tdsType" minOccurs="0"/&gt;
 *         &lt;element name="senderReceiverInfo" type="{http://www.bpc.ru/apigate/general/}senderReceiverInfoType" minOccurs="0"/&gt;
 *         &lt;element name="pointOfServiceDataCode" type="{http://www.bpc.ru/apigate/general/}pointOfServiceDataCodeType" minOccurs="0"/&gt;
 *         &lt;element name="cardAcceptorParameters" type="{http://www.bpc.ru/apigate/general/}cardAcceptorParametersType" minOccurs="0"/&gt;
 *         &lt;element name="securityLevelIndicator" type="{http://www.bpc.ru/apigate/general/}securityLevelIndicatorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseRequestType", propOrder = {
    "cardIdentification",
    "amount",
    "currency",
    "accountType",
    "accountNumber",
    "tds",
    "senderReceiverInfo",
    "pointOfServiceDataCode",
    "cardAcceptorParameters",
    "securityLevelIndicator"
})
public class PurchaseRequestType {

    @XmlElement(required = true)
    protected CardIdentificationType cardIdentification;
    @XmlElement(required = true)
    protected BigInteger amount;
    protected int currency;
    @XmlSchemaType(name = "string")
    protected AccountTypeType accountType;
    protected String accountNumber;
    protected TdsType tds;
    protected SenderReceiverInfoType senderReceiverInfo;
    protected String pointOfServiceDataCode;
    protected CardAcceptorParametersType cardAcceptorParameters;
    protected String securityLevelIndicator;

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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmount(BigInteger value) {
        this.amount = value;
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
     * Gets the value of the tds property.
     * 
     * @return
     *     possible object is
     *     {@link TdsType }
     *     
     */
    public TdsType getTds() {
        return tds;
    }

    /**
     * Sets the value of the tds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdsType }
     *     
     */
    public void setTds(TdsType value) {
        this.tds = value;
    }

    /**
     * Gets the value of the senderReceiverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SenderReceiverInfoType }
     *     
     */
    public SenderReceiverInfoType getSenderReceiverInfo() {
        return senderReceiverInfo;
    }

    /**
     * Sets the value of the senderReceiverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderReceiverInfoType }
     *     
     */
    public void setSenderReceiverInfo(SenderReceiverInfoType value) {
        this.senderReceiverInfo = value;
    }

    /**
     * Gets the value of the pointOfServiceDataCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfServiceDataCode() {
        return pointOfServiceDataCode;
    }

    /**
     * Sets the value of the pointOfServiceDataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfServiceDataCode(String value) {
        this.pointOfServiceDataCode = value;
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

    /**
     * Gets the value of the securityLevelIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityLevelIndicator() {
        return securityLevelIndicator;
    }

    /**
     * Sets the value of the securityLevelIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityLevelIndicator(String value) {
        this.securityLevelIndicator = value;
    }

}

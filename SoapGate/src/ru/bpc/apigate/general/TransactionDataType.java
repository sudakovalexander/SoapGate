
package ru.bpc.apigate.general;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Параметры транзакции.
 * 
 * <p>Java class for transactionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boWriteOffDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="authorizationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="transactionType" type="{http://www.bpc.ru/apigate/general/}transactionTypeType"/&gt;
 *         &lt;element name="operationDirection" type="{http://www.bpc.ru/apigate/general/}debitCreditIndicatorType"/&gt;
 *         &lt;element name="amount" type="{http://www.bpc.ru/apigate/general/}amountType"/&gt;
 *         &lt;element name="currency" type="{http://www.bpc.ru/apigate/general/}currencyN3CodeType"/&gt;
 *         &lt;element name="amountInAccountCurrency" type="{http://www.bpc.ru/apigate/general/}amountType"/&gt;
 *         &lt;element name="utrnno" type="{http://www.bpc.ru/apigate/general/}utrnnoType"/&gt;
 *         &lt;element name="transactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feeDirection" type="{http://www.bpc.ru/apigate/general/}debitCreditIndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="acquireFeeAmount" type="{http://www.bpc.ru/apigate/general/}amountType" minOccurs="0"/&gt;
 *         &lt;element name="feIssuerFeeAmount" type="{http://www.bpc.ru/apigate/general/}amountType" minOccurs="0"/&gt;
 *         &lt;element name="boIssuerFeeAmount" type="{http://www.bpc.ru/apigate/general/}amountType" minOccurs="0"/&gt;
 *         &lt;element name="mcc" type="{http://www.bpc.ru/apigate/general/}mccType" minOccurs="0"/&gt;
 *         &lt;element name="merchantCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantId" type="{http://www.bpc.ru/apigate/general/}merchantIdType" minOccurs="0"/&gt;
 *         &lt;element name="terminalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="posDataCode" type="{http://www.bpc.ru/apigate/general/}posDataCodeType" minOccurs="0"/&gt;
 *         &lt;element name="authorizationIdResponse" type="{http://www.bpc.ru/apigate/general/}authorizationIdResponseType" minOccurs="0"/&gt;
 *         &lt;element name="reversalDate" type="{http://www.bpc.ru/apigate/general/}transactionDateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionDataType", propOrder = {
    "boWriteOffDate",
    "authorizationDate",
    "transactionType",
    "operationDirection",
    "amount",
    "currency",
    "amountInAccountCurrency",
    "utrnno",
    "transactionDescription",
    "feeDirection",
    "acquireFeeAmount",
    "feIssuerFeeAmount",
    "boIssuerFeeAmount",
    "mcc",
    "merchantCountry",
    "merchantCity",
    "merchantName",
    "merchantId",
    "terminalAddress",
    "posDataCode",
    "authorizationIdResponse",
    "reversalDate"
})
public class TransactionDataType {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar boWriteOffDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authorizationDate;
    protected int transactionType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DebitCreditIndicatorType operationDirection;
    @XmlElement(required = true)
    protected BigInteger amount;
    protected int currency;
    @XmlElement(required = true)
    protected BigInteger amountInAccountCurrency;
    @XmlSchemaType(name = "unsignedLong")
    protected long utrnno;
    protected String transactionDescription;
    @XmlSchemaType(name = "string")
    protected DebitCreditIndicatorType feeDirection;
    protected BigInteger acquireFeeAmount;
    protected BigInteger feIssuerFeeAmount;
    protected BigInteger boIssuerFeeAmount;
    @XmlSchemaType(name = "unsignedInt")
    protected Long mcc;
    protected String merchantCountry;
    protected String merchantCity;
    protected String merchantName;
    protected String merchantId;
    protected String terminalAddress;
    protected String posDataCode;
    protected String authorizationIdResponse;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reversalDate;

    /**
     * Gets the value of the boWriteOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBoWriteOffDate() {
        return boWriteOffDate;
    }

    /**
     * Sets the value of the boWriteOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBoWriteOffDate(XMLGregorianCalendar value) {
        this.boWriteOffDate = value;
    }

    /**
     * Gets the value of the authorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * Sets the value of the authorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizationDate(XMLGregorianCalendar value) {
        this.authorizationDate = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     */
    public int getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     */
    public void setTransactionType(int value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the operationDirection property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCreditIndicatorType }
     *     
     */
    public DebitCreditIndicatorType getOperationDirection() {
        return operationDirection;
    }

    /**
     * Sets the value of the operationDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCreditIndicatorType }
     *     
     */
    public void setOperationDirection(DebitCreditIndicatorType value) {
        this.operationDirection = value;
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
     * Gets the value of the amountInAccountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmountInAccountCurrency() {
        return amountInAccountCurrency;
    }

    /**
     * Sets the value of the amountInAccountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmountInAccountCurrency(BigInteger value) {
        this.amountInAccountCurrency = value;
    }

    /**
     * Gets the value of the utrnno property.
     * 
     */
    public long getUtrnno() {
        return utrnno;
    }

    /**
     * Sets the value of the utrnno property.
     * 
     */
    public void setUtrnno(long value) {
        this.utrnno = value;
    }

    /**
     * Gets the value of the transactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDescription() {
        return transactionDescription;
    }

    /**
     * Sets the value of the transactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDescription(String value) {
        this.transactionDescription = value;
    }

    /**
     * Gets the value of the feeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCreditIndicatorType }
     *     
     */
    public DebitCreditIndicatorType getFeeDirection() {
        return feeDirection;
    }

    /**
     * Sets the value of the feeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCreditIndicatorType }
     *     
     */
    public void setFeeDirection(DebitCreditIndicatorType value) {
        this.feeDirection = value;
    }

    /**
     * Gets the value of the acquireFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcquireFeeAmount() {
        return acquireFeeAmount;
    }

    /**
     * Sets the value of the acquireFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcquireFeeAmount(BigInteger value) {
        this.acquireFeeAmount = value;
    }

    /**
     * Gets the value of the feIssuerFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFeIssuerFeeAmount() {
        return feIssuerFeeAmount;
    }

    /**
     * Sets the value of the feIssuerFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFeIssuerFeeAmount(BigInteger value) {
        this.feIssuerFeeAmount = value;
    }

    /**
     * Gets the value of the boIssuerFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBoIssuerFeeAmount() {
        return boIssuerFeeAmount;
    }

    /**
     * Sets the value of the boIssuerFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBoIssuerFeeAmount(BigInteger value) {
        this.boIssuerFeeAmount = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMcc() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMcc(Long value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the merchantCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCountry() {
        return merchantCountry;
    }

    /**
     * Sets the value of the merchantCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCountry(String value) {
        this.merchantCountry = value;
    }

    /**
     * Gets the value of the merchantCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCity() {
        return merchantCity;
    }

    /**
     * Sets the value of the merchantCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCity(String value) {
        this.merchantCity = value;
    }

    /**
     * Gets the value of the merchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Gets the value of the merchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantId(String value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the terminalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalAddress() {
        return terminalAddress;
    }

    /**
     * Sets the value of the terminalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalAddress(String value) {
        this.terminalAddress = value;
    }

    /**
     * Gets the value of the posDataCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosDataCode() {
        return posDataCode;
    }

    /**
     * Sets the value of the posDataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosDataCode(String value) {
        this.posDataCode = value;
    }

    /**
     * Gets the value of the authorizationIdResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationIdResponse() {
        return authorizationIdResponse;
    }

    /**
     * Sets the value of the authorizationIdResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationIdResponse(String value) {
        this.authorizationIdResponse = value;
    }

    /**
     * Gets the value of the reversalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReversalDate() {
        return reversalDate;
    }

    /**
     * Sets the value of the reversalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReversalDate(XMLGregorianCalendar value) {
        this.reversalDate = value;
    }

}

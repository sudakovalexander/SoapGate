
package ru.bpc.apigate.general;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Параметры транзакции.
 * 
 * <p>Java class for transactionBDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionBDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardNumber" type="{http://www.bpc.ru/apigate/general/}maskedCardNumberType" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="cardSequenceNumber" type="{http://www.bpc.ru/apigate/general/}cardPlasticNumberType"/&gt;
 *         &lt;element name="utrnno" type="{http://www.bpc.ru/apigate/general/}utrnnoType"/&gt;
 *         &lt;element name="reversal" type="{http://www.bpc.ru/apigate/general/}reversalType"/&gt;
 *         &lt;element name="responseCode" type="{http://www.bpc.ru/apigate/general/}responseCodeInternalType" minOccurs="0"/&gt;
 *         &lt;element name="transactionType" type="{http://www.bpc.ru/apigate/general/}transactionTypeType" minOccurs="0"/&gt;
 *         &lt;element name="transmissionDate" type="{http://www.bpc.ru/apigate/general/}transactionDateType" minOccurs="0"/&gt;
 *         &lt;element name="trace" type="{http://www.bpc.ru/apigate/general/}traceType" minOccurs="0"/&gt;
 *         &lt;element name="localTransactionDate" type="{http://www.bpc.ru/apigate/general/}transactionDateType" minOccurs="0"/&gt;
 *         &lt;element name="referenceNumber" type="{http://www.bpc.ru/apigate/general/}referenceNumberType" minOccurs="0"/&gt;
 *         &lt;element name="authorizationIdResponse" type="{http://www.bpc.ru/apigate/general/}authorizationIdResponseType" minOccurs="0"/&gt;
 *         &lt;element name="processingCode" type="{http://www.bpc.ru/apigate/general/}processingCodeType" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.bpc.ru/apigate/general/}amountType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.bpc.ru/apigate/general/}currencyN3CodeType" minOccurs="0"/&gt;
 *         &lt;element name="accountNumber" type="{http://www.bpc.ru/apigate/general/}accountNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionBDataType", propOrder = {
    "cardNumber",
    "expiryDate",
    "cardSequenceNumber",
    "utrnno",
    "reversal",
    "responseCode",
    "transactionType",
    "transmissionDate",
    "trace",
    "localTransactionDate",
    "referenceNumber",
    "authorizationIdResponse",
    "processingCode",
    "amount",
    "currency",
    "accountNumber"
})
@XmlSeeAlso({
    TransactionDetailsBDataType.class
})
public class TransactionBDataType {

    protected String cardNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    protected int cardSequenceNumber;
    @XmlSchemaType(name = "unsignedLong")
    protected long utrnno;
    protected boolean reversal;
    protected Integer responseCode;
    protected Integer transactionType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transmissionDate;
    protected String trace;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar localTransactionDate;
    protected String referenceNumber;
    protected String authorizationIdResponse;
    protected String processingCode;
    protected BigInteger amount;
    protected Integer currency;
    protected String accountNumber;

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the cardSequenceNumber property.
     * 
     */
    public int getCardSequenceNumber() {
        return cardSequenceNumber;
    }

    /**
     * Sets the value of the cardSequenceNumber property.
     * 
     */
    public void setCardSequenceNumber(int value) {
        this.cardSequenceNumber = value;
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
     * Gets the value of the reversal property.
     * 
     */
    public boolean isReversal() {
        return reversal;
    }

    /**
     * Sets the value of the reversal property.
     * 
     */
    public void setReversal(boolean value) {
        this.reversal = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseCode(Integer value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransactionType(Integer value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transmissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransmissionDate() {
        return transmissionDate;
    }

    /**
     * Sets the value of the transmissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransmissionDate(XMLGregorianCalendar value) {
        this.transmissionDate = value;
    }

    /**
     * Gets the value of the trace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrace() {
        return trace;
    }

    /**
     * Sets the value of the trace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrace(String value) {
        this.trace = value;
    }

    /**
     * Gets the value of the localTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalTransactionDate() {
        return localTransactionDate;
    }

    /**
     * Sets the value of the localTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalTransactionDate(XMLGregorianCalendar value) {
        this.localTransactionDate = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
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
     * Gets the value of the processingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingCode() {
        return processingCode;
    }

    /**
     * Sets the value of the processingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingCode(String value) {
        this.processingCode = value;
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

}

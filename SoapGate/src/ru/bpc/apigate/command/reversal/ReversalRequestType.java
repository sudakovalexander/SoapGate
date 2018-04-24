
package ru.bpc.apigate.command.reversal;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.bpc.apigate.general.CardAcceptorParametersType;
import ru.bpc.apigate.general.CardIdentificationType;


/**
 * <p>Java class for reversalRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reversalRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardIdentification" type="{http://www.bpc.ru/apigate/general/}cardIdentificationType"/&gt;
 *         &lt;element name="amount" type="{http://www.bpc.ru/apigate/general/}amountType"/&gt;
 *         &lt;element name="currency" type="{http://www.bpc.ru/apigate/general/}currencyN3CodeType"/&gt;
 *         &lt;element name="processingCode" type="{http://www.bpc.ru/apigate/general/}processingCodeType"/&gt;
 *         &lt;element name="systemTraceAuditNumber" type="{http://www.bpc.ru/apigate/general/}systemTraceAuditNumberType"/&gt;
 *         &lt;element name="transactionDate" type="{http://www.bpc.ru/apigate/general/}transactionDateType"/&gt;
 *         &lt;element name="rrn" type="{http://www.bpc.ru/apigate/general/}rrnType"/&gt;
 *         &lt;element name="authorizationIdResponse" type="{http://www.bpc.ru/apigate/general/}authorizationIdResponseType"/&gt;
 *         &lt;element name="serviceId" type="{http://www.bpc.ru/apigate/general/}serviceIdType" minOccurs="0"/&gt;
 *         &lt;element name="accountNumber" type="{http://www.bpc.ru/apigate/general/}accountNumberType" minOccurs="0"/&gt;
 *         &lt;element name="pointOfServiceDataCode" type="{http://www.bpc.ru/apigate/general/}pointOfServiceDataCodeType" minOccurs="0"/&gt;
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
@XmlType(name = "reversalRequestType", propOrder = {
    "cardIdentification",
    "amount",
    "currency",
    "processingCode",
    "systemTraceAuditNumber",
    "transactionDate",
    "rrn",
    "authorizationIdResponse",
    "serviceId",
    "accountNumber",
    "pointOfServiceDataCode",
    "cardAcceptorParameters"
})
public class ReversalRequestType {

    @XmlElement(required = true)
    protected CardIdentificationType cardIdentification;
    @XmlElement(required = true)
    protected BigInteger amount;
    protected int currency;
    @XmlElement(required = true)
    protected String processingCode;
    protected int systemTraceAuditNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(required = true)
    protected String rrn;
    @XmlElement(required = true)
    protected String authorizationIdResponse;
    protected String serviceId;
    protected String accountNumber;
    protected String pointOfServiceDataCode;
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
     * Gets the value of the systemTraceAuditNumber property.
     * 
     */
    public int getSystemTraceAuditNumber() {
        return systemTraceAuditNumber;
    }

    /**
     * Sets the value of the systemTraceAuditNumber property.
     * 
     */
    public void setSystemTraceAuditNumber(int value) {
        this.systemTraceAuditNumber = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the rrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrn() {
        return rrn;
    }

    /**
     * Sets the value of the rrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrn(String value) {
        this.rrn = value;
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
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
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

}

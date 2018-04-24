
package ru.bpc.apigate.command.ministatement;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.bpc.apigate.general.DebitCreditIndicatorType;


/**
 * Запись мини-выписки.
 * 
 * <p>Java class for miniStatementRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="miniStatementRecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionDate" type="{http://www.bpc.ru/apigate/general/}transactionDateType"/&gt;
 *         &lt;element name="transactionType" type="{http://www.bpc.ru/apigate/command/miniStatement/}miniStatementTransactionTypeType"/&gt;
 *         &lt;element name="debitCreditIndicator" type="{http://www.bpc.ru/apigate/general/}debitCreditIndicatorType"/&gt;
 *         &lt;element name="amount" type="{http://www.bpc.ru/apigate/general/}amountType"/&gt;
 *         &lt;element name="currency" type="{http://www.bpc.ru/apigate/general/}currencyN3CodeType"/&gt;
 *         &lt;element name="terminalIdentification" type="{http://www.bpc.ru/apigate/general/}terminalIdentificationType"/&gt;
 *         &lt;element name="cardAcceptorNameAndLocation" type="{http://www.bpc.ru/apigate/general/}cardAcceptorNameAndLocationType"/&gt;
 *         &lt;element name="authorizationIdResponse" type="{http://www.bpc.ru/apigate/general/}authorizationIdResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "miniStatementRecordType", propOrder = {
    "transactionDate",
    "transactionType",
    "debitCreditIndicator",
    "amount",
    "currency",
    "terminalIdentification",
    "cardAcceptorNameAndLocation",
    "authorizationIdResponse"
})
public class MiniStatementRecordType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(required = true)
    protected String transactionType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DebitCreditIndicatorType debitCreditIndicator;
    @XmlElement(required = true)
    protected BigInteger amount;
    protected int currency;
    @XmlElement(required = true)
    protected String terminalIdentification;
    @XmlElement(required = true)
    protected String cardAcceptorNameAndLocation;
    @XmlElement(required = true)
    protected String authorizationIdResponse;

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
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the debitCreditIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link DebitCreditIndicatorType }
     *     
     */
    public DebitCreditIndicatorType getDebitCreditIndicator() {
        return debitCreditIndicator;
    }

    /**
     * Sets the value of the debitCreditIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitCreditIndicatorType }
     *     
     */
    public void setDebitCreditIndicator(DebitCreditIndicatorType value) {
        this.debitCreditIndicator = value;
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
     * Gets the value of the terminalIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalIdentification() {
        return terminalIdentification;
    }

    /**
     * Sets the value of the terminalIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalIdentification(String value) {
        this.terminalIdentification = value;
    }

    /**
     * Gets the value of the cardAcceptorNameAndLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcceptorNameAndLocation() {
        return cardAcceptorNameAndLocation;
    }

    /**
     * Sets the value of the cardAcceptorNameAndLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcceptorNameAndLocation(String value) {
        this.cardAcceptorNameAndLocation = value;
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

}

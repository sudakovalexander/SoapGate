
package ru.unitarius.integration.schema.cards;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StatementEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TranOperationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OperationID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsCancellation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CardTranNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CorrespondentAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurrencyCodeAlpha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCodeNumeric" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="DocumentComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MCC" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Merchant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FeeTerminal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FeeNetwork" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FeeMerchBank" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TerminalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MerchPointNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IssuerBIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementEntryType", propOrder = {
    "operationDate",
    "tranOperationDate",
    "operationID",
    "transactionID",
    "isCancellation",
    "cardTranNumber",
    "accountID",
    "accountNumber",
    "correspondentAccountNumber",
    "documentAmount",
    "amount",
    "operationType",
    "currencyCodeAlpha",
    "currencyCodeNumeric",
    "documentComment",
    "comment",
    "balance",
    "mcc",
    "merchant",
    "feeTerminal",
    "feeNetwork",
    "feeMerchBank",
    "terminalCode",
    "deviceCode",
    "country",
    "city",
    "merchPointNum",
    "issuerBIN"
})
public class StatementEntryType {

    @XmlElement(name = "OperationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operationDate;
    @XmlElement(name = "TranOperationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranOperationDate;
    @XmlElement(name = "OperationID", required = true)
    protected String operationID;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "IsCancellation")
    protected Boolean isCancellation;
    @XmlElement(name = "CardTranNumber")
    protected String cardTranNumber;
    @XmlElement(name = "AccountID")
    protected Long accountID;
    @XmlElement(name = "AccountNumber", required = true)
    protected String accountNumber;
    @XmlElement(name = "CorrespondentAccountNumber")
    protected String correspondentAccountNumber;
    @XmlElement(name = "DocumentAmount")
    protected BigDecimal documentAmount;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "OperationType", required = true)
    protected String operationType;
    @XmlElement(name = "CurrencyCodeAlpha")
    protected String currencyCodeAlpha;
    @XmlElement(name = "CurrencyCodeNumeric")
    protected BigInteger currencyCodeNumeric;
    @XmlElement(name = "DocumentComment")
    protected String documentComment;
    @XmlElement(name = "Comment", required = true)
    protected String comment;
    @XmlElement(name = "Balance", required = true)
    protected BigDecimal balance;
    @XmlElement(name = "MCC")
    protected BigInteger mcc;
    @XmlElement(name = "Merchant")
    protected String merchant;
    @XmlElement(name = "FeeTerminal")
    protected BigDecimal feeTerminal;
    @XmlElement(name = "FeeNetwork")
    protected BigDecimal feeNetwork;
    @XmlElement(name = "FeeMerchBank")
    protected BigDecimal feeMerchBank;
    @XmlElement(name = "TerminalCode")
    protected String terminalCode;
    @XmlElement(name = "DeviceCode")
    protected String deviceCode;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "MerchPointNum")
    protected String merchPointNum;
    @XmlElement(name = "IssuerBIN")
    protected String issuerBIN;

    /**
     * Gets the value of the operationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationDate() {
        return operationDate;
    }

    /**
     * Sets the value of the operationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationDate(XMLGregorianCalendar value) {
        this.operationDate = value;
    }

    /**
     * Gets the value of the tranOperationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranOperationDate() {
        return tranOperationDate;
    }

    /**
     * Sets the value of the tranOperationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranOperationDate(XMLGregorianCalendar value) {
        this.tranOperationDate = value;
    }

    /**
     * Gets the value of the operationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationID() {
        return operationID;
    }

    /**
     * Sets the value of the operationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationID(String value) {
        this.operationID = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the isCancellation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancellation() {
        return isCancellation;
    }

    /**
     * Sets the value of the isCancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancellation(Boolean value) {
        this.isCancellation = value;
    }

    /**
     * Gets the value of the cardTranNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTranNumber() {
        return cardTranNumber;
    }

    /**
     * Sets the value of the cardTranNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTranNumber(String value) {
        this.cardTranNumber = value;
    }

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountID(Long value) {
        this.accountID = value;
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
     * Gets the value of the correspondentAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondentAccountNumber() {
        return correspondentAccountNumber;
    }

    /**
     * Sets the value of the correspondentAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondentAccountNumber(String value) {
        this.correspondentAccountNumber = value;
    }

    /**
     * Gets the value of the documentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocumentAmount() {
        return documentAmount;
    }

    /**
     * Sets the value of the documentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocumentAmount(BigDecimal value) {
        this.documentAmount = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the currencyCodeAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCodeAlpha() {
        return currencyCodeAlpha;
    }

    /**
     * Sets the value of the currencyCodeAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCodeAlpha(String value) {
        this.currencyCodeAlpha = value;
    }

    /**
     * Gets the value of the currencyCodeNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrencyCodeNumeric() {
        return currencyCodeNumeric;
    }

    /**
     * Sets the value of the currencyCodeNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrencyCodeNumeric(BigInteger value) {
        this.currencyCodeNumeric = value;
    }

    /**
     * Gets the value of the documentComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentComment() {
        return documentComment;
    }

    /**
     * Sets the value of the documentComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentComment(String value) {
        this.documentComment = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMCC() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMCC(BigInteger value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchant(String value) {
        this.merchant = value;
    }

    /**
     * Gets the value of the feeTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeTerminal() {
        return feeTerminal;
    }

    /**
     * Sets the value of the feeTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeTerminal(BigDecimal value) {
        this.feeTerminal = value;
    }

    /**
     * Gets the value of the feeNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeNetwork() {
        return feeNetwork;
    }

    /**
     * Sets the value of the feeNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeNetwork(BigDecimal value) {
        this.feeNetwork = value;
    }

    /**
     * Gets the value of the feeMerchBank property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeMerchBank() {
        return feeMerchBank;
    }

    /**
     * Sets the value of the feeMerchBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeMerchBank(BigDecimal value) {
        this.feeMerchBank = value;
    }

    /**
     * Gets the value of the terminalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalCode() {
        return terminalCode;
    }

    /**
     * Sets the value of the terminalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalCode(String value) {
        this.terminalCode = value;
    }

    /**
     * Gets the value of the deviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * Sets the value of the deviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceCode(String value) {
        this.deviceCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the merchPointNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchPointNum() {
        return merchPointNum;
    }

    /**
     * Sets the value of the merchPointNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchPointNum(String value) {
        this.merchPointNum = value;
    }

    /**
     * Gets the value of the issuerBIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerBIN() {
        return issuerBIN;
    }

    /**
     * Sets the value of the issuerBIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerBIN(String value) {
        this.issuerBIN = value;
    }

}


package ru.unitarius.integration.schema.loans;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.unitarius.integration.schema.common.EntityErrorType;


/**
 * <p>Java class for LoanBasicInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanBasicInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoanID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="LoanMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankProductID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BranchID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FinOperID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FinOperBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Mortgage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateValue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DateEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DateLong" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DateSigning" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="UserAnnual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MoratoriumDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MoratoriumTerm" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BatchID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FlagReceptionBKI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FlagGrantingBKI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateReceptionBKI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DateGrantingBKI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="InDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateClose" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="BalloonAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="HasCreditCard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LoanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsAgreementProvided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DivisionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LastTrancheDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CessionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Term" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MainContractID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ExtNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CurrentInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DefaultInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PrincipalDebt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PrincipalDebtAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InterestDebt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InterestDebtAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultPrincipalDebt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DefaultPrincipalDebtAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultInterestDebt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DefaultInterestDebtAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorList" type="{http://unitarius.ru/integration/schema/common}EntityErrorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanBasicInfoType", propOrder = {
    "loanID",
    "clientID",
    "loanMode",
    "bankProductID",
    "branchID",
    "finOperID",
    "finOperBrief",
    "isClosed",
    "currencyID",
    "currencyCode",
    "currencyNumber",
    "amount",
    "mortgage",
    "dateValue",
    "date",
    "dateEnd",
    "dateLong",
    "dateSigning",
    "userAnnual",
    "number",
    "moratoriumDate",
    "moratoriumTerm",
    "batchID",
    "flagReceptionBKI",
    "flagGrantingBKI",
    "dateReceptionBKI",
    "dateGrantingBKI",
    "inDateTime",
    "userID",
    "comment",
    "dateClose",
    "balloonAmount",
    "hasCreditCard",
    "loanType",
    "isAgreementProvided",
    "divisionID",
    "lastTrancheDate",
    "cessionStatus",
    "term",
    "applicationNumber",
    "applicationDate",
    "mainContractID",
    "extNumber",
    "paymentDate",
    "currentInterestRate",
    "defaultInterestRate",
    "principalDebt",
    "principalDebtAccount",
    "interestDebt",
    "interestDebtAccount",
    "defaultPrincipalDebt",
    "defaultPrincipalDebtAccount",
    "defaultInterestDebt",
    "defaultInterestDebtAccount",
    "errorList"
})
@XmlSeeAlso({
    LoanFullInfoType.class
})
public class LoanBasicInfoType {

    @XmlElement(name = "LoanID")
    protected long loanID;
    @XmlElement(name = "ClientID")
    protected long clientID;
    @XmlElement(name = "LoanMode")
    protected String loanMode;
    @XmlElement(name = "BankProductID")
    protected Long bankProductID;
    @XmlElement(name = "BranchID")
    protected Long branchID;
    @XmlElement(name = "FinOperID")
    protected Long finOperID;
    @XmlElement(name = "FinOperBrief")
    protected String finOperBrief;
    @XmlElement(name = "IsClosed")
    protected Boolean isClosed;
    @XmlElement(name = "CurrencyID")
    protected Long currencyID;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "CurrencyNumber")
    protected BigInteger currencyNumber;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "Mortgage")
    protected String mortgage;
    @XmlElement(name = "DateValue")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateValue;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "DateEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEnd;
    @XmlElement(name = "DateLong")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateLong;
    @XmlElement(name = "DateSigning")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateSigning;
    @XmlElement(name = "UserAnnual")
    protected BigDecimal userAnnual;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "MoratoriumDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar moratoriumDate;
    @XmlElement(name = "MoratoriumTerm")
    protected Long moratoriumTerm;
    @XmlElement(name = "BatchID")
    protected Long batchID;
    @XmlElement(name = "FlagReceptionBKI")
    protected String flagReceptionBKI;
    @XmlElement(name = "FlagGrantingBKI")
    protected String flagGrantingBKI;
    @XmlElement(name = "DateReceptionBKI")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateReceptionBKI;
    @XmlElement(name = "DateGrantingBKI")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateGrantingBKI;
    @XmlElement(name = "InDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDateTime;
    @XmlElement(name = "UserID")
    protected Long userID;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "DateClose")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateClose;
    @XmlElement(name = "BalloonAmount")
    protected BigDecimal balloonAmount;
    @XmlElement(name = "HasCreditCard")
    protected Boolean hasCreditCard;
    @XmlElement(name = "LoanType")
    protected String loanType;
    @XmlElement(name = "IsAgreementProvided")
    protected Boolean isAgreementProvided;
    @XmlElement(name = "DivisionID")
    protected Long divisionID;
    @XmlElement(name = "LastTrancheDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastTrancheDate;
    @XmlElement(name = "CessionStatus")
    protected String cessionStatus;
    @XmlElement(name = "Term")
    protected Long term;
    @XmlElement(name = "ApplicationNumber")
    protected String applicationNumber;
    @XmlElement(name = "ApplicationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar applicationDate;
    @XmlElement(name = "MainContractID")
    protected Long mainContractID;
    @XmlElement(name = "ExtNumber")
    protected String extNumber;
    @XmlElement(name = "PaymentDate")
    protected Integer paymentDate;
    @XmlElement(name = "CurrentInterestRate")
    protected BigDecimal currentInterestRate;
    @XmlElement(name = "DefaultInterestRate")
    protected BigDecimal defaultInterestRate;
    @XmlElement(name = "PrincipalDebt")
    protected BigDecimal principalDebt;
    @XmlElement(name = "PrincipalDebtAccount")
    protected String principalDebtAccount;
    @XmlElement(name = "InterestDebt")
    protected BigDecimal interestDebt;
    @XmlElement(name = "InterestDebtAccount")
    protected String interestDebtAccount;
    @XmlElement(name = "DefaultPrincipalDebt")
    protected BigDecimal defaultPrincipalDebt;
    @XmlElement(name = "DefaultPrincipalDebtAccount")
    protected String defaultPrincipalDebtAccount;
    @XmlElement(name = "DefaultInterestDebt")
    protected BigDecimal defaultInterestDebt;
    @XmlElement(name = "DefaultInterestDebtAccount")
    protected String defaultInterestDebtAccount;
    @XmlElement(name = "ErrorList")
    protected List<EntityErrorType> errorList;

    /**
     * Gets the value of the loanID property.
     * 
     */
    public long getLoanID() {
        return loanID;
    }

    /**
     * Sets the value of the loanID property.
     * 
     */
    public void setLoanID(long value) {
        this.loanID = value;
    }

    /**
     * Gets the value of the clientID property.
     * 
     */
    public long getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     */
    public void setClientID(long value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the loanMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanMode() {
        return loanMode;
    }

    /**
     * Sets the value of the loanMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanMode(String value) {
        this.loanMode = value;
    }

    /**
     * Gets the value of the bankProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankProductID() {
        return bankProductID;
    }

    /**
     * Sets the value of the bankProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankProductID(Long value) {
        this.bankProductID = value;
    }

    /**
     * Gets the value of the branchID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBranchID() {
        return branchID;
    }

    /**
     * Sets the value of the branchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBranchID(Long value) {
        this.branchID = value;
    }

    /**
     * Gets the value of the finOperID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinOperID() {
        return finOperID;
    }

    /**
     * Sets the value of the finOperID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinOperID(Long value) {
        this.finOperID = value;
    }

    /**
     * Gets the value of the finOperBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinOperBrief() {
        return finOperBrief;
    }

    /**
     * Sets the value of the finOperBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinOperBrief(String value) {
        this.finOperBrief = value;
    }

    /**
     * Gets the value of the isClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsClosed() {
        return isClosed;
    }

    /**
     * Sets the value of the isClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClosed(Boolean value) {
        this.isClosed = value;
    }

    /**
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrencyID(Long value) {
        this.currencyID = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the currencyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrencyNumber() {
        return currencyNumber;
    }

    /**
     * Sets the value of the currencyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrencyNumber(BigInteger value) {
        this.currencyNumber = value;
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
     * Gets the value of the mortgage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMortgage() {
        return mortgage;
    }

    /**
     * Sets the value of the mortgage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMortgage(String value) {
        this.mortgage = value;
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValue() {
        return dateValue;
    }

    /**
     * Sets the value of the dateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValue(XMLGregorianCalendar value) {
        this.dateValue = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the dateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the value of the dateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEnd(XMLGregorianCalendar value) {
        this.dateEnd = value;
    }

    /**
     * Gets the value of the dateLong property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLong() {
        return dateLong;
    }

    /**
     * Sets the value of the dateLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLong(XMLGregorianCalendar value) {
        this.dateLong = value;
    }

    /**
     * Gets the value of the dateSigning property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSigning() {
        return dateSigning;
    }

    /**
     * Sets the value of the dateSigning property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSigning(XMLGregorianCalendar value) {
        this.dateSigning = value;
    }

    /**
     * Gets the value of the userAnnual property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUserAnnual() {
        return userAnnual;
    }

    /**
     * Sets the value of the userAnnual property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUserAnnual(BigDecimal value) {
        this.userAnnual = value;
    }

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
     * Gets the value of the moratoriumDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMoratoriumDate() {
        return moratoriumDate;
    }

    /**
     * Sets the value of the moratoriumDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMoratoriumDate(XMLGregorianCalendar value) {
        this.moratoriumDate = value;
    }

    /**
     * Gets the value of the moratoriumTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMoratoriumTerm() {
        return moratoriumTerm;
    }

    /**
     * Sets the value of the moratoriumTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMoratoriumTerm(Long value) {
        this.moratoriumTerm = value;
    }

    /**
     * Gets the value of the batchID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBatchID() {
        return batchID;
    }

    /**
     * Sets the value of the batchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBatchID(Long value) {
        this.batchID = value;
    }

    /**
     * Gets the value of the flagReceptionBKI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagReceptionBKI() {
        return flagReceptionBKI;
    }

    /**
     * Sets the value of the flagReceptionBKI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagReceptionBKI(String value) {
        this.flagReceptionBKI = value;
    }

    /**
     * Gets the value of the flagGrantingBKI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagGrantingBKI() {
        return flagGrantingBKI;
    }

    /**
     * Sets the value of the flagGrantingBKI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagGrantingBKI(String value) {
        this.flagGrantingBKI = value;
    }

    /**
     * Gets the value of the dateReceptionBKI property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReceptionBKI() {
        return dateReceptionBKI;
    }

    /**
     * Sets the value of the dateReceptionBKI property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReceptionBKI(XMLGregorianCalendar value) {
        this.dateReceptionBKI = value;
    }

    /**
     * Gets the value of the dateGrantingBKI property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateGrantingBKI() {
        return dateGrantingBKI;
    }

    /**
     * Sets the value of the dateGrantingBKI property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateGrantingBKI(XMLGregorianCalendar value) {
        this.dateGrantingBKI = value;
    }

    /**
     * Gets the value of the inDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDateTime() {
        return inDateTime;
    }

    /**
     * Sets the value of the inDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDateTime(XMLGregorianCalendar value) {
        this.inDateTime = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserID(Long value) {
        this.userID = value;
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
     * Gets the value of the dateClose property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateClose() {
        return dateClose;
    }

    /**
     * Sets the value of the dateClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateClose(XMLGregorianCalendar value) {
        this.dateClose = value;
    }

    /**
     * Gets the value of the balloonAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalloonAmount() {
        return balloonAmount;
    }

    /**
     * Sets the value of the balloonAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalloonAmount(BigDecimal value) {
        this.balloonAmount = value;
    }

    /**
     * Gets the value of the hasCreditCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasCreditCard() {
        return hasCreditCard;
    }

    /**
     * Sets the value of the hasCreditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasCreditCard(Boolean value) {
        this.hasCreditCard = value;
    }

    /**
     * Gets the value of the loanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * Sets the value of the loanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanType(String value) {
        this.loanType = value;
    }

    /**
     * Gets the value of the isAgreementProvided property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAgreementProvided() {
        return isAgreementProvided;
    }

    /**
     * Sets the value of the isAgreementProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAgreementProvided(Boolean value) {
        this.isAgreementProvided = value;
    }

    /**
     * Gets the value of the divisionID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDivisionID() {
        return divisionID;
    }

    /**
     * Sets the value of the divisionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDivisionID(Long value) {
        this.divisionID = value;
    }

    /**
     * Gets the value of the lastTrancheDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTrancheDate() {
        return lastTrancheDate;
    }

    /**
     * Sets the value of the lastTrancheDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTrancheDate(XMLGregorianCalendar value) {
        this.lastTrancheDate = value;
    }

    /**
     * Gets the value of the cessionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCessionStatus() {
        return cessionStatus;
    }

    /**
     * Sets the value of the cessionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCessionStatus(String value) {
        this.cessionStatus = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTerm(Long value) {
        this.term = value;
    }

    /**
     * Gets the value of the applicationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * Sets the value of the applicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationNumber(String value) {
        this.applicationNumber = value;
    }

    /**
     * Gets the value of the applicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationDate(XMLGregorianCalendar value) {
        this.applicationDate = value;
    }

    /**
     * Gets the value of the mainContractID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMainContractID() {
        return mainContractID;
    }

    /**
     * Sets the value of the mainContractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMainContractID(Long value) {
        this.mainContractID = value;
    }

    /**
     * Gets the value of the extNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtNumber() {
        return extNumber;
    }

    /**
     * Sets the value of the extNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtNumber(String value) {
        this.extNumber = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentDate(Integer value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the currentInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentInterestRate() {
        return currentInterestRate;
    }

    /**
     * Sets the value of the currentInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentInterestRate(BigDecimal value) {
        this.currentInterestRate = value;
    }

    /**
     * Gets the value of the defaultInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultInterestRate() {
        return defaultInterestRate;
    }

    /**
     * Sets the value of the defaultInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultInterestRate(BigDecimal value) {
        this.defaultInterestRate = value;
    }

    /**
     * Gets the value of the principalDebt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrincipalDebt() {
        return principalDebt;
    }

    /**
     * Sets the value of the principalDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrincipalDebt(BigDecimal value) {
        this.principalDebt = value;
    }

    /**
     * Gets the value of the principalDebtAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalDebtAccount() {
        return principalDebtAccount;
    }

    /**
     * Sets the value of the principalDebtAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalDebtAccount(String value) {
        this.principalDebtAccount = value;
    }

    /**
     * Gets the value of the interestDebt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestDebt() {
        return interestDebt;
    }

    /**
     * Sets the value of the interestDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestDebt(BigDecimal value) {
        this.interestDebt = value;
    }

    /**
     * Gets the value of the interestDebtAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestDebtAccount() {
        return interestDebtAccount;
    }

    /**
     * Sets the value of the interestDebtAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestDebtAccount(String value) {
        this.interestDebtAccount = value;
    }

    /**
     * Gets the value of the defaultPrincipalDebt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultPrincipalDebt() {
        return defaultPrincipalDebt;
    }

    /**
     * Sets the value of the defaultPrincipalDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultPrincipalDebt(BigDecimal value) {
        this.defaultPrincipalDebt = value;
    }

    /**
     * Gets the value of the defaultPrincipalDebtAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPrincipalDebtAccount() {
        return defaultPrincipalDebtAccount;
    }

    /**
     * Sets the value of the defaultPrincipalDebtAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPrincipalDebtAccount(String value) {
        this.defaultPrincipalDebtAccount = value;
    }

    /**
     * Gets the value of the defaultInterestDebt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultInterestDebt() {
        return defaultInterestDebt;
    }

    /**
     * Sets the value of the defaultInterestDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultInterestDebt(BigDecimal value) {
        this.defaultInterestDebt = value;
    }

    /**
     * Gets the value of the defaultInterestDebtAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultInterestDebtAccount() {
        return defaultInterestDebtAccount;
    }

    /**
     * Sets the value of the defaultInterestDebtAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultInterestDebtAccount(String value) {
        this.defaultInterestDebtAccount = value;
    }

    /**
     * Gets the value of the errorList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityErrorType }
     * 
     * 
     */
    public List<EntityErrorType> getErrorList() {
        if (errorList == null) {
            errorList = new ArrayList<EntityErrorType>();
        }
        return this.errorList;
    }

}

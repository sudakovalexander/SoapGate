
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentRequestOutgoingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentRequestOutgoingRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="docId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="docBankDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="sendType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acceptTerm" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="payerFullname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payerInn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payerKpp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payerAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payerCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="payerAccountCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payerBankBik" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payerBankCorrAccount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payerBankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payerBankPlace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiverFullname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiverInn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiverKpp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiverAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiverCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiverAccountCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiverBankBik" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiverBankCorrAccount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiverBankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="receiverBankPlace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="operationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="urgentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="uin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://custsystems.com/integration/abs}files" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRequestOutgoingRequest", propOrder = {
    "reqID",
    "docNumber",
    "docId",
    "docDate",
    "subSys",
    "customerID",
    "branchId",
    "docBankDate",
    "sendType",
    "payCondition",
    "acceptTerm",
    "amount",
    "payerFullname",
    "payerInn",
    "payerKpp",
    "payerAccountNumber",
    "payerCardNumber",
    "payerAccountCurrencyCode",
    "payerBankBik",
    "payerBankCorrAccount",
    "payerBankName",
    "payerBankPlace",
    "receiverFullname",
    "receiverInn",
    "receiverKpp",
    "receiverAccountNumber",
    "receiverCardNumber",
    "receiverAccountCurrencyCode",
    "receiverBankBik",
    "receiverBankCorrAccount",
    "receiverBankName",
    "receiverBankPlace",
    "operationType",
    "urgentType",
    "uin",
    "description",
    "files"
})
public class PaymentRequestOutgoingRequest {

    protected String reqID;
    @XmlElement(required = true)
    protected String docNumber;
    @XmlElement(required = true)
    protected String docId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDate;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "BranchId", required = true)
    protected String branchId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docBankDate;
    @XmlElement(required = true)
    protected String sendType;
    @XmlElement(required = true)
    protected String payCondition;
    protected BigInteger acceptTerm;
    @XmlElement(required = true)
    protected BigDecimal amount;
    @XmlElement(required = true)
    protected String payerFullname;
    @XmlElement(required = true)
    protected String payerInn;
    @XmlElement(required = true)
    protected String payerKpp;
    protected String payerAccountNumber;
    protected String payerCardNumber;
    @XmlElement(required = true)
    protected String payerAccountCurrencyCode;
    @XmlElement(required = true)
    protected String payerBankBik;
    @XmlElement(required = true)
    protected String payerBankCorrAccount;
    @XmlElement(required = true)
    protected String payerBankName;
    @XmlElement(required = true)
    protected String payerBankPlace;
    @XmlElement(required = true)
    protected String receiverFullname;
    @XmlElement(required = true)
    protected String receiverInn;
    @XmlElement(required = true)
    protected String receiverKpp;
    protected String receiverAccountNumber;
    protected String receiverCardNumber;
    @XmlElement(required = true)
    protected String receiverAccountCurrencyCode;
    @XmlElement(required = true)
    protected String receiverBankBik;
    @XmlElement(required = true)
    protected String receiverBankCorrAccount;
    @XmlElement(required = true)
    protected String receiverBankName;
    @XmlElement(required = true)
    protected String receiverBankPlace;
    @XmlElement(required = true)
    protected String operationType;
    @XmlElement(required = true)
    protected String urgentType;
    @XmlElement(required = true)
    protected String uin;
    @XmlElement(required = true)
    protected String description;
    protected Files files;

    /**
     * Gets the value of the reqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqID() {
        return reqID;
    }

    /**
     * Sets the value of the reqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqID(String value) {
        this.reqID = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the docId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocId(String value) {
        this.docId = value;
    }

    /**
     * Gets the value of the docDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Gets the value of the subSys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSys() {
        return subSys;
    }

    /**
     * Sets the value of the subSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSys(String value) {
        this.subSys = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the docBankDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocBankDate() {
        return docBankDate;
    }

    /**
     * Sets the value of the docBankDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocBankDate(XMLGregorianCalendar value) {
        this.docBankDate = value;
    }

    /**
     * Gets the value of the sendType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendType() {
        return sendType;
    }

    /**
     * Sets the value of the sendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendType(String value) {
        this.sendType = value;
    }

    /**
     * Gets the value of the payCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayCondition() {
        return payCondition;
    }

    /**
     * Sets the value of the payCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayCondition(String value) {
        this.payCondition = value;
    }

    /**
     * Gets the value of the acceptTerm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcceptTerm() {
        return acceptTerm;
    }

    /**
     * Sets the value of the acceptTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcceptTerm(BigInteger value) {
        this.acceptTerm = value;
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
     * Gets the value of the payerFullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerFullname() {
        return payerFullname;
    }

    /**
     * Sets the value of the payerFullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerFullname(String value) {
        this.payerFullname = value;
    }

    /**
     * Gets the value of the payerInn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInn() {
        return payerInn;
    }

    /**
     * Sets the value of the payerInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInn(String value) {
        this.payerInn = value;
    }

    /**
     * Gets the value of the payerKpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerKpp() {
        return payerKpp;
    }

    /**
     * Sets the value of the payerKpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerKpp(String value) {
        this.payerKpp = value;
    }

    /**
     * Gets the value of the payerAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAccountNumber() {
        return payerAccountNumber;
    }

    /**
     * Sets the value of the payerAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAccountNumber(String value) {
        this.payerAccountNumber = value;
    }

    /**
     * Gets the value of the payerCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerCardNumber() {
        return payerCardNumber;
    }

    /**
     * Sets the value of the payerCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerCardNumber(String value) {
        this.payerCardNumber = value;
    }

    /**
     * Gets the value of the payerAccountCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAccountCurrencyCode() {
        return payerAccountCurrencyCode;
    }

    /**
     * Sets the value of the payerAccountCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAccountCurrencyCode(String value) {
        this.payerAccountCurrencyCode = value;
    }

    /**
     * Gets the value of the payerBankBik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerBankBik() {
        return payerBankBik;
    }

    /**
     * Sets the value of the payerBankBik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerBankBik(String value) {
        this.payerBankBik = value;
    }

    /**
     * Gets the value of the payerBankCorrAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerBankCorrAccount() {
        return payerBankCorrAccount;
    }

    /**
     * Sets the value of the payerBankCorrAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerBankCorrAccount(String value) {
        this.payerBankCorrAccount = value;
    }

    /**
     * Gets the value of the payerBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerBankName() {
        return payerBankName;
    }

    /**
     * Sets the value of the payerBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerBankName(String value) {
        this.payerBankName = value;
    }

    /**
     * Gets the value of the payerBankPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerBankPlace() {
        return payerBankPlace;
    }

    /**
     * Sets the value of the payerBankPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerBankPlace(String value) {
        this.payerBankPlace = value;
    }

    /**
     * Gets the value of the receiverFullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverFullname() {
        return receiverFullname;
    }

    /**
     * Sets the value of the receiverFullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverFullname(String value) {
        this.receiverFullname = value;
    }

    /**
     * Gets the value of the receiverInn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverInn() {
        return receiverInn;
    }

    /**
     * Sets the value of the receiverInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverInn(String value) {
        this.receiverInn = value;
    }

    /**
     * Gets the value of the receiverKpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverKpp() {
        return receiverKpp;
    }

    /**
     * Sets the value of the receiverKpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverKpp(String value) {
        this.receiverKpp = value;
    }

    /**
     * Gets the value of the receiverAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    /**
     * Sets the value of the receiverAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAccountNumber(String value) {
        this.receiverAccountNumber = value;
    }

    /**
     * Gets the value of the receiverCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverCardNumber() {
        return receiverCardNumber;
    }

    /**
     * Sets the value of the receiverCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverCardNumber(String value) {
        this.receiverCardNumber = value;
    }

    /**
     * Gets the value of the receiverAccountCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverAccountCurrencyCode() {
        return receiverAccountCurrencyCode;
    }

    /**
     * Sets the value of the receiverAccountCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAccountCurrencyCode(String value) {
        this.receiverAccountCurrencyCode = value;
    }

    /**
     * Gets the value of the receiverBankBik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverBankBik() {
        return receiverBankBik;
    }

    /**
     * Sets the value of the receiverBankBik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverBankBik(String value) {
        this.receiverBankBik = value;
    }

    /**
     * Gets the value of the receiverBankCorrAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverBankCorrAccount() {
        return receiverBankCorrAccount;
    }

    /**
     * Sets the value of the receiverBankCorrAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverBankCorrAccount(String value) {
        this.receiverBankCorrAccount = value;
    }

    /**
     * Gets the value of the receiverBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverBankName() {
        return receiverBankName;
    }

    /**
     * Sets the value of the receiverBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverBankName(String value) {
        this.receiverBankName = value;
    }

    /**
     * Gets the value of the receiverBankPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverBankPlace() {
        return receiverBankPlace;
    }

    /**
     * Sets the value of the receiverBankPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverBankPlace(String value) {
        this.receiverBankPlace = value;
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
     * Gets the value of the urgentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrgentType() {
        return urgentType;
    }

    /**
     * Sets the value of the urgentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrgentType(String value) {
        this.urgentType = value;
    }

    /**
     * Gets the value of the uin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUin() {
        return uin;
    }

    /**
     * Sets the value of the uin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUin(String value) {
        this.uin = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the files property.
     * 
     * @return
     *     possible object is
     *     {@link Files }
     *     
     */
    public Files getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param value
     *     allowed object is
     *     {@link Files }
     *     
     */
    public void setFiles(Files value) {
        this.files = value;
    }

}


package com.custsystems.integration.abs;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DealPassCreditRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealPassCreditRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docBankDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="acceptDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="dealPassContractInfo" type="{http://custsystems.com/integration/abs}ContractInfo" minOccurs="0"/&gt;
 *         &lt;element name="credPayPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="debetsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="deliveryType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="depositAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="contrAmountTrans" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="fixRatePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="flagPayReturn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="increaseRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="isDirectInvest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="liborRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="otherPayments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherRateMehtod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nonResidentInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{http://custsystems.com/integration/abs}NonResidentInfo" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dpInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{http://custsystems.com/integration/abs}DpInfo" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dpReissueInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{http://custsystems.com/integration/abs}DpReissueInfo" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="creditTranche" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{http://custsystems.com/integration/abs}CreditTranche" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="paymentReturn" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{http://custsystems.com/integration/abs}PaymentReturn" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="creditReceipt" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{http://custsystems.com/integration/abs}CreditReceipt" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "DealPassCreditRequest", propOrder = {
    "reqID",
    "docNumber",
    "docId",
    "docDate",
    "subSys",
    "customerID",
    "branchId",
    "docBankDate",
    "acceptDate",
    "dealPassContractInfo",
    "credPayPeriod",
    "debetsAmount",
    "deliveryType",
    "depositAmount",
    "contrAmountTrans",
    "fixRatePercent",
    "flagPayReturn",
    "increaseRate",
    "isDirectInvest",
    "liborRate",
    "otherPayments",
    "otherRateMehtod",
    "returnDate",
    "address",
    "nonResidentInfo",
    "dpInfo",
    "dpReissueInfo",
    "creditTranche",
    "paymentReturn",
    "creditReceipt",
    "files"
})
public class DealPassCreditRequest {

    protected String reqID;
    protected String docNumber;
    protected String docId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDate;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "BranchId")
    protected String branchId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docBankDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acceptDate;
    protected ContractInfo dealPassContractInfo;
    @XmlElement(required = true)
    protected String credPayPeriod;
    @XmlElement(required = true)
    protected BigDecimal debetsAmount;
    @XmlElement(required = true)
    protected BigInteger deliveryType;
    @XmlElement(required = true)
    protected BigDecimal depositAmount;
    @XmlElement(required = true)
    protected BigDecimal contrAmountTrans;
    protected BigDecimal fixRatePercent;
    protected BigInteger flagPayReturn;
    @XmlElement(required = true)
    protected BigDecimal increaseRate;
    protected Boolean isDirectInvest;
    protected BigDecimal liborRate;
    protected String otherPayments;
    protected String otherRateMehtod;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar returnDate;
    protected String address;
    protected DealPassCreditRequest.NonResidentInfo nonResidentInfo;
    protected DealPassCreditRequest.DpInfo dpInfo;
    protected DealPassCreditRequest.DpReissueInfo dpReissueInfo;
    protected DealPassCreditRequest.CreditTranche creditTranche;
    protected DealPassCreditRequest.PaymentReturn paymentReturn;
    protected DealPassCreditRequest.CreditReceipt creditReceipt;
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
     * Gets the value of the acceptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptDate() {
        return acceptDate;
    }

    /**
     * Sets the value of the acceptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptDate(XMLGregorianCalendar value) {
        this.acceptDate = value;
    }

    /**
     * Gets the value of the dealPassContractInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractInfo }
     *     
     */
    public ContractInfo getDealPassContractInfo() {
        return dealPassContractInfo;
    }

    /**
     * Sets the value of the dealPassContractInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractInfo }
     *     
     */
    public void setDealPassContractInfo(ContractInfo value) {
        this.dealPassContractInfo = value;
    }

    /**
     * Gets the value of the credPayPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredPayPeriod() {
        return credPayPeriod;
    }

    /**
     * Sets the value of the credPayPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredPayPeriod(String value) {
        this.credPayPeriod = value;
    }

    /**
     * Gets the value of the debetsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebetsAmount() {
        return debetsAmount;
    }

    /**
     * Sets the value of the debetsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebetsAmount(BigDecimal value) {
        this.debetsAmount = value;
    }

    /**
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeliveryType(BigInteger value) {
        this.deliveryType = value;
    }

    /**
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepositAmount(BigDecimal value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the contrAmountTrans property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContrAmountTrans() {
        return contrAmountTrans;
    }

    /**
     * Sets the value of the contrAmountTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContrAmountTrans(BigDecimal value) {
        this.contrAmountTrans = value;
    }

    /**
     * Gets the value of the fixRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixRatePercent() {
        return fixRatePercent;
    }

    /**
     * Sets the value of the fixRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixRatePercent(BigDecimal value) {
        this.fixRatePercent = value;
    }

    /**
     * Gets the value of the flagPayReturn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlagPayReturn() {
        return flagPayReturn;
    }

    /**
     * Sets the value of the flagPayReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlagPayReturn(BigInteger value) {
        this.flagPayReturn = value;
    }

    /**
     * Gets the value of the increaseRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncreaseRate() {
        return increaseRate;
    }

    /**
     * Sets the value of the increaseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncreaseRate(BigDecimal value) {
        this.increaseRate = value;
    }

    /**
     * Gets the value of the isDirectInvest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDirectInvest() {
        return isDirectInvest;
    }

    /**
     * Sets the value of the isDirectInvest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDirectInvest(Boolean value) {
        this.isDirectInvest = value;
    }

    /**
     * Gets the value of the liborRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLiborRate() {
        return liborRate;
    }

    /**
     * Sets the value of the liborRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLiborRate(BigDecimal value) {
        this.liborRate = value;
    }

    /**
     * Gets the value of the otherPayments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPayments() {
        return otherPayments;
    }

    /**
     * Sets the value of the otherPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPayments(String value) {
        this.otherPayments = value;
    }

    /**
     * Gets the value of the otherRateMehtod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRateMehtod() {
        return otherRateMehtod;
    }

    /**
     * Sets the value of the otherRateMehtod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRateMehtod(String value) {
        this.otherRateMehtod = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDate(XMLGregorianCalendar value) {
        this.returnDate = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the nonResidentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DealPassCreditRequest.NonResidentInfo }
     *     
     */
    public DealPassCreditRequest.NonResidentInfo getNonResidentInfo() {
        return nonResidentInfo;
    }

    /**
     * Sets the value of the nonResidentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealPassCreditRequest.NonResidentInfo }
     *     
     */
    public void setNonResidentInfo(DealPassCreditRequest.NonResidentInfo value) {
        this.nonResidentInfo = value;
    }

    /**
     * Gets the value of the dpInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DealPassCreditRequest.DpInfo }
     *     
     */
    public DealPassCreditRequest.DpInfo getDpInfo() {
        return dpInfo;
    }

    /**
     * Sets the value of the dpInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealPassCreditRequest.DpInfo }
     *     
     */
    public void setDpInfo(DealPassCreditRequest.DpInfo value) {
        this.dpInfo = value;
    }

    /**
     * Gets the value of the dpReissueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DealPassCreditRequest.DpReissueInfo }
     *     
     */
    public DealPassCreditRequest.DpReissueInfo getDpReissueInfo() {
        return dpReissueInfo;
    }

    /**
     * Sets the value of the dpReissueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealPassCreditRequest.DpReissueInfo }
     *     
     */
    public void setDpReissueInfo(DealPassCreditRequest.DpReissueInfo value) {
        this.dpReissueInfo = value;
    }

    /**
     * Gets the value of the creditTranche property.
     * 
     * @return
     *     possible object is
     *     {@link DealPassCreditRequest.CreditTranche }
     *     
     */
    public DealPassCreditRequest.CreditTranche getCreditTranche() {
        return creditTranche;
    }

    /**
     * Sets the value of the creditTranche property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealPassCreditRequest.CreditTranche }
     *     
     */
    public void setCreditTranche(DealPassCreditRequest.CreditTranche value) {
        this.creditTranche = value;
    }

    /**
     * Gets the value of the paymentReturn property.
     * 
     * @return
     *     possible object is
     *     {@link DealPassCreditRequest.PaymentReturn }
     *     
     */
    public DealPassCreditRequest.PaymentReturn getPaymentReturn() {
        return paymentReturn;
    }

    /**
     * Sets the value of the paymentReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealPassCreditRequest.PaymentReturn }
     *     
     */
    public void setPaymentReturn(DealPassCreditRequest.PaymentReturn value) {
        this.paymentReturn = value;
    }

    /**
     * Gets the value of the creditReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link DealPassCreditRequest.CreditReceipt }
     *     
     */
    public DealPassCreditRequest.CreditReceipt getCreditReceipt() {
        return creditReceipt;
    }

    /**
     * Sets the value of the creditReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealPassCreditRequest.CreditReceipt }
     *     
     */
    public void setCreditReceipt(DealPassCreditRequest.CreditReceipt value) {
        this.creditReceipt = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{http://custsystems.com/integration/abs}CreditReceipt" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class CreditReceipt {

        @XmlElement(required = true)
        protected List<com.custsystems.integration.abs.CreditReceipt> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link com.custsystems.integration.abs.CreditReceipt }
         * 
         * 
         */
        public List<com.custsystems.integration.abs.CreditReceipt> getItem() {
            if (item == null) {
                item = new ArrayList<com.custsystems.integration.abs.CreditReceipt>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{http://custsystems.com/integration/abs}CreditTranche" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class CreditTranche {

        @XmlElement(required = true)
        protected List<com.custsystems.integration.abs.CreditTranche> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link com.custsystems.integration.abs.CreditTranche }
         * 
         * 
         */
        public List<com.custsystems.integration.abs.CreditTranche> getItem() {
            if (item == null) {
                item = new ArrayList<com.custsystems.integration.abs.CreditTranche>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{http://custsystems.com/integration/abs}DpInfo" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class DpInfo {

        @XmlElement(required = true)
        protected List<com.custsystems.integration.abs.DpInfo> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link com.custsystems.integration.abs.DpInfo }
         * 
         * 
         */
        public List<com.custsystems.integration.abs.DpInfo> getItem() {
            if (item == null) {
                item = new ArrayList<com.custsystems.integration.abs.DpInfo>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{http://custsystems.com/integration/abs}DpReissueInfo" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class DpReissueInfo {

        @XmlElement(required = true)
        protected List<com.custsystems.integration.abs.DpReissueInfo> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link com.custsystems.integration.abs.DpReissueInfo }
         * 
         * 
         */
        public List<com.custsystems.integration.abs.DpReissueInfo> getItem() {
            if (item == null) {
                item = new ArrayList<com.custsystems.integration.abs.DpReissueInfo>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{http://custsystems.com/integration/abs}NonResidentInfo" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class NonResidentInfo {

        @XmlElement(required = true)
        protected List<com.custsystems.integration.abs.NonResidentInfo> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link com.custsystems.integration.abs.NonResidentInfo }
         * 
         * 
         */
        public List<com.custsystems.integration.abs.NonResidentInfo> getItem() {
            if (item == null) {
                item = new ArrayList<com.custsystems.integration.abs.NonResidentInfo>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{http://custsystems.com/integration/abs}PaymentReturn" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class PaymentReturn {

        @XmlElement(required = true)
        protected List<com.custsystems.integration.abs.PaymentReturn> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link com.custsystems.integration.abs.PaymentReturn }
         * 
         * 
         */
        public List<com.custsystems.integration.abs.PaymentReturn> getItem() {
            if (item == null) {
                item = new ArrayList<com.custsystems.integration.abs.PaymentReturn>();
            }
            return this.item;
        }

    }

}

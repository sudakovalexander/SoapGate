
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditLoanRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditLoanRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRTP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="N" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ED" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Prc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CUR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="A" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="R" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Acc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LoanAccount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="34"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RepayAccount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="34"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PrcAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PrcTerm" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ODA" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="OPA" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="OPrc" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="MNP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PRCP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OFN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TSM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PTRM" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RefTdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ILPEN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IIPEN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ProductCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContractID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CurrentDebtOnLoan" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OverduePrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AvailAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OutstandingAmountAll" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RestLoanAccount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TypePayment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CreditFullCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CreditTotalAmountDebtPay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AccCreditRepayment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AccCreditRepayment2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InsuranceLoanerType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GracePeriodPayment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AccruedPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CreditProductType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CurrentPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CurrentLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DateDebt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AmountCommisOtherPay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Restructured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditLoanRecord", propOrder = {
    "crtp",
    "d",
    "n",
    "dt",
    "ed",
    "prc",
    "cur",
    "crd",
    "a",
    "r",
    "acc",
    "loanAccount",
    "repayAccount",
    "prcAmount",
    "prcTerm",
    "oda",
    "opa",
    "oPrc",
    "status",
    "mnp",
    "prcp",
    "ofn",
    "fn",
    "tsm",
    "ptrm",
    "refTdn",
    "ilpen",
    "iipen",
    "productCode",
    "contractID",
    "currentDebtOnLoan",
    "overduePrincipal",
    "availAmount",
    "outstandingAmountAll",
    "restLoanAccount",
    "typePayment",
    "creditFullCost",
    "creditTotalAmountDebtPay",
    "accCreditRepayment",
    "accCreditRepayment2",
    "insuranceLoanerType",
    "gracePeriodPayment",
    "accruedPercent",
    "creditProductType",
    "currentPercent",
    "currentLimit",
    "dateDebt",
    "amountCommisOtherPay",
    "restructured"
})
public class CreditLoanRecord {

    @XmlElement(name = "CRTP", required = true)
    protected String crtp;
    @XmlElement(name = "D", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar d;
    @XmlElement(name = "N", required = true)
    protected String n;
    @XmlElement(name = "DT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "ED")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ed;
    @XmlElement(name = "Prc")
    protected BigDecimal prc;
    @XmlElement(name = "CUR", required = true)
    protected String cur;
    @XmlElement(name = "CRD")
    protected String crd;
    @XmlElement(name = "A", required = true)
    protected BigDecimal a;
    @XmlElement(name = "R", required = true)
    protected BigDecimal r;
    @XmlElement(name = "Acc", required = true)
    protected String acc;
    @XmlElement(name = "LoanAccount")
    protected String loanAccount;
    @XmlElement(name = "RepayAccount")
    protected String repayAccount;
    @XmlElement(name = "PrcAmount", required = true)
    protected BigDecimal prcAmount;
    @XmlElement(name = "PrcTerm")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prcTerm;
    @XmlElement(name = "ODA", required = true)
    protected BigDecimal oda;
    @XmlElement(name = "OPA", required = true)
    protected BigDecimal opa;
    @XmlElement(name = "OPrc", required = true)
    protected BigDecimal oPrc;
    @XmlElement(name = "Status", required = true)
    protected BigDecimal status;
    @XmlElement(name = "MNP")
    protected BigDecimal mnp;
    @XmlElement(name = "PRCP")
    protected BigDecimal prcp;
    @XmlElement(name = "OFN")
    protected BigDecimal ofn;
    @XmlElement(name = "FN")
    protected BigDecimal fn;
    @XmlElement(name = "TSM")
    protected BigDecimal tsm;
    @XmlElement(name = "PTRM")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ptrm;
    @XmlElement(name = "RefTdn")
    protected String refTdn;
    @XmlElement(name = "ILPEN")
    protected BigDecimal ilpen;
    @XmlElement(name = "IIPEN")
    protected BigDecimal iipen;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "ContractID")
    protected String contractID;
    @XmlElement(name = "CurrentDebtOnLoan")
    protected BigDecimal currentDebtOnLoan;
    @XmlElement(name = "OverduePrincipal")
    protected BigDecimal overduePrincipal;
    @XmlElement(name = "AvailAmount")
    protected BigDecimal availAmount;
    @XmlElement(name = "OutstandingAmountAll")
    protected BigDecimal outstandingAmountAll;
    @XmlElement(name = "RestLoanAccount")
    protected BigDecimal restLoanAccount;
    @XmlElement(name = "TypePayment")
    protected String typePayment;
    @XmlElement(name = "CreditFullCost")
    protected BigDecimal creditFullCost;
    @XmlElement(name = "CreditTotalAmountDebtPay")
    protected BigDecimal creditTotalAmountDebtPay;
    @XmlElement(name = "AccCreditRepayment")
    protected String accCreditRepayment;
    @XmlElement(name = "AccCreditRepayment2")
    protected String accCreditRepayment2;
    @XmlElement(name = "InsuranceLoanerType")
    protected String insuranceLoanerType;
    @XmlElement(name = "GracePeriodPayment")
    protected BigDecimal gracePeriodPayment;
    @XmlElement(name = "AccruedPercent")
    protected BigDecimal accruedPercent;
    @XmlElement(name = "CreditProductType")
    protected String creditProductType;
    @XmlElement(name = "CurrentPercent")
    protected BigDecimal currentPercent;
    @XmlElement(name = "CurrentLimit")
    protected BigDecimal currentLimit;
    @XmlElement(name = "DateDebt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDebt;
    @XmlElement(name = "AmountCommisOtherPay")
    protected BigDecimal amountCommisOtherPay;
    @XmlElement(name = "Restructured")
    protected Boolean restructured;

    /**
     * Gets the value of the crtp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRTP() {
        return crtp;
    }

    /**
     * Sets the value of the crtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRTP(String value) {
        this.crtp = value;
    }

    /**
     * Gets the value of the d property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setD(XMLGregorianCalendar value) {
        this.d = value;
    }

    /**
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN(String value) {
        this.n = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDT() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDT(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Gets the value of the ed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getED() {
        return ed;
    }

    /**
     * Sets the value of the ed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setED(XMLGregorianCalendar value) {
        this.ed = value;
    }

    /**
     * Gets the value of the prc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrc() {
        return prc;
    }

    /**
     * Sets the value of the prc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrc(BigDecimal value) {
        this.prc = value;
    }

    /**
     * Gets the value of the cur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUR() {
        return cur;
    }

    /**
     * Sets the value of the cur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUR(String value) {
        this.cur = value;
    }

    /**
     * Gets the value of the crd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRD() {
        return crd;
    }

    /**
     * Sets the value of the crd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRD(String value) {
        this.crd = value;
    }

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setA(BigDecimal value) {
        this.a = value;
    }

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setR(BigDecimal value) {
        this.r = value;
    }

    /**
     * Gets the value of the acc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcc() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcc(String value) {
        this.acc = value;
    }

    /**
     * Gets the value of the loanAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanAccount() {
        return loanAccount;
    }

    /**
     * Sets the value of the loanAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanAccount(String value) {
        this.loanAccount = value;
    }

    /**
     * Gets the value of the repayAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayAccount() {
        return repayAccount;
    }

    /**
     * Sets the value of the repayAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayAccount(String value) {
        this.repayAccount = value;
    }

    /**
     * Gets the value of the prcAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrcAmount() {
        return prcAmount;
    }

    /**
     * Sets the value of the prcAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrcAmount(BigDecimal value) {
        this.prcAmount = value;
    }

    /**
     * Gets the value of the prcTerm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrcTerm() {
        return prcTerm;
    }

    /**
     * Sets the value of the prcTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrcTerm(XMLGregorianCalendar value) {
        this.prcTerm = value;
    }

    /**
     * Gets the value of the oda property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getODA() {
        return oda;
    }

    /**
     * Sets the value of the oda property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setODA(BigDecimal value) {
        this.oda = value;
    }

    /**
     * Gets the value of the opa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOPA() {
        return opa;
    }

    /**
     * Sets the value of the opa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOPA(BigDecimal value) {
        this.opa = value;
    }

    /**
     * Gets the value of the oPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOPrc() {
        return oPrc;
    }

    /**
     * Sets the value of the oPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOPrc(BigDecimal value) {
        this.oPrc = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStatus(BigDecimal value) {
        this.status = value;
    }

    /**
     * Gets the value of the mnp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMNP() {
        return mnp;
    }

    /**
     * Sets the value of the mnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMNP(BigDecimal value) {
        this.mnp = value;
    }

    /**
     * Gets the value of the prcp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRCP() {
        return prcp;
    }

    /**
     * Sets the value of the prcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRCP(BigDecimal value) {
        this.prcp = value;
    }

    /**
     * Gets the value of the ofn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOFN() {
        return ofn;
    }

    /**
     * Sets the value of the ofn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOFN(BigDecimal value) {
        this.ofn = value;
    }

    /**
     * Gets the value of the fn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFN() {
        return fn;
    }

    /**
     * Sets the value of the fn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFN(BigDecimal value) {
        this.fn = value;
    }

    /**
     * Gets the value of the tsm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTSM() {
        return tsm;
    }

    /**
     * Sets the value of the tsm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTSM(BigDecimal value) {
        this.tsm = value;
    }

    /**
     * Gets the value of the ptrm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPTRM() {
        return ptrm;
    }

    /**
     * Sets the value of the ptrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPTRM(XMLGregorianCalendar value) {
        this.ptrm = value;
    }

    /**
     * Gets the value of the refTdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefTdn() {
        return refTdn;
    }

    /**
     * Sets the value of the refTdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefTdn(String value) {
        this.refTdn = value;
    }

    /**
     * Gets the value of the ilpen property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getILPEN() {
        return ilpen;
    }

    /**
     * Sets the value of the ilpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setILPEN(BigDecimal value) {
        this.ilpen = value;
    }

    /**
     * Gets the value of the iipen property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIIPEN() {
        return iipen;
    }

    /**
     * Sets the value of the iipen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIIPEN(BigDecimal value) {
        this.iipen = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the contractID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractID() {
        return contractID;
    }

    /**
     * Sets the value of the contractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractID(String value) {
        this.contractID = value;
    }

    /**
     * Gets the value of the currentDebtOnLoan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentDebtOnLoan() {
        return currentDebtOnLoan;
    }

    /**
     * Sets the value of the currentDebtOnLoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentDebtOnLoan(BigDecimal value) {
        this.currentDebtOnLoan = value;
    }

    /**
     * Gets the value of the overduePrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverduePrincipal() {
        return overduePrincipal;
    }

    /**
     * Sets the value of the overduePrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverduePrincipal(BigDecimal value) {
        this.overduePrincipal = value;
    }

    /**
     * Gets the value of the availAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailAmount() {
        return availAmount;
    }

    /**
     * Sets the value of the availAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailAmount(BigDecimal value) {
        this.availAmount = value;
    }

    /**
     * Gets the value of the outstandingAmountAll property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutstandingAmountAll() {
        return outstandingAmountAll;
    }

    /**
     * Sets the value of the outstandingAmountAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutstandingAmountAll(BigDecimal value) {
        this.outstandingAmountAll = value;
    }

    /**
     * Gets the value of the restLoanAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRestLoanAccount() {
        return restLoanAccount;
    }

    /**
     * Sets the value of the restLoanAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRestLoanAccount(BigDecimal value) {
        this.restLoanAccount = value;
    }

    /**
     * Gets the value of the typePayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypePayment() {
        return typePayment;
    }

    /**
     * Sets the value of the typePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypePayment(String value) {
        this.typePayment = value;
    }

    /**
     * Gets the value of the creditFullCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditFullCost() {
        return creditFullCost;
    }

    /**
     * Sets the value of the creditFullCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditFullCost(BigDecimal value) {
        this.creditFullCost = value;
    }

    /**
     * Gets the value of the creditTotalAmountDebtPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditTotalAmountDebtPay() {
        return creditTotalAmountDebtPay;
    }

    /**
     * Sets the value of the creditTotalAmountDebtPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditTotalAmountDebtPay(BigDecimal value) {
        this.creditTotalAmountDebtPay = value;
    }

    /**
     * Gets the value of the accCreditRepayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccCreditRepayment() {
        return accCreditRepayment;
    }

    /**
     * Sets the value of the accCreditRepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccCreditRepayment(String value) {
        this.accCreditRepayment = value;
    }

    /**
     * Gets the value of the accCreditRepayment2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccCreditRepayment2() {
        return accCreditRepayment2;
    }

    /**
     * Sets the value of the accCreditRepayment2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccCreditRepayment2(String value) {
        this.accCreditRepayment2 = value;
    }

    /**
     * Gets the value of the insuranceLoanerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceLoanerType() {
        return insuranceLoanerType;
    }

    /**
     * Sets the value of the insuranceLoanerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceLoanerType(String value) {
        this.insuranceLoanerType = value;
    }

    /**
     * Gets the value of the gracePeriodPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGracePeriodPayment() {
        return gracePeriodPayment;
    }

    /**
     * Sets the value of the gracePeriodPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGracePeriodPayment(BigDecimal value) {
        this.gracePeriodPayment = value;
    }

    /**
     * Gets the value of the accruedPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccruedPercent() {
        return accruedPercent;
    }

    /**
     * Sets the value of the accruedPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccruedPercent(BigDecimal value) {
        this.accruedPercent = value;
    }

    /**
     * Gets the value of the creditProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditProductType() {
        return creditProductType;
    }

    /**
     * Sets the value of the creditProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditProductType(String value) {
        this.creditProductType = value;
    }

    /**
     * Gets the value of the currentPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentPercent() {
        return currentPercent;
    }

    /**
     * Sets the value of the currentPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentPercent(BigDecimal value) {
        this.currentPercent = value;
    }

    /**
     * Gets the value of the currentLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentLimit() {
        return currentLimit;
    }

    /**
     * Sets the value of the currentLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentLimit(BigDecimal value) {
        this.currentLimit = value;
    }

    /**
     * Gets the value of the dateDebt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDebt() {
        return dateDebt;
    }

    /**
     * Sets the value of the dateDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDebt(XMLGregorianCalendar value) {
        this.dateDebt = value;
    }

    /**
     * Gets the value of the amountCommisOtherPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountCommisOtherPay() {
        return amountCommisOtherPay;
    }

    /**
     * Sets the value of the amountCommisOtherPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountCommisOtherPay(BigDecimal value) {
        this.amountCommisOtherPay = value;
    }

    /**
     * Gets the value of the restructured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestructured() {
        return restructured;
    }

    /**
     * Sets the value of the restructured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestructured(Boolean value) {
        this.restructured = value;
    }

}

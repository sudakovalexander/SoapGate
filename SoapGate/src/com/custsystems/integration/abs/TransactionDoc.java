
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
 * <p>Java class for TransactionDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionDoc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extDocId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="docId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="docNum" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isDirect" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="fromAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="fromCur" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fromAcc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fromName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fromINN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fromKPP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fromBIK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fromNameBank" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fromPlaceBank" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fromCorrBank" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="toAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="toCur" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="toAcc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="toName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="toINN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="toKPP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="toBIK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="toNameBank" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="toPlaceBank" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="toCorrBank" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priority" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sendType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docUIN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="taxState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KBK" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OKTMO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxPurpose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="registerDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="registerDateBank" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="executeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="executeDateBank" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="docOperatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDoc", propOrder = {
    "extDocId",
    "docId",
    "docDate",
    "docNum",
    "isDirect",
    "fromAmount",
    "fromCur",
    "fromAcc",
    "fromName",
    "fromINN",
    "fromKPP",
    "fromBIK",
    "fromNameBank",
    "fromPlaceBank",
    "fromCorrBank",
    "toAmount",
    "toCur",
    "toAcc",
    "toName",
    "toINN",
    "toKPP",
    "toBIK",
    "toNameBank",
    "toPlaceBank",
    "toCorrBank",
    "purpose",
    "priority",
    "sendType",
    "docType",
    "docUIN",
    "taxState",
    "kbk",
    "oktmo",
    "taxPurpose",
    "taxPeriod",
    "taxNumber",
    "taxDate",
    "taxType",
    "registerDate",
    "registerDateBank",
    "executeDate",
    "executeDateBank",
    "docOperatorName"
})
public class TransactionDoc {

    @XmlElement(required = true)
    protected String extDocId;
    protected String docId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDate;
    protected String docNum;
    @XmlElement(required = true)
    protected BigInteger isDirect;
    protected BigDecimal fromAmount;
    protected String fromCur;
    protected String fromAcc;
    protected String fromName;
    protected String fromINN;
    protected String fromKPP;
    protected String fromBIK;
    protected String fromNameBank;
    protected String fromPlaceBank;
    protected String fromCorrBank;
    protected BigDecimal toAmount;
    protected String toCur;
    protected String toAcc;
    protected String toName;
    protected String toINN;
    protected String toKPP;
    protected String toBIK;
    protected String toNameBank;
    protected String toPlaceBank;
    protected String toCorrBank;
    protected String purpose;
    protected String priority;
    protected String sendType;
    protected String docType;
    protected String docUIN;
    @XmlElement(required = true)
    protected String taxState;
    @XmlElement(name = "KBK", required = true)
    protected String kbk;
    @XmlElement(name = "OKTMO", required = true)
    protected String oktmo;
    @XmlElement(required = true)
    protected String taxPurpose;
    @XmlElement(required = true)
    protected String taxPeriod;
    @XmlElement(required = true)
    protected String taxNumber;
    @XmlElement(required = true)
    protected String taxDate;
    @XmlElement(required = true)
    protected String taxType;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registerDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar registerDateBank;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar executeDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar executeDateBank;
    protected String docOperatorName;

    /**
     * Gets the value of the extDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtDocId() {
        return extDocId;
    }

    /**
     * Sets the value of the extDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtDocId(String value) {
        this.extDocId = value;
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
     * Gets the value of the docNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNum() {
        return docNum;
    }

    /**
     * Sets the value of the docNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNum(String value) {
        this.docNum = value;
    }

    /**
     * Gets the value of the isDirect property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsDirect() {
        return isDirect;
    }

    /**
     * Sets the value of the isDirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsDirect(BigInteger value) {
        this.isDirect = value;
    }

    /**
     * Gets the value of the fromAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFromAmount() {
        return fromAmount;
    }

    /**
     * Sets the value of the fromAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFromAmount(BigDecimal value) {
        this.fromAmount = value;
    }

    /**
     * Gets the value of the fromCur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCur() {
        return fromCur;
    }

    /**
     * Sets the value of the fromCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCur(String value) {
        this.fromCur = value;
    }

    /**
     * Gets the value of the fromAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAcc() {
        return fromAcc;
    }

    /**
     * Sets the value of the fromAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAcc(String value) {
        this.fromAcc = value;
    }

    /**
     * Gets the value of the fromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * Sets the value of the fromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * Gets the value of the fromINN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromINN() {
        return fromINN;
    }

    /**
     * Sets the value of the fromINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromINN(String value) {
        this.fromINN = value;
    }

    /**
     * Gets the value of the fromKPP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromKPP() {
        return fromKPP;
    }

    /**
     * Sets the value of the fromKPP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromKPP(String value) {
        this.fromKPP = value;
    }

    /**
     * Gets the value of the fromBIK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBIK() {
        return fromBIK;
    }

    /**
     * Sets the value of the fromBIK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBIK(String value) {
        this.fromBIK = value;
    }

    /**
     * Gets the value of the fromNameBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromNameBank() {
        return fromNameBank;
    }

    /**
     * Sets the value of the fromNameBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromNameBank(String value) {
        this.fromNameBank = value;
    }

    /**
     * Gets the value of the fromPlaceBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPlaceBank() {
        return fromPlaceBank;
    }

    /**
     * Sets the value of the fromPlaceBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPlaceBank(String value) {
        this.fromPlaceBank = value;
    }

    /**
     * Gets the value of the fromCorrBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCorrBank() {
        return fromCorrBank;
    }

    /**
     * Sets the value of the fromCorrBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCorrBank(String value) {
        this.fromCorrBank = value;
    }

    /**
     * Gets the value of the toAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToAmount() {
        return toAmount;
    }

    /**
     * Sets the value of the toAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToAmount(BigDecimal value) {
        this.toAmount = value;
    }

    /**
     * Gets the value of the toCur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCur() {
        return toCur;
    }

    /**
     * Sets the value of the toCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCur(String value) {
        this.toCur = value;
    }

    /**
     * Gets the value of the toAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAcc() {
        return toAcc;
    }

    /**
     * Sets the value of the toAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAcc(String value) {
        this.toAcc = value;
    }

    /**
     * Gets the value of the toName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToName() {
        return toName;
    }

    /**
     * Sets the value of the toName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToName(String value) {
        this.toName = value;
    }

    /**
     * Gets the value of the toINN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToINN() {
        return toINN;
    }

    /**
     * Sets the value of the toINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToINN(String value) {
        this.toINN = value;
    }

    /**
     * Gets the value of the toKPP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToKPP() {
        return toKPP;
    }

    /**
     * Sets the value of the toKPP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToKPP(String value) {
        this.toKPP = value;
    }

    /**
     * Gets the value of the toBIK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToBIK() {
        return toBIK;
    }

    /**
     * Sets the value of the toBIK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToBIK(String value) {
        this.toBIK = value;
    }

    /**
     * Gets the value of the toNameBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToNameBank() {
        return toNameBank;
    }

    /**
     * Sets the value of the toNameBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToNameBank(String value) {
        this.toNameBank = value;
    }

    /**
     * Gets the value of the toPlaceBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToPlaceBank() {
        return toPlaceBank;
    }

    /**
     * Sets the value of the toPlaceBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToPlaceBank(String value) {
        this.toPlaceBank = value;
    }

    /**
     * Gets the value of the toCorrBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCorrBank() {
        return toCorrBank;
    }

    /**
     * Sets the value of the toCorrBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCorrBank(String value) {
        this.toCorrBank = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
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
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * Gets the value of the docUIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocUIN() {
        return docUIN;
    }

    /**
     * Sets the value of the docUIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocUIN(String value) {
        this.docUIN = value;
    }

    /**
     * Gets the value of the taxState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxState() {
        return taxState;
    }

    /**
     * Sets the value of the taxState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxState(String value) {
        this.taxState = value;
    }

    /**
     * Gets the value of the kbk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBK() {
        return kbk;
    }

    /**
     * Sets the value of the kbk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKBK(String value) {
        this.kbk = value;
    }

    /**
     * Gets the value of the oktmo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKTMO(String value) {
        this.oktmo = value;
    }

    /**
     * Gets the value of the taxPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPurpose() {
        return taxPurpose;
    }

    /**
     * Sets the value of the taxPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPurpose(String value) {
        this.taxPurpose = value;
    }

    /**
     * Gets the value of the taxPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxPeriod() {
        return taxPeriod;
    }

    /**
     * Sets the value of the taxPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxPeriod(String value) {
        this.taxPeriod = value;
    }

    /**
     * Gets the value of the taxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNumber() {
        return taxNumber;
    }

    /**
     * Sets the value of the taxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNumber(String value) {
        this.taxNumber = value;
    }

    /**
     * Gets the value of the taxDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDate() {
        return taxDate;
    }

    /**
     * Sets the value of the taxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDate(String value) {
        this.taxDate = value;
    }

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

    /**
     * Gets the value of the registerDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegisterDate() {
        return registerDate;
    }

    /**
     * Sets the value of the registerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegisterDate(XMLGregorianCalendar value) {
        this.registerDate = value;
    }

    /**
     * Gets the value of the registerDateBank property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegisterDateBank() {
        return registerDateBank;
    }

    /**
     * Sets the value of the registerDateBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegisterDateBank(XMLGregorianCalendar value) {
        this.registerDateBank = value;
    }

    /**
     * Gets the value of the executeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecuteDate() {
        return executeDate;
    }

    /**
     * Sets the value of the executeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecuteDate(XMLGregorianCalendar value) {
        this.executeDate = value;
    }

    /**
     * Gets the value of the executeDateBank property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecuteDateBank() {
        return executeDateBank;
    }

    /**
     * Sets the value of the executeDateBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecuteDateBank(XMLGregorianCalendar value) {
        this.executeDateBank = value;
    }

    /**
     * Gets the value of the docOperatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocOperatorName() {
        return docOperatorName;
    }

    /**
     * Sets the value of the docOperatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocOperatorName(String value) {
        this.docOperatorName = value;
    }

}

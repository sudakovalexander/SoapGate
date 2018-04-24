
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
 * <p>Java class for dealType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dealType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberLine" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="payDirection" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transferFunds" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="transferDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="operationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="operationDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="payCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dealPassportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="contractDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="amountCurrencyContract" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="currencyCodeContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expectDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dateRefundPrepayment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dealType", propOrder = {
    "numberLine",
    "payDirection",
    "docNumber",
    "transferFunds",
    "transferDate",
    "operationCode",
    "operationDate",
    "amount",
    "payCurrencyCode",
    "dealPassportNumber",
    "contractNumber",
    "contractDate",
    "amountCurrencyContract",
    "currencyCodeContract",
    "expectDate",
    "dateRefundPrepayment",
    "remark"
})
public class DealType {

    @XmlElement(required = true)
    protected BigInteger numberLine;
    @XmlElement(required = true)
    protected BigInteger payDirection;
    @XmlElement(required = true)
    protected String docNumber;
    protected boolean transferFunds;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transferDate;
    @XmlElement(required = true)
    protected String operationCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar operationDate;
    @XmlElement(required = true)
    protected BigDecimal amount;
    @XmlElement(required = true)
    protected String payCurrencyCode;
    protected String dealPassportNumber;
    protected String contractNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractDate;
    protected BigDecimal amountCurrencyContract;
    protected String currencyCodeContract;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateRefundPrepayment;
    protected String remark;

    /**
     * Gets the value of the numberLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberLine() {
        return numberLine;
    }

    /**
     * Sets the value of the numberLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberLine(BigInteger value) {
        this.numberLine = value;
    }

    /**
     * Gets the value of the payDirection property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPayDirection() {
        return payDirection;
    }

    /**
     * Sets the value of the payDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPayDirection(BigInteger value) {
        this.payDirection = value;
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
     * Gets the value of the transferFunds property.
     * 
     */
    public boolean isTransferFunds() {
        return transferFunds;
    }

    /**
     * Sets the value of the transferFunds property.
     * 
     */
    public void setTransferFunds(boolean value) {
        this.transferFunds = value;
    }

    /**
     * Gets the value of the transferDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransferDate() {
        return transferDate;
    }

    /**
     * Sets the value of the transferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransferDate(XMLGregorianCalendar value) {
        this.transferDate = value;
    }

    /**
     * Gets the value of the operationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * Sets the value of the operationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationCode(String value) {
        this.operationCode = value;
    }

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
     * Gets the value of the payCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayCurrencyCode() {
        return payCurrencyCode;
    }

    /**
     * Sets the value of the payCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayCurrencyCode(String value) {
        this.payCurrencyCode = value;
    }

    /**
     * Gets the value of the dealPassportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealPassportNumber() {
        return dealPassportNumber;
    }

    /**
     * Sets the value of the dealPassportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealPassportNumber(String value) {
        this.dealPassportNumber = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the contractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractDate() {
        return contractDate;
    }

    /**
     * Sets the value of the contractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractDate(XMLGregorianCalendar value) {
        this.contractDate = value;
    }

    /**
     * Gets the value of the amountCurrencyContract property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountCurrencyContract() {
        return amountCurrencyContract;
    }

    /**
     * Sets the value of the amountCurrencyContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountCurrencyContract(BigDecimal value) {
        this.amountCurrencyContract = value;
    }

    /**
     * Gets the value of the currencyCodeContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCodeContract() {
        return currencyCodeContract;
    }

    /**
     * Sets the value of the currencyCodeContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCodeContract(String value) {
        this.currencyCodeContract = value;
    }

    /**
     * Gets the value of the expectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectDate() {
        return expectDate;
    }

    /**
     * Sets the value of the expectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectDate(XMLGregorianCalendar value) {
        this.expectDate = value;
    }

    /**
     * Gets the value of the dateRefundPrepayment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRefundPrepayment() {
        return dateRefundPrepayment;
    }

    /**
     * Sets the value of the dateRefundPrepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRefundPrepayment(XMLGregorianCalendar value) {
        this.dateRefundPrepayment = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}

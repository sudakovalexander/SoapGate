
package ru.unitarius.integration.schema.loans;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LoanAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanAccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkAccountID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LinkSystemTypeBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LinkSystemType" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="TemplateBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LinkStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DateEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BalanceCUR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanAccountType", propOrder = {
    "linkAccountID",
    "accountNumber",
    "linkSystemTypeBrief",
    "linkSystemType",
    "templateBrief",
    "templateName",
    "accountID",
    "linkStatus",
    "dateStart",
    "dateEnd",
    "balance",
    "balanceCUR",
    "currencyID",
    "currencyNumber",
    "currencyCode"
})
public class LoanAccountType {

    @XmlElement(name = "LinkAccountID")
    protected long linkAccountID;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "LinkSystemTypeBrief")
    protected String linkSystemTypeBrief;
    @XmlElement(name = "LinkSystemType")
    protected Short linkSystemType;
    @XmlElement(name = "TemplateBrief")
    protected String templateBrief;
    @XmlElement(name = "TemplateName")
    protected String templateName;
    @XmlElement(name = "AccountID")
    protected Long accountID;
    @XmlElement(name = "LinkStatus")
    protected String linkStatus;
    @XmlElement(name = "DateStart")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateStart;
    @XmlElement(name = "DateEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEnd;
    @XmlElement(name = "Balance")
    protected BigDecimal balance;
    @XmlElement(name = "BalanceCUR")
    protected BigDecimal balanceCUR;
    @XmlElement(name = "CurrencyID")
    protected Long currencyID;
    @XmlElement(name = "CurrencyNumber")
    protected BigInteger currencyNumber;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;

    /**
     * Gets the value of the linkAccountID property.
     * 
     */
    public long getLinkAccountID() {
        return linkAccountID;
    }

    /**
     * Sets the value of the linkAccountID property.
     * 
     */
    public void setLinkAccountID(long value) {
        this.linkAccountID = value;
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
     * Gets the value of the linkSystemTypeBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkSystemTypeBrief() {
        return linkSystemTypeBrief;
    }

    /**
     * Sets the value of the linkSystemTypeBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkSystemTypeBrief(String value) {
        this.linkSystemTypeBrief = value;
    }

    /**
     * Gets the value of the linkSystemType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLinkSystemType() {
        return linkSystemType;
    }

    /**
     * Sets the value of the linkSystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLinkSystemType(Short value) {
        this.linkSystemType = value;
    }

    /**
     * Gets the value of the templateBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateBrief() {
        return templateBrief;
    }

    /**
     * Sets the value of the templateBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateBrief(String value) {
        this.templateBrief = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
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
     * Gets the value of the linkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkStatus() {
        return linkStatus;
    }

    /**
     * Sets the value of the linkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkStatus(String value) {
        this.linkStatus = value;
    }

    /**
     * Gets the value of the dateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateStart() {
        return dateStart;
    }

    /**
     * Sets the value of the dateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateStart(XMLGregorianCalendar value) {
        this.dateStart = value;
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
     * Gets the value of the balanceCUR property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceCUR() {
        return balanceCUR;
    }

    /**
     * Sets the value of the balanceCUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceCUR(BigDecimal value) {
        this.balanceCUR = value;
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

}

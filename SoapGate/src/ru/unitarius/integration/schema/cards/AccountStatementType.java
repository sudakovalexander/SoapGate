
package ru.unitarius.integration.schema.cards;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.unitarius.integration.schema.common.SubsystemEnum;


/**
 * <p>Java class for AccountStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountStatementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CardNumber" type="{http://unitarius.ru/integration/schema/cards}CardNumberType" minOccurs="0"/&gt;
 *         &lt;element name="DocumentID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DocumentBalanceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BalanceIn" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BalanceOut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="StatementEntryList" type="{http://unitarius.ru/integration/schema/cards}StatementEntryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="subsystem" use="required" type="{http://unitarius.ru/integration/schema/common}SubsystemEnum" /&gt;
 *       &lt;attribute name="StartDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="EndDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatementType", propOrder = {
    "cardID",
    "cardNumber",
    "documentID",
    "documentNumber",
    "documentCreationDate",
    "documentBalanceDate",
    "accountID",
    "accountNumber",
    "balanceIn",
    "balanceOut",
    "statementEntryList"
})
public class AccountStatementType {

    @XmlElement(name = "CardID")
    protected Long cardID;
    @XmlElement(name = "CardNumber")
    protected CardNumberType cardNumber;
    @XmlElement(name = "DocumentID")
    protected Long documentID;
    @XmlElement(name = "DocumentNumber")
    protected String documentNumber;
    @XmlElement(name = "DocumentCreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentCreationDate;
    @XmlElement(name = "DocumentBalanceDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentBalanceDate;
    @XmlElement(name = "AccountID")
    protected Long accountID;
    @XmlElement(name = "AccountNumber", required = true)
    protected String accountNumber;
    @XmlElement(name = "BalanceIn")
    protected BigDecimal balanceIn;
    @XmlElement(name = "BalanceOut")
    protected BigDecimal balanceOut;
    @XmlElement(name = "StatementEntryList")
    protected List<StatementEntryType> statementEntryList;
    @XmlAttribute(name = "subsystem", required = true)
    protected SubsystemEnum subsystem;
    @XmlAttribute(name = "StartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "EndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;

    /**
     * Gets the value of the cardID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardID() {
        return cardID;
    }

    /**
     * Sets the value of the cardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardID(Long value) {
        this.cardID = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CardNumberType }
     *     
     */
    public CardNumberType getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardNumberType }
     *     
     */
    public void setCardNumber(CardNumberType value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocumentID(Long value) {
        this.documentID = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the documentCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentCreationDate() {
        return documentCreationDate;
    }

    /**
     * Sets the value of the documentCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentCreationDate(XMLGregorianCalendar value) {
        this.documentCreationDate = value;
    }

    /**
     * Gets the value of the documentBalanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentBalanceDate() {
        return documentBalanceDate;
    }

    /**
     * Sets the value of the documentBalanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentBalanceDate(XMLGregorianCalendar value) {
        this.documentBalanceDate = value;
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
     * Gets the value of the balanceIn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceIn() {
        return balanceIn;
    }

    /**
     * Sets the value of the balanceIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceIn(BigDecimal value) {
        this.balanceIn = value;
    }

    /**
     * Gets the value of the balanceOut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceOut() {
        return balanceOut;
    }

    /**
     * Sets the value of the balanceOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceOut(BigDecimal value) {
        this.balanceOut = value;
    }

    /**
     * Gets the value of the statementEntryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementEntryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementEntryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementEntryType }
     * 
     * 
     */
    public List<StatementEntryType> getStatementEntryList() {
        if (statementEntryList == null) {
            statementEntryList = new ArrayList<StatementEntryType>();
        }
        return this.statementEntryList;
    }

    /**
     * Gets the value of the subsystem property.
     * 
     * @return
     *     possible object is
     *     {@link SubsystemEnum }
     *     
     */
    public SubsystemEnum getSubsystem() {
        return subsystem;
    }

    /**
     * Sets the value of the subsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsystemEnum }
     *     
     */
    public void setSubsystem(SubsystemEnum value) {
        this.subsystem = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

}


package ru.unitarius.integration.schema.loans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BalanceIn" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BalanceInCUR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BalanceOut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BalanceOutCUR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FlowDebit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FlowDebitCUR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FlowCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FlowCreditCUR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="StatementEntryList" type="{http://unitarius.ru/integration/schema/loans}StatementEntryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatementType", propOrder = {
    "accountID",
    "accountNumber",
    "balanceIn",
    "balanceInCUR",
    "balanceOut",
    "balanceOutCUR",
    "flowDebit",
    "flowDebitCUR",
    "flowCredit",
    "flowCreditCUR",
    "statementEntryList"
})
public class AccountStatementType {

    @XmlElement(name = "AccountID")
    protected long accountID;
    @XmlElement(name = "AccountNumber", required = true)
    protected String accountNumber;
    @XmlElement(name = "BalanceIn")
    protected BigDecimal balanceIn;
    @XmlElement(name = "BalanceInCUR")
    protected BigDecimal balanceInCUR;
    @XmlElement(name = "BalanceOut")
    protected BigDecimal balanceOut;
    @XmlElement(name = "BalanceOutCUR")
    protected BigDecimal balanceOutCUR;
    @XmlElement(name = "FlowDebit")
    protected BigDecimal flowDebit;
    @XmlElement(name = "FlowDebitCUR")
    protected BigDecimal flowDebitCUR;
    @XmlElement(name = "FlowCredit")
    protected BigDecimal flowCredit;
    @XmlElement(name = "FlowCreditCUR")
    protected BigDecimal flowCreditCUR;
    @XmlElement(name = "StatementEntryList")
    protected List<StatementEntryType> statementEntryList;

    /**
     * Gets the value of the accountID property.
     * 
     */
    public long getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     */
    public void setAccountID(long value) {
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
     * Gets the value of the balanceInCUR property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceInCUR() {
        return balanceInCUR;
    }

    /**
     * Sets the value of the balanceInCUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceInCUR(BigDecimal value) {
        this.balanceInCUR = value;
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
     * Gets the value of the balanceOutCUR property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceOutCUR() {
        return balanceOutCUR;
    }

    /**
     * Sets the value of the balanceOutCUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceOutCUR(BigDecimal value) {
        this.balanceOutCUR = value;
    }

    /**
     * Gets the value of the flowDebit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlowDebit() {
        return flowDebit;
    }

    /**
     * Sets the value of the flowDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlowDebit(BigDecimal value) {
        this.flowDebit = value;
    }

    /**
     * Gets the value of the flowDebitCUR property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlowDebitCUR() {
        return flowDebitCUR;
    }

    /**
     * Sets the value of the flowDebitCUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlowDebitCUR(BigDecimal value) {
        this.flowDebitCUR = value;
    }

    /**
     * Gets the value of the flowCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlowCredit() {
        return flowCredit;
    }

    /**
     * Sets the value of the flowCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlowCredit(BigDecimal value) {
        this.flowCredit = value;
    }

    /**
     * Gets the value of the flowCreditCUR property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlowCreditCUR() {
        return flowCreditCUR;
    }

    /**
     * Sets the value of the flowCreditCUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlowCreditCUR(BigDecimal value) {
        this.flowCreditCUR = value;
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

}

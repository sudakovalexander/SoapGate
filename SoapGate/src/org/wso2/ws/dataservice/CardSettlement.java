
package org.wso2.ws.dataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardSettlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardSettlement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tlogid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="datelocal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="timelocal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="curr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="termcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mcc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="merchant" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="txntype" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="txncode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rev" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sysdate1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardSettlement", propOrder = {
    "operid",
    "tlogid",
    "datelocal",
    "timelocal",
    "amount",
    "curr",
    "termcode",
    "mcc",
    "merchant",
    "detail",
    "balance",
    "txntype",
    "txncode",
    "rev",
    "sysdate1",
    "pan",
    "accno"
})
public class CardSettlement {

    @XmlElement(required = true, nillable = true)
    protected String operid;
    @XmlElement(required = true, nillable = true)
    protected String tlogid;
    @XmlElement(required = true, nillable = true)
    protected String datelocal;
    @XmlElement(required = true, nillable = true)
    protected String timelocal;
    @XmlElement(required = true, nillable = true)
    protected String amount;
    @XmlElement(required = true, nillable = true)
    protected String curr;
    @XmlElement(required = true, nillable = true)
    protected String termcode;
    @XmlElement(required = true, nillable = true)
    protected String mcc;
    @XmlElement(required = true, nillable = true)
    protected String merchant;
    @XmlElement(required = true, nillable = true)
    protected String detail;
    @XmlElement(required = true, nillable = true)
    protected String balance;
    @XmlElement(required = true, nillable = true)
    protected String txntype;
    @XmlElement(required = true, nillable = true)
    protected String txncode;
    @XmlElement(required = true, nillable = true)
    protected String rev;
    @XmlElement(required = true, nillable = true)
    protected String sysdate1;
    @XmlElement(required = true, nillable = true)
    protected String pan;
    @XmlElement(required = true, nillable = true)
    protected String accno;

    /**
     * Gets the value of the operid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperid() {
        return operid;
    }

    /**
     * Sets the value of the operid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperid(String value) {
        this.operid = value;
    }

    /**
     * Gets the value of the tlogid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlogid() {
        return tlogid;
    }

    /**
     * Sets the value of the tlogid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlogid(String value) {
        this.tlogid = value;
    }

    /**
     * Gets the value of the datelocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatelocal() {
        return datelocal;
    }

    /**
     * Sets the value of the datelocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatelocal(String value) {
        this.datelocal = value;
    }

    /**
     * Gets the value of the timelocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimelocal() {
        return timelocal;
    }

    /**
     * Sets the value of the timelocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimelocal(String value) {
        this.timelocal = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the curr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurr() {
        return curr;
    }

    /**
     * Sets the value of the curr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurr(String value) {
        this.curr = value;
    }

    /**
     * Gets the value of the termcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermcode() {
        return termcode;
    }

    /**
     * Sets the value of the termcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermcode(String value) {
        this.termcode = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcc() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcc(String value) {
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
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetail(String value) {
        this.detail = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalance(String value) {
        this.balance = value;
    }

    /**
     * Gets the value of the txntype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxntype() {
        return txntype;
    }

    /**
     * Sets the value of the txntype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxntype(String value) {
        this.txntype = value;
    }

    /**
     * Gets the value of the txncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxncode() {
        return txncode;
    }

    /**
     * Sets the value of the txncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxncode(String value) {
        this.txncode = value;
    }

    /**
     * Gets the value of the rev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRev() {
        return rev;
    }

    /**
     * Sets the value of the rev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRev(String value) {
        this.rev = value;
    }

    /**
     * Gets the value of the sysdate1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysdate1() {
        return sysdate1;
    }

    /**
     * Sets the value of the sysdate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysdate1(String value) {
        this.sysdate1 = value;
    }

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the accno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccno() {
        return accno;
    }

    /**
     * Sets the value of the accno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccno(String value) {
        this.accno = value;
    }

}

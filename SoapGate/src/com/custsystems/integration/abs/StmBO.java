
package com.custsystems.integration.abs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StmBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StmBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="EDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StmBO", propOrder = {
    "reqID",
    "subSys",
    "customerID",
    "branchId",
    "bDate",
    "eDate",
    "account",
    "cardNumber"
})
public class StmBO {

    @XmlElement(required = true)
    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "BranchId")
    protected String branchId;
    @XmlElement(name = "BDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bDate;
    @XmlElement(name = "EDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eDate;
    @XmlElement(name = "Account", required = true)
    protected String account;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;

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
     * Gets the value of the bDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBDate() {
        return bDate;
    }

    /**
     * Sets the value of the bDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBDate(XMLGregorianCalendar value) {
        this.bDate = value;
    }

    /**
     * Gets the value of the eDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEDate() {
        return eDate;
    }

    /**
     * Sets the value of the eDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEDate(XMLGregorianCalendar value) {
        this.eDate = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

}

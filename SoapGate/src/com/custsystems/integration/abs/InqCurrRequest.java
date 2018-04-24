
package com.custsystems.integration.abs;

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
 * <p>Java class for InqCurrRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InqCurrRequest"&gt;
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
 *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="bankCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="bankBik" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankCorrAccount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankPlace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="correctFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="correctNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="employee" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deals" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{http://custsystems.com/integration/abs}dealType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "InqCurrRequest", propOrder = {
    "reqID",
    "docNumber",
    "docId",
    "docDate",
    "subSys",
    "customerID",
    "branchId",
    "docBankDate",
    "inn",
    "fullname",
    "accountNumber",
    "bankCountryCode",
    "bankBik",
    "bankCorrAccount",
    "bankName",
    "bankPlace",
    "correctFlag",
    "correctNumber",
    "employee",
    "phone",
    "deals",
    "files"
})
public class InqCurrRequest {

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
    protected String inn;
    @XmlElement(required = true)
    protected String fullname;
    protected String accountNumber;
    protected String bankCountryCode;
    @XmlElement(required = true)
    protected String bankBik;
    @XmlElement(required = true)
    protected String bankCorrAccount;
    @XmlElement(required = true)
    protected String bankName;
    @XmlElement(required = true)
    protected String bankPlace;
    protected boolean correctFlag;
    protected BigInteger correctNumber;
    @XmlElement(required = true)
    protected String employee;
    @XmlElement(required = true)
    protected String phone;
    protected InqCurrRequest.Deals deals;
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
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the fullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * Sets the value of the fullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullname(String value) {
        this.fullname = value;
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
     * Gets the value of the bankCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCountryCode() {
        return bankCountryCode;
    }

    /**
     * Sets the value of the bankCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCountryCode(String value) {
        this.bankCountryCode = value;
    }

    /**
     * Gets the value of the bankBik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBik() {
        return bankBik;
    }

    /**
     * Sets the value of the bankBik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBik(String value) {
        this.bankBik = value;
    }

    /**
     * Gets the value of the bankCorrAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCorrAccount() {
        return bankCorrAccount;
    }

    /**
     * Sets the value of the bankCorrAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCorrAccount(String value) {
        this.bankCorrAccount = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankPlace() {
        return bankPlace;
    }

    /**
     * Sets the value of the bankPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankPlace(String value) {
        this.bankPlace = value;
    }

    /**
     * Gets the value of the correctFlag property.
     * 
     */
    public boolean isCorrectFlag() {
        return correctFlag;
    }

    /**
     * Sets the value of the correctFlag property.
     * 
     */
    public void setCorrectFlag(boolean value) {
        this.correctFlag = value;
    }

    /**
     * Gets the value of the correctNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCorrectNumber() {
        return correctNumber;
    }

    /**
     * Sets the value of the correctNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCorrectNumber(BigInteger value) {
        this.correctNumber = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployee(String value) {
        this.employee = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the deals property.
     * 
     * @return
     *     possible object is
     *     {@link InqCurrRequest.Deals }
     *     
     */
    public InqCurrRequest.Deals getDeals() {
        return deals;
    }

    /**
     * Sets the value of the deals property.
     * 
     * @param value
     *     allowed object is
     *     {@link InqCurrRequest.Deals }
     *     
     */
    public void setDeals(InqCurrRequest.Deals value) {
        this.deals = value;
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
     *         &lt;element name="item" type="{http://custsystems.com/integration/abs}dealType" maxOccurs="unbounded"/&gt;
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
    public static class Deals {

        @XmlElement(required = true)
        protected List<DealType> item;

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
         * {@link DealType }
         * 
         * 
         */
        public List<DealType> getItem() {
            if (item == null) {
                item = new ArrayList<DealType>();
            }
            return this.item;
        }

    }

}


package com.custsystems.integration.abs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DealPassRenewRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DealPassRenewRequest"&gt;
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
 *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankBik" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankCorrAccount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankPlace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="employee" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="typeDp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="dpNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="dpDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="dealpassNumbers" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="item" type="{http://custsystems.com/integration/abs}DealpassNumberType" maxOccurs="unbounded"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="dpCredInfoChanges" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="item" type="{http://custsystems.com/integration/abs}dpCredInfoChange" maxOccurs="unbounded"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="dpContrInfoChanges" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="item" type="{http://custsystems.com/integration/abs}dpContrInfoChange" maxOccurs="unbounded"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="docsGroundReissue" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{http://custsystems.com/integration/abs}docGroundReissue" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "DealPassRenewRequest", propOrder = {
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
    "accNumber",
    "bankBik",
    "bankCorrAccount",
    "bankName",
    "bankPlace",
    "employee",
    "phone",
    "description",
    "typeDp",
    "dpNum",
    "dpDate",
    "dealpassNumbers",
    "dpCredInfoChanges",
    "dpContrInfoChanges",
    "docsGroundReissue",
    "files"
})
public class DealPassRenewRequest {

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
    protected String inn;
    @XmlElement(required = true)
    protected String fullname;
    protected String accNumber;
    @XmlElement(required = true)
    protected String bankBik;
    @XmlElement(required = true)
    protected String bankCorrAccount;
    @XmlElement(required = true)
    protected String bankName;
    @XmlElement(required = true)
    protected String bankPlace;
    @XmlElement(required = true)
    protected String employee;
    @XmlElement(required = true)
    protected String phone;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String typeDp;
    protected String dpNum;
    protected String dpDate;
    protected DealPassRenewRequest.DealpassNumbers dealpassNumbers;
    protected DealPassRenewRequest.DpCredInfoChanges dpCredInfoChanges;
    protected DealPassRenewRequest.DpContrInfoChanges dpContrInfoChanges;
    protected DealPassRenewRequest.DocsGroundReissue docsGroundReissue;
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
     * Gets the value of the accNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccNumber() {
        return accNumber;
    }

    /**
     * Sets the value of the accNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccNumber(String value) {
        this.accNumber = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the typeDp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDp() {
        return typeDp;
    }

    /**
     * Sets the value of the typeDp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDp(String value) {
        this.typeDp = value;
    }

    /**
     * Gets the value of the dpNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpNum() {
        return dpNum;
    }

    /**
     * Sets the value of the dpNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDpNum(String value) {
        this.dpNum = value;
    }

    /**
     * Gets the value of the dpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpDate() {
        return dpDate;
    }

    /**
     * Sets the value of the dpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDpDate(String value) {
        this.dpDate = value;
    }

    /**
     * Gets the value of the dealpassNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link DealPassRenewRequest.DealpassNumbers }
     *     
     */
    public DealPassRenewRequest.DealpassNumbers getDealpassNumbers() {
        return dealpassNumbers;
    }

    /**
     * Sets the value of the dealpassNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealPassRenewRequest.DealpassNumbers }
     *     
     */
    public void setDealpassNumbers(DealPassRenewRequest.DealpassNumbers value) {
        this.dealpassNumbers = value;
    }

    /**
     * Gets the value of the dpCredInfoChanges property.
     * 
     * @return
     *     possible object is
     *     {@link DealPassRenewRequest.DpCredInfoChanges }
     *     
     */
    public DealPassRenewRequest.DpCredInfoChanges getDpCredInfoChanges() {
        return dpCredInfoChanges;
    }

    /**
     * Sets the value of the dpCredInfoChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealPassRenewRequest.DpCredInfoChanges }
     *     
     */
    public void setDpCredInfoChanges(DealPassRenewRequest.DpCredInfoChanges value) {
        this.dpCredInfoChanges = value;
    }

    /**
     * Gets the value of the dpContrInfoChanges property.
     * 
     * @return
     *     possible object is
     *     {@link DealPassRenewRequest.DpContrInfoChanges }
     *     
     */
    public DealPassRenewRequest.DpContrInfoChanges getDpContrInfoChanges() {
        return dpContrInfoChanges;
    }

    /**
     * Sets the value of the dpContrInfoChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealPassRenewRequest.DpContrInfoChanges }
     *     
     */
    public void setDpContrInfoChanges(DealPassRenewRequest.DpContrInfoChanges value) {
        this.dpContrInfoChanges = value;
    }

    /**
     * Gets the value of the docsGroundReissue property.
     * 
     * @return
     *     possible object is
     *     {@link DealPassRenewRequest.DocsGroundReissue }
     *     
     */
    public DealPassRenewRequest.DocsGroundReissue getDocsGroundReissue() {
        return docsGroundReissue;
    }

    /**
     * Sets the value of the docsGroundReissue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DealPassRenewRequest.DocsGroundReissue }
     *     
     */
    public void setDocsGroundReissue(DealPassRenewRequest.DocsGroundReissue value) {
        this.docsGroundReissue = value;
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
     *         &lt;element name="item" type="{http://custsystems.com/integration/abs}DealpassNumberType" maxOccurs="unbounded"/&gt;
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
    public static class DealpassNumbers {

        @XmlElement(required = true)
        protected List<DealpassNumberType> item;

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
         * {@link DealpassNumberType }
         * 
         * 
         */
        public List<DealpassNumberType> getItem() {
            if (item == null) {
                item = new ArrayList<DealpassNumberType>();
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
     *         &lt;element name="item" type="{http://custsystems.com/integration/abs}docGroundReissue" maxOccurs="unbounded"/&gt;
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
    public static class DocsGroundReissue {

        @XmlElement(required = true)
        protected List<DocGroundReissue> item;

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
         * {@link DocGroundReissue }
         * 
         * 
         */
        public List<DocGroundReissue> getItem() {
            if (item == null) {
                item = new ArrayList<DocGroundReissue>();
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
     *         &lt;element name="item" type="{http://custsystems.com/integration/abs}dpContrInfoChange" maxOccurs="unbounded"/&gt;
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
    public static class DpContrInfoChanges {

        @XmlElement(required = true)
        protected List<DpContrInfoChange> item;

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
         * {@link DpContrInfoChange }
         * 
         * 
         */
        public List<DpContrInfoChange> getItem() {
            if (item == null) {
                item = new ArrayList<DpContrInfoChange>();
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
     *         &lt;element name="item" type="{http://custsystems.com/integration/abs}dpCredInfoChange" maxOccurs="unbounded"/&gt;
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
    public static class DpCredInfoChanges {

        @XmlElement(required = true)
        protected List<DpCredInfoChange> item;

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
         * {@link DpCredInfoChange }
         * 
         * 
         */
        public List<DpCredInfoChange> getItem() {
            if (item == null) {
                item = new ArrayList<DpCredInfoChange>();
            }
            return this.item;
        }

    }

}

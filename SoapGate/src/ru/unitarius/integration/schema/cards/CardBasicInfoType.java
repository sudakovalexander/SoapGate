
package ru.unitarius.integration.schema.cards;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.unitarius.integration.schema.common.SubsystemIDLongType;


/**
 * <p>Java class for CardBasicInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardBasicInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OwnerID" type="{http://unitarius.ru/integration/schema/common}SubsystemIDLongType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="OwnerBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CardNumber" type="{http://unitarius.ru/integration/schema/cards}CardNumberType"/&gt;
 *         &lt;element name="IsMain" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DateStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DateEnd" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TariffID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Tariff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmbossedName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StatusCodeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StatusBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgreementID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="BranchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardBasicInfoType", propOrder = {
    "ownerID",
    "ownerBrief",
    "cardID",
    "cardNumber",
    "isMain",
    "isActive",
    "dateStart",
    "dateEnd",
    "productID",
    "product",
    "currencyID",
    "currencyCode",
    "tariffID",
    "tariff",
    "accountID",
    "accountNumber",
    "embossedName",
    "statusCodeID",
    "statusBrief",
    "statusDescription",
    "agreementID",
    "branch",
    "branchID",
    "branchNumber"
})
@XmlSeeAlso({
    CardFullInfoType.class
})
public class CardBasicInfoType {

    @XmlElement(name = "OwnerID", required = true)
    protected List<SubsystemIDLongType> ownerID;
    @XmlElement(name = "OwnerBrief")
    protected String ownerBrief;
    @XmlElement(name = "CardID")
    protected Long cardID;
    @XmlElement(name = "CardNumber", required = true)
    protected CardNumberType cardNumber;
    @XmlElement(name = "IsMain")
    protected Boolean isMain;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "DateStart")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateStart;
    @XmlElement(name = "DateEnd", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEnd;
    @XmlElement(name = "ProductID")
    protected Long productID;
    @XmlElement(name = "Product")
    protected String product;
    @XmlElement(name = "CurrencyID")
    protected Long currencyID;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "TariffID")
    protected Long tariffID;
    @XmlElement(name = "Tariff")
    protected String tariff;
    @XmlElement(name = "AccountID")
    protected Long accountID;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "EmbossedName", required = true)
    protected String embossedName;
    @XmlElement(name = "StatusCodeID")
    protected Long statusCodeID;
    @XmlElement(name = "StatusBrief")
    protected String statusBrief;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    @XmlElement(name = "AgreementID")
    protected Long agreementID;
    @XmlElement(name = "Branch")
    protected String branch;
    @XmlElement(name = "BranchID")
    protected Long branchID;
    @XmlElement(name = "BranchNumber")
    protected String branchNumber;

    /**
     * Gets the value of the ownerID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownerID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnerID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubsystemIDLongType }
     * 
     * 
     */
    public List<SubsystemIDLongType> getOwnerID() {
        if (ownerID == null) {
            ownerID = new ArrayList<SubsystemIDLongType>();
        }
        return this.ownerID;
    }

    /**
     * Gets the value of the ownerBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerBrief() {
        return ownerBrief;
    }

    /**
     * Sets the value of the ownerBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerBrief(String value) {
        this.ownerBrief = value;
    }

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
     * Gets the value of the isMain property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMain() {
        return isMain;
    }

    /**
     * Sets the value of the isMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMain(Boolean value) {
        this.isMain = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
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
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductID(Long value) {
        this.productID = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
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

    /**
     * Gets the value of the tariffID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTariffID() {
        return tariffID;
    }

    /**
     * Sets the value of the tariffID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTariffID(Long value) {
        this.tariffID = value;
    }

    /**
     * Gets the value of the tariff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariff() {
        return tariff;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariff(String value) {
        this.tariff = value;
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
     * Gets the value of the embossedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbossedName() {
        return embossedName;
    }

    /**
     * Sets the value of the embossedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbossedName(String value) {
        this.embossedName = value;
    }

    /**
     * Gets the value of the statusCodeID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStatusCodeID() {
        return statusCodeID;
    }

    /**
     * Sets the value of the statusCodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStatusCodeID(Long value) {
        this.statusCodeID = value;
    }

    /**
     * Gets the value of the statusBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusBrief() {
        return statusBrief;
    }

    /**
     * Sets the value of the statusBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusBrief(String value) {
        this.statusBrief = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the agreementID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAgreementID() {
        return agreementID;
    }

    /**
     * Sets the value of the agreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAgreementID(Long value) {
        this.agreementID = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the branchID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBranchID() {
        return branchID;
    }

    /**
     * Sets the value of the branchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBranchID(Long value) {
        this.branchID = value;
    }

    /**
     * Gets the value of the branchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchNumber() {
        return branchNumber;
    }

    /**
     * Sets the value of the branchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchNumber(String value) {
        this.branchNumber = value;
    }

}

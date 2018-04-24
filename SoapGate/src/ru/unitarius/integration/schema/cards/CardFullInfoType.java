
package ru.unitarius.integration.schema.cards;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CardFullInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardFullInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://unitarius.ru/integration/schema/cards}CardBasicInfoType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DateClose" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SafeCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SafeMainCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardContractID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CardContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainCardContractID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MainCardContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsCorporate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsPersonified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CardTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardTypeFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsSalary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardFullInfoType", propOrder = {
    "linkID",
    "dateClose",
    "safeCardNumber",
    "safeMainCardNumber",
    "cardContractID",
    "cardContractNumber",
    "mainCardContractID",
    "mainCardContractNumber",
    "cardType",
    "isCorporate",
    "isPersonified",
    "cardTypeName",
    "cardTypeFullName",
    "isSalary"
})
public class CardFullInfoType
    extends CardBasicInfoType
{

    @XmlElement(name = "LinkID")
    protected Long linkID;
    @XmlElement(name = "DateClose")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateClose;
    @XmlElement(name = "SafeCardNumber")
    protected String safeCardNumber;
    @XmlElement(name = "SafeMainCardNumber")
    protected String safeMainCardNumber;
    @XmlElement(name = "CardContractID")
    protected Long cardContractID;
    @XmlElement(name = "CardContractNumber")
    protected String cardContractNumber;
    @XmlElement(name = "MainCardContractID")
    protected Long mainCardContractID;
    @XmlElement(name = "MainCardContractNumber")
    protected String mainCardContractNumber;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "IsCorporate")
    protected Boolean isCorporate;
    @XmlElement(name = "IsPersonified")
    protected Boolean isPersonified;
    @XmlElement(name = "CardTypeName")
    protected String cardTypeName;
    @XmlElement(name = "CardTypeFullName")
    protected String cardTypeFullName;
    @XmlElement(name = "IsSalary")
    protected Boolean isSalary;

    /**
     * Gets the value of the linkID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLinkID() {
        return linkID;
    }

    /**
     * Sets the value of the linkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLinkID(Long value) {
        this.linkID = value;
    }

    /**
     * Gets the value of the dateClose property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateClose() {
        return dateClose;
    }

    /**
     * Sets the value of the dateClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateClose(XMLGregorianCalendar value) {
        this.dateClose = value;
    }

    /**
     * Gets the value of the safeCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafeCardNumber() {
        return safeCardNumber;
    }

    /**
     * Sets the value of the safeCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafeCardNumber(String value) {
        this.safeCardNumber = value;
    }

    /**
     * Gets the value of the safeMainCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafeMainCardNumber() {
        return safeMainCardNumber;
    }

    /**
     * Sets the value of the safeMainCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafeMainCardNumber(String value) {
        this.safeMainCardNumber = value;
    }

    /**
     * Gets the value of the cardContractID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCardContractID() {
        return cardContractID;
    }

    /**
     * Sets the value of the cardContractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCardContractID(Long value) {
        this.cardContractID = value;
    }

    /**
     * Gets the value of the cardContractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardContractNumber() {
        return cardContractNumber;
    }

    /**
     * Sets the value of the cardContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardContractNumber(String value) {
        this.cardContractNumber = value;
    }

    /**
     * Gets the value of the mainCardContractID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMainCardContractID() {
        return mainCardContractID;
    }

    /**
     * Sets the value of the mainCardContractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMainCardContractID(Long value) {
        this.mainCardContractID = value;
    }

    /**
     * Gets the value of the mainCardContractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainCardContractNumber() {
        return mainCardContractNumber;
    }

    /**
     * Sets the value of the mainCardContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainCardContractNumber(String value) {
        this.mainCardContractNumber = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the isCorporate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCorporate() {
        return isCorporate;
    }

    /**
     * Sets the value of the isCorporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCorporate(Boolean value) {
        this.isCorporate = value;
    }

    /**
     * Gets the value of the isPersonified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPersonified() {
        return isPersonified;
    }

    /**
     * Sets the value of the isPersonified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPersonified(Boolean value) {
        this.isPersonified = value;
    }

    /**
     * Gets the value of the cardTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeName() {
        return cardTypeName;
    }

    /**
     * Sets the value of the cardTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeName(String value) {
        this.cardTypeName = value;
    }

    /**
     * Gets the value of the cardTypeFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeFullName() {
        return cardTypeFullName;
    }

    /**
     * Sets the value of the cardTypeFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeFullName(String value) {
        this.cardTypeFullName = value;
    }

    /**
     * Gets the value of the isSalary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSalary() {
        return isSalary;
    }

    /**
     * Sets the value of the isSalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSalary(Boolean value) {
        this.isSalary = value;
    }

}

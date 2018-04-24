
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Параметры карты.
 * 
 * <p>Java class for cardDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="cardNumber" type="{http://www.bpc.ru/apigate/general/}cardNumberType"/&gt;
 *           &lt;element name="cardNumberMask" type="{http://www.bpc.ru/apigate/general/}maskedCardNumberType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="expiryDate" type="{http://www.bpc.ru/apigate/general/}cardExpDateType" minOccurs="0"/&gt;
 *         &lt;element name="cardId" type="{http://www.bpc.ru/apigate/general/}cardIdType" minOccurs="0"/&gt;
 *         &lt;element name="hotCardStatus" type="{http://www.bpc.ru/apigate/general/}hotCardStatusType" minOccurs="0"/&gt;
 *         &lt;element name="cardTypeName" type="{http://www.bpc.ru/apigate/general/}cardTypeNameType" minOccurs="0"/&gt;
 *         &lt;element name="embossedName" type="{http://www.bpc.ru/apigate/general/}embossedNameType" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.bpc.ru/apigate/general/}customerIdType" minOccurs="0"/&gt;
 *         &lt;element name="personId" type="{http://www.bpc.ru/apigate/general/}personIdType" minOccurs="0"/&gt;
 *         &lt;element name="pinDenialCounter" type="{http://www.bpc.ru/apigate/general/}pinDenialCounterType" minOccurs="0"/&gt;
 *         &lt;element name="plasticNumber" type="{http://www.bpc.ru/apigate/general/}cardPlasticNumberType" minOccurs="0"/&gt;
 *         &lt;element name="hotCardStatusDescription" type="{http://www.bpc.ru/apigate/general/}hotCardStatusDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="cardIsPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="cardBindToCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="customerIsCardholder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="cardContractId" type="{http://www.bpc.ru/apigate/general/}cardContractIdType" minOccurs="0"/&gt;
 *         &lt;element name="cardPlasticId" type="{http://www.bpc.ru/apigate/general/}cardPlasticIdType" minOccurs="0"/&gt;
 *         &lt;element name="cardPlasticDescription" type="{http://www.bpc.ru/apigate/general/}cardPlasticDescriptionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardDataType", propOrder = {
    "cardNumber",
    "cardNumberMask",
    "expiryDate",
    "cardId",
    "hotCardStatus",
    "cardTypeName",
    "embossedName",
    "customerId",
    "personId",
    "pinDenialCounter",
    "plasticNumber",
    "hotCardStatusDescription",
    "cardIsPrimary",
    "cardBindToCustomer",
    "customerIsCardholder",
    "cardContractId",
    "cardPlasticId",
    "cardPlasticDescription"
})
@XmlSeeAlso({
    CardDataDetailedType.class
})
public class CardDataType {

    protected String cardNumber;
    protected String cardNumberMask;
    protected String expiryDate;
    protected String cardId;
    protected Integer hotCardStatus;
    protected String cardTypeName;
    protected String embossedName;
    protected String customerId;
    protected String personId;
    protected Integer pinDenialCounter;
    protected Integer plasticNumber;
    protected String hotCardStatusDescription;
    protected Boolean cardIsPrimary;
    protected Boolean cardBindToCustomer;
    protected Boolean customerIsCardholder;
    protected String cardContractId;
    protected String cardPlasticId;
    protected String cardPlasticDescription;

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

    /**
     * Gets the value of the cardNumberMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumberMask() {
        return cardNumberMask;
    }

    /**
     * Sets the value of the cardNumberMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumberMask(String value) {
        this.cardNumberMask = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the hotCardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotCardStatus() {
        return hotCardStatus;
    }

    /**
     * Sets the value of the hotCardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotCardStatus(Integer value) {
        this.hotCardStatus = value;
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
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    /**
     * Gets the value of the pinDenialCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPinDenialCounter() {
        return pinDenialCounter;
    }

    /**
     * Sets the value of the pinDenialCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPinDenialCounter(Integer value) {
        this.pinDenialCounter = value;
    }

    /**
     * Gets the value of the plasticNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlasticNumber() {
        return plasticNumber;
    }

    /**
     * Sets the value of the plasticNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlasticNumber(Integer value) {
        this.plasticNumber = value;
    }

    /**
     * Gets the value of the hotCardStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotCardStatusDescription() {
        return hotCardStatusDescription;
    }

    /**
     * Sets the value of the hotCardStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotCardStatusDescription(String value) {
        this.hotCardStatusDescription = value;
    }

    /**
     * Gets the value of the cardIsPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardIsPrimary() {
        return cardIsPrimary;
    }

    /**
     * Sets the value of the cardIsPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardIsPrimary(Boolean value) {
        this.cardIsPrimary = value;
    }

    /**
     * Gets the value of the cardBindToCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardBindToCustomer() {
        return cardBindToCustomer;
    }

    /**
     * Sets the value of the cardBindToCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardBindToCustomer(Boolean value) {
        this.cardBindToCustomer = value;
    }

    /**
     * Gets the value of the customerIsCardholder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomerIsCardholder() {
        return customerIsCardholder;
    }

    /**
     * Sets the value of the customerIsCardholder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomerIsCardholder(Boolean value) {
        this.customerIsCardholder = value;
    }

    /**
     * Gets the value of the cardContractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardContractId() {
        return cardContractId;
    }

    /**
     * Sets the value of the cardContractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardContractId(String value) {
        this.cardContractId = value;
    }

    /**
     * Gets the value of the cardPlasticId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPlasticId() {
        return cardPlasticId;
    }

    /**
     * Sets the value of the cardPlasticId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPlasticId(String value) {
        this.cardPlasticId = value;
    }

    /**
     * Gets the value of the cardPlasticDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPlasticDescription() {
        return cardPlasticDescription;
    }

    /**
     * Sets the value of the cardPlasticDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPlasticDescription(String value) {
        this.cardPlasticDescription = value;
    }

}

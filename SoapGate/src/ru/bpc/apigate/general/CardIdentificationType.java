
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Параметры идентификации карты.
 * 
 * <p>Java class for cardIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="cardNumber" type="{http://www.bpc.ru/apigate/general/}cardNumberType"/&gt;
 *           &lt;element name="cardLastDigitMask" type="{http://www.bpc.ru/apigate/general/}cardLastDigitMaskType"/&gt;
 *           &lt;element name="cardNumberMask" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="cardId" type="{http://www.bpc.ru/apigate/general/}cardIdType" minOccurs="0"/&gt;
 *         &lt;element name="expDate" type="{http://www.bpc.ru/apigate/general/}cardExpDateType" minOccurs="0"/&gt;
 *         &lt;element name="plasticNumber" type="{http://www.bpc.ru/apigate/general/}cardPlasticNumberType" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumber" type="{http://www.bpc.ru/apigate/general/}phoneNumberType" minOccurs="0"/&gt;
 *         &lt;element name="cardholderId" type="{http://www.bpc.ru/apigate/general/}cardholderIdType" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.bpc.ru/apigate/general/}customerIdType" minOccurs="0"/&gt;
 *         &lt;element name="barCode" type="{http://www.bpc.ru/apigate/general/}barCodeType" minOccurs="0"/&gt;
 *         &lt;element name="cvv2" type="{http://www.bpc.ru/apigate/general/}cvv2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardIdentificationType", propOrder = {
    "cardNumber",
    "cardLastDigitMask",
    "cardNumberMask",
    "cardId",
    "expDate",
    "plasticNumber",
    "phoneNumber",
    "cardholderId",
    "customerId",
    "barCode",
    "cvv2"
})
public class CardIdentificationType {

    protected String cardNumber;
    protected String cardLastDigitMask;
    protected String cardNumberMask;
    protected String cardId;
    protected String expDate;
    protected Integer plasticNumber;
    protected String phoneNumber;
    protected String cardholderId;
    protected String customerId;
    protected String barCode;
    protected String cvv2;

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
     * Gets the value of the cardLastDigitMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLastDigitMask() {
        return cardLastDigitMask;
    }

    /**
     * Sets the value of the cardLastDigitMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLastDigitMask(String value) {
        this.cardLastDigitMask = value;
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
     * Gets the value of the expDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDate(String value) {
        this.expDate = value;
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
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the cardholderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderId() {
        return cardholderId;
    }

    /**
     * Sets the value of the cardholderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderId(String value) {
        this.cardholderId = value;
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
     * Gets the value of the barCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * Sets the value of the barCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCode(String value) {
        this.barCode = value;
    }

    /**
     * Gets the value of the cvv2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvv2() {
        return cvv2;
    }

    /**
     * Sets the value of the cvv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvv2(String value) {
        this.cvv2 = value;
    }

}


package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Параметры идентификации виртуальной карты.
 * 
 * <p>Java class for virtualCardIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="virtualCardIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardNumber" type="{http://www.bpc.ru/apigate/general/}cardNumberType" minOccurs="0"/&gt;
 *         &lt;element name="cardNumberMask" type="{http://www.bpc.ru/apigate/general/}maskedCardNumberType" minOccurs="0"/&gt;
 *         &lt;element name="expDate" type="{http://www.bpc.ru/apigate/general/}cardExpDateType"/&gt;
 *         &lt;element name="productType" type="{http://www.bpc.ru/apigate/general/}productTypeType"/&gt;
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
@XmlType(name = "virtualCardIdentificationType", propOrder = {
    "cardNumber",
    "cardNumberMask",
    "expDate",
    "productType",
    "barCode",
    "cvv2"
})
public class VirtualCardIdentificationType {

    protected String cardNumber;
    protected String cardNumberMask;
    @XmlElement(required = true)
    protected String expDate;
    @XmlElement(required = true)
    protected String productType;
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
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
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


package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Элемент списка карт.
 * 
 * <p>Java class for cardListElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardListElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="cardNumber" type="{http://www.bpc.ru/apigate/general/}cardNumberType"/&gt;
 *           &lt;element name="cardNumberMask" type="{http://www.bpc.ru/apigate/general/}maskedCardNumberType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="expiryDate" type="{http://www.bpc.ru/apigate/general/}cardExpDateType" minOccurs="0"/&gt;
 *         &lt;element name="authenticationFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardListElement", propOrder = {
    "cardNumber",
    "cardNumberMask",
    "expiryDate",
    "authenticationFlag"
})
public class CardListElement {

    protected String cardNumber;
    protected String cardNumberMask;
    protected String expiryDate;
    @XmlElement(required = true)
    protected String authenticationFlag;

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
     * Gets the value of the authenticationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationFlag() {
        return authenticationFlag;
    }

    /**
     * Sets the value of the authenticationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationFlag(String value) {
        this.authenticationFlag = value;
    }

}

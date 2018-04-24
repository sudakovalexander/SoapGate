
package ru.bpc.apigate.command.checkcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.bpc.apigate.general.CardDataType;


/**
 * <p>Java class for checkCardRequestResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkCardRequestResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseCode" type="{http://www.bpc.ru/apigate/general/}responseCodeType"/&gt;
 *         &lt;element name="cardData" type="{http://www.bpc.ru/apigate/general/}cardDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkCardRequestResponseType", propOrder = {
    "responseCode",
    "cardData"
})
public class CheckCardRequestResponseType {

    @XmlElement(required = true)
    protected String responseCode;
    protected CardDataType cardData;

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the cardData property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataType }
     *     
     */
    public CardDataType getCardData() {
        return cardData;
    }

    /**
     * Sets the value of the cardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataType }
     *     
     */
    public void setCardData(CardDataType value) {
        this.cardData = value;
    }

}

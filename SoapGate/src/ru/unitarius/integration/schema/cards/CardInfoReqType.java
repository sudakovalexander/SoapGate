
package ru.unitarius.integration.schema.cards;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardInfoReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardInfoReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CardNumber" type="{http://unitarius.ru/integration/schema/cards}CardNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardInfoReqType", propOrder = {
    "cardID",
    "cardNumber"
})
public class CardInfoReqType {

    @XmlElement(name = "CardID")
    protected Long cardID;
    @XmlElement(name = "CardNumber")
    protected CardNumberType cardNumber;

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

}

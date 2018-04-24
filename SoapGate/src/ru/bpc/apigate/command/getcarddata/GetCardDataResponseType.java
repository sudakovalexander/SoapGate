
package ru.bpc.apigate.command.getcarddata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.bpc.apigate.general.CardDataDetailedType;


/**
 * <p>Java class for getCardDataResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCardDataResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardData" type="{http://www.bpc.ru/apigate/general/}cardDataDetailedType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCardDataResponseType", propOrder = {
    "cardData"
})
public class GetCardDataResponseType {

    @XmlElement(required = true)
    protected CardDataDetailedType cardData;

    /**
     * Gets the value of the cardData property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataDetailedType }
     *     
     */
    public CardDataDetailedType getCardData() {
        return cardData;
    }

    /**
     * Sets the value of the cardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataDetailedType }
     *     
     */
    public void setCardData(CardDataDetailedType value) {
        this.cardData = value;
    }

}


package ru.bpc.apigate.command.getcardlistbyowner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCardListByOwnerResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCardListByOwnerResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.bpc.ru/apigate/command/getCardListByOwner/}cards"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCardListByOwnerResponseType", propOrder = {
    "cards"
})
public class GetCardListByOwnerResponseType {

    @XmlElement(required = true)
    protected Cards cards;

    /**
     * Gets the value of the cards property.
     * 
     * @return
     *     possible object is
     *     {@link Cards }
     *     
     */
    public Cards getCards() {
        return cards;
    }

    /**
     * Sets the value of the cards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cards }
     *     
     */
    public void setCards(Cards value) {
        this.cards = value;
    }

}

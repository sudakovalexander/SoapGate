
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Детальные параметры счета.
 * 
 * <p>Java class for accountDataDetailedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountDataDetailedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bpc.ru/apigate/general/}accountDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cards" type="{http://www.bpc.ru/apigate/general/}cardsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountDataDetailedType", propOrder = {
    "cards"
})
public class AccountDataDetailedType
    extends AccountDataType
{

    @XmlElement(required = true)
    protected CardsType cards;

    /**
     * Gets the value of the cards property.
     * 
     * @return
     *     possible object is
     *     {@link CardsType }
     *     
     */
    public CardsType getCards() {
        return cards;
    }

    /**
     * Sets the value of the cards property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardsType }
     *     
     */
    public void setCards(CardsType value) {
        this.cards = value;
    }

}

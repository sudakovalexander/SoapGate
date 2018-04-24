
package ru.unitarius.integration.schema.cards;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.unitarius.integration.schema.common.AbstractResponseType;


/**
 * <p>Java class for CardInfoResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardInfoResType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://unitarius.ru/integration/schema/common}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Card" type="{http://unitarius.ru/integration/schema/cards}CardFullInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardInfoResType", propOrder = {
    "card"
})
public class CardInfoResType
    extends AbstractResponseType
{

    @XmlElement(name = "Card")
    protected CardFullInfoType card;

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link CardFullInfoType }
     *     
     */
    public CardFullInfoType getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardFullInfoType }
     *     
     */
    public void setCard(CardFullInfoType value) {
        this.card = value;
    }

}

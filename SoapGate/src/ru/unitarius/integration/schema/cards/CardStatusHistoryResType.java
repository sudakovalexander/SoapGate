
package ru.unitarius.integration.schema.cards;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.unitarius.integration.schema.common.AbstractResponseType;


/**
 * <p>Java class for CardStatusHistoryResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardStatusHistoryResType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://unitarius.ru/integration/schema/common}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CardNumber" type="{http://unitarius.ru/integration/schema/cards}CardNumberType"/&gt;
 *         &lt;element name="EventList" type="{http://unitarius.ru/integration/schema/cards}CardStatusChangeEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardStatusHistoryResType", propOrder = {
    "cardID",
    "cardNumber",
    "eventList"
})
public class CardStatusHistoryResType
    extends AbstractResponseType
{

    @XmlElement(name = "CardID")
    protected long cardID;
    @XmlElement(name = "CardNumber", required = true)
    protected CardNumberType cardNumber;
    @XmlElement(name = "EventList")
    protected List<CardStatusChangeEventType> eventList;

    /**
     * Gets the value of the cardID property.
     * 
     */
    public long getCardID() {
        return cardID;
    }

    /**
     * Sets the value of the cardID property.
     * 
     */
    public void setCardID(long value) {
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

    /**
     * Gets the value of the eventList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardStatusChangeEventType }
     * 
     * 
     */
    public List<CardStatusChangeEventType> getEventList() {
        if (eventList == null) {
            eventList = new ArrayList<CardStatusChangeEventType>();
        }
        return this.eventList;
    }

}


package ru.bpc.apigate.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Перечень карт.
 * 
 * <p>Java class for cardsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardData" type="{http://www.bpc.ru/apigate/general/}cardDataType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardsType", propOrder = {
    "cardData"
})
public class CardsType {

    @XmlElement(required = true)
    protected List<CardDataType> cardData;

    /**
     * Gets the value of the cardData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataType }
     * 
     * 
     */
    public List<CardDataType> getCardData() {
        if (cardData == null) {
            cardData = new ArrayList<CardDataType>();
        }
        return this.cardData;
    }

}


package ru.unitarius.integration.schema.cards;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.unitarius.integration.schema.common.AbstractResponseType;


/**
 * <p>Java class for CardListResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardListResType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://unitarius.ru/integration/schema/common}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardList" type="{http://unitarius.ru/integration/schema/cards}CardBasicInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardListResType", propOrder = {
    "cardList"
})
public class CardListResType
    extends AbstractResponseType
{

    @XmlElement(name = "CardList")
    protected List<CardBasicInfoType> cardList;

    /**
     * Gets the value of the cardList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardBasicInfoType }
     * 
     * 
     */
    public List<CardBasicInfoType> getCardList() {
        if (cardList == null) {
            cardList = new ArrayList<CardBasicInfoType>();
        }
        return this.cardList;
    }

}

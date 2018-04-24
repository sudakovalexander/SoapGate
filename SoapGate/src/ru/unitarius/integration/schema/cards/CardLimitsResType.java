
package ru.unitarius.integration.schema.cards;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.unitarius.integration.schema.common.AbstractResponseType;


/**
 * <p>Java class for CardLimitsResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardLimitsResType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://unitarius.ru/integration/schema/common}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LimitList" type="{http://unitarius.ru/integration/schema/cards}CardLimitType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardLimitsResType", propOrder = {
    "limitList"
})
public class CardLimitsResType
    extends AbstractResponseType
{

    @XmlElement(name = "LimitList")
    protected List<CardLimitType> limitList;

    /**
     * Gets the value of the limitList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardLimitType }
     * 
     * 
     */
    public List<CardLimitType> getLimitList() {
        if (limitList == null) {
            limitList = new ArrayList<CardLimitType>();
        }
        return this.limitList;
    }

}

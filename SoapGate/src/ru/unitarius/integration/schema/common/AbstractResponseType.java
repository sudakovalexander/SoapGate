
package ru.unitarius.integration.schema.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.unitarius.integration.schema.cards.CardInfoResType;
import ru.unitarius.integration.schema.cards.CardLimitsResType;
import ru.unitarius.integration.schema.cards.CardListResType;
import ru.unitarius.integration.schema.cards.CardPaymentScheduleResType;
import ru.unitarius.integration.schema.cards.CardPhoneNumberResType;
import ru.unitarius.integration.schema.cards.CardStatusHistoryResType;
import ru.unitarius.integration.schema.cards.CardStatusResType;
import ru.unitarius.integration.schema.cards.CheckCodewordResType;
import ru.unitarius.integration.schema.cards.StatementResType;


/**
 * <p>Java class for AbstractResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WarningList" type="{http://unitarius.ru/integration/schema/common}WarningType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractResponseType", propOrder = {
    "warningList"
})
@XmlSeeAlso({
    AsyncResponseType.class,
    CardInfoResType.class,
    CardLimitsResType.class,
    CardListResType.class,
    CardPaymentScheduleResType.class,
    CardPhoneNumberResType.class,
    CardStatusHistoryResType.class,
    CardStatusResType.class,
    CheckCodewordResType.class,
    StatementResType.class
})
public abstract class AbstractResponseType {

    @XmlElement(name = "WarningList")
    protected List<WarningType> warningList;

    /**
     * Gets the value of the warningList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningType }
     * 
     * 
     */
    public List<WarningType> getWarningList() {
        if (warningList == null) {
            warningList = new ArrayList<WarningType>();
        }
        return this.warningList;
    }

}

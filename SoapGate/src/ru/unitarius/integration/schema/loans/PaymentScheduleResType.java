
package ru.unitarius.integration.schema.loans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.unitarius.integration.schema.common.AbstractResponseType;


/**
 * <p>Java class for PaymentScheduleResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentScheduleResType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://unitarius.ru/integration/schema/common}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FactPaymentScheduleList" type="{http://unitarius.ru/integration/schema/loans}FactPaymentScheduleEntryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PlanPaymentScheduleList" type="{http://unitarius.ru/integration/schema/loans}PlanPaymentScheduleEntryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentScheduleResType", propOrder = {
    "factPaymentScheduleList",
    "planPaymentScheduleList"
})
public class PaymentScheduleResType
    extends AbstractResponseType
{

    @XmlElement(name = "FactPaymentScheduleList")
    protected List<FactPaymentScheduleEntryType> factPaymentScheduleList;
    @XmlElement(name = "PlanPaymentScheduleList")
    protected List<PlanPaymentScheduleEntryType> planPaymentScheduleList;

    /**
     * Gets the value of the factPaymentScheduleList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factPaymentScheduleList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactPaymentScheduleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FactPaymentScheduleEntryType }
     * 
     * 
     */
    public List<FactPaymentScheduleEntryType> getFactPaymentScheduleList() {
        if (factPaymentScheduleList == null) {
            factPaymentScheduleList = new ArrayList<FactPaymentScheduleEntryType>();
        }
        return this.factPaymentScheduleList;
    }

    /**
     * Gets the value of the planPaymentScheduleList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planPaymentScheduleList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanPaymentScheduleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanPaymentScheduleEntryType }
     * 
     * 
     */
    public List<PlanPaymentScheduleEntryType> getPlanPaymentScheduleList() {
        if (planPaymentScheduleList == null) {
            planPaymentScheduleList = new ArrayList<PlanPaymentScheduleEntryType>();
        }
        return this.planPaymentScheduleList;
    }

}

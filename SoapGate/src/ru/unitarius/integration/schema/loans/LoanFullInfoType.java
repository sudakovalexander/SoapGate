
package ru.unitarius.integration.schema.loans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanFullInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanFullInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://unitarius.ru/integration/schema/loans}LoanBasicInfoType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InterestRateList" type="{http://unitarius.ru/integration/schema/loans}InterestRateType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="AccountList" type="{http://unitarius.ru/integration/schema/loans}LoanAccountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CalcParamList" type="{http://unitarius.ru/integration/schema/loans}CalcParamType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GracePeriodList" type="{http://unitarius.ru/integration/schema/loans}GracePeriodType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanFullInfoType", propOrder = {
    "interestRateList",
    "accountList",
    "calcParamList",
    "gracePeriodList"
})
public class LoanFullInfoType
    extends LoanBasicInfoType
{

    @XmlElement(name = "InterestRateList", required = true)
    protected List<InterestRateType> interestRateList;
    @XmlElement(name = "AccountList")
    protected List<LoanAccountType> accountList;
    @XmlElement(name = "CalcParamList")
    protected List<CalcParamType> calcParamList;
    @XmlElement(name = "GracePeriodList")
    protected List<GracePeriodType> gracePeriodList;

    /**
     * Gets the value of the interestRateList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestRateList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestRateList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestRateType }
     * 
     * 
     */
    public List<InterestRateType> getInterestRateList() {
        if (interestRateList == null) {
            interestRateList = new ArrayList<InterestRateType>();
        }
        return this.interestRateList;
    }

    /**
     * Gets the value of the accountList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanAccountType }
     * 
     * 
     */
    public List<LoanAccountType> getAccountList() {
        if (accountList == null) {
            accountList = new ArrayList<LoanAccountType>();
        }
        return this.accountList;
    }

    /**
     * Gets the value of the calcParamList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calcParamList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalcParamList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalcParamType }
     * 
     * 
     */
    public List<CalcParamType> getCalcParamList() {
        if (calcParamList == null) {
            calcParamList = new ArrayList<CalcParamType>();
        }
        return this.calcParamList;
    }

    /**
     * Gets the value of the gracePeriodList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gracePeriodList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGracePeriodList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GracePeriodType }
     * 
     * 
     */
    public List<GracePeriodType> getGracePeriodList() {
        if (gracePeriodList == null) {
            gracePeriodList = new ArrayList<GracePeriodType>();
        }
        return this.gracePeriodList;
    }

}


package ru.unitarius.integration.schema.loans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.unitarius.integration.schema.common.AbstractResponseType;


/**
 * <p>Java class for LoansFindListResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoansFindListResType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://unitarius.ru/integration/schema/common}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoanList" type="{http://unitarius.ru/integration/schema/loans}LoanBasicInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoansFindListResType", propOrder = {
    "loanList"
})
public class LoansFindListResType
    extends AbstractResponseType
{

    @XmlElement(name = "LoanList")
    protected List<LoanBasicInfoType> loanList;

    /**
     * Gets the value of the loanList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanBasicInfoType }
     * 
     * 
     */
    public List<LoanBasicInfoType> getLoanList() {
        if (loanList == null) {
            loanList = new ArrayList<LoanBasicInfoType>();
        }
        return this.loanList;
    }

}

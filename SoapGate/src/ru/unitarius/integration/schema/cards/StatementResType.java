
package ru.unitarius.integration.schema.cards;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.unitarius.integration.schema.common.AbstractResponseType;


/**
 * <p>Java class for StatementResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementResType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://unitarius.ru/integration/schema/common}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountStatementList" type="{http://unitarius.ru/integration/schema/cards}AccountStatementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementResType", propOrder = {
    "accountStatementList"
})
public class StatementResType
    extends AbstractResponseType
{

    @XmlElement(name = "AccountStatementList")
    protected List<AccountStatementType> accountStatementList;

    /**
     * Gets the value of the accountStatementList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountStatementList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountStatementList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountStatementType }
     * 
     * 
     */
    public List<AccountStatementType> getAccountStatementList() {
        if (accountStatementList == null) {
            accountStatementList = new ArrayList<AccountStatementType>();
        }
        return this.accountStatementList;
    }

}

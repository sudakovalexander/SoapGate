
package ru.bpc.apigate.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Перечень счетов.
 * 
 * <p>Java class for accountsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountData" type="{http://www.bpc.ru/apigate/general/}accountDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountsType", propOrder = {
    "accountData"
})
public class AccountsType {

    protected List<AccountDataType> accountData;

    /**
     * Gets the value of the accountData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountDataType }
     * 
     * 
     */
    public List<AccountDataType> getAccountData() {
        if (accountData == null) {
            accountData = new ArrayList<AccountDataType>();
        }
        return this.accountData;
    }

}

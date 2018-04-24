
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Детальные параметры карты.
 * 
 * <p>Java class for cardDataDetailedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardDataDetailedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bpc.ru/apigate/general/}cardDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accounts" type="{http://www.bpc.ru/apigate/general/}accountsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardDataDetailedType", propOrder = {
    "accounts"
})
public class CardDataDetailedType
    extends CardDataType
{

    @XmlElement(required = true)
    protected AccountsType accounts;

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountsType }
     *     
     */
    public AccountsType getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountsType }
     *     
     */
    public void setAccounts(AccountsType value) {
        this.accounts = value;
    }

}

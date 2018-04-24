
package ru.bpc.apigate.command.getaccountdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.bpc.apigate.general.AccountDataDetailedType;


/**
 * <p>Java class for getAccountDataResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAccountDataResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountData" type="{http://www.bpc.ru/apigate/general/}accountDataDetailedType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAccountDataResponseType", propOrder = {
    "accountData"
})
public class GetAccountDataResponseType {

    @XmlElement(required = true)
    protected AccountDataDetailedType accountData;

    /**
     * Gets the value of the accountData property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDataDetailedType }
     *     
     */
    public AccountDataDetailedType getAccountData() {
        return accountData;
    }

    /**
     * Sets the value of the accountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDataDetailedType }
     *     
     */
    public void setAccountData(AccountDataDetailedType value) {
        this.accountData = value;
    }

}

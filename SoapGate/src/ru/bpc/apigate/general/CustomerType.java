
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Параметры клиента.
 * 
 * <p>Java class for customerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerId" type="{http://www.bpc.ru/apigate/general/}customerIdType"/&gt;
 *         &lt;element name="address" type="{http://www.bpc.ru/apigate/general/}addressType"/&gt;
 *         &lt;element name="memorableWord" type="{http://www.bpc.ru/apigate/general/}memorableWordType" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.bpc.ru/apigate/general/}phoneNumberType" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.bpc.ru/apigate/general/}emailType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerType", propOrder = {
    "customerId",
    "address",
    "memorableWord",
    "phone",
    "email"
})
public class CustomerType {

    @XmlElement(required = true)
    protected String customerId;
    @XmlElement(required = true)
    protected String address;
    protected String memorableWord;
    protected String phone;
    protected String email;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the memorableWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemorableWord() {
        return memorableWord;
    }

    /**
     * Sets the value of the memorableWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemorableWord(String value) {
        this.memorableWord = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}

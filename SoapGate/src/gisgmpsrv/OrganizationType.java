
package gisgmpsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayeeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PayeeINN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PayeeKPP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeAccountList" type="{http://support.diasoft.ru}PayeeAccountListType"/&gt;
 *         &lt;element name="PayeeAddressList" type="{http://support.diasoft.ru}PayeeAddressListType" minOccurs="0"/&gt;
 *         &lt;element name="PayeeContactList" type="{http://support.diasoft.ru}PayeeContactListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationType", propOrder = {
    "payeeName",
    "payeeINN",
    "payeeKPP",
    "ogrn",
    "payeeAccountList",
    "payeeAddressList",
    "payeeContactList"
})
public class OrganizationType {

    @XmlElement(name = "PayeeName", required = true)
    protected String payeeName;
    @XmlElement(name = "PayeeINN", required = true)
    protected String payeeINN;
    @XmlElement(name = "PayeeKPP", required = true)
    protected String payeeKPP;
    @XmlElement(name = "OGRN")
    protected String ogrn;
    @XmlElement(name = "PayeeAccountList", required = true)
    protected PayeeAccountListType payeeAccountList;
    @XmlElement(name = "PayeeAddressList")
    protected PayeeAddressListType payeeAddressList;
    @XmlElement(name = "PayeeContactList")
    protected PayeeContactListType payeeContactList;

    /**
     * Gets the value of the payeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeName(String value) {
        this.payeeName = value;
    }

    /**
     * Gets the value of the payeeINN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeINN() {
        return payeeINN;
    }

    /**
     * Sets the value of the payeeINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeINN(String value) {
        this.payeeINN = value;
    }

    /**
     * Gets the value of the payeeKPP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeKPP() {
        return payeeKPP;
    }

    /**
     * Sets the value of the payeeKPP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeKPP(String value) {
        this.payeeKPP = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRN(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the payeeAccountList property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeAccountListType }
     *     
     */
    public PayeeAccountListType getPayeeAccountList() {
        return payeeAccountList;
    }

    /**
     * Sets the value of the payeeAccountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeAccountListType }
     *     
     */
    public void setPayeeAccountList(PayeeAccountListType value) {
        this.payeeAccountList = value;
    }

    /**
     * Gets the value of the payeeAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeAddressListType }
     *     
     */
    public PayeeAddressListType getPayeeAddressList() {
        return payeeAddressList;
    }

    /**
     * Sets the value of the payeeAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeAddressListType }
     *     
     */
    public void setPayeeAddressList(PayeeAddressListType value) {
        this.payeeAddressList = value;
    }

    /**
     * Gets the value of the payeeContactList property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeContactListType }
     *     
     */
    public PayeeContactListType getPayeeContactList() {
        return payeeContactList;
    }

    /**
     * Sets the value of the payeeContactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeContactListType }
     *     
     */
    public void setPayeeContactList(PayeeContactListType value) {
        this.payeeContactList = value;
    }

}


package gisgmpsrv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayerInstitutionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerCorrespondentBankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerInstitutionBIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://support.diasoft.ru}PayerInstitutionAddressType" minOccurs="0"/&gt;
 *         &lt;element name="Contacts" type="{http://support.diasoft.ru}ContactInstitutionList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankType", propOrder = {
    "payerInstitutionName",
    "payerCorrespondentBankAccount",
    "payerInstitutionBIC",
    "senderBankCode",
    "address",
    "contacts"
})
public class BankType {

    @XmlElement(name = "PayerInstitutionName")
    protected String payerInstitutionName;
    @XmlElement(name = "PayerCorrespondentBankAccount")
    protected String payerCorrespondentBankAccount;
    @XmlElement(name = "PayerInstitutionBIC")
    protected String payerInstitutionBIC;
    @XmlElement(name = "SenderBankCode")
    protected String senderBankCode;
    @XmlElement(name = "Address")
    protected PayerInstitutionAddressType address;
    @XmlElement(name = "Contacts")
    protected List<ContactInstitutionList> contacts;

    /**
     * Gets the value of the payerInstitutionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInstitutionName() {
        return payerInstitutionName;
    }

    /**
     * Sets the value of the payerInstitutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInstitutionName(String value) {
        this.payerInstitutionName = value;
    }

    /**
     * Gets the value of the payerCorrespondentBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerCorrespondentBankAccount() {
        return payerCorrespondentBankAccount;
    }

    /**
     * Sets the value of the payerCorrespondentBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerCorrespondentBankAccount(String value) {
        this.payerCorrespondentBankAccount = value;
    }

    /**
     * Gets the value of the payerInstitutionBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInstitutionBIC() {
        return payerInstitutionBIC;
    }

    /**
     * Sets the value of the payerInstitutionBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInstitutionBIC(String value) {
        this.payerInstitutionBIC = value;
    }

    /**
     * Gets the value of the senderBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderBankCode() {
        return senderBankCode;
    }

    /**
     * Sets the value of the senderBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderBankCode(String value) {
        this.senderBankCode = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link PayerInstitutionAddressType }
     *     
     */
    public PayerInstitutionAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerInstitutionAddressType }
     *     
     */
    public void setAddress(PayerInstitutionAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInstitutionList }
     * 
     * 
     */
    public List<ContactInstitutionList> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<ContactInstitutionList>();
        }
        return this.contacts;
    }

}

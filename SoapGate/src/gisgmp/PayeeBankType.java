
package gisgmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayeeBankType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeBankType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayeeInstitutionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeCorrespondentBankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeInstitutionBIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeInstitutionAddressData" type="{http://support.diasoft.ru}PayeeInstitutionAddressDataType" minOccurs="0"/&gt;
 *         &lt;element name="PayeeInstitutionContacts" type="{http://support.diasoft.ru}PayeeInstitutionContactsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayeeBankType", propOrder = {
    "payeeInstitutionName",
    "payeeCorrespondentBankAccount",
    "payeeInstitutionBIC",
    "senderBankCode",
    "payeeInstitutionAddressData",
    "payeeInstitutionContacts"
})
public class PayeeBankType {

    @XmlElement(name = "PayeeInstitutionName")
    protected String payeeInstitutionName;
    @XmlElement(name = "PayeeCorrespondentBankAccount")
    protected String payeeCorrespondentBankAccount;
    @XmlElement(name = "PayeeInstitutionBIC")
    protected String payeeInstitutionBIC;
    @XmlElement(name = "SenderBankCode")
    protected String senderBankCode;
    @XmlElement(name = "PayeeInstitutionAddressData")
    protected PayeeInstitutionAddressDataType payeeInstitutionAddressData;
    @XmlElement(name = "PayeeInstitutionContacts")
    protected PayeeInstitutionContactsType payeeInstitutionContacts;

    /**
     * Gets the value of the payeeInstitutionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionName() {
        return payeeInstitutionName;
    }

    /**
     * Sets the value of the payeeInstitutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionName(String value) {
        this.payeeInstitutionName = value;
    }

    /**
     * Gets the value of the payeeCorrespondentBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeCorrespondentBankAccount() {
        return payeeCorrespondentBankAccount;
    }

    /**
     * Sets the value of the payeeCorrespondentBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeCorrespondentBankAccount(String value) {
        this.payeeCorrespondentBankAccount = value;
    }

    /**
     * Gets the value of the payeeInstitutionBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionBIC() {
        return payeeInstitutionBIC;
    }

    /**
     * Sets the value of the payeeInstitutionBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionBIC(String value) {
        this.payeeInstitutionBIC = value;
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
     * Gets the value of the payeeInstitutionAddressData property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeInstitutionAddressDataType }
     *     
     */
    public PayeeInstitutionAddressDataType getPayeeInstitutionAddressData() {
        return payeeInstitutionAddressData;
    }

    /**
     * Sets the value of the payeeInstitutionAddressData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeInstitutionAddressDataType }
     *     
     */
    public void setPayeeInstitutionAddressData(PayeeInstitutionAddressDataType value) {
        this.payeeInstitutionAddressData = value;
    }

    /**
     * Gets the value of the payeeInstitutionContacts property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeInstitutionContactsType }
     *     
     */
    public PayeeInstitutionContactsType getPayeeInstitutionContacts() {
        return payeeInstitutionContacts;
    }

    /**
     * Sets the value of the payeeInstitutionContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeInstitutionContactsType }
     *     
     */
    public void setPayeeInstitutionContacts(PayeeInstitutionContactsType value) {
        this.payeeInstitutionContacts = value;
    }

}

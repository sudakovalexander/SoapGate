
package giszhkh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о платежных реквизитах организации
 * 
 * <p>Java class for PaymentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecipientINN" type="{http://smev.gosuslugi.ru/rev120315}INNType"/&gt;
 *         &lt;element name="RecipientKPP" type="{http://smev.gosuslugi.ru/rev120315}KPPType" minOccurs="0"/&gt;
 *         &lt;element name="BankName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="160"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PaymentRecipient"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="160"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BankBIK" type="{http://smev.gosuslugi.ru/rev120315}BIKType"/&gt;
 *         &lt;element name="operatingAccountNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CorrespondentBankAccount" type="{http://smev.gosuslugi.ru/rev120315}AccountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInformationType", propOrder = {
    "recipientINN",
    "recipientKPP",
    "bankName",
    "paymentRecipient",
    "bankBIK",
    "operatingAccountNumber",
    "correspondentBankAccount"
})
@XmlSeeAlso({
    giszhkh.PaymentDocumentDetailsType.ExecutorInformation.PaymentInformation.class,
    giszhkh.ServiceDetailsType.ExecutorInformation.PaymentInformation.class
})
public class PaymentInformationType {

    @XmlElement(name = "RecipientINN", required = true)
    protected String recipientINN;
    @XmlElement(name = "RecipientKPP")
    protected String recipientKPP;
    @XmlElement(name = "BankName", required = true)
    protected String bankName;
    @XmlElement(name = "PaymentRecipient", required = true)
    protected String paymentRecipient;
    @XmlElement(name = "BankBIK", required = true)
    protected String bankBIK;
    @XmlElement(required = true)
    protected String operatingAccountNumber;
    @XmlElement(name = "CorrespondentBankAccount", required = true)
    protected String correspondentBankAccount;

    /**
     * Gets the value of the recipientINN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientINN() {
        return recipientINN;
    }

    /**
     * Sets the value of the recipientINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientINN(String value) {
        this.recipientINN = value;
    }

    /**
     * Gets the value of the recipientKPP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientKPP() {
        return recipientKPP;
    }

    /**
     * Sets the value of the recipientKPP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientKPP(String value) {
        this.recipientKPP = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the paymentRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRecipient() {
        return paymentRecipient;
    }

    /**
     * Sets the value of the paymentRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRecipient(String value) {
        this.paymentRecipient = value;
    }

    /**
     * Gets the value of the bankBIK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBIK() {
        return bankBIK;
    }

    /**
     * Sets the value of the bankBIK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBIK(String value) {
        this.bankBIK = value;
    }

    /**
     * Gets the value of the operatingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingAccountNumber() {
        return operatingAccountNumber;
    }

    /**
     * Sets the value of the operatingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingAccountNumber(String value) {
        this.operatingAccountNumber = value;
    }

    /**
     * Gets the value of the correspondentBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondentBankAccount() {
        return correspondentBankAccount;
    }

    /**
     * Sets the value of the correspondentBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondentBankAccount(String value) {
        this.correspondentBankAccount = value;
    }

}

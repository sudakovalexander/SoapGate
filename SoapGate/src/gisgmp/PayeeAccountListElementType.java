
package gisgmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayeeAccountListElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeAccountListElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierBillID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PayeeAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PayeeSubAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankType" type="{http://support.diasoft.ru}PayeeBankType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayeeAccountListElementType", propOrder = {
    "supplierBillID",
    "payeeAccountType",
    "payeeAccountNumber",
    "payeeSubAccountNumber",
    "bankType"
})
public class PayeeAccountListElementType {

    @XmlElement(name = "SupplierBillID", required = true)
    protected String supplierBillID;
    @XmlElement(name = "PayeeAccountType")
    protected String payeeAccountType;
    @XmlElement(name = "PayeeAccountNumber", required = true)
    protected String payeeAccountNumber;
    @XmlElement(name = "PayeeSubAccountNumber")
    protected String payeeSubAccountNumber;
    @XmlElement(name = "BankType", required = true)
    protected PayeeBankType bankType;

    /**
     * Gets the value of the supplierBillID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierBillID() {
        return supplierBillID;
    }

    /**
     * Sets the value of the supplierBillID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierBillID(String value) {
        this.supplierBillID = value;
    }

    /**
     * Gets the value of the payeeAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeAccountType() {
        return payeeAccountType;
    }

    /**
     * Sets the value of the payeeAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeAccountType(String value) {
        this.payeeAccountType = value;
    }

    /**
     * Gets the value of the payeeAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeAccountNumber() {
        return payeeAccountNumber;
    }

    /**
     * Sets the value of the payeeAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeAccountNumber(String value) {
        this.payeeAccountNumber = value;
    }

    /**
     * Gets the value of the payeeSubAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeSubAccountNumber() {
        return payeeSubAccountNumber;
    }

    /**
     * Sets the value of the payeeSubAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeSubAccountNumber(String value) {
        this.payeeSubAccountNumber = value;
    }

    /**
     * Gets the value of the bankType property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeBankType }
     *     
     */
    public PayeeBankType getBankType() {
        return bankType;
    }

    /**
     * Sets the value of the bankType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeBankType }
     *     
     */
    public void setBankType(PayeeBankType value) {
        this.bankType = value;
    }

}

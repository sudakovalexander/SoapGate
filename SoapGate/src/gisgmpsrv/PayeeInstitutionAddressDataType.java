
package gisgmpsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayeeInstitutionAddressDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeInstitutionAddressDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayeeInstitutionAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeInstitutionAddressName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PayeeInstitutionAddressComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressField" type="{http://support.diasoft.ru}PayeeInstitutionAddressFieldType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayeeInstitutionAddressDataType", propOrder = {
    "payeeInstitutionAddress",
    "payeeInstitutionAddressName",
    "payeeInstitutionAddressComment",
    "addressField"
})
public class PayeeInstitutionAddressDataType {

    @XmlElement(name = "PayeeInstitutionAddress")
    protected String payeeInstitutionAddress;
    @XmlElement(name = "PayeeInstitutionAddressName", required = true)
    protected String payeeInstitutionAddressName;
    @XmlElement(name = "PayeeInstitutionAddressComment")
    protected String payeeInstitutionAddressComment;
    @XmlElement(name = "AddressField")
    protected PayeeInstitutionAddressFieldType addressField;

    /**
     * Gets the value of the payeeInstitutionAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionAddress() {
        return payeeInstitutionAddress;
    }

    /**
     * Sets the value of the payeeInstitutionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionAddress(String value) {
        this.payeeInstitutionAddress = value;
    }

    /**
     * Gets the value of the payeeInstitutionAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionAddressName() {
        return payeeInstitutionAddressName;
    }

    /**
     * Sets the value of the payeeInstitutionAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionAddressName(String value) {
        this.payeeInstitutionAddressName = value;
    }

    /**
     * Gets the value of the payeeInstitutionAddressComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionAddressComment() {
        return payeeInstitutionAddressComment;
    }

    /**
     * Sets the value of the payeeInstitutionAddressComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionAddressComment(String value) {
        this.payeeInstitutionAddressComment = value;
    }

    /**
     * Gets the value of the addressField property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeInstitutionAddressFieldType }
     *     
     */
    public PayeeInstitutionAddressFieldType getAddressField() {
        return addressField;
    }

    /**
     * Sets the value of the addressField property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeInstitutionAddressFieldType }
     *     
     */
    public void setAddressField(PayeeInstitutionAddressFieldType value) {
        this.addressField = value;
    }

}


package gisgmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayeeAddressListElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeAddressListElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierBillID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PayeeAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeAddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeAddressComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeZipValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeCountryValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeRegionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeStateValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeTownValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeCityValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeStreetValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeHouseValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeBuildingValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeFlatValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayeeAddressListElementType", propOrder = {
    "supplierBillID",
    "payeeAddress",
    "payeeAddressName",
    "payeeAddressComment",
    "payeeZipValue",
    "payeeCountryValue",
    "payeeRegionValue",
    "payeeStateValue",
    "payeeTownValue",
    "payeeCityValue",
    "payeeStreetValue",
    "payeeHouseValue",
    "payeeBuildingValue",
    "payeeFlatValue"
})
public class PayeeAddressListElementType {

    @XmlElement(name = "SupplierBillID", required = true)
    protected String supplierBillID;
    @XmlElement(name = "PayeeAddress")
    protected String payeeAddress;
    @XmlElement(name = "PayeeAddressName")
    protected String payeeAddressName;
    @XmlElement(name = "PayeeAddressComment")
    protected String payeeAddressComment;
    @XmlElement(name = "PayeeZipValue")
    protected String payeeZipValue;
    @XmlElement(name = "PayeeCountryValue")
    protected String payeeCountryValue;
    @XmlElement(name = "PayeeRegionValue")
    protected String payeeRegionValue;
    @XmlElement(name = "PayeeStateValue")
    protected String payeeStateValue;
    @XmlElement(name = "PayeeTownValue")
    protected String payeeTownValue;
    @XmlElement(name = "PayeeCityValue")
    protected String payeeCityValue;
    @XmlElement(name = "PayeeStreetValue")
    protected String payeeStreetValue;
    @XmlElement(name = "PayeeHouseValue")
    protected String payeeHouseValue;
    @XmlElement(name = "PayeeBuildingValue")
    protected String payeeBuildingValue;
    @XmlElement(name = "PayeeFlatValue")
    protected String payeeFlatValue;

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
     * Gets the value of the payeeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeAddress() {
        return payeeAddress;
    }

    /**
     * Sets the value of the payeeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeAddress(String value) {
        this.payeeAddress = value;
    }

    /**
     * Gets the value of the payeeAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeAddressName() {
        return payeeAddressName;
    }

    /**
     * Sets the value of the payeeAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeAddressName(String value) {
        this.payeeAddressName = value;
    }

    /**
     * Gets the value of the payeeAddressComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeAddressComment() {
        return payeeAddressComment;
    }

    /**
     * Sets the value of the payeeAddressComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeAddressComment(String value) {
        this.payeeAddressComment = value;
    }

    /**
     * Gets the value of the payeeZipValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeZipValue() {
        return payeeZipValue;
    }

    /**
     * Sets the value of the payeeZipValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeZipValue(String value) {
        this.payeeZipValue = value;
    }

    /**
     * Gets the value of the payeeCountryValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeCountryValue() {
        return payeeCountryValue;
    }

    /**
     * Sets the value of the payeeCountryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeCountryValue(String value) {
        this.payeeCountryValue = value;
    }

    /**
     * Gets the value of the payeeRegionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeRegionValue() {
        return payeeRegionValue;
    }

    /**
     * Sets the value of the payeeRegionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeRegionValue(String value) {
        this.payeeRegionValue = value;
    }

    /**
     * Gets the value of the payeeStateValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeStateValue() {
        return payeeStateValue;
    }

    /**
     * Sets the value of the payeeStateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeStateValue(String value) {
        this.payeeStateValue = value;
    }

    /**
     * Gets the value of the payeeTownValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeTownValue() {
        return payeeTownValue;
    }

    /**
     * Sets the value of the payeeTownValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeTownValue(String value) {
        this.payeeTownValue = value;
    }

    /**
     * Gets the value of the payeeCityValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeCityValue() {
        return payeeCityValue;
    }

    /**
     * Sets the value of the payeeCityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeCityValue(String value) {
        this.payeeCityValue = value;
    }

    /**
     * Gets the value of the payeeStreetValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeStreetValue() {
        return payeeStreetValue;
    }

    /**
     * Sets the value of the payeeStreetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeStreetValue(String value) {
        this.payeeStreetValue = value;
    }

    /**
     * Gets the value of the payeeHouseValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeHouseValue() {
        return payeeHouseValue;
    }

    /**
     * Sets the value of the payeeHouseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeHouseValue(String value) {
        this.payeeHouseValue = value;
    }

    /**
     * Gets the value of the payeeBuildingValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeBuildingValue() {
        return payeeBuildingValue;
    }

    /**
     * Sets the value of the payeeBuildingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeBuildingValue(String value) {
        this.payeeBuildingValue = value;
    }

    /**
     * Gets the value of the payeeFlatValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeFlatValue() {
        return payeeFlatValue;
    }

    /**
     * Sets the value of the payeeFlatValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeFlatValue(String value) {
        this.payeeFlatValue = value;
    }

}

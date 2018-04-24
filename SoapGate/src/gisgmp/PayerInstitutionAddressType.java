
package gisgmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayerInstitutionAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayerInstitutionAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayerInstitutionAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerInstitutionAddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerInstitutionAddressComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerInstitutionZipValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerInstitutionCountryValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerInstitutionRegionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerInstitutionStateValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerInstitutionTownValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerInstitutionCityValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerInstitutionStreetValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerInstitutionHouseValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerInstitutionBuildingValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerInstitutionFlatValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerInstitutionAddressType", propOrder = {
    "payerInstitutionAddress",
    "payerInstitutionAddressName",
    "payerInstitutionAddressComment",
    "payerInstitutionZipValue",
    "payerInstitutionCountryValue",
    "payerInstitutionRegionValue",
    "payerInstitutionStateValue",
    "payerInstitutionTownValue",
    "payerInstitutionCityValue",
    "payerInstitutionStreetValue",
    "payerInstitutionHouseValue",
    "payerInstitutionBuildingValue",
    "payerInstitutionFlatValue"
})
public class PayerInstitutionAddressType {

    @XmlElement(name = "PayerInstitutionAddress")
    protected String payerInstitutionAddress;
    @XmlElement(name = "PayerInstitutionAddressName")
    protected String payerInstitutionAddressName;
    @XmlElement(name = "PayerInstitutionAddressComment")
    protected String payerInstitutionAddressComment;
    @XmlElement(name = "PayerInstitutionZipValue")
    protected String payerInstitutionZipValue;
    @XmlElement(name = "PayerInstitutionCountryValue")
    protected String payerInstitutionCountryValue;
    @XmlElement(name = "PayerInstitutionRegionValue")
    protected String payerInstitutionRegionValue;
    @XmlElement(name = "PayerInstitutionStateValue")
    protected String payerInstitutionStateValue;
    @XmlElement(name = "PayerInstitutionTownValue")
    protected String payerInstitutionTownValue;
    @XmlElement(name = "PayerInstitutionCityValue")
    protected String payerInstitutionCityValue;
    @XmlElement(name = "PayerInstitutionStreetValue")
    protected String payerInstitutionStreetValue;
    @XmlElement(name = "PayerInstitutionHouseValue")
    protected String payerInstitutionHouseValue;
    @XmlElement(name = "PayerInstitutionBuildingValue")
    protected String payerInstitutionBuildingValue;
    @XmlElement(name = "PayerInstitutionFlatValue")
    protected String payerInstitutionFlatValue;

    /**
     * Gets the value of the payerInstitutionAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInstitutionAddress() {
        return payerInstitutionAddress;
    }

    /**
     * Sets the value of the payerInstitutionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInstitutionAddress(String value) {
        this.payerInstitutionAddress = value;
    }

    /**
     * Gets the value of the payerInstitutionAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInstitutionAddressName() {
        return payerInstitutionAddressName;
    }

    /**
     * Sets the value of the payerInstitutionAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInstitutionAddressName(String value) {
        this.payerInstitutionAddressName = value;
    }

    /**
     * Gets the value of the payerInstitutionAddressComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInstitutionAddressComment() {
        return payerInstitutionAddressComment;
    }

    /**
     * Sets the value of the payerInstitutionAddressComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInstitutionAddressComment(String value) {
        this.payerInstitutionAddressComment = value;
    }

    /**
     * Gets the value of the payerInstitutionZipValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInstitutionZipValue() {
        return payerInstitutionZipValue;
    }

    /**
     * Sets the value of the payerInstitutionZipValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInstitutionZipValue(String value) {
        this.payerInstitutionZipValue = value;
    }

    /**
     * Gets the value of the payerInstitutionCountryValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInstitutionCountryValue() {
        return payerInstitutionCountryValue;
    }

    /**
     * Sets the value of the payerInstitutionCountryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInstitutionCountryValue(String value) {
        this.payerInstitutionCountryValue = value;
    }

    /**
     * Gets the value of the payerInstitutionRegionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInstitutionRegionValue() {
        return payerInstitutionRegionValue;
    }

    /**
     * Sets the value of the payerInstitutionRegionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInstitutionRegionValue(String value) {
        this.payerInstitutionRegionValue = value;
    }

    /**
     * Gets the value of the payerInstitutionStateValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInstitutionStateValue() {
        return payerInstitutionStateValue;
    }

    /**
     * Sets the value of the payerInstitutionStateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInstitutionStateValue(String value) {
        this.payerInstitutionStateValue = value;
    }

    /**
     * Gets the value of the payerInstitutionTownValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInstitutionTownValue() {
        return payerInstitutionTownValue;
    }

    /**
     * Sets the value of the payerInstitutionTownValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInstitutionTownValue(String value) {
        this.payerInstitutionTownValue = value;
    }

    /**
     * Gets the value of the payerInstitutionCityValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInstitutionCityValue() {
        return payerInstitutionCityValue;
    }

    /**
     * Sets the value of the payerInstitutionCityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInstitutionCityValue(String value) {
        this.payerInstitutionCityValue = value;
    }

    /**
     * Gets the value of the payerInstitutionStreetValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInstitutionStreetValue() {
        return payerInstitutionStreetValue;
    }

    /**
     * Sets the value of the payerInstitutionStreetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInstitutionStreetValue(String value) {
        this.payerInstitutionStreetValue = value;
    }

    /**
     * Gets the value of the payerInstitutionHouseValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInstitutionHouseValue() {
        return payerInstitutionHouseValue;
    }

    /**
     * Sets the value of the payerInstitutionHouseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInstitutionHouseValue(String value) {
        this.payerInstitutionHouseValue = value;
    }

    /**
     * Gets the value of the payerInstitutionBuildingValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInstitutionBuildingValue() {
        return payerInstitutionBuildingValue;
    }

    /**
     * Sets the value of the payerInstitutionBuildingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInstitutionBuildingValue(String value) {
        this.payerInstitutionBuildingValue = value;
    }

    /**
     * Gets the value of the payerInstitutionFlatValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerInstitutionFlatValue() {
        return payerInstitutionFlatValue;
    }

    /**
     * Sets the value of the payerInstitutionFlatValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerInstitutionFlatValue(String value) {
        this.payerInstitutionFlatValue = value;
    }

}

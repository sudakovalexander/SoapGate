
package gisgmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayeeInstitutionAddressFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeInstitutionAddressFieldType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayeeInstitutionZipValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeInstitutionCountryValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeInstitutionRegionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeInstitutionStateValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeInstitutionTownValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeInstitutionCityValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeInstitutionStreetValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeInstitutionHouseValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeInstitutionBuildingValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayeeInstitutionFlatValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayeeInstitutionAddressFieldType", propOrder = {
    "payeeInstitutionZipValue",
    "payeeInstitutionCountryValue",
    "payeeInstitutionRegionValue",
    "payeeInstitutionStateValue",
    "payeeInstitutionTownValue",
    "payeeInstitutionCityValue",
    "payeeInstitutionStreetValue",
    "payeeInstitutionHouseValue",
    "payeeInstitutionBuildingValue",
    "payeeInstitutionFlatValue"
})
public class PayeeInstitutionAddressFieldType {

    @XmlElement(name = "PayeeInstitutionZipValue")
    protected String payeeInstitutionZipValue;
    @XmlElement(name = "PayeeInstitutionCountryValue")
    protected String payeeInstitutionCountryValue;
    @XmlElement(name = "PayeeInstitutionRegionValue")
    protected String payeeInstitutionRegionValue;
    @XmlElement(name = "PayeeInstitutionStateValue")
    protected String payeeInstitutionStateValue;
    @XmlElement(name = "PayeeInstitutionTownValue")
    protected String payeeInstitutionTownValue;
    @XmlElement(name = "PayeeInstitutionCityValue")
    protected String payeeInstitutionCityValue;
    @XmlElement(name = "PayeeInstitutionStreetValue")
    protected String payeeInstitutionStreetValue;
    @XmlElement(name = "PayeeInstitutionHouseValue")
    protected String payeeInstitutionHouseValue;
    @XmlElement(name = "PayeeInstitutionBuildingValue")
    protected String payeeInstitutionBuildingValue;
    @XmlElement(name = "PayeeInstitutionFlatValue")
    protected String payeeInstitutionFlatValue;

    /**
     * Gets the value of the payeeInstitutionZipValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionZipValue() {
        return payeeInstitutionZipValue;
    }

    /**
     * Sets the value of the payeeInstitutionZipValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionZipValue(String value) {
        this.payeeInstitutionZipValue = value;
    }

    /**
     * Gets the value of the payeeInstitutionCountryValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionCountryValue() {
        return payeeInstitutionCountryValue;
    }

    /**
     * Sets the value of the payeeInstitutionCountryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionCountryValue(String value) {
        this.payeeInstitutionCountryValue = value;
    }

    /**
     * Gets the value of the payeeInstitutionRegionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionRegionValue() {
        return payeeInstitutionRegionValue;
    }

    /**
     * Sets the value of the payeeInstitutionRegionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionRegionValue(String value) {
        this.payeeInstitutionRegionValue = value;
    }

    /**
     * Gets the value of the payeeInstitutionStateValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionStateValue() {
        return payeeInstitutionStateValue;
    }

    /**
     * Sets the value of the payeeInstitutionStateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionStateValue(String value) {
        this.payeeInstitutionStateValue = value;
    }

    /**
     * Gets the value of the payeeInstitutionTownValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionTownValue() {
        return payeeInstitutionTownValue;
    }

    /**
     * Sets the value of the payeeInstitutionTownValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionTownValue(String value) {
        this.payeeInstitutionTownValue = value;
    }

    /**
     * Gets the value of the payeeInstitutionCityValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionCityValue() {
        return payeeInstitutionCityValue;
    }

    /**
     * Sets the value of the payeeInstitutionCityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionCityValue(String value) {
        this.payeeInstitutionCityValue = value;
    }

    /**
     * Gets the value of the payeeInstitutionStreetValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionStreetValue() {
        return payeeInstitutionStreetValue;
    }

    /**
     * Sets the value of the payeeInstitutionStreetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionStreetValue(String value) {
        this.payeeInstitutionStreetValue = value;
    }

    /**
     * Gets the value of the payeeInstitutionHouseValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionHouseValue() {
        return payeeInstitutionHouseValue;
    }

    /**
     * Sets the value of the payeeInstitutionHouseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionHouseValue(String value) {
        this.payeeInstitutionHouseValue = value;
    }

    /**
     * Gets the value of the payeeInstitutionBuildingValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionBuildingValue() {
        return payeeInstitutionBuildingValue;
    }

    /**
     * Sets the value of the payeeInstitutionBuildingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionBuildingValue(String value) {
        this.payeeInstitutionBuildingValue = value;
    }

    /**
     * Gets the value of the payeeInstitutionFlatValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeInstitutionFlatValue() {
        return payeeInstitutionFlatValue;
    }

    /**
     * Sets the value of the payeeInstitutionFlatValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeInstitutionFlatValue(String value) {
        this.payeeInstitutionFlatValue = value;
    }

}

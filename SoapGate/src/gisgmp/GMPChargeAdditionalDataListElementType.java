
package gisgmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GMPChargeAdditionalDataListElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMPChargeAdditionalDataListElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierBillID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LinkAddDataID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FieldValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMPChargeAdditionalDataListElementType", propOrder = {
    "supplierBillID",
    "linkAddDataID",
    "fieldName",
    "fieldValue"
})
public class GMPChargeAdditionalDataListElementType {

    @XmlElement(name = "SupplierBillID", required = true)
    protected String supplierBillID;
    @XmlElement(name = "LinkAddDataID")
    protected long linkAddDataID;
    @XmlElement(name = "FieldName", required = true)
    protected String fieldName;
    @XmlElement(name = "FieldValue", required = true)
    protected String fieldValue;

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
     * Gets the value of the linkAddDataID property.
     * 
     */
    public long getLinkAddDataID() {
        return linkAddDataID;
    }

    /**
     * Sets the value of the linkAddDataID property.
     * 
     */
    public void setLinkAddDataID(long value) {
        this.linkAddDataID = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the fieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * Sets the value of the fieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

}

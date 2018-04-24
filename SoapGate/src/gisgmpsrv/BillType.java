
package gisgmpsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierBillID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MainSupplierBillID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ChargeValidUntil" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SupplierOrgInfo" type="{http://support.diasoft.ru}OrganizationType"/&gt;
 *         &lt;element name="BillFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillType", propOrder = {
    "supplierBillID",
    "mainSupplierBillID",
    "version",
    "billDate",
    "chargeValidUntil",
    "supplierOrgInfo",
    "billFor",
    "totalAmount",
    "url"
})
public class BillType {

    @XmlElement(name = "SupplierBillID", required = true)
    protected String supplierBillID;
    @XmlElement(name = "MainSupplierBillID")
    protected String mainSupplierBillID;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "BillDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billDate;
    @XmlElement(name = "ChargeValidUntil")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chargeValidUntil;
    @XmlElement(name = "SupplierOrgInfo", required = true)
    protected OrganizationType supplierOrgInfo;
    @XmlElement(name = "BillFor")
    protected String billFor;
    @XmlElement(name = "TotalAmount")
    protected long totalAmount;
    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;

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
     * Gets the value of the mainSupplierBillID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainSupplierBillID() {
        return mainSupplierBillID;
    }

    /**
     * Sets the value of the mainSupplierBillID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainSupplierBillID(String value) {
        this.mainSupplierBillID = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the billDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillDate() {
        return billDate;
    }

    /**
     * Sets the value of the billDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillDate(XMLGregorianCalendar value) {
        this.billDate = value;
    }

    /**
     * Gets the value of the chargeValidUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChargeValidUntil() {
        return chargeValidUntil;
    }

    /**
     * Sets the value of the chargeValidUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChargeValidUntil(XMLGregorianCalendar value) {
        this.chargeValidUntil = value;
    }

    /**
     * Gets the value of the supplierOrgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationType }
     *     
     */
    public OrganizationType getSupplierOrgInfo() {
        return supplierOrgInfo;
    }

    /**
     * Sets the value of the supplierOrgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationType }
     *     
     */
    public void setSupplierOrgInfo(OrganizationType value) {
        this.supplierOrgInfo = value;
    }

    /**
     * Gets the value of the billFor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillFor() {
        return billFor;
    }

    /**
     * Sets the value of the billFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillFor(String value) {
        this.billFor = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     */
    public long getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     */
    public void setTotalAmount(long value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

}

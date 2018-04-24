
package giszhkh;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SP" type="{http://smev.gosuslugi.ru/rev120315}PaymentReceiverType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ActualDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" /&gt;
 *       &lt;attribute name="PkgType" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="FULL"/&gt;
 *             &lt;enumeration value="DELTA"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="DeltaFromDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="DeltaToDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sp"
})
@XmlRootElement(name = "PaymentRecieverPkg")
public class PaymentRecieverPkg {

    @XmlElement(name = "SP")
    protected List<PaymentReceiverType> sp;
    @XmlAttribute(name = "ActualDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualDate;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "PkgType", required = true)
    protected String pkgType;
    @XmlAttribute(name = "DeltaFromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deltaFromDate;
    @XmlAttribute(name = "DeltaToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deltaToDate;

    /**
     * Gets the value of the sp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReceiverType }
     * 
     * 
     */
    public List<PaymentReceiverType> getSP() {
        if (sp == null) {
            sp = new ArrayList<PaymentReceiverType>();
        }
        return this.sp;
    }

    /**
     * Gets the value of the actualDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDate() {
        return actualDate;
    }

    /**
     * Sets the value of the actualDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDate(XMLGregorianCalendar value) {
        this.actualDate = value;
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
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
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
     * Gets the value of the pkgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkgType() {
        return pkgType;
    }

    /**
     * Sets the value of the pkgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkgType(String value) {
        this.pkgType = value;
    }

    /**
     * Gets the value of the deltaFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeltaFromDate() {
        return deltaFromDate;
    }

    /**
     * Sets the value of the deltaFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeltaFromDate(XMLGregorianCalendar value) {
        this.deltaFromDate = value;
    }

    /**
     * Gets the value of the deltaToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeltaToDate() {
        return deltaToDate;
    }

    /**
     * Sets the value of the deltaToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeltaToDate(XMLGregorianCalendar value) {
        this.deltaToDate = value;
    }

}

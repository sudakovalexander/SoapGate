
package giszhkhsrv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="TransportID" type="{http://smev.gosuslugi.ru/rev120315}GUIDType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *           &lt;element ref="{http://smev.gosuslugi.ru/rev120315}ErrorMessage" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transportID",
    "updateDate",
    "errorMessage"
})
@XmlRootElement(name = "CommonResult")
public class CommonResult {

    @XmlElement(name = "TransportID", required = true)
    protected String transportID;
    @XmlElement(name = "UpdateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    @XmlElement(name = "ErrorMessage")
    protected List<ErrorMessage> errorMessage;

    /**
     * Gets the value of the transportID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportID() {
        return transportID;
    }

    /**
     * Sets the value of the transportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportID(String value) {
        this.transportID = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorMessage }
     * 
     * 
     */
    public List<ErrorMessage> getErrorMessage() {
        if (errorMessage == null) {
            errorMessage = new ArrayList<ErrorMessage>();
        }
        return this.errorMessage;
    }

}


package giszhkh;

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
 *       &lt;choice&gt;
 *         &lt;element name="Full" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ByDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "full",
    "byDate"
})
@XmlRootElement(name = "PaymentReceiversRequest")
public class PaymentReceiversRequest {

    @XmlElement(name = "Full")
    protected Boolean full;
    @XmlElement(name = "ByDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar byDate;

    /**
     * Gets the value of the full property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFull() {
        return full;
    }

    /**
     * Sets the value of the full property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFull(Boolean value) {
        this.full = value;
    }

    /**
     * Gets the value of the byDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getByDate() {
        return byDate;
    }

    /**
     * Sets the value of the byDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setByDate(XMLGregorianCalendar value) {
        this.byDate = value;
    }

}


package giszhkhsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DSCALLFAULT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSCALLFAULT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="faultcode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="faultmessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSCALLFAULT", namespace = "http://support.diasoft.ru", propOrder = {
    "faultcode",
    "faultmessage"
})
public class DSCALLFAULT {

    protected int faultcode;
    @XmlElement(required = true)
    protected String faultmessage;

    /**
     * Gets the value of the faultcode property.
     * 
     */
    public int getFaultcode() {
        return faultcode;
    }

    /**
     * Sets the value of the faultcode property.
     * 
     */
    public void setFaultcode(int value) {
        this.faultcode = value;
    }

    /**
     * Gets the value of the faultmessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultmessage() {
        return faultmessage;
    }

    /**
     * Sets the value of the faultmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultmessage(String value) {
        this.faultmessage = value;
    }

}

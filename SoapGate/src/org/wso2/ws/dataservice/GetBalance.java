
package org.wso2.ws.dataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="pan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="instcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "pan",
    "instcode"
})
@XmlRootElement(name = "getBalance")
public class GetBalance {

    @XmlElement(required = true, nillable = true)
    protected String pan;
    @XmlElement(required = true, nillable = true)
    protected String instcode;

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the instcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstcode() {
        return instcode;
    }

    /**
     * Sets the value of the instcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstcode(String value) {
        this.instcode = value;
    }

}

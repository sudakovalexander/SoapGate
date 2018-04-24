
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
 *         &lt;element name="basecurcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="curcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "basecurcode",
    "curcode"
})
@XmlRootElement(name = "getCurrencyRate")
public class GetCurrencyRate {

    @XmlElement(required = true, nillable = true)
    protected String basecurcode;
    @XmlElement(required = true, nillable = true)
    protected String curcode;

    /**
     * Gets the value of the basecurcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasecurcode() {
        return basecurcode;
    }

    /**
     * Sets the value of the basecurcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasecurcode(String value) {
        this.basecurcode = value;
    }

    /**
     * Gets the value of the curcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurcode() {
        return curcode;
    }

    /**
     * Sets the value of the curcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurcode(String value) {
        this.curcode = value;
    }

}

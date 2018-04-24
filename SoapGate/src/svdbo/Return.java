
package svdbo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for return complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="return"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACTIONCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BASECURCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CURCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BUYRATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SELLRATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="STARDATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ENDDATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "return", propOrder = {
    "actioncode",
    "basecurcode",
    "curcode",
    "buyrate",
    "sellrate",
    "stardate",
    "enddate"
})
public class Return {

    @XmlElement(name = "ACTIONCODE", required = true, nillable = true)
    protected String actioncode;
    @XmlElement(name = "BASECURCODE", required = true, nillable = true)
    protected String basecurcode;
    @XmlElement(name = "CURCODE", required = true, nillable = true)
    protected String curcode;
    @XmlElement(name = "BUYRATE", required = true, nillable = true)
    protected String buyrate;
    @XmlElement(name = "SELLRATE", required = true, nillable = true)
    protected String sellrate;
    @XmlElement(name = "STARDATE", required = true, nillable = true)
    protected String stardate;
    @XmlElement(name = "ENDDATE", required = true, nillable = true)
    protected String enddate;

    /**
     * Gets the value of the actioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIONCODE() {
        return actioncode;
    }

    /**
     * Sets the value of the actioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIONCODE(String value) {
        this.actioncode = value;
    }

    /**
     * Gets the value of the basecurcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBASECURCODE() {
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
    public void setBASECURCODE(String value) {
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
    public String getCURCODE() {
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
    public void setCURCODE(String value) {
        this.curcode = value;
    }

    /**
     * Gets the value of the buyrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUYRATE() {
        return buyrate;
    }

    /**
     * Sets the value of the buyrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUYRATE(String value) {
        this.buyrate = value;
    }

    /**
     * Gets the value of the sellrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSELLRATE() {
        return sellrate;
    }

    /**
     * Sets the value of the sellrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSELLRATE(String value) {
        this.sellrate = value;
    }

    /**
     * Gets the value of the stardate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTARDATE() {
        return stardate;
    }

    /**
     * Sets the value of the stardate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTARDATE(String value) {
        this.stardate = value;
    }

    /**
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDDATE() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDDATE(String value) {
        this.enddate = value;
    }

}

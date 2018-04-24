
package ctxdbo;

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
 *         &lt;element name="actioncode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basecurcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="curcode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buyrate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sellrate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stardate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="enddate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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

    @XmlElement(required = true, nillable = true)
    protected String actioncode;
    @XmlElement(required = true, nillable = true)
    protected String basecurcode;
    @XmlElement(required = true, nillable = true)
    protected String curcode;
    @XmlElement(required = true, nillable = true)
    protected String buyrate;
    @XmlElement(required = true, nillable = true)
    protected String sellrate;
    @XmlElement(required = true, nillable = true)
    protected String stardate;
    @XmlElement(required = true, nillable = true)
    protected String enddate;

    /**
     * Gets the value of the actioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActioncode() {
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
    public void setActioncode(String value) {
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

    /**
     * Gets the value of the buyrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyrate() {
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
    public void setBuyrate(String value) {
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
    public String getSellrate() {
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
    public void setSellrate(String value) {
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
    public String getStardate() {
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
    public void setStardate(String value) {
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
    public String getEnddate() {
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
    public void setEnddate(String value) {
        this.enddate = value;
    }

}


package lv.d8.cortexws.currency.valueobj.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAddCurrencyRateRqstInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAddCurrencyRateRqstInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://valueobj.currency.cortexws.d8.lv/xsd}BaseRqstInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basecurcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="crdproduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="effdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="efftime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exptime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAddCurrencyRateRqstInfo", propOrder = {
    "basecurcode",
    "buyrate",
    "crdproduct",
    "curcode",
    "effdate",
    "efftime",
    "expdate",
    "exptime",
    "instcode",
    "multiplier",
    "quote",
    "sellrate"
})
public class GetAddCurrencyRateRqstInfo
    extends BaseRqstInfo
{

    @XmlElementRef(name = "basecurcode", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> basecurcode;
    @XmlElementRef(name = "buyrate", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyrate;
    @XmlElementRef(name = "crdproduct", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crdproduct;
    @XmlElementRef(name = "curcode", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curcode;
    @XmlElementRef(name = "effdate", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> effdate;
    @XmlElementRef(name = "efftime", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> efftime;
    @XmlElementRef(name = "expdate", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> expdate;
    @XmlElementRef(name = "exptime", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exptime;
    @XmlElementRef(name = "instcode", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instcode;
    @XmlElementRef(name = "multiplier", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> multiplier;
    @XmlElementRef(name = "quote", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quote;
    @XmlElementRef(name = "sellrate", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sellrate;

    /**
     * Gets the value of the basecurcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBasecurcode() {
        return basecurcode;
    }

    /**
     * Sets the value of the basecurcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBasecurcode(JAXBElement<String> value) {
        this.basecurcode = value;
    }

    /**
     * Gets the value of the buyrate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyrate() {
        return buyrate;
    }

    /**
     * Sets the value of the buyrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyrate(JAXBElement<String> value) {
        this.buyrate = value;
    }

    /**
     * Gets the value of the crdproduct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCrdproduct() {
        return crdproduct;
    }

    /**
     * Sets the value of the crdproduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCrdproduct(JAXBElement<String> value) {
        this.crdproduct = value;
    }

    /**
     * Gets the value of the curcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurcode() {
        return curcode;
    }

    /**
     * Sets the value of the curcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurcode(JAXBElement<String> value) {
        this.curcode = value;
    }

    /**
     * Gets the value of the effdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEffdate() {
        return effdate;
    }

    /**
     * Sets the value of the effdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEffdate(JAXBElement<String> value) {
        this.effdate = value;
    }

    /**
     * Gets the value of the efftime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEfftime() {
        return efftime;
    }

    /**
     * Sets the value of the efftime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEfftime(JAXBElement<String> value) {
        this.efftime = value;
    }

    /**
     * Gets the value of the expdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpdate() {
        return expdate;
    }

    /**
     * Sets the value of the expdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpdate(JAXBElement<String> value) {
        this.expdate = value;
    }

    /**
     * Gets the value of the exptime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExptime() {
        return exptime;
    }

    /**
     * Sets the value of the exptime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExptime(JAXBElement<String> value) {
        this.exptime = value;
    }

    /**
     * Gets the value of the instcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstcode() {
        return instcode;
    }

    /**
     * Sets the value of the instcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstcode(JAXBElement<String> value) {
        this.instcode = value;
    }

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMultiplier(JAXBElement<String> value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the quote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuote() {
        return quote;
    }

    /**
     * Sets the value of the quote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuote(JAXBElement<String> value) {
        this.quote = value;
    }

    /**
     * Gets the value of the sellrate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSellrate() {
        return sellrate;
    }

    /**
     * Sets the value of the sellrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSellrate(JAXBElement<String> value) {
        this.sellrate = value;
    }

}

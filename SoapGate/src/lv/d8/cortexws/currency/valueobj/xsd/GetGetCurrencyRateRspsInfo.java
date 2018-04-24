
package lv.d8.cortexws.currency.valueobj.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGetCurrencyRateRspsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGetCurrencyRateRspsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://valueobj.currency.cortexws.d8.lv/xsd}BaseRspsInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basecurcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buyrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sellrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGetCurrencyRateRspsInfo", propOrder = {
    "basecurcode",
    "buyrate",
    "curcode",
    "enddate",
    "sellrate",
    "startdate"
})
public class GetGetCurrencyRateRspsInfo
    extends BaseRspsInfo
{

    @XmlElementRef(name = "basecurcode", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> basecurcode;
    @XmlElementRef(name = "buyrate", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyrate;
    @XmlElementRef(name = "curcode", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curcode;
    @XmlElementRef(name = "enddate", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enddate;
    @XmlElementRef(name = "sellrate", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sellrate;
    @XmlElementRef(name = "startdate", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startdate;

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
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnddate() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnddate(JAXBElement<String> value) {
        this.enddate = value;
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

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartdate() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartdate(JAXBElement<String> value) {
        this.startdate = value;
    }

}

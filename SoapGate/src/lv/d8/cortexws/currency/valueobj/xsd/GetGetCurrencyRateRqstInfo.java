
package lv.d8.cortexws.currency.valueobj.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGetCurrencyRateRqstInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGetCurrencyRateRqstInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://valueobj.currency.cortexws.d8.lv/xsd}BaseRqstInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basecurcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGetCurrencyRateRqstInfo", propOrder = {
    "basecurcode",
    "curcode",
    "date"
})
public class GetGetCurrencyRateRqstInfo
    extends BaseRqstInfo
{

    @XmlElementRef(name = "basecurcode", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> basecurcode;
    @XmlElementRef(name = "curcode", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curcode;
    @XmlElementRef(name = "date", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> date;

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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDate(JAXBElement<String> value) {
        this.date = value;
    }

}

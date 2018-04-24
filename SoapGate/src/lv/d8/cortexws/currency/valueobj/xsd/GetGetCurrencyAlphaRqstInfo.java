
package lv.d8.cortexws.currency.valueobj.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGetCurrencyAlphaRqstInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGetCurrencyAlphaRqstInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://valueobj.currency.cortexws.d8.lv/xsd}BaseRqstInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alphaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGetCurrencyAlphaRqstInfo", propOrder = {
    "alphaCode"
})
public class GetGetCurrencyAlphaRqstInfo
    extends BaseRqstInfo
{

    @XmlElementRef(name = "alphaCode", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alphaCode;

    /**
     * Gets the value of the alphaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlphaCode() {
        return alphaCode;
    }

    /**
     * Sets the value of the alphaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlphaCode(JAXBElement<String> value) {
        this.alphaCode = value;
    }

}

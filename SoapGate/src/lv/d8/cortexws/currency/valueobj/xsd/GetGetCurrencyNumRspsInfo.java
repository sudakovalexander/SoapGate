
package lv.d8.cortexws.currency.valueobj.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetGetCurrencyNumRspsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetGetCurrencyNumRspsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://valueobj.currency.cortexws.d8.lv/xsd}BaseRspsInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currency" type="{http://valueobj.currency.cortexws.d8.lv/xsd}Currency" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGetCurrencyNumRspsInfo", propOrder = {
    "currency"
})
public class GetGetCurrencyNumRspsInfo
    extends BaseRspsInfo
{

    @XmlElementRef(name = "currency", namespace = "http://valueobj.currency.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Currency> currency;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Currency }{@code >}
     *     
     */
    public JAXBElement<Currency> getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Currency }{@code >}
     *     
     */
    public void setCurrency(JAXBElement<Currency> value) {
        this.currency = value;
    }

}

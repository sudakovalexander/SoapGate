
package lv.d8.cortexws.card.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lv.d8.cortexws.card.valueobj.xsd.GetBalanceRspsInfo;


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
 *         &lt;element name="return" type="{http://valueobj.card.cortexws.d8.lv/xsd}GetBalanceRspsInfo" minOccurs="0"/&gt;
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
    "_return"
})
@XmlRootElement(name = "getBalanceResponse")
public class GetBalanceResponse {

    @XmlElementRef(name = "return", namespace = "http://service.card.cortexws.d8.lv", type = JAXBElement.class, required = false)
    protected JAXBElement<GetBalanceRspsInfo> _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetBalanceRspsInfo }{@code >}
     *     
     */
    public JAXBElement<GetBalanceRspsInfo> getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetBalanceRspsInfo }{@code >}
     *     
     */
    public void setReturn(JAXBElement<GetBalanceRspsInfo> value) {
        this._return = value;
    }

}

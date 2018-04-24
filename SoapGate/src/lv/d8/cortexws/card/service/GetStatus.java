
package lv.d8.cortexws.card.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lv.d8.cortexws.card.valueobj.xsd.GetStatusRqstInfo;


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
 *         &lt;element name="param0" type="{http://valueobj.card.cortexws.d8.lv/xsd}GetStatusRqstInfo" minOccurs="0"/&gt;
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
    "param0"
})
@XmlRootElement(name = "getStatus")
public class GetStatus {

    @XmlElementRef(name = "param0", namespace = "http://service.card.cortexws.d8.lv", type = JAXBElement.class, required = false)
    protected JAXBElement<GetStatusRqstInfo> param0;

    /**
     * Gets the value of the param0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetStatusRqstInfo }{@code >}
     *     
     */
    public JAXBElement<GetStatusRqstInfo> getParam0() {
        return param0;
    }

    /**
     * Sets the value of the param0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetStatusRqstInfo }{@code >}
     *     
     */
    public void setParam0(JAXBElement<GetStatusRqstInfo> value) {
        this.param0 = value;
    }

}

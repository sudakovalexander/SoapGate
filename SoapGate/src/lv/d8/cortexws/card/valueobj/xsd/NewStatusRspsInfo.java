
package lv.d8.cortexws.card.valueobj.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import lv.d8.cortexws.common.valueobj.xsd.CortexWSRspsInfo;


/**
 * <p>Java class for NewStatusRspsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewStatusRspsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://valueobj.common.cortexws.d8.lv/xsd}CortexWSRspsInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actioncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actionmessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewStatusRspsInfo", propOrder = {
    "action",
    "actioncode",
    "actionmessage",
    "pan"
})
public class NewStatusRspsInfo
    extends CortexWSRspsInfo
{

    @XmlElementRef(name = "action", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> action;
    @XmlElementRef(name = "actioncode", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actioncode;
    @XmlElementRef(name = "actionmessage", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actionmessage;
    @XmlElementRef(name = "pan", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pan;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAction(JAXBElement<String> value) {
        this.action = value;
    }

    /**
     * Gets the value of the actioncode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActioncode() {
        return actioncode;
    }

    /**
     * Sets the value of the actioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActioncode(JAXBElement<String> value) {
        this.actioncode = value;
    }

    /**
     * Gets the value of the actionmessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActionmessage() {
        return actionmessage;
    }

    /**
     * Sets the value of the actionmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActionmessage(JAXBElement<String> value) {
        this.actionmessage = value;
    }

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPan(JAXBElement<String> value) {
        this.pan = value;
    }

}

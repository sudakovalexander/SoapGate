
package payment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRD2CRDPaymentRspsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRD2CRDPaymentRspsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actioncode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="rejMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rspcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tlogid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRD2CRDPaymentRspsInfo", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", propOrder = {
    "actioncode",
    "rejMsg",
    "rspcode",
    "tlogid"
})
public class CRD2CRDPaymentRspsInfo {

    protected Object actioncode;
    @XmlElementRef(name = "rejMsg", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rejMsg;
    @XmlElementRef(name = "rspcode", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rspcode;
    @XmlElementRef(name = "tlogid", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> tlogid;

    /**
     * Gets the value of the actioncode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getActioncode() {
        return actioncode;
    }

    /**
     * Sets the value of the actioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setActioncode(Object value) {
        this.actioncode = value;
    }

    /**
     * Gets the value of the rejMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRejMsg() {
        return rejMsg;
    }

    /**
     * Sets the value of the rejMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRejMsg(JAXBElement<String> value) {
        this.rejMsg = value;
    }

    /**
     * Gets the value of the rspcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRspcode() {
        return rspcode;
    }

    /**
     * Sets the value of the rspcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRspcode(JAXBElement<String> value) {
        this.rspcode = value;
    }

    /**
     * Gets the value of the tlogid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTlogid() {
        return tlogid;
    }

    /**
     * Sets the value of the tlogid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTlogid(JAXBElement<Long> value) {
        this.tlogid = value;
    }

}


package lv.d8.cortexws.card.valueobj.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import lv.d8.cortexws.common.valueobj.xsd.CortexWSRqstInfo;


/**
 * <p>Java class for NewStatusRqstInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewStatusRqstInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://valueobj.common.cortexws.d8.lv/xsd}CortexWSRqstInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newstatcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seqno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="whoset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="whyset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewStatusRqstInfo", propOrder = {
    "action",
    "instcode",
    "newstatcode",
    "pan",
    "seqno",
    "whoset",
    "whyset"
})
public class NewStatusRqstInfo
    extends CortexWSRqstInfo
{

    @XmlElementRef(name = "action", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> action;
    @XmlElementRef(name = "instcode", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instcode;
    @XmlElementRef(name = "newstatcode", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newstatcode;
    @XmlElementRef(name = "pan", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pan;
    @XmlElementRef(name = "seqno", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seqno;
    @XmlElementRef(name = "whoset", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> whoset;
    @XmlElementRef(name = "whyset", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> whyset;

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
     * Gets the value of the newstatcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewstatcode() {
        return newstatcode;
    }

    /**
     * Sets the value of the newstatcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewstatcode(JAXBElement<String> value) {
        this.newstatcode = value;
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

    /**
     * Gets the value of the seqno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeqno() {
        return seqno;
    }

    /**
     * Sets the value of the seqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeqno(JAXBElement<String> value) {
        this.seqno = value;
    }

    /**
     * Gets the value of the whoset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWhoset() {
        return whoset;
    }

    /**
     * Sets the value of the whoset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWhoset(JAXBElement<String> value) {
        this.whoset = value;
    }

    /**
     * Gets the value of the whyset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWhyset() {
        return whyset;
    }

    /**
     * Sets the value of the whyset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWhyset(JAXBElement<String> value) {
        this.whyset = value;
    }

}

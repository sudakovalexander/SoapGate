
package lv.d8.cortexws.card.valueobj.xsd;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import lv.d8.cortexws.common.valueobj.xsd.CortexWSRspsInfo;


/**
 * <p>Java class for GetBalanceRspsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBalanceRspsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://valueobj.common.cortexws.d8.lv/xsd}CortexWSRspsInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actioncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actionmessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="avlbal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="blkamt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="currcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "GetBalanceRspsInfo", propOrder = {
    "accno",
    "action",
    "actioncode",
    "actionmessage",
    "avlbal",
    "blkamt",
    "currcode",
    "pan"
})
public class GetBalanceRspsInfo
    extends CortexWSRspsInfo
{

    @XmlElementRef(name = "accno", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accno;
    @XmlElementRef(name = "action", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> action;
    @XmlElementRef(name = "actioncode", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actioncode;
    @XmlElementRef(name = "actionmessage", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actionmessage;
    @XmlElementRef(name = "avlbal", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> avlbal;
    @XmlElementRef(name = "blkamt", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> blkamt;
    @XmlElementRef(name = "currcode", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currcode;
    @XmlElementRef(name = "pan", namespace = "http://valueobj.card.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pan;

    /**
     * Gets the value of the accno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccno() {
        return accno;
    }

    /**
     * Sets the value of the accno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccno(JAXBElement<String> value) {
        this.accno = value;
    }

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
     * Gets the value of the avlbal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAvlbal() {
        return avlbal;
    }

    /**
     * Sets the value of the avlbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAvlbal(JAXBElement<BigDecimal> value) {
        this.avlbal = value;
    }

    /**
     * Gets the value of the blkamt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBlkamt() {
        return blkamt;
    }

    /**
     * Sets the value of the blkamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBlkamt(JAXBElement<BigDecimal> value) {
        this.blkamt = value;
    }

    /**
     * Gets the value of the currcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrcode() {
        return currcode;
    }

    /**
     * Sets the value of the currcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrcode(JAXBElement<String> value) {
        this.currcode = value;
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

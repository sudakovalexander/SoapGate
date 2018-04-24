
package payment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CRD2CRDPaymentReqstInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRD2CRDPaymentReqstInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amttxn" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cardExpiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clearRecipientPan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clearSenderPan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cryptedRecipientPan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cryptedSenderPan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curtxn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayRecipientPan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displaySenderPan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="termCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRD2CRDPaymentReqstInfo", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", propOrder = {
    "amttxn",
    "cardExpiry",
    "clearRecipientPan",
    "clearSenderPan",
    "cryptedRecipientPan",
    "cryptedSenderPan",
    "curtxn",
    "dateLocal",
    "displayRecipientPan",
    "displaySenderPan",
    "termCode",
    "timeLocal"
})
public class CRD2CRDPaymentReqstInfo {

    @XmlElementRef(name = "amttxn", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> amttxn;
    @XmlElementRef(name = "cardExpiry", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardExpiry;
    @XmlElementRef(name = "clearRecipientPan", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clearRecipientPan;
    @XmlElementRef(name = "clearSenderPan", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clearSenderPan;
    @XmlElementRef(name = "cryptedRecipientPan", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cryptedRecipientPan;
    @XmlElementRef(name = "cryptedSenderPan", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cryptedSenderPan;
    @XmlElementRef(name = "curtxn", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curtxn;
    @XmlElementRef(name = "dateLocal", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateLocal;
    @XmlElementRef(name = "displayRecipientPan", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayRecipientPan;
    @XmlElementRef(name = "displaySenderPan", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displaySenderPan;
    @XmlElementRef(name = "termCode", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> termCode;
    @XmlElementRef(name = "timeLocal", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeLocal;

    /**
     * Gets the value of the amttxn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getAmttxn() {
        return amttxn;
    }

    /**
     * Sets the value of the amttxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setAmttxn(JAXBElement<Double> value) {
        this.amttxn = value;
    }

    /**
     * Gets the value of the cardExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardExpiry() {
        return cardExpiry;
    }

    /**
     * Sets the value of the cardExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardExpiry(JAXBElement<String> value) {
        this.cardExpiry = value;
    }

    /**
     * Gets the value of the clearRecipientPan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClearRecipientPan() {
        return clearRecipientPan;
    }

    /**
     * Sets the value of the clearRecipientPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClearRecipientPan(JAXBElement<String> value) {
        this.clearRecipientPan = value;
    }

    /**
     * Gets the value of the clearSenderPan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClearSenderPan() {
        return clearSenderPan;
    }

    /**
     * Sets the value of the clearSenderPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClearSenderPan(JAXBElement<String> value) {
        this.clearSenderPan = value;
    }

    /**
     * Gets the value of the cryptedRecipientPan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCryptedRecipientPan() {
        return cryptedRecipientPan;
    }

    /**
     * Sets the value of the cryptedRecipientPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCryptedRecipientPan(JAXBElement<String> value) {
        this.cryptedRecipientPan = value;
    }

    /**
     * Gets the value of the cryptedSenderPan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCryptedSenderPan() {
        return cryptedSenderPan;
    }

    /**
     * Sets the value of the cryptedSenderPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCryptedSenderPan(JAXBElement<String> value) {
        this.cryptedSenderPan = value;
    }

    /**
     * Gets the value of the curtxn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurtxn() {
        return curtxn;
    }

    /**
     * Sets the value of the curtxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurtxn(JAXBElement<String> value) {
        this.curtxn = value;
    }

    /**
     * Gets the value of the dateLocal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateLocal() {
        return dateLocal;
    }

    /**
     * Sets the value of the dateLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateLocal(JAXBElement<String> value) {
        this.dateLocal = value;
    }

    /**
     * Gets the value of the displayRecipientPan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayRecipientPan() {
        return displayRecipientPan;
    }

    /**
     * Sets the value of the displayRecipientPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayRecipientPan(JAXBElement<String> value) {
        this.displayRecipientPan = value;
    }

    /**
     * Gets the value of the displaySenderPan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplaySenderPan() {
        return displaySenderPan;
    }

    /**
     * Sets the value of the displaySenderPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplaySenderPan(JAXBElement<String> value) {
        this.displaySenderPan = value;
    }

    /**
     * Gets the value of the termCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTermCode() {
        return termCode;
    }

    /**
     * Sets the value of the termCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTermCode(JAXBElement<String> value) {
        this.termCode = value;
    }

    /**
     * Gets the value of the timeLocal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeLocal() {
        return timeLocal;
    }

    /**
     * Sets the value of the timeLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeLocal(JAXBElement<String> value) {
        this.timeLocal = value;
    }

}


package payment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MakePaymentReqstInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MakePaymentReqstInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adddata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amttxn" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cardExpiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curtxn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mrchNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seqno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="termCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MakePaymentReqstInfo", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", propOrder = {
    "adddata",
    "amttxn",
    "cardExpiry",
    "curtxn",
    "dateLocal",
    "fromAcc",
    "instcode",
    "mrchNo",
    "pan",
    "rrn",
    "seqno",
    "termCode",
    "timeLocal",
    "toAcc"
})
public class MakePaymentReqstInfo {

    @XmlElementRef(name = "adddata", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adddata;
    @XmlElementRef(name = "amttxn", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> amttxn;
    @XmlElementRef(name = "cardExpiry", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardExpiry;
    @XmlElementRef(name = "curtxn", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curtxn;
    @XmlElementRef(name = "dateLocal", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateLocal;
    @XmlElementRef(name = "fromAcc", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fromAcc;
    @XmlElementRef(name = "instcode", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instcode;
    @XmlElementRef(name = "mrchNo", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mrchNo;
    @XmlElementRef(name = "pan", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pan;
    @XmlElementRef(name = "rrn", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rrn;
    @XmlElementRef(name = "seqno", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seqno;
    @XmlElementRef(name = "termCode", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> termCode;
    @XmlElementRef(name = "timeLocal", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeLocal;
    @XmlElementRef(name = "toAcc", namespace = "http://valueobj.transaction.cortexws.d8.lv/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> toAcc;

    /**
     * Gets the value of the adddata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdddata() {
        return adddata;
    }

    /**
     * Sets the value of the adddata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdddata(JAXBElement<String> value) {
        this.adddata = value;
    }

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
     * Gets the value of the fromAcc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFromAcc() {
        return fromAcc;
    }

    /**
     * Sets the value of the fromAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFromAcc(JAXBElement<String> value) {
        this.fromAcc = value;
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
     * Gets the value of the mrchNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMrchNo() {
        return mrchNo;
    }

    /**
     * Sets the value of the mrchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMrchNo(JAXBElement<String> value) {
        this.mrchNo = value;
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

    public JAXBElement<String> getRrn() {
        return rrn;
    }

    public void setRrn(JAXBElement<String> value) {
        this.rrn = value;
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

    /**
     * Gets the value of the toAcc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToAcc() {
        return toAcc;
    }

    /**
     * Sets the value of the toAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToAcc(JAXBElement<String> value) {
        this.toAcc = value;
    }

}

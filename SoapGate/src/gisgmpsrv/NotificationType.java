
package gisgmpsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LinkID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="NTFID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NTFMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NTFAdmMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationType", propOrder = {
    "linkID",
    "ntfid",
    "ntfMessage",
    "ntfAdmMessage"
})
public class NotificationType {

    @XmlElement(name = "LinkID")
    protected long linkID;
    @XmlElement(name = "NTFID")
    protected String ntfid;
    @XmlElement(name = "NTFMessage")
    protected String ntfMessage;
    @XmlElement(name = "NTFAdmMessage")
    protected String ntfAdmMessage;

    /**
     * Gets the value of the linkID property.
     * 
     */
    public long getLinkID() {
        return linkID;
    }

    /**
     * Sets the value of the linkID property.
     * 
     */
    public void setLinkID(long value) {
        this.linkID = value;
    }

    /**
     * Gets the value of the ntfid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTFID() {
        return ntfid;
    }

    /**
     * Sets the value of the ntfid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTFID(String value) {
        this.ntfid = value;
    }

    /**
     * Gets the value of the ntfMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTFMessage() {
        return ntfMessage;
    }

    /**
     * Sets the value of the ntfMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTFMessage(String value) {
        this.ntfMessage = value;
    }

    /**
     * Gets the value of the ntfAdmMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTFAdmMessage() {
        return ntfAdmMessage;
    }

    /**
     * Sets the value of the ntfAdmMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTFAdmMessage(String value) {
        this.ntfAdmMessage = value;
    }

}

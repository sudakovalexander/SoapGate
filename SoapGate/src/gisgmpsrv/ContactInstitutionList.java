
package gisgmpsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactInstitutionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInstitutionList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactKind" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContactValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInstitutionList", propOrder = {
    "contactKind",
    "contactValue",
    "comment"
})
public class ContactInstitutionList {

    @XmlElement(name = "ContactKind", required = true)
    protected String contactKind;
    @XmlElement(name = "ContactValue", required = true)
    protected String contactValue;
    @XmlElement(name = "Comment")
    protected String comment;

    /**
     * Gets the value of the contactKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactKind() {
        return contactKind;
    }

    /**
     * Sets the value of the contactKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactKind(String value) {
        this.contactKind = value;
    }

    /**
     * Gets the value of the contactValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactValue() {
        return contactValue;
    }

    /**
     * Sets the value of the contactValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactValue(String value) {
        this.contactValue = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}

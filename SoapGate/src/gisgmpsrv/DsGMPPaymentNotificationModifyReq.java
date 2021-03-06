
package gisgmpsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ParentNotificationID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FinalPayment" type="{http://support.diasoft.ru}PaymentInfoTypeType"/&gt;
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
    "parentNotificationID",
    "finalPayment"
})
@XmlRootElement(name = "dsGMPPaymentNotificationModifyReq")
public class DsGMPPaymentNotificationModifyReq {

    @XmlElement(name = "ParentNotificationID")
    protected Long parentNotificationID;
    @XmlElement(name = "FinalPayment", required = true)
    protected PaymentInfoTypeType finalPayment;

    /**
     * Gets the value of the parentNotificationID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentNotificationID() {
        return parentNotificationID;
    }

    /**
     * Sets the value of the parentNotificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentNotificationID(Long value) {
        this.parentNotificationID = value;
    }

    /**
     * Gets the value of the finalPayment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfoTypeType }
     *     
     */
    public PaymentInfoTypeType getFinalPayment() {
        return finalPayment;
    }

    /**
     * Sets the value of the finalPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoTypeType }
     *     
     */
    public void setFinalPayment(PaymentInfoTypeType value) {
        this.finalPayment = value;
    }

}


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
 *         &lt;element name="NotificationID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "notificationID"
})
@XmlRootElement(name = "dsGMPPaymentNotificationInsertAsyncGetByIDReq")
public class DsGMPPaymentNotificationInsertAsyncGetByIDReq {

    @XmlElement(name = "NotificationID")
    protected long notificationID;

    /**
     * Gets the value of the notificationID property.
     * 
     */
    public long getNotificationID() {
        return notificationID;
    }

    /**
     * Sets the value of the notificationID property.
     * 
     */
    public void setNotificationID(long value) {
        this.notificationID = value;
    }

}

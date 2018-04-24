
package giszhkh;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="payment-organization-guid" type="{http://smev.gosuslugi.ru/rev120315}GUIDType"/&gt;
 *         &lt;element name="NotificationOfOrderExecutionCancellation" type="{http://smev.gosuslugi.ru/rev120315}NotificationOfOrderExecutionCancellationType" maxOccurs="1000"/&gt;
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
    "paymentOrganizationGuid",
    "notificationOfOrderExecutionCancellation"
})
@XmlRootElement(name = "importNotificationsOfOrderExecutionCancellation")
public class ImportNotificationsOfOrderExecutionCancellation {

    @XmlElement(name = "payment-organization-guid", required = true)
    protected String paymentOrganizationGuid;
    @XmlElement(name = "NotificationOfOrderExecutionCancellation", required = true)
    protected List<NotificationOfOrderExecutionCancellationType> notificationOfOrderExecutionCancellation;

    /**
     * Gets the value of the paymentOrganizationGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrganizationGuid() {
        return paymentOrganizationGuid;
    }

    /**
     * Sets the value of the paymentOrganizationGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrganizationGuid(String value) {
        this.paymentOrganizationGuid = value;
    }

    /**
     * Gets the value of the notificationOfOrderExecutionCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationOfOrderExecutionCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationOfOrderExecutionCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationOfOrderExecutionCancellationType }
     * 
     * 
     */
    public List<NotificationOfOrderExecutionCancellationType> getNotificationOfOrderExecutionCancellation() {
        if (notificationOfOrderExecutionCancellation == null) {
            notificationOfOrderExecutionCancellation = new ArrayList<NotificationOfOrderExecutionCancellationType>();
        }
        return this.notificationOfOrderExecutionCancellation;
    }

}

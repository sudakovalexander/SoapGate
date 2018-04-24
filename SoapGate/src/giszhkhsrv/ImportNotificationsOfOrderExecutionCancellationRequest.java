
package giszhkhsrv;

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
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Message"/&gt;
 *         &lt;element name="MessageData" type="{http://smev.gosuslugi.ru/rev120315}importNotificationsOfOrderExecutionCancellationType"/&gt;
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
    "message",
    "messageData"
})
@XmlRootElement(name = "importNotificationsOfOrderExecutionCancellationRequest")
public class ImportNotificationsOfOrderExecutionCancellationRequest {

    @XmlElement(name = "Message", required = true)
    protected MessageType message;
    @XmlElement(name = "MessageData", required = true)
    protected ImportNotificationsOfOrderExecutionCancellationType messageData;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setMessage(MessageType value) {
        this.message = value;
    }

    /**
     * Gets the value of the messageData property.
     * 
     * @return
     *     possible object is
     *     {@link ImportNotificationsOfOrderExecutionCancellationType }
     *     
     */
    public ImportNotificationsOfOrderExecutionCancellationType getMessageData() {
        return messageData;
    }

    /**
     * Sets the value of the messageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportNotificationsOfOrderExecutionCancellationType }
     *     
     */
    public void setMessageData(ImportNotificationsOfOrderExecutionCancellationType value) {
        this.messageData = value;
    }

}

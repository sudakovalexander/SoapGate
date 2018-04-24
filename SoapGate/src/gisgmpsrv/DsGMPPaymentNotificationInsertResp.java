
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
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ErrorData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResultData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "notificationID",
    "requestID",
    "errorCode",
    "errorDescription",
    "errorData",
    "resultData"
})
@XmlRootElement(name = "dsGMPPaymentNotificationInsertResp")
public class DsGMPPaymentNotificationInsertResp {

    @XmlElement(name = "NotificationID")
    protected long notificationID;
    @XmlElement(name = "RequestID", required = true)
    protected String requestID;
    @XmlElement(name = "ErrorCode", required = true)
    protected String errorCode;
    @XmlElement(name = "ErrorDescription", required = true)
    protected String errorDescription;
    @XmlElement(name = "ErrorData", required = true)
    protected String errorData;
    @XmlElement(name = "ResultData")
    protected String resultData;

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

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the errorData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorData() {
        return errorData;
    }

    /**
     * Sets the value of the errorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorData(String value) {
        this.errorData = value;
    }

    /**
     * Gets the value of the resultData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultData() {
        return resultData;
    }

    /**
     * Sets the value of the resultData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultData(String value) {
        this.resultData = value;
    }

}

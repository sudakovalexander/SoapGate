
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
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="SystemFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DepartmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "priority",
    "systemFrom",
    "departmentID",
    "finalPayment"
})
@XmlRootElement(name = "dsGMPPaymentNotificationInsertAsyncReq")
public class DsGMPPaymentNotificationInsertAsyncReq {

    @XmlElement(name = "Priority")
    protected long priority;
    @XmlElement(name = "SystemFrom", required = true)
    protected String systemFrom;
    @XmlElement(name = "DepartmentID")
    protected String departmentID;
    @XmlElement(name = "FinalPayment", required = true)
    protected PaymentInfoTypeType finalPayment;

    /**
     * Gets the value of the priority property.
     * 
     */
    public long getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(long value) {
        this.priority = value;
    }

    /**
     * Gets the value of the systemFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemFrom() {
        return systemFrom;
    }

    /**
     * Sets the value of the systemFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemFrom(String value) {
        this.systemFrom = value;
    }

    /**
     * Gets the value of the departmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentID() {
        return departmentID;
    }

    /**
     * Sets the value of the departmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentID(String value) {
        this.departmentID = value;
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


package giszhkh;

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
 *         &lt;element name="LoggerParams" type="{http://support.ftgiszhkhreqprocws.V01.diasoft.ru}dsLoggerParams" minOccurs="0"/&gt;
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}PaymentDocumentDetailsRequest" minOccurs="0"/&gt;
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
    "loggerParams",
    "paymentDocumentDetailsRequest"
})
@XmlRootElement(name = "dsPaymentDocumentDetailsRequest", namespace = "http://support.diasoft.ru")
public class DsPaymentDocumentDetailsRequest {

    @XmlElement(name = "LoggerParams", namespace = "http://support.diasoft.ru")
    protected DsLoggerParams loggerParams;
    @XmlElement(name = "PaymentDocumentDetailsRequest")
    protected PaymentDocumentDetailsRequest paymentDocumentDetailsRequest;

    /**
     * Gets the value of the loggerParams property.
     * 
     * @return
     *     possible object is
     *     {@link DsLoggerParams }
     *     
     */
    public DsLoggerParams getLoggerParams() {
        return loggerParams;
    }

    /**
     * Sets the value of the loggerParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsLoggerParams }
     *     
     */
    public void setLoggerParams(DsLoggerParams value) {
        this.loggerParams = value;
    }

    /**
     * Gets the value of the paymentDocumentDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDocumentDetailsRequest }
     *     
     */
    public PaymentDocumentDetailsRequest getPaymentDocumentDetailsRequest() {
        return paymentDocumentDetailsRequest;
    }

    /**
     * Sets the value of the paymentDocumentDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDocumentDetailsRequest }
     *     
     */
    public void setPaymentDocumentDetailsRequest(PaymentDocumentDetailsRequest value) {
        this.paymentDocumentDetailsRequest = value;
    }

}

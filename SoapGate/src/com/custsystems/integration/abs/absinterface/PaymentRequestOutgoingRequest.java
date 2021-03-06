
package com.custsystems.integration.abs.absinterface;

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
 *         &lt;element name="request" type="{http://custsystems.com/integration/abs}PaymentRequestOutgoingRequest"/&gt;
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
    "request"
})
@XmlRootElement(name = "paymentRequestOutgoingRequest")
public class PaymentRequestOutgoingRequest {

    @XmlElement(required = true, nillable = true)
    protected com.custsystems.integration.abs.PaymentRequestOutgoingRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link com.custsystems.integration.abs.PaymentRequestOutgoingRequest }
     *     
     */
    public com.custsystems.integration.abs.PaymentRequestOutgoingRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.custsystems.integration.abs.PaymentRequestOutgoingRequest }
     *     
     */
    public void setRequest(com.custsystems.integration.abs.PaymentRequestOutgoingRequest value) {
        this.request = value;
    }

}

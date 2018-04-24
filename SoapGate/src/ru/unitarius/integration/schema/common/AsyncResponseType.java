
package ru.unitarius.integration.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsyncResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsyncResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://unitarius.ru/integration/schema/common}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ErrorList" type="{http://unitarius.ru/integration/schema/common}AsyncResponseErrorType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDetails" type="{http://unitarius.ru/integration/schema/common}AbstractResponseDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncResponseType", propOrder = {
    "requestID",
    "responseID",
    "responseStatus",
    "errorList",
    "responseDetails"
})
public class AsyncResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "RequestID", required = true)
    protected String requestID;
    @XmlElement(name = "ResponseID")
    protected String responseID;
    @XmlElement(name = "ResponseStatus", required = true)
    protected String responseStatus;
    @XmlElement(name = "ErrorList")
    protected AsyncResponseErrorType errorList;
    @XmlElement(name = "ResponseDetails")
    protected AbstractResponseDetailsType responseDetails;

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
     * Gets the value of the responseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseID() {
        return responseID;
    }

    /**
     * Sets the value of the responseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseID(String value) {
        this.responseID = value;
    }

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseStatus(String value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the errorList property.
     * 
     * @return
     *     possible object is
     *     {@link AsyncResponseErrorType }
     *     
     */
    public AsyncResponseErrorType getErrorList() {
        return errorList;
    }

    /**
     * Sets the value of the errorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncResponseErrorType }
     *     
     */
    public void setErrorList(AsyncResponseErrorType value) {
        this.errorList = value;
    }

    /**
     * Gets the value of the responseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractResponseDetailsType }
     *     
     */
    public AbstractResponseDetailsType getResponseDetails() {
        return responseDetails;
    }

    /**
     * Sets the value of the responseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractResponseDetailsType }
     *     
     */
    public void setResponseDetails(AbstractResponseDetailsType value) {
        this.responseDetails = value;
    }

}

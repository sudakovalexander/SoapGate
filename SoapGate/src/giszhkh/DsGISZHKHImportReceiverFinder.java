
package giszhkh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dsGISZHKHImportReceiverFinder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsGISZHKHImportReceiverFinder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RequestTypeByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RequestTypeFull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MessageGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ResultCode" type="{http://support.ftgiszhkhreqprocws.V01.diasoft.ru}dsGISZHKHReceiverResultCodeType" minOccurs="0"/&gt;
 *         &lt;element name="LastError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dsGISZHKHImportReceiverFinder", namespace = "http://support.ftgiszhkhreqprocws.V01.diasoft.ru", propOrder = {
    "requestDate",
    "requestTypeByDate",
    "requestTypeFull",
    "messageGUID",
    "responseDate",
    "resultCode",
    "lastError"
})
public class DsGISZHKHImportReceiverFinder {

    @XmlElement(name = "RequestDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    @XmlElement(name = "RequestTypeByDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestTypeByDate;
    @XmlElement(name = "RequestTypeFull")
    protected Boolean requestTypeFull;
    @XmlElement(name = "MessageGUID")
    protected String messageGUID;
    @XmlElement(name = "ResponseDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseDate;
    @XmlElement(name = "ResultCode")
    @XmlSchemaType(name = "string")
    protected DsGISZHKHReceiverResultCodeType resultCode;
    @XmlElement(name = "LastError")
    protected String lastError;

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the requestTypeByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestTypeByDate() {
        return requestTypeByDate;
    }

    /**
     * Sets the value of the requestTypeByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestTypeByDate(XMLGregorianCalendar value) {
        this.requestTypeByDate = value;
    }

    /**
     * Gets the value of the requestTypeFull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestTypeFull() {
        return requestTypeFull;
    }

    /**
     * Sets the value of the requestTypeFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestTypeFull(Boolean value) {
        this.requestTypeFull = value;
    }

    /**
     * Gets the value of the messageGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageGUID() {
        return messageGUID;
    }

    /**
     * Sets the value of the messageGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageGUID(String value) {
        this.messageGUID = value;
    }

    /**
     * Gets the value of the responseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDate() {
        return responseDate;
    }

    /**
     * Sets the value of the responseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseDate(XMLGregorianCalendar value) {
        this.responseDate = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link DsGISZHKHReceiverResultCodeType }
     *     
     */
    public DsGISZHKHReceiverResultCodeType getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsGISZHKHReceiverResultCodeType }
     *     
     */
    public void setResultCode(DsGISZHKHReceiverResultCodeType value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the lastError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastError() {
        return lastError;
    }

    /**
     * Sets the value of the lastError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastError(String value) {
        this.lastError = value;
    }

}


package giszhkh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dsGISZHKHSinglePaymentNotificationGetByIDResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsGISZHKHSinglePaymentNotificationGetByIDResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://support.ftgiszhkhreqprocws.V01.diasoft.ru}dsReturnCodes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="statesystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransportID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dsGISZHKHSinglePaymentNotificationGetByIDResp", namespace = "http://support.ftgiszhkhreqprocws.V01.diasoft.ru", propOrder = {
    "documentid",
    "statesystem",
    "statename",
    "transportID",
    "updateDate"
})
public class DsGISZHKHSinglePaymentNotificationGetByIDResp
    extends DsReturnCodes
{

    protected Long documentid;
    protected String statesystem;
    protected String statename;
    @XmlElement(name = "TransportID")
    protected String transportID;
    @XmlElement(name = "UpdateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;

    /**
     * Gets the value of the documentid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocumentid() {
        return documentid;
    }

    /**
     * Sets the value of the documentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocumentid(Long value) {
        this.documentid = value;
    }

    /**
     * Gets the value of the statesystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatesystem() {
        return statesystem;
    }

    /**
     * Sets the value of the statesystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatesystem(String value) {
        this.statesystem = value;
    }

    /**
     * Gets the value of the statename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatename() {
        return statename;
    }

    /**
     * Sets the value of the statename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatename(String value) {
        this.statename = value;
    }

    /**
     * Gets the value of the transportID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportID() {
        return transportID;
    }

    /**
     * Sets the value of the transportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportID(String value) {
        this.transportID = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

}

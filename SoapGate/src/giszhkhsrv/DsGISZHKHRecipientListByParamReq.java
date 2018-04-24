
package giszhkhsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dsGISZHKHRecipientListByParamReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsGISZHKHRecipientListByParamReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://support.ftgiszhkhreqprocws.V01.diasoft.ru}dsLoggerParams"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreationDateStart" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="CreationDateEnd" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dsGISZHKHRecipientListByParamReq", namespace = "http://support.ftgiszhkhreqprocws.V01.diasoft.ru", propOrder = {
    "creationDateStart",
    "creationDateEnd"
})
public class DsGISZHKHRecipientListByParamReq
    extends DsLoggerParams
{

    @XmlElement(name = "CreationDateStart", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDateStart;
    @XmlElement(name = "CreationDateEnd", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDateEnd;

    /**
     * Gets the value of the creationDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateStart() {
        return creationDateStart;
    }

    /**
     * Sets the value of the creationDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateStart(XMLGregorianCalendar value) {
        this.creationDateStart = value;
    }

    /**
     * Gets the value of the creationDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateEnd() {
        return creationDateEnd;
    }

    /**
     * Sets the value of the creationDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateEnd(XMLGregorianCalendar value) {
        this.creationDateEnd = value;
    }

}

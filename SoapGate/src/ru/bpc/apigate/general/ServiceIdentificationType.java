
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Параметры идентификации сервиса.
 * 
 * <p>Java class for serviceIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceType" type="{http://www.bpc.ru/apigate/general/}serviceTypeType"/&gt;
 *         &lt;element name="serviceId" type="{http://www.bpc.ru/apigate/general/}serviceIdType"/&gt;
 *         &lt;element name="serviceObjectType" type="{http://www.bpc.ru/apigate/general/}serviceObjectTypeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceIdentificationType", propOrder = {
    "serviceType",
    "serviceId",
    "serviceObjectType"
})
public class ServiceIdentificationType {

    @XmlElement(required = true)
    protected String serviceType;
    @XmlElement(required = true)
    protected String serviceId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ServiceObjectTypeType serviceObjectType;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the serviceObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceObjectTypeType }
     *     
     */
    public ServiceObjectTypeType getServiceObjectType() {
        return serviceObjectType;
    }

    /**
     * Sets the value of the serviceObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceObjectTypeType }
     *     
     */
    public void setServiceObjectType(ServiceObjectTypeType value) {
        this.serviceObjectType = value;
    }

}

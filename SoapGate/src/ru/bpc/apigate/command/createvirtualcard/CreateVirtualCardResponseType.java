
package ru.bpc.apigate.command.createvirtualcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.bpc.apigate.general.VirtualCardIdentificationType;


/**
 * <p>Java class for createVirtualCardResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createVirtualCardResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="virtualCardIdentification" type="{http://www.bpc.ru/apigate/general/}virtualCardIdentificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createVirtualCardResponseType", propOrder = {
    "virtualCardIdentification"
})
public class CreateVirtualCardResponseType {

    @XmlElement(required = true)
    protected VirtualCardIdentificationType virtualCardIdentification;

    /**
     * Gets the value of the virtualCardIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualCardIdentificationType }
     *     
     */
    public VirtualCardIdentificationType getVirtualCardIdentification() {
        return virtualCardIdentification;
    }

    /**
     * Sets the value of the virtualCardIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualCardIdentificationType }
     *     
     */
    public void setVirtualCardIdentification(VirtualCardIdentificationType value) {
        this.virtualCardIdentification = value;
    }

}

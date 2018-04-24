
package ru.unitarius.integration.schema.loans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.unitarius.integration.schema.common.SubsystemIDLongType;


/**
 * <p>Java class for LoansListFindByClientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoansListFindByClientType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientID" type="{http://unitarius.ru/integration/schema/common}SubsystemIDLongType"/&gt;
 *         &lt;element name="ClientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoansListFindByClientType", propOrder = {
    "clientID",
    "clientType"
})
public class LoansListFindByClientType {

    @XmlElement(name = "ClientID", required = true)
    protected SubsystemIDLongType clientID;
    @XmlElement(name = "ClientType")
    protected String clientType;

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link SubsystemIDLongType }
     *     
     */
    public SubsystemIDLongType getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsystemIDLongType }
     *     
     */
    public void setClientID(SubsystemIDLongType value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the clientType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * Sets the value of the clientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientType(String value) {
        this.clientType = value;
    }

}

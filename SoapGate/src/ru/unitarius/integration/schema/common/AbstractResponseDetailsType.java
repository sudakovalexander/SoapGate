
package ru.unitarius.integration.schema.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractResponseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractResponseDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaimID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExternalID" type="{http://unitarius.ru/integration/schema/common}SubsystemIDLongType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractResponseDetailsType", propOrder = {
    "claimID",
    "externalID"
})
public abstract class AbstractResponseDetailsType {

    @XmlElement(name = "ClaimID", required = true)
    protected String claimID;
    @XmlElement(name = "ExternalID")
    protected List<SubsystemIDLongType> externalID;

    /**
     * Gets the value of the claimID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimID() {
        return claimID;
    }

    /**
     * Sets the value of the claimID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimID(String value) {
        this.claimID = value;
    }

    /**
     * Gets the value of the externalID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubsystemIDLongType }
     * 
     * 
     */
    public List<SubsystemIDLongType> getExternalID() {
        if (externalID == null) {
            externalID = new ArrayList<SubsystemIDLongType>();
        }
        return this.externalID;
    }

}


package ru.unitarius.integration.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityErrorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://unitarius.ru/integration/schema/common}BasicErrorType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityErrorType", propOrder = {
    "entityID"
})
public class EntityErrorType
    extends BasicErrorType
{

    @XmlElement(name = "EntityID")
    protected long entityID;

    /**
     * Gets the value of the entityID property.
     * 
     */
    public long getEntityID() {
        return entityID;
    }

    /**
     * Sets the value of the entityID property.
     * 
     */
    public void setEntityID(long value) {
        this.entityID = value;
    }

}

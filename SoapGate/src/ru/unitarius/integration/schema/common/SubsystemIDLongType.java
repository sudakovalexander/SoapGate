
package ru.unitarius.integration.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for SubsystemIDLongType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubsystemIDLongType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;long"&gt;
 *       &lt;attribute name="subsystem" type="{http://unitarius.ru/integration/schema/common}SubsystemEnum" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsystemIDLongType", propOrder = {
    "value"
})
public class SubsystemIDLongType {

    @XmlValue
    protected long value;
    @XmlAttribute(name = "subsystem")
    protected SubsystemEnum subsystem;

    /**
     * Gets the value of the value property.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(long value) {
        this.value = value;
    }

    /**
     * Gets the value of the subsystem property.
     * 
     * @return
     *     possible object is
     *     {@link SubsystemEnum }
     *     
     */
    public SubsystemEnum getSubsystem() {
        return subsystem;
    }

    /**
     * Sets the value of the subsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsystemEnum }
     *     
     */
    public void setSubsystem(SubsystemEnum value) {
        this.subsystem = value;
    }

}

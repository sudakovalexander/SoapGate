
package ru.bpc.apigate.command.getcardlimits;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.bpc.apigate.general.LimitsType;


/**
 * <p>Java class for getCardLimitsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCardLimitsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="limits" type="{http://www.bpc.ru/apigate/general/}limitsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCardLimitsResponseType", propOrder = {
    "limits"
})
public class GetCardLimitsResponseType {

    @XmlElement(required = true)
    protected LimitsType limits;

    /**
     * Gets the value of the limits property.
     * 
     * @return
     *     possible object is
     *     {@link LimitsType }
     *     
     */
    public LimitsType getLimits() {
        return limits;
    }

    /**
     * Sets the value of the limits property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitsType }
     *     
     */
    public void setLimits(LimitsType value) {
        this.limits = value;
    }

}

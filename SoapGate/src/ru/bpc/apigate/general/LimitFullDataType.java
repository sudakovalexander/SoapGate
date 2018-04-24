
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Расширенные параметры лимита.
 * 
 * <p>Java class for limitFullDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="limitFullDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bpc.ru/apigate/general/}limitBaseDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="limitExceptions" type="{http://www.bpc.ru/apigate/general/}limitExceptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "limitFullDataType", propOrder = {
    "limitExceptions"
})
public class LimitFullDataType
    extends LimitBaseDataType
{

    @XmlElement(required = true)
    protected LimitExceptionsType limitExceptions;

    /**
     * Gets the value of the limitExceptions property.
     * 
     * @return
     *     possible object is
     *     {@link LimitExceptionsType }
     *     
     */
    public LimitExceptionsType getLimitExceptions() {
        return limitExceptions;
    }

    /**
     * Sets the value of the limitExceptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitExceptionsType }
     *     
     */
    public void setLimitExceptions(LimitExceptionsType value) {
        this.limitExceptions = value;
    }

}

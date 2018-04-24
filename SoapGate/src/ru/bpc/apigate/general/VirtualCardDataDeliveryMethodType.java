
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for virtualCardDataDeliveryMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="virtualCardDataDeliveryMethodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WS"/&gt;
 *     &lt;enumeration value="HALF_AND_HALF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "virtualCardDataDeliveryMethodType")
@XmlEnum
public enum VirtualCardDataDeliveryMethodType {

    WS,
    HALF_AND_HALF;

    public String value() {
        return name();
    }

    public static VirtualCardDataDeliveryMethodType fromValue(String v) {
        return valueOf(v);
    }

}

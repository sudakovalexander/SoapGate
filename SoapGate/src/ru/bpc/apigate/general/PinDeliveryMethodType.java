
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pinDeliveryMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pinDeliveryMethodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SMS"/&gt;
 *     &lt;enumeration value="WS"/&gt;
 *     &lt;enumeration value="HALF_AND_HALF"/&gt;
 *     &lt;enumeration value="WS_ENCRYPTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "pinDeliveryMethodType")
@XmlEnum
public enum PinDeliveryMethodType {

    SMS,
    WS,
    HALF_AND_HALF,
    WS_ENCRYPTED;

    public String value() {
        return name();
    }

    public static PinDeliveryMethodType fromValue(String v) {
        return valueOf(v);
    }

}

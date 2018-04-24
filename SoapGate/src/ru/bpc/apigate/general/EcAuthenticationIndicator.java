
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ecAuthenticationIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ecAuthenticationIndicator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOT_PERFORMED"/&gt;
 *     &lt;enumeration value="TDS_MERCHANT_ONLY"/&gt;
 *     &lt;enumeration value="TDS_PERFORMED"/&gt;
 *     &lt;enumeration value="ADDITIONAL_PROTOCOL_USED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ecAuthenticationIndicator")
@XmlEnum
public enum EcAuthenticationIndicator {

    NOT_PERFORMED,
    TDS_MERCHANT_ONLY,
    TDS_PERFORMED,
    ADDITIONAL_PROTOCOL_USED;

    public String value() {
        return name();
    }

    public static EcAuthenticationIndicator fromValue(String v) {
        return valueOf(v);
    }

}

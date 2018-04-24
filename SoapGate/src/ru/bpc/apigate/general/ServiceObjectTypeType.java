
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceObjectTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceObjectTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SERVICE_OBJECT_CARD"/&gt;
 *     &lt;enumeration value="SERVICE_OBJECT_ACCOUNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "serviceObjectTypeType")
@XmlEnum
public enum ServiceObjectTypeType {

    SERVICE_OBJECT_CARD,
    SERVICE_OBJECT_ACCOUNT;

    public String value() {
        return name();
    }

    public static ServiceObjectTypeType fromValue(String v) {
        return valueOf(v);
    }

}

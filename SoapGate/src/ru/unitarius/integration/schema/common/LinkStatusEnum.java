
package ru.unitarius.integration.schema.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LinkStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="INACTIVE"/&gt;
 *     &lt;enumeration value="BLOCKED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LinkStatusEnum")
@XmlEnum
public enum LinkStatusEnum {

    ACTIVE,
    INACTIVE,
    BLOCKED;

    public String value() {
        return name();
    }

    public static LinkStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}

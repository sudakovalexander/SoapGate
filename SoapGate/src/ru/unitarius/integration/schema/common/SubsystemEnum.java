
package ru.unitarius.integration.schema.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubsystemEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubsystemEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABS"/&gt;
 *     &lt;enumeration value="CARDS"/&gt;
 *     &lt;enumeration value="PROCESSING"/&gt;
 *     &lt;enumeration value="TERMINAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubsystemEnum")
@XmlEnum
public enum SubsystemEnum {

    ABS,
    CARDS,
    PROCESSING,
    TERMINAL;

    public String value() {
        return name();
    }

    public static SubsystemEnum fromValue(String v) {
        return valueOf(v);
    }

}

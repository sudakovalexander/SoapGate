
package ru.unitarius.integration.schema.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INDIVIDUAL"/&gt;
 *     &lt;enumeration value="LEGAL_ENTITY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClientTypeEnum")
@XmlEnum
public enum ClientTypeEnum {

    INDIVIDUAL,
    LEGAL_ENTITY;

    public String value() {
        return name();
    }

    public static ClientTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}

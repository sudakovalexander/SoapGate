
package ru.unitarius.integration.schema.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DATE"/&gt;
 *     &lt;enumeration value="PERIOD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PeriodTypeEnum")
@XmlEnum
public enum PeriodTypeEnum {

    DATE,
    PERIOD;

    public String value() {
        return name();
    }

    public static PeriodTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}

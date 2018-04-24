
package ru.unitarius.integration.schema.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgreementTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNDEFINED"/&gt;
 *     &lt;enumeration value="GRANTED"/&gt;
 *     &lt;enumeration value="NOT_GRANTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AgreementTypeEnum")
@XmlEnum
public enum AgreementTypeEnum {

    UNDEFINED,
    GRANTED,
    NOT_GRANTED;

    public String value() {
        return name();
    }

    public static AgreementTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}

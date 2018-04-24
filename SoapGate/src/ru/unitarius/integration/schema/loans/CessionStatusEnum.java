
package ru.unitarius.integration.schema.loans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CessionStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CessionStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="SELL"/&gt;
 *     &lt;enumeration value="BUY"/&gt;
 *     &lt;enumeration value="NOT_APPLICABLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CessionStatusEnum")
@XmlEnum
public enum CessionStatusEnum {

    NONE,
    SELL,
    BUY,
    NOT_APPLICABLE;

    public String value() {
        return name();
    }

    public static CessionStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}

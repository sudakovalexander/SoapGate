
package ru.unitarius.integration.schema.loans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalcTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalcTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PERCENT"/&gt;
 *     &lt;enumeration value="PAYMENT_AMOUNT"/&gt;
 *     &lt;enumeration value="PERIOD_AMOUNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalcTypeEnum")
@XmlEnum
public enum CalcTypeEnum {

    PERCENT,
    PAYMENT_AMOUNT,
    PERIOD_AMOUNT;

    public String value() {
        return name();
    }

    public static CalcTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}


package ru.unitarius.integration.schema.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="EARLY_WITHDRAWAL"/&gt;
 *     &lt;enumeration value="INTEREST_RATE"/&gt;
 *     &lt;enumeration value="CORRECTION"/&gt;
 *     &lt;enumeration value="EARLY_REPAYMENT"/&gt;
 *     &lt;enumeration value="DELAY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentStatusEnum")
@XmlEnum
public enum PaymentStatusEnum {

    NONE,
    EARLY_WITHDRAWAL,
    INTEREST_RATE,
    CORRECTION,
    EARLY_REPAYMENT,
    DELAY;

    public String value() {
        return name();
    }

    public static PaymentStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}

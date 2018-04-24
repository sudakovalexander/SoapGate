
package ru.unitarius.integration.schema.loans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentScheduleTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentScheduleTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SCHEDULE"/&gt;
 *     &lt;enumeration value="ANNUITY"/&gt;
 *     &lt;enumeration value="EQUAL_AMOUNTS"/&gt;
 *     &lt;enumeration value="OVERDRAFT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentScheduleTypeEnum")
@XmlEnum
public enum PaymentScheduleTypeEnum {

    SCHEDULE,
    ANNUITY,
    EQUAL_AMOUNTS,
    OVERDRAFT;

    public String value() {
        return name();
    }

    public static PaymentScheduleTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}

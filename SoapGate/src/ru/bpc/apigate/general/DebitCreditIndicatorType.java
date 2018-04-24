
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for debitCreditIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="debitCreditIndicatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="credit"/&gt;
 *     &lt;enumeration value="debit"/&gt;
 *     &lt;enumeration value="noop"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "debitCreditIndicatorType")
@XmlEnum
public enum DebitCreditIndicatorType {

    @XmlEnumValue("credit")
    CREDIT("credit"),
    @XmlEnumValue("debit")
    DEBIT("debit"),
    @XmlEnumValue("noop")
    NOOP("noop");
    private final String value;

    DebitCreditIndicatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DebitCreditIndicatorType fromValue(String v) {
        for (DebitCreditIndicatorType c: DebitCreditIndicatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

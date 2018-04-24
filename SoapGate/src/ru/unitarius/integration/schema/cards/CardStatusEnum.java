
package ru.unitarius.integration.schema.cards;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NORMAL"/&gt;
 *     &lt;enumeration value="PIN_TRIES_EXCEEDED"/&gt;
 *     &lt;enumeration value="NOT_YET_ISSUED"/&gt;
 *     &lt;enumeration value="EXPIRED"/&gt;
 *     &lt;enumeration value="LOST"/&gt;
 *     &lt;enumeration value="STOLEN"/&gt;
 *     &lt;enumeration value="CLOSED"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *     &lt;enumeration value="FRAUDULENT_USE"/&gt;
 *     &lt;enumeration value="RETURNED"/&gt;
 *     &lt;enumeration value="TEMPORARY_BLOCKED"/&gt;
 *     &lt;enumeration value="UNDEFINED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardStatusEnum")
@XmlEnum
public enum CardStatusEnum {

    NORMAL,
    PIN_TRIES_EXCEEDED,
    NOT_YET_ISSUED,
    EXPIRED,
    LOST,
    STOLEN,
    CLOSED,
    CANCELLED,
    FRAUDULENT_USE,
    RETURNED,
    TEMPORARY_BLOCKED,
    UNDEFINED;

    public String value() {
        return name();
    }

    public static CardStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}

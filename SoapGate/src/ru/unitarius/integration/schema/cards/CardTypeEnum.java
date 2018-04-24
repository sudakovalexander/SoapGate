
package ru.unitarius.integration.schema.cards;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CREDIT"/&gt;
 *     &lt;enumeration value="DEBIT_NO_OVERDRAFT"/&gt;
 *     &lt;enumeration value="DEBIT_OVERDRAFT"/&gt;
 *     &lt;enumeration value="UNDEFINED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardTypeEnum")
@XmlEnum
public enum CardTypeEnum {

    CREDIT,
    DEBIT_NO_OVERDRAFT,
    DEBIT_OVERDRAFT,
    UNDEFINED;

    public String value() {
        return name();
    }

    public static CardTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}

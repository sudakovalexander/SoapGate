
package ru.unitarius.integration.schema.loans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *     &lt;enumeration value="LINE"/&gt;
 *     &lt;enumeration value="TRANCHE"/&gt;
 *     &lt;enumeration value="OVERDRAFT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoanTypeEnum")
@XmlEnum
public enum LoanTypeEnum {

    TERM,
    LINE,
    TRANCHE,
    OVERDRAFT;

    public String value() {
        return name();
    }

    public static LoanTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}


package ru.unitarius.integration.schema.loans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanModeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COMMERCIAL"/&gt;
 *     &lt;enumeration value="CONSUMER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoanModeEnum")
@XmlEnum
public enum LoanModeEnum {

    COMMERCIAL,
    CONSUMER;

    public String value() {
        return name();
    }

    public static LoanModeEnum fromValue(String v) {
        return valueOf(v);
    }

}


package ru.unitarius.integration.schema.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementOperationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatementOperationTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEBIT"/&gt;
 *     &lt;enumeration value="CREDIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatementOperationTypeEnum")
@XmlEnum
public enum StatementOperationTypeEnum {

    DEBIT,
    CREDIT;

    public String value() {
        return name();
    }

    public static StatementOperationTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}

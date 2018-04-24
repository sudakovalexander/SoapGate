
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="accountTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCOUNT_TYPE_DEFAULT"/&gt;
 *     &lt;enumeration value="ACCOUNT_TYPE_SAVING"/&gt;
 *     &lt;enumeration value="ACCOUNT_TYPE_CHECKING"/&gt;
 *     &lt;enumeration value="ACCOUNT_TYPE_CREDIT"/&gt;
 *     &lt;enumeration value="ACCOUNT_TYPE_FIRST_OTHERS"/&gt;
 *     &lt;enumeration value="ACCOUNT_TYPE_LOANS"/&gt;
 *     &lt;enumeration value="ACCOUNT_TYPE_ENVELOPE"/&gt;
 *     &lt;enumeration value="ACCOUNT_TYPE_ESCROW"/&gt;
 *     &lt;enumeration value="ACCOUNT_TYPE_MONEY_MARKET"/&gt;
 *     &lt;enumeration value="ACCOUNT_TYPE_LOYALTY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "accountTypeType")
@XmlEnum
public enum AccountTypeType {

    ACCOUNT_TYPE_DEFAULT,
    ACCOUNT_TYPE_SAVING,
    ACCOUNT_TYPE_CHECKING,
    ACCOUNT_TYPE_CREDIT,
    ACCOUNT_TYPE_FIRST_OTHERS,
    ACCOUNT_TYPE_LOANS,
    ACCOUNT_TYPE_ENVELOPE,
    ACCOUNT_TYPE_ESCROW,
    ACCOUNT_TYPE_MONEY_MARKET,
    ACCOUNT_TYPE_LOYALTY;

    public String value() {
        return name();
    }

    public static AccountTypeType fromValue(String v) {
        return valueOf(v);
    }

}

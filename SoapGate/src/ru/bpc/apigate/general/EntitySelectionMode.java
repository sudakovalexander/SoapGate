
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entitySelectionMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="entitySelectionMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "entitySelectionMode")
@XmlEnum
public enum EntitySelectionMode {

    F,
    L,
    A;

    public String value() {
        return name();
    }

    public static EntitySelectionMode fromValue(String v) {
        return valueOf(v);
    }

}

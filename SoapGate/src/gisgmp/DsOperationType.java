
package gisgmp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DsOperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DsOperationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPEND"/&gt;
 *     &lt;enumeration value="REPLACE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DsOperationType")
@XmlEnum
public enum DsOperationType {


    /**
     * Добавление сертификата
     * 
     */
    APPEND,

    /**
     * Обновление существующего
     * 
     */
    REPLACE;

    public String value() {
        return name();
    }

    public static DsOperationType fromValue(String v) {
        return valueOf(v);
    }

}

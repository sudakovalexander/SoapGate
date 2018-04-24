
package giszhkh;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dsGISZHKHReceiverResultCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dsGISZHKHReceiverResultCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CreateFinder"/&gt;
 *     &lt;enumeration value="GUIDObtained"/&gt;
 *     &lt;enumeration value="ResultObtained"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "dsGISZHKHReceiverResultCodeType", namespace = "http://support.ftgiszhkhreqprocws.V01.diasoft.ru")
@XmlEnum
public enum DsGISZHKHReceiverResultCodeType {


    /**
     * Начальное состояние
     * 
     */
    @XmlEnumValue("CreateFinder")
    CREATE_FINDER("CreateFinder"),

    /**
     * GUID получен
     * 
     */
    @XmlEnumValue("GUIDObtained")
    GUID_OBTAINED("GUIDObtained"),

    /**
     * Справочник получен
     * 
     */
    @XmlEnumValue("ResultObtained")
    RESULT_OBTAINED("ResultObtained");
    private final String value;

    DsGISZHKHReceiverResultCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DsGISZHKHReceiverResultCodeType fromValue(String v) {
        for (DsGISZHKHReceiverResultCodeType c: DsGISZHKHReceiverResultCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

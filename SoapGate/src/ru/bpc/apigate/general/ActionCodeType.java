
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="actionCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTION_CODE_ADD"/&gt;
 *     &lt;enumeration value="ACTION_CODE_UPDATE"/&gt;
 *     &lt;enumeration value="ACTION_CODE_DELETE"/&gt;
 *     &lt;enumeration value="ACTION_CODE_CHECK"/&gt;
 *     &lt;enumeration value="ACTION_CODE_CHANGE_ACCESS"/&gt;
 *     &lt;enumeration value="ACTION_CODE_CHECK_PARAMETERS"/&gt;
 *     &lt;enumeration value="ACTION_CODE_RESTORE_PARAMETERS"/&gt;
 *     &lt;enumeration value="ACTION_CODE_INQUIRE"/&gt;
 *     &lt;enumeration value="ACTION_CODE_ACTION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "actionCodeType")
@XmlEnum
public enum ActionCodeType {

    ACTION_CODE_ADD,
    ACTION_CODE_UPDATE,
    ACTION_CODE_DELETE,
    ACTION_CODE_CHECK,
    ACTION_CODE_CHANGE_ACCESS,
    ACTION_CODE_CHECK_PARAMETERS,
    ACTION_CODE_RESTORE_PARAMETERS,
    ACTION_CODE_INQUIRE,
    ACTION_CODE_ACTION;

    public String value() {
        return name();
    }

    public static ActionCodeType fromValue(String v) {
        return valueOf(v);
    }

}

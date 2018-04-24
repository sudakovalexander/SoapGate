
package giszhkh;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REQUEST"/&gt;
 *     &lt;enumeration value="RESULT"/&gt;
 *     &lt;enumeration value="REJECT"/&gt;
 *     &lt;enumeration value="INVALID"/&gt;
 *     &lt;enumeration value="ACCEPT"/&gt;
 *     &lt;enumeration value="PING"/&gt;
 *     &lt;enumeration value="PROCESS"/&gt;
 *     &lt;enumeration value="NOTIFY"/&gt;
 *     &lt;enumeration value="FAILURE"/&gt;
 *     &lt;enumeration value="CANCEL"/&gt;
 *     &lt;enumeration value="STATE"/&gt;
 *     &lt;enumeration value="PACKET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusType")
@XmlEnum
public enum StatusType {


    /**
     * Запрос
     * 
     */
    REQUEST,

    /**
     * Результат
     * 
     */
    RESULT,

    /**
     * Мотивированный отказ
     * 
     */
    REJECT,

    /**
     * Ошибка при ФЛК
     * 
     */
    INVALID,

    /**
     * Сообщение-квиток о приеме
     * 
     */
    ACCEPT,

    /**
     * Запрос данных/результатов
     * 
     */
    PING,

    /**
     * В обработке
     * 
     */
    PROCESS,

    /**
     * Уведомление об ошибке
     * 
     */
    NOTIFY,

    /**
     * Технический сбой
     * 
     */
    FAILURE,

    /**
     * Отзыв заявления
     * 
     */
    CANCEL,

    /**
     * Возврат состояния
     * 
     */
    STATE,

    /**
     * Передача пакетного сообщения
     * 
     */
    PACKET;

    public String value() {
        return name();
    }

    public static StatusType fromValue(String v) {
        return valueOf(v);
    }

}

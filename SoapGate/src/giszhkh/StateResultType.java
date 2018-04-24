
package giszhkh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип данных сообщения о завершении операции 
 * 
 * <p>Java class for StateResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppData"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://smev.gosuslugi.ru/rev120315}AppDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;choice&gt;
 *                     &lt;element ref="{http://smev.gosuslugi.ru/rev120315}ErrorMessage"/&gt;
 *                     &lt;element ref="{http://smev.gosuslugi.ru/rev120315}CommonResult" maxOccurs="unbounded"/&gt;
 *                     &lt;element ref="{http://smev.gosuslugi.ru/rev120315}ExtendedResult" maxOccurs="unbounded"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateResultType", propOrder = {
    "appData"
})
public class StateResultType {

    @XmlElement(name = "AppData", required = true)
    protected StateResultType.AppData appData;

    /**
     * Gets the value of the appData property.
     * 
     * @return
     *     possible object is
     *     {@link StateResultType.AppData }
     *     
     */
    public StateResultType.AppData getAppData() {
        return appData;
    }

    /**
     * Sets the value of the appData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateResultType.AppData }
     *     
     */
    public void setAppData(StateResultType.AppData value) {
        this.appData = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://smev.gosuslugi.ru/rev120315}AppDataType"&gt;
     *       &lt;sequence&gt;
     *         &lt;choice&gt;
     *           &lt;element ref="{http://smev.gosuslugi.ru/rev120315}ErrorMessage"/&gt;
     *           &lt;element ref="{http://smev.gosuslugi.ru/rev120315}CommonResult" maxOccurs="unbounded"/&gt;
     *           &lt;element ref="{http://smev.gosuslugi.ru/rev120315}ExtendedResult" maxOccurs="unbounded"/&gt;
     *         &lt;/choice&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AppData
        extends AppDataType
    {


    }

}

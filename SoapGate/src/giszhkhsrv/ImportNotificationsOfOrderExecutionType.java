
package giszhkhsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Базовый тип пакета извещений о принятии к исполнению распоряжения
 * 
 * <p>Java class for importNotificationsOfOrderExecutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importNotificationsOfOrderExecutionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppData"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://smev.gosuslugi.ru/rev120315}AppDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}importNotificationsOfOrderExecution"/&gt;
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
@XmlType(name = "importNotificationsOfOrderExecutionType", propOrder = {
    "appData"
})
public class ImportNotificationsOfOrderExecutionType {

    @XmlElement(name = "AppData", required = true)
    protected ImportNotificationsOfOrderExecutionType.AppData appData;

    /**
     * Gets the value of the appData property.
     * 
     * @return
     *     possible object is
     *     {@link ImportNotificationsOfOrderExecutionType.AppData }
     *     
     */
    public ImportNotificationsOfOrderExecutionType.AppData getAppData() {
        return appData;
    }

    /**
     * Sets the value of the appData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportNotificationsOfOrderExecutionType.AppData }
     *     
     */
    public void setAppData(ImportNotificationsOfOrderExecutionType.AppData value) {
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
     *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}importNotificationsOfOrderExecution"/&gt;
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

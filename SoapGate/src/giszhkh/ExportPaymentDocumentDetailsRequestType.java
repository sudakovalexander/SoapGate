
package giszhkh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Базовый тип запроса экспорта реквизитов и сведений о платежных документах
 * 
 * <p>Java class for exportPaymentDocumentDetailsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exportPaymentDocumentDetailsRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppData"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://smev.gosuslugi.ru/rev120315}AppDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}PaymentDocumentDetailsRequest"/&gt;
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
@XmlType(name = "exportPaymentDocumentDetailsRequestType", propOrder = {
    "appData"
})
public class ExportPaymentDocumentDetailsRequestType {

    @XmlElement(name = "AppData", required = true)
    protected ExportPaymentDocumentDetailsRequestType.AppData appData;

    /**
     * Gets the value of the appData property.
     * 
     * @return
     *     possible object is
     *     {@link ExportPaymentDocumentDetailsRequestType.AppData }
     *     
     */
    public ExportPaymentDocumentDetailsRequestType.AppData getAppData() {
        return appData;
    }

    /**
     * Sets the value of the appData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPaymentDocumentDetailsRequestType.AppData }
     *     
     */
    public void setAppData(ExportPaymentDocumentDetailsRequestType.AppData value) {
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
     *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}PaymentDocumentDetailsRequest"/&gt;
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

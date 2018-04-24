
package giszhkh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Базовый тип ответа экспорта реквизитов и сведений о платежных документах
 * 
 * <p>Java class for exportPaymentDocumentDetailsResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exportPaymentDocumentDetailsResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppData"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://smev.gosuslugi.ru/rev120315}AppDataType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}ExportPaymentDocumentDetails"/&gt;
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
@XmlType(name = "exportPaymentDocumentDetailsResultType", propOrder = {
    "appData"
})
public class ExportPaymentDocumentDetailsResultType {

    @XmlElement(name = "AppData", required = true)
    protected ExportPaymentDocumentDetailsResultType.AppData appData;

    /**
     * Gets the value of the appData property.
     * 
     * @return
     *     possible object is
     *     {@link ExportPaymentDocumentDetailsResultType.AppData }
     *     
     */
    public ExportPaymentDocumentDetailsResultType.AppData getAppData() {
        return appData;
    }

    /**
     * Sets the value of the appData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPaymentDocumentDetailsResultType.AppData }
     *     
     */
    public void setAppData(ExportPaymentDocumentDetailsResultType.AppData value) {
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
     *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}ExportPaymentDocumentDetails"/&gt;
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

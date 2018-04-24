
package giszhkh;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dsGISZHKHPackPaymentNotificationInsertAsyncReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsGISZHKHPackPaymentNotificationInsertAsyncReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://support.ftgiszhkhreqprocws.V01.diasoft.ru}dsLoggerParams"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dsGISZHKHSinglePaymentNotificationInsertAsyncReq" type="{http://support.ftgiszhkhreqprocws.V01.diasoft.ru}dsGISZHKHSinglePaymentNotificationInsertAsyncReq" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dsGISZHKHPackPaymentNotificationInsertAsyncReq", namespace = "http://support.ftgiszhkhreqprocws.V01.diasoft.ru", propOrder = {
    "dsGISZHKHSinglePaymentNotificationInsertAsyncReq"
})
public class DsGISZHKHPackPaymentNotificationInsertAsyncReq
    extends DsLoggerParams
{

    protected List<DsGISZHKHSinglePaymentNotificationInsertAsyncReq> dsGISZHKHSinglePaymentNotificationInsertAsyncReq;

    /**
     * Gets the value of the dsGISZHKHSinglePaymentNotificationInsertAsyncReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dsGISZHKHSinglePaymentNotificationInsertAsyncReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsGISZHKHSinglePaymentNotificationInsertAsyncReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DsGISZHKHSinglePaymentNotificationInsertAsyncReq }
     * 
     * 
     */
    public List<DsGISZHKHSinglePaymentNotificationInsertAsyncReq> getDsGISZHKHSinglePaymentNotificationInsertAsyncReq() {
        if (dsGISZHKHSinglePaymentNotificationInsertAsyncReq == null) {
            dsGISZHKHSinglePaymentNotificationInsertAsyncReq = new ArrayList<DsGISZHKHSinglePaymentNotificationInsertAsyncReq>();
        }
        return this.dsGISZHKHSinglePaymentNotificationInsertAsyncReq;
    }

}

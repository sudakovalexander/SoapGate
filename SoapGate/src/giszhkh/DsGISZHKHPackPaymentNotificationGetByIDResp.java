
package giszhkh;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dsGISZHKHPackPaymentNotificationGetByIDResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsGISZHKHPackPaymentNotificationGetByIDResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://support.ftgiszhkhreqprocws.V01.diasoft.ru}dsReturnCodes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dsGISZHKHSinglePaymentNotificationGetByIDResp" type="{http://support.ftgiszhkhreqprocws.V01.diasoft.ru}dsGISZHKHSinglePaymentNotificationGetByIDResp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dsGISZHKHPackPaymentNotificationGetByIDResp", namespace = "http://support.ftgiszhkhreqprocws.V01.diasoft.ru", propOrder = {
    "dsGISZHKHSinglePaymentNotificationGetByIDResp"
})
public class DsGISZHKHPackPaymentNotificationGetByIDResp
    extends DsReturnCodes
{

    protected List<DsGISZHKHSinglePaymentNotificationGetByIDResp> dsGISZHKHSinglePaymentNotificationGetByIDResp;

    /**
     * Gets the value of the dsGISZHKHSinglePaymentNotificationGetByIDResp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dsGISZHKHSinglePaymentNotificationGetByIDResp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsGISZHKHSinglePaymentNotificationGetByIDResp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DsGISZHKHSinglePaymentNotificationGetByIDResp }
     * 
     * 
     */
    public List<DsGISZHKHSinglePaymentNotificationGetByIDResp> getDsGISZHKHSinglePaymentNotificationGetByIDResp() {
        if (dsGISZHKHSinglePaymentNotificationGetByIDResp == null) {
            dsGISZHKHSinglePaymentNotificationGetByIDResp = new ArrayList<DsGISZHKHSinglePaymentNotificationGetByIDResp>();
        }
        return this.dsGISZHKHSinglePaymentNotificationGetByIDResp;
    }

}

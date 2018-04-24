
package giszhkh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dsGISZHKHPackPaymentNotificationInsertAsyncResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsGISZHKHPackPaymentNotificationInsertAsyncResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://support.ftgiszhkhreqprocws.V01.diasoft.ru}dsReturnCodes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dsGISZHKHPackPaymentNotificationInsertAsyncResp", namespace = "http://support.ftgiszhkhreqprocws.V01.diasoft.ru", propOrder = {
    "packid"
})
public class DsGISZHKHPackPaymentNotificationInsertAsyncResp
    extends DsReturnCodes
{

    protected Long packid;

    /**
     * Gets the value of the packid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackid() {
        return packid;
    }

    /**
     * Sets the value of the packid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackid(Long value) {
        this.packid = value;
    }

}

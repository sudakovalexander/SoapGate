
package gisgmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExportChargesResponse" type="{http://support.diasoft.ru}ExportChargesResponseType"/&gt;
 *         &lt;element name="ChargeList" type="{http://support.diasoft.ru}ChargeListType"/&gt;
 *         &lt;element name="NotificationList" type="{http://support.diasoft.ru}NotificationListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exportChargesResponse",
    "chargeList",
    "notificationList"
})
@XmlRootElement(name = "dsGMPChargeFindListByParamResp")
public class DsGMPChargeFindListByParamResp {

    @XmlElement(name = "ExportChargesResponse", required = true)
    protected ExportChargesResponseType exportChargesResponse;
    @XmlElement(name = "ChargeList", required = true)
    protected ChargeListType chargeList;
    @XmlElement(name = "NotificationList")
    protected NotificationListType notificationList;

    /**
     * Gets the value of the exportChargesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ExportChargesResponseType }
     *     
     */
    public ExportChargesResponseType getExportChargesResponse() {
        return exportChargesResponse;
    }

    /**
     * Sets the value of the exportChargesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportChargesResponseType }
     *     
     */
    public void setExportChargesResponse(ExportChargesResponseType value) {
        this.exportChargesResponse = value;
    }

    /**
     * Gets the value of the chargeList property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeListType }
     *     
     */
    public ChargeListType getChargeList() {
        return chargeList;
    }

    /**
     * Sets the value of the chargeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeListType }
     *     
     */
    public void setChargeList(ChargeListType value) {
        this.chargeList = value;
    }

    /**
     * Gets the value of the notificationList property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationListType }
     *     
     */
    public NotificationListType getNotificationList() {
        return notificationList;
    }

    /**
     * Sets the value of the notificationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationListType }
     *     
     */
    public void setNotificationList(NotificationListType value) {
        this.notificationList = value;
    }

}

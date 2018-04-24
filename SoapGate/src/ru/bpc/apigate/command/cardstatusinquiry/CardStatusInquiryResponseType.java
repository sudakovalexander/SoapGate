
package ru.bpc.apigate.command.cardstatusinquiry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cardStatusInquiryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardStatusInquiryResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hotCardStatus" type="{http://www.bpc.ru/apigate/general/}hotCardStatusType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardStatusInquiryResponseType", propOrder = {
    "hotCardStatus"
})
public class CardStatusInquiryResponseType {

    protected int hotCardStatus;

    /**
     * Gets the value of the hotCardStatus property.
     * 
     */
    public int getHotCardStatus() {
        return hotCardStatus;
    }

    /**
     * Sets the value of the hotCardStatus property.
     * 
     */
    public void setHotCardStatus(int value) {
        this.hotCardStatus = value;
    }

}

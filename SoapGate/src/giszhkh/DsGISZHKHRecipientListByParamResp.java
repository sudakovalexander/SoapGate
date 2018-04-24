
package giszhkh;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dsGISZHKHRecipientListByParamResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsGISZHKHRecipientListByParamResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://support.ftgiszhkhreqprocws.V01.diasoft.ru}dsReturnCodes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GISZHKHRecipient" type="{http://support.ftgiszhkhreqprocws.V01.diasoft.ru}dsGISZHKHRecipientRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dsGISZHKHRecipientListByParamResp", namespace = "http://support.ftgiszhkhreqprocws.V01.diasoft.ru", propOrder = {
    "giszhkhRecipient"
})
public class DsGISZHKHRecipientListByParamResp
    extends DsReturnCodes
{

    @XmlElement(name = "GISZHKHRecipient")
    protected List<DsGISZHKHRecipientRecord> giszhkhRecipient;

    /**
     * Gets the value of the giszhkhRecipient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giszhkhRecipient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGISZHKHRecipient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DsGISZHKHRecipientRecord }
     * 
     * 
     */
    public List<DsGISZHKHRecipientRecord> getGISZHKHRecipient() {
        if (giszhkhRecipient == null) {
            giszhkhRecipient = new ArrayList<DsGISZHKHRecipientRecord>();
        }
        return this.giszhkhRecipient;
    }

}

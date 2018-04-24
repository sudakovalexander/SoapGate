
package giszhkh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dsGISZHKHRecipientDirectoryResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsGISZHKHRecipientDirectoryResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://support.ftgiszhkhreqprocws.V01.diasoft.ru}dsReturnCodes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="checkResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dsGISZHKHRecipientDirectoryResp", namespace = "http://support.ftgiszhkhreqprocws.V01.diasoft.ru", propOrder = {
    "checkResult"
})
public class DsGISZHKHRecipientDirectoryResp
    extends DsReturnCodes
{

    protected Boolean checkResult;

    /**
     * Gets the value of the checkResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckResult() {
        return checkResult;
    }

    /**
     * Sets the value of the checkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckResult(Boolean value) {
        this.checkResult = value;
    }

}

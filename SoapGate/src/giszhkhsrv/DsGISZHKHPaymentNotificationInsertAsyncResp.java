
package giszhkhsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dsGISZHKHPaymentNotificationInsertAsyncResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsGISZHKHPaymentNotificationInsertAsyncResp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://support.ftgiszhkhreqprocws.V01.diasoft.ru}dsReturnCodes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dsGISZHKHPaymentNotificationInsertAsyncResp", namespace = "http://support.ftgiszhkhreqprocws.V01.diasoft.ru", propOrder = {
    "documentid"
})
public class DsGISZHKHPaymentNotificationInsertAsyncResp
    extends DsReturnCodes
{

    protected Long documentid;

    /**
     * Gets the value of the documentid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocumentid() {
        return documentid;
    }

    /**
     * Sets the value of the documentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocumentid(Long value) {
        this.documentid = value;
    }

}


package gisgmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportChargesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportChargesResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostBlock" type="{http://support.diasoft.ru}PostBlockType"/&gt;
 *         &lt;element name="RequestProcessResult" type="{http://support.diasoft.ru}RequestProcessResultType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportChargesResponseType", propOrder = {
    "postBlock",
    "requestProcessResult"
})
public class ExportChargesResponseType {

    @XmlElement(name = "PostBlock", required = true)
    protected PostBlockType postBlock;
    @XmlElement(name = "RequestProcessResult")
    protected RequestProcessResultType requestProcessResult;

    /**
     * Gets the value of the postBlock property.
     * 
     * @return
     *     possible object is
     *     {@link PostBlockType }
     *     
     */
    public PostBlockType getPostBlock() {
        return postBlock;
    }

    /**
     * Sets the value of the postBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostBlockType }
     *     
     */
    public void setPostBlock(PostBlockType value) {
        this.postBlock = value;
    }

    /**
     * Gets the value of the requestProcessResult property.
     * 
     * @return
     *     possible object is
     *     {@link RequestProcessResultType }
     *     
     */
    public RequestProcessResultType getRequestProcessResult() {
        return requestProcessResult;
    }

    /**
     * Sets the value of the requestProcessResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestProcessResultType }
     *     
     */
    public void setRequestProcessResult(RequestProcessResultType value) {
        this.requestProcessResult = value;
    }

}

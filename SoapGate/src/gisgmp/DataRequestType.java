
package gisgmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestKind" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PostBlock" type="{http://support.diasoft.ru}PostBlockType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataRequestType", propOrder = {
    "requestKind",
    "postBlock"
})
public class DataRequestType {

    @XmlElement(name = "RequestKind", required = true)
    protected String requestKind;
    @XmlElement(name = "PostBlock", required = true)
    protected PostBlockType postBlock;

    /**
     * Gets the value of the requestKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestKind() {
        return requestKind;
    }

    /**
     * Sets the value of the requestKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestKind(String value) {
        this.requestKind = value;
    }

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

}

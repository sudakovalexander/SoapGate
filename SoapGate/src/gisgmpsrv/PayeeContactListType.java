
package gisgmpsrv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayeeContactListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeContactListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayeeContactListElement" type="{http://support.diasoft.ru}PayeeContactListElementType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayeeContactListType", propOrder = {
    "payeeContactListElement"
})
public class PayeeContactListType {

    @XmlElement(name = "PayeeContactListElement", required = true)
    protected List<PayeeContactListElementType> payeeContactListElement;

    /**
     * Gets the value of the payeeContactListElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payeeContactListElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayeeContactListElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayeeContactListElementType }
     * 
     * 
     */
    public List<PayeeContactListElementType> getPayeeContactListElement() {
        if (payeeContactListElement == null) {
            payeeContactListElement = new ArrayList<PayeeContactListElementType>();
        }
        return this.payeeContactListElement;
    }

}

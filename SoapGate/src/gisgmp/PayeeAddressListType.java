
package gisgmp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayeeAddressListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeAddressListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayeeAddressListElement" type="{http://support.diasoft.ru}PayeeAddressListElementType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayeeAddressListType", propOrder = {
    "payeeAddressListElement"
})
public class PayeeAddressListType {

    @XmlElement(name = "PayeeAddressListElement", required = true)
    protected List<PayeeAddressListElementType> payeeAddressListElement;

    /**
     * Gets the value of the payeeAddressListElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payeeAddressListElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayeeAddressListElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayeeAddressListElementType }
     * 
     * 
     */
    public List<PayeeAddressListElementType> getPayeeAddressListElement() {
        if (payeeAddressListElement == null) {
            payeeAddressListElement = new ArrayList<PayeeAddressListElementType>();
        }
        return this.payeeAddressListElement;
    }

}

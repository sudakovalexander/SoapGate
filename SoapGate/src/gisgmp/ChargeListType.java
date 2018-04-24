
package gisgmp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChargeElement" type="{http://support.diasoft.ru}ChargeElementType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeListType", propOrder = {
    "chargeElement"
})
public class ChargeListType {

    @XmlElement(name = "ChargeElement", required = true)
    protected List<ChargeElementType> chargeElement;

    /**
     * Gets the value of the chargeElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeElementType }
     * 
     * 
     */
    public List<ChargeElementType> getChargeElement() {
        if (chargeElement == null) {
            chargeElement = new ArrayList<ChargeElementType>();
        }
        return this.chargeElement;
    }

}

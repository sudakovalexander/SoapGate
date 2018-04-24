
package gisgmpsrv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GMPChargeMainListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMPChargeMainListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GMPChargeMainListElement" type="{http://support.diasoft.ru}GMPChargeMainListElementType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMPChargeMainListType", propOrder = {
    "gmpChargeMainListElement"
})
public class GMPChargeMainListType {

    @XmlElement(name = "GMPChargeMainListElement", required = true)
    protected List<GMPChargeMainListElementType> gmpChargeMainListElement;

    /**
     * Gets the value of the gmpChargeMainListElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gmpChargeMainListElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGMPChargeMainListElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GMPChargeMainListElementType }
     * 
     * 
     */
    public List<GMPChargeMainListElementType> getGMPChargeMainListElement() {
        if (gmpChargeMainListElement == null) {
            gmpChargeMainListElement = new ArrayList<GMPChargeMainListElementType>();
        }
        return this.gmpChargeMainListElement;
    }

}

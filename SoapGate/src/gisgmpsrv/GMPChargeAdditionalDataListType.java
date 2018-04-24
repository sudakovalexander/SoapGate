
package gisgmpsrv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GMPChargeAdditionalDataListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMPChargeAdditionalDataListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GMPChargeAdditionalDataListElement" type="{http://support.diasoft.ru}GMPChargeAdditionalDataListElementType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMPChargeAdditionalDataListType", propOrder = {
    "gmpChargeAdditionalDataListElement"
})
public class GMPChargeAdditionalDataListType {

    @XmlElement(name = "GMPChargeAdditionalDataListElement", required = true)
    protected List<GMPChargeAdditionalDataListElementType> gmpChargeAdditionalDataListElement;

    /**
     * Gets the value of the gmpChargeAdditionalDataListElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gmpChargeAdditionalDataListElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGMPChargeAdditionalDataListElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GMPChargeAdditionalDataListElementType }
     * 
     * 
     */
    public List<GMPChargeAdditionalDataListElementType> getGMPChargeAdditionalDataListElement() {
        if (gmpChargeAdditionalDataListElement == null) {
            gmpChargeAdditionalDataListElement = new ArrayList<GMPChargeAdditionalDataListElementType>();
        }
        return this.gmpChargeAdditionalDataListElement;
    }

}

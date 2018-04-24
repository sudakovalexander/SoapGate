
package ru.bpc.apigate.general;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Перечень лимитов.
 * 
 * <p>Java class for limitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="limitsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="limit" type="{http://www.bpc.ru/apigate/general/}limitFullDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "limitsType", propOrder = {
    "limit"
})
public class LimitsType {

    protected List<LimitFullDataType> limit;

    /**
     * Gets the value of the limit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitFullDataType }
     * 
     * 
     */
    public List<LimitFullDataType> getLimit() {
        if (limit == null) {
            limit = new ArrayList<LimitFullDataType>();
        }
        return this.limit;
    }

}

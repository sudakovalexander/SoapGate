
package ru.unitarius.integration.schema.cards;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.unitarius.integration.schema.common.SubsystemIDLongType;


/**
 * <p>Java class for CardListByOwnerIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardListByOwnerIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OwnerIDList" type="{http://unitarius.ru/integration/schema/common}SubsystemIDLongType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FilterCardNumber" type="{http://unitarius.ru/integration/schema/cards}CardNumberType" minOccurs="0"/&gt;
 *         &lt;element name="FilterAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardListByOwnerIdType", propOrder = {
    "ownerIDList",
    "filterCardNumber",
    "filterAccountNumber"
})
public class CardListByOwnerIdType {

    @XmlElement(name = "OwnerIDList", required = true)
    protected List<SubsystemIDLongType> ownerIDList;
    @XmlElement(name = "FilterCardNumber")
    protected CardNumberType filterCardNumber;
    @XmlElement(name = "FilterAccountNumber")
    protected String filterAccountNumber;

    /**
     * Gets the value of the ownerIDList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownerIDList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnerIDList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubsystemIDLongType }
     * 
     * 
     */
    public List<SubsystemIDLongType> getOwnerIDList() {
        if (ownerIDList == null) {
            ownerIDList = new ArrayList<SubsystemIDLongType>();
        }
        return this.ownerIDList;
    }

    /**
     * Gets the value of the filterCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CardNumberType }
     *     
     */
    public CardNumberType getFilterCardNumber() {
        return filterCardNumber;
    }

    /**
     * Sets the value of the filterCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardNumberType }
     *     
     */
    public void setFilterCardNumber(CardNumberType value) {
        this.filterCardNumber = value;
    }

    /**
     * Gets the value of the filterAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterAccountNumber() {
        return filterAccountNumber;
    }

    /**
     * Sets the value of the filterAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterAccountNumber(String value) {
        this.filterAccountNumber = value;
    }

}

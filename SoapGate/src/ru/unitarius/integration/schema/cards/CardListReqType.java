
package ru.unitarius.integration.schema.cards;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardListReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardListReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FindByOwnerID" type="{http://unitarius.ru/integration/schema/cards}CardListByOwnerIdType" minOccurs="0"/&gt;
 *         &lt;element name="FindByAccountNumber" type="{http://unitarius.ru/integration/schema/cards}CardListByAccountNumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardListReqType", propOrder = {
    "findByOwnerID",
    "findByAccountNumber"
})
public class CardListReqType {

    @XmlElement(name = "FindByOwnerID")
    protected CardListByOwnerIdType findByOwnerID;
    @XmlElement(name = "FindByAccountNumber")
    protected CardListByAccountNumberType findByAccountNumber;

    /**
     * Gets the value of the findByOwnerID property.
     * 
     * @return
     *     possible object is
     *     {@link CardListByOwnerIdType }
     *     
     */
    public CardListByOwnerIdType getFindByOwnerID() {
        return findByOwnerID;
    }

    /**
     * Sets the value of the findByOwnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardListByOwnerIdType }
     *     
     */
    public void setFindByOwnerID(CardListByOwnerIdType value) {
        this.findByOwnerID = value;
    }

    /**
     * Gets the value of the findByAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CardListByAccountNumberType }
     *     
     */
    public CardListByAccountNumberType getFindByAccountNumber() {
        return findByAccountNumber;
    }

    /**
     * Sets the value of the findByAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardListByAccountNumberType }
     *     
     */
    public void setFindByAccountNumber(CardListByAccountNumberType value) {
        this.findByAccountNumber = value;
    }

}

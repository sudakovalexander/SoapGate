
package ru.unitarius.integration.schema.cards;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CardStatusChangeEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardStatusChangeEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="NewStatusBrief" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NewStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="UserBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardStatusChangeEventType", propOrder = {
    "sequence",
    "date",
    "newStatusBrief",
    "newStatusDescription",
    "userID",
    "userBrief"
})
public class CardStatusChangeEventType {

    @XmlElement(name = "Sequence")
    protected long sequence;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "NewStatusBrief", required = true)
    protected String newStatusBrief;
    @XmlElement(name = "NewStatusDescription", required = true)
    protected String newStatusDescription;
    @XmlElement(name = "UserID")
    protected long userID;
    @XmlElement(name = "UserBrief")
    protected String userBrief;

    /**
     * Gets the value of the sequence property.
     * 
     */
    public long getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(long value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the newStatusBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewStatusBrief() {
        return newStatusBrief;
    }

    /**
     * Sets the value of the newStatusBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewStatusBrief(String value) {
        this.newStatusBrief = value;
    }

    /**
     * Gets the value of the newStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewStatusDescription() {
        return newStatusDescription;
    }

    /**
     * Sets the value of the newStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewStatusDescription(String value) {
        this.newStatusDescription = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     */
    public long getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     */
    public void setUserID(long value) {
        this.userID = value;
    }

    /**
     * Gets the value of the userBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserBrief() {
        return userBrief;
    }

    /**
     * Sets the value of the userBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserBrief(String value) {
        this.userBrief = value;
    }

}

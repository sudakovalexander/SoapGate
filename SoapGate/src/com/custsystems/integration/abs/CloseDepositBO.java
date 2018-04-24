
package com.custsystems.integration.abs;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CloseDepositBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CloseDepositBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOC_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DOC_NUMBER" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACC_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CARD_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="END_ACC_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="END_CARD_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CloseDepositBO", propOrder = {
    "reqID",
    "subSys",
    "customerID",
    "id",
    "docdate",
    "docnumber",
    "description",
    "accnumber",
    "cardnumber",
    "endaccnumber",
    "endcardnumber"
})
public class CloseDepositBO {

    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "DOC_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docdate;
    @XmlElement(name = "DOC_NUMBER")
    protected BigInteger docnumber;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "ACC_NUMBER")
    protected String accnumber;
    @XmlElement(name = "CARD_NUMBER")
    protected String cardnumber;
    @XmlElement(name = "END_ACC_NUMBER")
    protected String endaccnumber;
    @XmlElement(name = "END_CARD_NUMBER")
    protected String endcardnumber;

    /**
     * Gets the value of the reqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqID() {
        return reqID;
    }

    /**
     * Sets the value of the reqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqID(String value) {
        this.reqID = value;
    }

    /**
     * Gets the value of the subSys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSys() {
        return subSys;
    }

    /**
     * Sets the value of the subSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSys(String value) {
        this.subSys = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the docdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDOCDATE() {
        return docdate;
    }

    /**
     * Sets the value of the docdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDOCDATE(XMLGregorianCalendar value) {
        this.docdate = value;
    }

    /**
     * Gets the value of the docnumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDOCNUMBER() {
        return docnumber;
    }

    /**
     * Sets the value of the docnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDOCNUMBER(BigInteger value) {
        this.docnumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the accnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCNUMBER() {
        return accnumber;
    }

    /**
     * Sets the value of the accnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCNUMBER(String value) {
        this.accnumber = value;
    }

    /**
     * Gets the value of the cardnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDNUMBER() {
        return cardnumber;
    }

    /**
     * Sets the value of the cardnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDNUMBER(String value) {
        this.cardnumber = value;
    }

    /**
     * Gets the value of the endaccnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDACCNUMBER() {
        return endaccnumber;
    }

    /**
     * Sets the value of the endaccnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDACCNUMBER(String value) {
        this.endaccnumber = value;
    }

    /**
     * Gets the value of the endcardnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDCARDNUMBER() {
        return endcardnumber;
    }

    /**
     * Sets the value of the endcardnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDCARDNUMBER(String value) {
        this.endcardnumber = value;
    }

}

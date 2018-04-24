
package com.custsystems.integration.abs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Mail2bankULRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mail2bankULRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BRANCH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TOPIC_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CREATESTAMP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TOPIC_CAPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://custsystems.com/integration/abs}files" minOccurs="0"/&gt;
 *         &lt;element ref="{http://custsystems.com/integration/abs}signes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mail2bankULRequest", propOrder = {
    "reqID",
    "subSys",
    "customerID",
    "docid",
    "branchcode",
    "topiccode",
    "createstamp",
    "topiccaption",
    "description",
    "files",
    "signes"
})
public class Mail2BankULRequest {

    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "DOCID")
    protected String docid;
    @XmlElement(name = "BRANCH_CODE")
    protected String branchcode;
    @XmlElement(name = "TOPIC_CODE")
    protected String topiccode;
    @XmlElement(name = "CREATESTAMP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createstamp;
    @XmlElement(name = "TOPIC_CAPTION")
    protected String topiccaption;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    protected Files files;
    protected Signes signes;

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
     * Gets the value of the docid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCID() {
        return docid;
    }

    /**
     * Sets the value of the docid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCID(String value) {
        this.docid = value;
    }

    /**
     * Gets the value of the branchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHCODE() {
        return branchcode;
    }

    /**
     * Sets the value of the branchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHCODE(String value) {
        this.branchcode = value;
    }

    /**
     * Gets the value of the topiccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOPICCODE() {
        return topiccode;
    }

    /**
     * Sets the value of the topiccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOPICCODE(String value) {
        this.topiccode = value;
    }

    /**
     * Gets the value of the createstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCREATESTAMP() {
        return createstamp;
    }

    /**
     * Sets the value of the createstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCREATESTAMP(XMLGregorianCalendar value) {
        this.createstamp = value;
    }

    /**
     * Gets the value of the topiccaption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOPICCAPTION() {
        return topiccaption;
    }

    /**
     * Sets the value of the topiccaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOPICCAPTION(String value) {
        this.topiccaption = value;
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
     * Gets the value of the files property.
     * 
     * @return
     *     possible object is
     *     {@link Files }
     *     
     */
    public Files getFiles() {
        return files;
    }

    /**
     * Sets the value of the files property.
     * 
     * @param value
     *     allowed object is
     *     {@link Files }
     *     
     */
    public void setFiles(Files value) {
        this.files = value;
    }

    /**
     * Gets the value of the signes property.
     * 
     * @return
     *     possible object is
     *     {@link Signes }
     *     
     */
    public Signes getSignes() {
        return signes;
    }

    /**
     * Sets the value of the signes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Signes }
     *     
     */
    public void setSignes(Signes value) {
        this.signes = value;
    }

}


package giszhkh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dsGISZHKHRecipientRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsGISZHKHRecipientRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RECIPIENTID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="CREATIONDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dsGISZHKHRecipientRecord", namespace = "http://support.ftgiszhkhreqprocws.V01.diasoft.ru", propOrder = {
    "recipientid",
    "creationdate",
    "ogrn",
    "inn",
    "kpp",
    "name"
})
public class DsGISZHKHRecipientRecord {

    @XmlElement(name = "RECIPIENTID")
    protected long recipientid;
    @XmlElement(name = "CREATIONDATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationdate;
    @XmlElement(name = "OGRN")
    protected String ogrn;
    @XmlElement(name = "INN", required = true)
    protected String inn;
    @XmlElement(name = "KPP")
    protected String kpp;
    @XmlElement(name = "NAME")
    protected String name;

    /**
     * Gets the value of the recipientid property.
     * 
     */
    public long getRECIPIENTID() {
        return recipientid;
    }

    /**
     * Sets the value of the recipientid property.
     * 
     */
    public void setRECIPIENTID(long value) {
        this.recipientid = value;
    }

    /**
     * Gets the value of the creationdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCREATIONDATE() {
        return creationdate;
    }

    /**
     * Sets the value of the creationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCREATIONDATE(XMLGregorianCalendar value) {
        this.creationdate = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRN(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the kpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPP() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPP(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

}

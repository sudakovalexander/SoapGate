
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CardAccBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAccBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="VD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="N" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="A" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ACD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEXP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CEXP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PINN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PIDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PIDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PBBIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PBCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PBTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PBNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="response" type="{http://custsystems.com/integration/abs}CardAccResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAccBO", propOrder = {
    "reqID",
    "subSys",
    "customerID",
    "cur",
    "d",
    "vd",
    "n",
    "a",
    "acd",
    "crd",
    "acc",
    "crc",
    "gnd",
    "docid",
    "dexp",
    "cexp",
    "pinn",
    "pname",
    "pidd",
    "pidn",
    "pbbik",
    "pbca",
    "pbtyp",
    "pbname",
    "pbp",
    "response"
})
public class CardAccBO {

    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "CUR")
    protected String cur;
    @XmlElement(name = "D")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar d;
    @XmlElement(name = "VD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vd;
    @XmlElement(name = "N")
    protected String n;
    @XmlElement(name = "A")
    protected BigDecimal a;
    @XmlElement(name = "ACD")
    protected String acd;
    @XmlElement(name = "CRD")
    protected String crd;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "CRC")
    protected String crc;
    @XmlElement(name = "GND")
    protected String gnd;
    @XmlElement(name = "DOCID")
    protected String docid;
    @XmlElement(name = "DEXP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dexp;
    @XmlElement(name = "CEXP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cexp;
    @XmlElement(name = "PINN")
    protected String pinn;
    @XmlElement(name = "PNAME")
    protected String pname;
    @XmlElement(name = "PIDD")
    protected String pidd;
    @XmlElement(name = "PIDN")
    protected String pidn;
    @XmlElement(name = "PBBIK")
    protected String pbbik;
    @XmlElement(name = "PBCA")
    protected String pbca;
    @XmlElement(name = "PBTYP")
    protected String pbtyp;
    @XmlElement(name = "PBNAME")
    protected String pbname;
    @XmlElement(name = "PBP")
    protected String pbp;
    protected CardAccResponse response;

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
     * Gets the value of the cur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUR() {
        return cur;
    }

    /**
     * Sets the value of the cur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUR(String value) {
        this.cur = value;
    }

    /**
     * Gets the value of the d property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setD(XMLGregorianCalendar value) {
        this.d = value;
    }

    /**
     * Gets the value of the vd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVD() {
        return vd;
    }

    /**
     * Sets the value of the vd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVD(XMLGregorianCalendar value) {
        this.vd = value;
    }

    /**
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN(String value) {
        this.n = value;
    }

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setA(BigDecimal value) {
        this.a = value;
    }

    /**
     * Gets the value of the acd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACD() {
        return acd;
    }

    /**
     * Sets the value of the acd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACD(String value) {
        this.acd = value;
    }

    /**
     * Gets the value of the crd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRD() {
        return crd;
    }

    /**
     * Sets the value of the crd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRD(String value) {
        this.crd = value;
    }

    /**
     * Gets the value of the acc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACC() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACC(String value) {
        this.acc = value;
    }

    /**
     * Gets the value of the crc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRC() {
        return crc;
    }

    /**
     * Sets the value of the crc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRC(String value) {
        this.crc = value;
    }

    /**
     * Gets the value of the gnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGND() {
        return gnd;
    }

    /**
     * Sets the value of the gnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGND(String value) {
        this.gnd = value;
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
     * Gets the value of the dexp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDEXP() {
        return dexp;
    }

    /**
     * Sets the value of the dexp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDEXP(XMLGregorianCalendar value) {
        this.dexp = value;
    }

    /**
     * Gets the value of the cexp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCEXP() {
        return cexp;
    }

    /**
     * Sets the value of the cexp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCEXP(XMLGregorianCalendar value) {
        this.cexp = value;
    }

    /**
     * Gets the value of the pinn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINN() {
        return pinn;
    }

    /**
     * Sets the value of the pinn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINN(String value) {
        this.pinn = value;
    }

    /**
     * Gets the value of the pname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNAME() {
        return pname;
    }

    /**
     * Sets the value of the pname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNAME(String value) {
        this.pname = value;
    }

    /**
     * Gets the value of the pidd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIDD() {
        return pidd;
    }

    /**
     * Sets the value of the pidd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIDD(String value) {
        this.pidd = value;
    }

    /**
     * Gets the value of the pidn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIDN() {
        return pidn;
    }

    /**
     * Sets the value of the pidn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIDN(String value) {
        this.pidn = value;
    }

    /**
     * Gets the value of the pbbik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBBIK() {
        return pbbik;
    }

    /**
     * Sets the value of the pbbik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBBIK(String value) {
        this.pbbik = value;
    }

    /**
     * Gets the value of the pbca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBCA() {
        return pbca;
    }

    /**
     * Sets the value of the pbca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBCA(String value) {
        this.pbca = value;
    }

    /**
     * Gets the value of the pbtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBTYP() {
        return pbtyp;
    }

    /**
     * Sets the value of the pbtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBTYP(String value) {
        this.pbtyp = value;
    }

    /**
     * Gets the value of the pbname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBNAME() {
        return pbname;
    }

    /**
     * Sets the value of the pbname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBNAME(String value) {
        this.pbname = value;
    }

    /**
     * Gets the value of the pbp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBP() {
        return pbp;
    }

    /**
     * Sets the value of the pbp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBP(String value) {
        this.pbp = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccResponse }
     *     
     */
    public CardAccResponse getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccResponse }
     *     
     */
    public void setResponse(CardAccResponse value) {
        this.response = value;
    }

}

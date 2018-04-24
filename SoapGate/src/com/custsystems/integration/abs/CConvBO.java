
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CConvBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CConvBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CURC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="N" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ACD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PINN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMISSION" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="COMISSIONACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PCARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RCARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CConvBO", propOrder = {
    "reqID",
    "subSys",
    "customerID",
    "curd",
    "curc",
    "d",
    "n",
    "ad",
    "ac",
    "rate",
    "acd",
    "acc",
    "docid",
    "pname",
    "pinn",
    "comission",
    "comissionacc",
    "pcard",
    "rcard"
})
public class CConvBO {

    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "CURD")
    protected String curd;
    @XmlElement(name = "CURC")
    protected String curc;
    @XmlElement(name = "D")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar d;
    @XmlElement(name = "N")
    protected String n;
    @XmlElement(name = "AD")
    protected BigDecimal ad;
    @XmlElement(name = "AC")
    protected BigDecimal ac;
    @XmlElement(name = "RATE")
    protected BigDecimal rate;
    @XmlElement(name = "ACD")
    protected String acd;
    @XmlElement(name = "ACC")
    protected String acc;
    @XmlElement(name = "DOCID")
    protected String docid;
    @XmlElement(name = "PNAME")
    protected String pname;
    @XmlElement(name = "PINN")
    protected String pinn;
    @XmlElement(name = "COMISSION")
    protected BigDecimal comission;
    @XmlElement(name = "COMISSIONACC")
    protected String comissionacc;
    @XmlElement(name = "PCARD")
    protected String pcard;
    @XmlElement(name = "RCARD")
    protected String rcard;

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
     * Gets the value of the curd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURD() {
        return curd;
    }

    /**
     * Sets the value of the curd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURD(String value) {
        this.curd = value;
    }

    /**
     * Gets the value of the curc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURC() {
        return curc;
    }

    /**
     * Sets the value of the curc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURC(String value) {
        this.curc = value;
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
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAD() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAD(BigDecimal value) {
        this.ad = value;
    }

    /**
     * Gets the value of the ac property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAC() {
        return ac;
    }

    /**
     * Sets the value of the ac property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAC(BigDecimal value) {
        this.ac = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRATE() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRATE(BigDecimal value) {
        this.rate = value;
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
     * Gets the value of the comission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCOMISSION() {
        return comission;
    }

    /**
     * Sets the value of the comission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCOMISSION(BigDecimal value) {
        this.comission = value;
    }

    /**
     * Gets the value of the comissionacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMISSIONACC() {
        return comissionacc;
    }

    /**
     * Sets the value of the comissionacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMISSIONACC(String value) {
        this.comissionacc = value;
    }

    /**
     * Gets the value of the pcard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCARD() {
        return pcard;
    }

    /**
     * Sets the value of the pcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCARD(String value) {
        this.pcard = value;
    }

    /**
     * Gets the value of the rcard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCARD() {
        return rcard;
    }

    /**
     * Sets the value of the rcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCARD(String value) {
        this.rcard = value;
    }

}

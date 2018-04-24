
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccAccBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccAccBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlagComiss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="A" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="N" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PCARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RCARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMISSION" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="COMISSIONACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PINN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccAccBO", propOrder = {
    "reqID",
    "subSys",
    "customerID",
    "branchId",
    "flagComiss",
    "a",
    "cur",
    "crd",
    "d",
    "n",
    "pacc",
    "racc",
    "pcard",
    "rcard",
    "comission",
    "comissionacc",
    "docid",
    "gnd",
    "pname",
    "rname",
    "pinn"
})
public class AccAccBO {

    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID", required = true)
    protected String customerID;
    @XmlElement(name = "BranchId", required = true)
    protected String branchId;
    @XmlElement(name = "FlagComiss")
    protected Integer flagComiss;
    @XmlElement(name = "A", required = true)
    protected BigDecimal a;
    @XmlElement(name = "CUR")
    protected String cur;
    @XmlElement(name = "CRD")
    protected String crd;
    @XmlElement(name = "D", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar d;
    @XmlElement(name = "N")
    protected String n;
    @XmlElement(name = "PACC")
    protected String pacc;
    @XmlElement(name = "RACC")
    protected String racc;
    @XmlElement(name = "PCARD")
    protected String pcard;
    @XmlElement(name = "RCARD")
    protected String rcard;
    @XmlElement(name = "COMISSION")
    protected BigDecimal comission;
    @XmlElement(name = "COMISSIONACC")
    protected String comissionacc;
    @XmlElement(name = "DOCID")
    protected String docid;
    @XmlElement(name = "GND")
    protected String gnd;
    @XmlElement(name = "PNAME")
    protected String pname;
    @XmlElement(name = "RNAME")
    protected String rname;
    @XmlElement(name = "PINN")
    protected String pinn;

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
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the flagComiss property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlagComiss() {
        return flagComiss;
    }

    /**
     * Sets the value of the flagComiss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlagComiss(Integer value) {
        this.flagComiss = value;
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
     * Gets the value of the pacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACC() {
        return pacc;
    }

    /**
     * Sets the value of the pacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACC(String value) {
        this.pacc = value;
    }

    /**
     * Gets the value of the racc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRACC() {
        return racc;
    }

    /**
     * Sets the value of the racc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRACC(String value) {
        this.racc = value;
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
     * Gets the value of the rname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNAME() {
        return rname;
    }

    /**
     * Sets the value of the rname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRNAME(String value) {
        this.rname = value;
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

}

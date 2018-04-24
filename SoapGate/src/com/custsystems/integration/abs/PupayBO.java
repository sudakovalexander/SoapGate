
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PupayBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PupayBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlagComiss" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PUREF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UTILITY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="EXP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="N"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="A" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RCOMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CUR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRD"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PINN"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PNAME"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PACC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PIDD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PIDN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PIDI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RINN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RTYP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RACC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RBBIC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RBNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GROUND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMMISACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PBBIC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PBNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PBCORRACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOCSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SDREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PSPUREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PACKETCHECK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PACKETPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDITIONAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PERIOD" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BDATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="EDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PupayBO", propOrder = {
    "reqID",
    "subSys",
    "customerID",
    "branchId",
    "flagComiss",
    "puref",
    "utility",
    "d",
    "exp",
    "n",
    "a",
    "commis",
    "rcommis",
    "cur",
    "crd",
    "pinn",
    "pname",
    "pacc",
    "cn",
    "pidd",
    "pidn",
    "pidi",
    "rinn",
    "rname",
    "rtyp",
    "racc",
    "rbbic",
    "rbname",
    "docid",
    "ground",
    "commisacc",
    "pbbic",
    "pbname",
    "pbcorracc",
    "puid",
    "docstatus",
    "sdref",
    "pspuref",
    "packetcheck",
    "packetpay",
    "additional",
    "period",
    "unit",
    "bdate",
    "edate"
})
public class PupayBO {

    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "BranchId", required = true)
    protected String branchId;
    @XmlElement(name = "FlagComiss")
    protected int flagComiss;
    @XmlElement(name = "PUREF", required = true)
    protected String puref;
    @XmlElement(name = "UTILITY", required = true)
    protected String utility;
    @XmlElement(name = "D", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar d;
    @XmlElement(name = "EXP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exp;
    @XmlElement(name = "N", required = true)
    protected String n;
    @XmlElement(name = "A", required = true)
    protected BigDecimal a;
    @XmlElement(name = "COMMIS", required = true)
    protected BigDecimal commis;
    @XmlElement(name = "RCOMMIS")
    protected BigDecimal rcommis;
    @XmlElement(name = "CUR", required = true)
    protected String cur;
    @XmlElement(name = "CRD", required = true)
    protected String crd;
    @XmlElement(name = "PINN", required = true)
    protected String pinn;
    @XmlElement(name = "PNAME", required = true)
    protected String pname;
    @XmlElement(name = "PACC", required = true)
    protected String pacc;
    @XmlElement(name = "CN", required = true)
    protected String cn;
    @XmlElement(name = "PIDD", required = true)
    protected String pidd;
    @XmlElement(name = "PIDN", required = true)
    protected String pidn;
    @XmlElement(name = "PIDI", required = true)
    protected String pidi;
    @XmlElement(name = "RINN", required = true)
    protected String rinn;
    @XmlElement(name = "RNAME")
    protected String rname;
    @XmlElement(name = "RTYP", required = true)
    protected String rtyp;
    @XmlElement(name = "RACC", required = true)
    protected String racc;
    @XmlElement(name = "RBBIC")
    protected String rbbic;
    @XmlElement(name = "RBNAME")
    protected String rbname;
    @XmlElement(name = "DOCID", required = true)
    protected String docid;
    @XmlElement(name = "GROUND")
    protected String ground;
    @XmlElement(name = "COMMISACC")
    protected String commisacc;
    @XmlElement(name = "PBBIC")
    protected String pbbic;
    @XmlElement(name = "PBNAME")
    protected String pbname;
    @XmlElement(name = "PBCORRACC")
    protected String pbcorracc;
    @XmlElement(name = "PUID")
    protected String puid;
    @XmlElement(name = "DOCSTATUS")
    protected String docstatus;
    @XmlElement(name = "SDREF")
    protected String sdref;
    @XmlElement(name = "PSPUREF")
    protected String pspuref;
    @XmlElement(name = "PACKETCHECK")
    protected String packetcheck;
    @XmlElement(name = "PACKETPAY")
    protected String packetpay;
    @XmlElement(name = "ADDITIONAL")
    protected String additional;
    @XmlElement(name = "PERIOD")
    protected int period;
    @XmlElement(name = "UNIT", required = true)
    protected String unit;
    @XmlElement(name = "BDATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bdate;
    @XmlElement(name = "EDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar edate;

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
     */
    public int getFlagComiss() {
        return flagComiss;
    }

    /**
     * Sets the value of the flagComiss property.
     * 
     */
    public void setFlagComiss(int value) {
        this.flagComiss = value;
    }

    /**
     * Gets the value of the puref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUREF() {
        return puref;
    }

    /**
     * Sets the value of the puref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUREF(String value) {
        this.puref = value;
    }

    /**
     * Gets the value of the utility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTILITY() {
        return utility;
    }

    /**
     * Sets the value of the utility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTILITY(String value) {
        this.utility = value;
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
     * Gets the value of the exp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXP() {
        return exp;
    }

    /**
     * Sets the value of the exp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXP(XMLGregorianCalendar value) {
        this.exp = value;
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
     * Gets the value of the commis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCOMMIS() {
        return commis;
    }

    /**
     * Sets the value of the commis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCOMMIS(BigDecimal value) {
        this.commis = value;
    }

    /**
     * Gets the value of the rcommis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRCOMMIS() {
        return rcommis;
    }

    /**
     * Sets the value of the rcommis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRCOMMIS(BigDecimal value) {
        this.rcommis = value;
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
     * Gets the value of the cn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCN() {
        return cn;
    }

    /**
     * Sets the value of the cn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCN(String value) {
        this.cn = value;
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
     * Gets the value of the pidi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIDI() {
        return pidi;
    }

    /**
     * Sets the value of the pidi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIDI(String value) {
        this.pidi = value;
    }

    /**
     * Gets the value of the rinn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRINN() {
        return rinn;
    }

    /**
     * Sets the value of the rinn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRINN(String value) {
        this.rinn = value;
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
     * Gets the value of the rtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTYP() {
        return rtyp;
    }

    /**
     * Sets the value of the rtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTYP(String value) {
        this.rtyp = value;
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
     * Gets the value of the rbbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBBIC() {
        return rbbic;
    }

    /**
     * Sets the value of the rbbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBBIC(String value) {
        this.rbbic = value;
    }

    /**
     * Gets the value of the rbname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBNAME() {
        return rbname;
    }

    /**
     * Sets the value of the rbname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBNAME(String value) {
        this.rbname = value;
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
     * Gets the value of the ground property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUND() {
        return ground;
    }

    /**
     * Sets the value of the ground property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUND(String value) {
        this.ground = value;
    }

    /**
     * Gets the value of the commisacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMISACC() {
        return commisacc;
    }

    /**
     * Sets the value of the commisacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMISACC(String value) {
        this.commisacc = value;
    }

    /**
     * Gets the value of the pbbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBBIC() {
        return pbbic;
    }

    /**
     * Sets the value of the pbbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBBIC(String value) {
        this.pbbic = value;
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
     * Gets the value of the pbcorracc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBCORRACC() {
        return pbcorracc;
    }

    /**
     * Sets the value of the pbcorracc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBCORRACC(String value) {
        this.pbcorracc = value;
    }

    /**
     * Gets the value of the puid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUID() {
        return puid;
    }

    /**
     * Sets the value of the puid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUID(String value) {
        this.puid = value;
    }

    /**
     * Gets the value of the docstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCSTATUS() {
        return docstatus;
    }

    /**
     * Sets the value of the docstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCSTATUS(String value) {
        this.docstatus = value;
    }

    /**
     * Gets the value of the sdref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDREF() {
        return sdref;
    }

    /**
     * Sets the value of the sdref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDREF(String value) {
        this.sdref = value;
    }

    /**
     * Gets the value of the pspuref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSPUREF() {
        return pspuref;
    }

    /**
     * Sets the value of the pspuref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSPUREF(String value) {
        this.pspuref = value;
    }

    /**
     * Gets the value of the packetcheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKETCHECK() {
        return packetcheck;
    }

    /**
     * Sets the value of the packetcheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKETCHECK(String value) {
        this.packetcheck = value;
    }

    /**
     * Gets the value of the packetpay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACKETPAY() {
        return packetpay;
    }

    /**
     * Sets the value of the packetpay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACKETPAY(String value) {
        this.packetpay = value;
    }

    /**
     * Gets the value of the additional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDITIONAL() {
        return additional;
    }

    /**
     * Sets the value of the additional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDITIONAL(String value) {
        this.additional = value;
    }

    /**
     * Gets the value of the period property.
     * 
     */
    public int getPERIOD() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     */
    public void setPERIOD(int value) {
        this.period = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIT() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIT(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBDATE(XMLGregorianCalendar value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEDATE() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEDATE(XMLGregorianCalendar value) {
        this.edate = value;
    }

}

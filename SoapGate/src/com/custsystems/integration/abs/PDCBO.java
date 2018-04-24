
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PDCBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDCBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="N"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="A" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PNAME"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PACC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PIDD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PIDN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PIDI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PBBIK"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PBCA"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PBTYP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PBNAME"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PBPT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PBP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RNAME"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RACC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RBCA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RBNAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RBP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BBCCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RBBSWIFT"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BBSWIFT"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BBCA"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BBNAME"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BBP"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BBADDR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RCCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RP"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RADDR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RBCCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RBADDR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="COMMISSION"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="BEN"/&gt;
 *               &lt;enumeration value="OUR"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CACC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DOCID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OPERCODE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAYPURP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="response" type="{http://custsystems.com/integration/abs}PDCResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDCBO", propOrder = {
    "reqID",
    "subSys",
    "customerID",
    "cur",
    "crd",
    "d",
    "n",
    "a",
    "pname",
    "pacc",
    "pidd",
    "pidn",
    "pidi",
    "pbbik",
    "pbca",
    "pbtyp",
    "pbname",
    "pbpt",
    "pbp",
    "rname",
    "racc",
    "rbca",
    "rbname",
    "rbp",
    "bbccode",
    "rbbswift",
    "bbswift",
    "bbca",
    "bbname",
    "bbp",
    "bbaddr",
    "rccode",
    "rp",
    "raddr",
    "rbccode",
    "rbaddr",
    "commission",
    "cacc",
    "docid",
    "opercode",
    "paypurp",
    "response"
})
public class PDCBO {

    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "CUR", required = true)
    protected String cur;
    @XmlElement(name = "CRD", required = true)
    protected String crd;
    @XmlElement(name = "D", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar d;
    @XmlElement(name = "N", required = true)
    protected String n;
    @XmlElement(name = "A", required = true)
    protected BigDecimal a;
    @XmlElement(name = "PNAME", required = true)
    protected String pname;
    @XmlElement(name = "PACC", required = true)
    protected String pacc;
    @XmlElement(name = "PIDD", required = true)
    protected String pidd;
    @XmlElement(name = "PIDN", required = true)
    protected String pidn;
    @XmlElement(name = "PIDI", required = true)
    protected String pidi;
    @XmlElement(name = "PBBIK", required = true)
    protected String pbbik;
    @XmlElement(name = "PBCA", required = true)
    protected String pbca;
    @XmlElement(name = "PBTYP", required = true)
    protected String pbtyp;
    @XmlElement(name = "PBNAME", required = true)
    protected String pbname;
    @XmlElement(name = "PBPT", required = true)
    protected String pbpt;
    @XmlElement(name = "PBP", required = true)
    protected String pbp;
    @XmlElement(name = "RNAME", required = true)
    protected String rname;
    @XmlElement(name = "RACC", required = true)
    protected String racc;
    @XmlElement(name = "RBCA")
    protected String rbca;
    @XmlElement(name = "RBNAME", required = true)
    protected String rbname;
    @XmlElement(name = "RBP", required = true)
    protected String rbp;
    @XmlElement(name = "BBCCODE", required = true)
    protected String bbccode;
    @XmlElement(name = "RBBSWIFT", required = true)
    protected String rbbswift;
    @XmlElement(name = "BBSWIFT", required = true)
    protected String bbswift;
    @XmlElement(name = "BBCA", required = true)
    protected String bbca;
    @XmlElement(name = "BBNAME", required = true)
    protected String bbname;
    @XmlElement(name = "BBP", required = true)
    protected String bbp;
    @XmlElement(name = "BBADDR", required = true)
    protected String bbaddr;
    @XmlElement(name = "RCCODE", required = true)
    protected String rccode;
    @XmlElement(name = "RP", required = true)
    protected String rp;
    @XmlElement(name = "RADDR", required = true)
    protected String raddr;
    @XmlElement(name = "RBCCODE", required = true)
    protected String rbccode;
    @XmlElement(name = "RBADDR", required = true)
    protected String rbaddr;
    @XmlElement(name = "COMMISSION", required = true)
    protected String commission;
    @XmlElement(name = "CACC", required = true)
    protected String cacc;
    @XmlElement(name = "DOCID")
    protected String docid;
    @XmlElement(name = "OPERCODE", required = true)
    protected String opercode;
    @XmlElement(name = "PAYPURP", required = true)
    protected String paypurp;
    protected PDCResponse response;

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
     * Gets the value of the pbpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBPT() {
        return pbpt;
    }

    /**
     * Sets the value of the pbpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBPT(String value) {
        this.pbpt = value;
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
     * Gets the value of the rbca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBCA() {
        return rbca;
    }

    /**
     * Sets the value of the rbca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBCA(String value) {
        this.rbca = value;
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
     * Gets the value of the rbp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBP() {
        return rbp;
    }

    /**
     * Sets the value of the rbp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBP(String value) {
        this.rbp = value;
    }

    /**
     * Gets the value of the bbccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBCCODE() {
        return bbccode;
    }

    /**
     * Sets the value of the bbccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBCCODE(String value) {
        this.bbccode = value;
    }

    /**
     * Gets the value of the rbbswift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBBSWIFT() {
        return rbbswift;
    }

    /**
     * Sets the value of the rbbswift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBBSWIFT(String value) {
        this.rbbswift = value;
    }

    /**
     * Gets the value of the bbswift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBSWIFT() {
        return bbswift;
    }

    /**
     * Sets the value of the bbswift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBSWIFT(String value) {
        this.bbswift = value;
    }

    /**
     * Gets the value of the bbca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBCA() {
        return bbca;
    }

    /**
     * Sets the value of the bbca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBCA(String value) {
        this.bbca = value;
    }

    /**
     * Gets the value of the bbname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBNAME() {
        return bbname;
    }

    /**
     * Sets the value of the bbname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBNAME(String value) {
        this.bbname = value;
    }

    /**
     * Gets the value of the bbp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBP() {
        return bbp;
    }

    /**
     * Sets the value of the bbp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBP(String value) {
        this.bbp = value;
    }

    /**
     * Gets the value of the bbaddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBADDR() {
        return bbaddr;
    }

    /**
     * Sets the value of the bbaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBADDR(String value) {
        this.bbaddr = value;
    }

    /**
     * Gets the value of the rccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCCODE() {
        return rccode;
    }

    /**
     * Sets the value of the rccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCCODE(String value) {
        this.rccode = value;
    }

    /**
     * Gets the value of the rp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRP() {
        return rp;
    }

    /**
     * Sets the value of the rp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRP(String value) {
        this.rp = value;
    }

    /**
     * Gets the value of the raddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRADDR() {
        return raddr;
    }

    /**
     * Sets the value of the raddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRADDR(String value) {
        this.raddr = value;
    }

    /**
     * Gets the value of the rbccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBCCODE() {
        return rbccode;
    }

    /**
     * Sets the value of the rbccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBCCODE(String value) {
        this.rbccode = value;
    }

    /**
     * Gets the value of the rbaddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBADDR() {
        return rbaddr;
    }

    /**
     * Sets the value of the rbaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBADDR(String value) {
        this.rbaddr = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMISSION() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMISSION(String value) {
        this.commission = value;
    }

    /**
     * Gets the value of the cacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCACC() {
        return cacc;
    }

    /**
     * Sets the value of the cacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCACC(String value) {
        this.cacc = value;
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
     * Gets the value of the opercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERCODE() {
        return opercode;
    }

    /**
     * Sets the value of the opercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERCODE(String value) {
        this.opercode = value;
    }

    /**
     * Gets the value of the paypurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYPURP() {
        return paypurp;
    }

    /**
     * Sets the value of the paypurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYPURP(String value) {
        this.paypurp = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link PDCResponse }
     *     
     */
    public PDCResponse getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDCResponse }
     *     
     */
    public void setResponse(PDCResponse value) {
        this.response = value;
    }

}

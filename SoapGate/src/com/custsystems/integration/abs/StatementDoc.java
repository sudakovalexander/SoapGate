
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StatementDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementDoc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EXT_DOC_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="PD" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="N"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="A" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="G" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CT" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SYMBOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRIORITY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PKPP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RKPP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OKATO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="REASON" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CBCCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UIN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AO"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KPPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BIKO"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BNAMEO"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCAO"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="INNC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KPPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BIKC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BNAMEC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCAC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AOPER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OPCUR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRDN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="HOLD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CLINAME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MCC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="STYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExecDateBank" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RegDateBank" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="StatDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="BPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementDoc", propOrder = {
    "extdocid",
    "d",
    "pd",
    "n",
    "a",
    "g",
    "ct",
    "oc",
    "symbol",
    "st",
    "priority",
    "pkpp",
    "rkpp",
    "okato",
    "ts",
    "reason",
    "tp",
    "tn",
    "td",
    "tt",
    "cbccode",
    "uin",
    "ao",
    "no",
    "inno",
    "kppo",
    "biko",
    "bnameo",
    "bcao",
    "ac",
    "nc",
    "innc",
    "kppc",
    "bikc",
    "bnamec",
    "bcac",
    "sdate",
    "tdate",
    "aoper",
    "opcur",
    "crdn",
    "hold",
    "cliname",
    "mcc",
    "rdate",
    "stype",
    "execDateBank",
    "regDateBank",
    "statDate",
    "bpo",
    "bpc",
    "operatorName"
})
public class StatementDoc {

    @XmlElement(name = "EXT_DOC_ID")
    protected String extdocid;
    @XmlElement(name = "D", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar d;
    @XmlElement(name = "PD", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pd;
    @XmlElement(name = "N", required = true)
    protected String n;
    @XmlElement(name = "A", required = true)
    protected BigDecimal a;
    @XmlElement(name = "G")
    protected String g;
    @XmlElement(name = "CT")
    protected int ct;
    @XmlElement(name = "OC", required = true)
    protected String oc;
    @XmlElement(name = "SYMBOL")
    protected String symbol;
    @XmlElement(name = "ST", required = true)
    protected String st;
    @XmlElement(name = "PRIORITY", required = true)
    protected String priority;
    @XmlElement(name = "PKPP", required = true)
    protected String pkpp;
    @XmlElement(name = "RKPP", required = true)
    protected String rkpp;
    @XmlElement(name = "OKATO", required = true)
    protected String okato;
    @XmlElement(name = "TS", required = true)
    protected String ts;
    @XmlElement(name = "REASON", required = true)
    protected String reason;
    @XmlElement(name = "TP", required = true)
    protected String tp;
    @XmlElement(name = "TN", required = true)
    protected String tn;
    @XmlElement(name = "TD", required = true)
    protected String td;
    @XmlElement(name = "TT", required = true)
    protected String tt;
    @XmlElement(name = "CBCCODE", required = true)
    protected String cbccode;
    @XmlElement(name = "UIN")
    protected String uin;
    @XmlElement(name = "AO", required = true)
    protected String ao;
    @XmlElement(name = "NO")
    protected String no;
    @XmlElement(name = "INNO")
    protected String inno;
    @XmlElement(name = "KPPO")
    protected String kppo;
    @XmlElement(name = "BIKO", required = true)
    protected String biko;
    @XmlElement(name = "BNAMEO", required = true)
    protected String bnameo;
    @XmlElement(name = "BCAO", required = true)
    protected String bcao;
    @XmlElement(name = "AC", required = true)
    protected String ac;
    @XmlElement(name = "NC")
    protected String nc;
    @XmlElement(name = "INNC")
    protected String innc;
    @XmlElement(name = "KPPC")
    protected String kppc;
    @XmlElement(name = "BIKC", required = true)
    protected String bikc;
    @XmlElement(name = "BNAMEC", required = true)
    protected String bnamec;
    @XmlElement(name = "BCAC", required = true)
    protected String bcac;
    @XmlElement(name = "SDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sdate;
    @XmlElement(name = "TDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tdate;
    @XmlElement(name = "AOPER")
    protected BigDecimal aoper;
    @XmlElement(name = "OPCUR")
    protected String opcur;
    @XmlElement(name = "CRDN")
    protected BigDecimal crdn;
    @XmlElement(name = "HOLD")
    protected String hold;
    @XmlElement(name = "CLINAME")
    protected String cliname;
    @XmlElement(name = "MCC")
    protected String mcc;
    @XmlElement(name = "RDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rdate;
    @XmlElement(name = "STYPE")
    protected String stype;
    @XmlElement(name = "ExecDateBank")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar execDateBank;
    @XmlElement(name = "RegDateBank")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regDateBank;
    @XmlElement(name = "StatDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statDate;
    @XmlElement(name = "BPO")
    protected String bpo;
    @XmlElement(name = "BPC")
    protected String bpc;
    protected String operatorName;

    /**
     * Gets the value of the extdocid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTDOCID() {
        return extdocid;
    }

    /**
     * Sets the value of the extdocid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTDOCID(String value) {
        this.extdocid = value;
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
     * Gets the value of the pd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPD() {
        return pd;
    }

    /**
     * Sets the value of the pd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPD(XMLGregorianCalendar value) {
        this.pd = value;
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
     * Gets the value of the g property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getG() {
        return g;
    }

    /**
     * Sets the value of the g property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setG(String value) {
        this.g = value;
    }

    /**
     * Gets the value of the ct property.
     * 
     */
    public int getCT() {
        return ct;
    }

    /**
     * Sets the value of the ct property.
     * 
     */
    public void setCT(int value) {
        this.ct = value;
    }

    /**
     * Gets the value of the oc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOC() {
        return oc;
    }

    /**
     * Sets the value of the oc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOC(String value) {
        this.oc = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYMBOL() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYMBOL(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the st property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getST() {
        return st;
    }

    /**
     * Sets the value of the st property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setST(String value) {
        this.st = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIORITY() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIORITY(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the pkpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPKPP() {
        return pkpp;
    }

    /**
     * Sets the value of the pkpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPKPP(String value) {
        this.pkpp = value;
    }

    /**
     * Gets the value of the rkpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRKPP() {
        return rkpp;
    }

    /**
     * Sets the value of the rkpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRKPP(String value) {
        this.rkpp = value;
    }

    /**
     * Gets the value of the okato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKATO() {
        return okato;
    }

    /**
     * Sets the value of the okato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKATO(String value) {
        this.okato = value;
    }

    /**
     * Gets the value of the ts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTS() {
        return ts;
    }

    /**
     * Sets the value of the ts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTS(String value) {
        this.ts = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREASON() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREASON(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTP() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTP(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the tn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTN() {
        return tn;
    }

    /**
     * Sets the value of the tn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTN(String value) {
        this.tn = value;
    }

    /**
     * Gets the value of the td property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTD() {
        return td;
    }

    /**
     * Sets the value of the td property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTD(String value) {
        this.td = value;
    }

    /**
     * Gets the value of the tt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTT() {
        return tt;
    }

    /**
     * Sets the value of the tt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTT(String value) {
        this.tt = value;
    }

    /**
     * Gets the value of the cbccode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBCCODE() {
        return cbccode;
    }

    /**
     * Sets the value of the cbccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBCCODE(String value) {
        this.cbccode = value;
    }

    /**
     * Gets the value of the uin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIN() {
        return uin;
    }

    /**
     * Sets the value of the uin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIN(String value) {
        this.uin = value;
    }

    /**
     * Gets the value of the ao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAO() {
        return ao;
    }

    /**
     * Sets the value of the ao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAO(String value) {
        this.ao = value;
    }

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNO() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNO(String value) {
        this.no = value;
    }

    /**
     * Gets the value of the inno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINNO() {
        return inno;
    }

    /**
     * Sets the value of the inno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINNO(String value) {
        this.inno = value;
    }

    /**
     * Gets the value of the kppo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPPO() {
        return kppo;
    }

    /**
     * Sets the value of the kppo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPPO(String value) {
        this.kppo = value;
    }

    /**
     * Gets the value of the biko property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIKO() {
        return biko;
    }

    /**
     * Sets the value of the biko property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIKO(String value) {
        this.biko = value;
    }

    /**
     * Gets the value of the bnameo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNAMEO() {
        return bnameo;
    }

    /**
     * Sets the value of the bnameo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNAMEO(String value) {
        this.bnameo = value;
    }

    /**
     * Gets the value of the bcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCAO() {
        return bcao;
    }

    /**
     * Sets the value of the bcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCAO(String value) {
        this.bcao = value;
    }

    /**
     * Gets the value of the ac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAC() {
        return ac;
    }

    /**
     * Sets the value of the ac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAC(String value) {
        this.ac = value;
    }

    /**
     * Gets the value of the nc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNC() {
        return nc;
    }

    /**
     * Sets the value of the nc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNC(String value) {
        this.nc = value;
    }

    /**
     * Gets the value of the innc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINNC() {
        return innc;
    }

    /**
     * Sets the value of the innc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINNC(String value) {
        this.innc = value;
    }

    /**
     * Gets the value of the kppc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPPC() {
        return kppc;
    }

    /**
     * Sets the value of the kppc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPPC(String value) {
        this.kppc = value;
    }

    /**
     * Gets the value of the bikc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIKC() {
        return bikc;
    }

    /**
     * Sets the value of the bikc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIKC(String value) {
        this.bikc = value;
    }

    /**
     * Gets the value of the bnamec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNAMEC() {
        return bnamec;
    }

    /**
     * Sets the value of the bnamec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNAMEC(String value) {
        this.bnamec = value;
    }

    /**
     * Gets the value of the bcac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCAC() {
        return bcac;
    }

    /**
     * Sets the value of the bcac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCAC(String value) {
        this.bcac = value;
    }

    /**
     * Gets the value of the sdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSDATE() {
        return sdate;
    }

    /**
     * Sets the value of the sdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSDATE(XMLGregorianCalendar value) {
        this.sdate = value;
    }

    /**
     * Gets the value of the tdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDATE() {
        return tdate;
    }

    /**
     * Sets the value of the tdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDATE(XMLGregorianCalendar value) {
        this.tdate = value;
    }

    /**
     * Gets the value of the aoper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAOPER() {
        return aoper;
    }

    /**
     * Sets the value of the aoper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAOPER(BigDecimal value) {
        this.aoper = value;
    }

    /**
     * Gets the value of the opcur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPCUR() {
        return opcur;
    }

    /**
     * Sets the value of the opcur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPCUR(String value) {
        this.opcur = value;
    }

    /**
     * Gets the value of the crdn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRDN() {
        return crdn;
    }

    /**
     * Sets the value of the crdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRDN(BigDecimal value) {
        this.crdn = value;
    }

    /**
     * Gets the value of the hold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOLD() {
        return hold;
    }

    /**
     * Sets the value of the hold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOLD(String value) {
        this.hold = value;
    }

    /**
     * Gets the value of the cliname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLINAME() {
        return cliname;
    }

    /**
     * Sets the value of the cliname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLINAME(String value) {
        this.cliname = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCC() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCC(String value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the rdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRDATE() {
        return rdate;
    }

    /**
     * Sets the value of the rdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRDATE(XMLGregorianCalendar value) {
        this.rdate = value;
    }

    /**
     * Gets the value of the stype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTYPE() {
        return stype;
    }

    /**
     * Sets the value of the stype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTYPE(String value) {
        this.stype = value;
    }

    /**
     * Gets the value of the execDateBank property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecDateBank() {
        return execDateBank;
    }

    /**
     * Sets the value of the execDateBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecDateBank(XMLGregorianCalendar value) {
        this.execDateBank = value;
    }

    /**
     * Gets the value of the regDateBank property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDateBank() {
        return regDateBank;
    }

    /**
     * Sets the value of the regDateBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDateBank(XMLGregorianCalendar value) {
        this.regDateBank = value;
    }

    /**
     * Gets the value of the statDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatDate() {
        return statDate;
    }

    /**
     * Sets the value of the statDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatDate(XMLGregorianCalendar value) {
        this.statDate = value;
    }

    /**
     * Gets the value of the bpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPO() {
        return bpo;
    }

    /**
     * Sets the value of the bpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPO(String value) {
        this.bpo = value;
    }

    /**
     * Gets the value of the bpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBPC() {
        return bpc;
    }

    /**
     * Sets the value of the bpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBPC(String value) {
        this.bpc = value;
    }

    /**
     * Gets the value of the operatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Sets the value of the operatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

}

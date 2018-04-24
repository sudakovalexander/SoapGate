
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Card complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Card"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PROCESSING" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="34"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="19"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BIC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CA" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CUR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ED" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="R" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CRLM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TYPENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CBLNG" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SMS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CROLE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CONTRACTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CARDHASH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRODCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRODNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SMSPHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ABLOCK" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ODBT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PRCONREST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MARK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TECHOVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONTRACTSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CARHOLDERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DCTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DCTNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DCTSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DCTORG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DCTDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="OPC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DBT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PRCA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PRCO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UCSUT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DATELIMIT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ADUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AFINES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="APREF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ACRED" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AOWN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Card", propOrder = {
    "processing",
    "cn",
    "bic",
    "bcn",
    "ca",
    "crd",
    "cur",
    "bd",
    "ed",
    "r",
    "crlm",
    "pc",
    "type",
    "typename",
    "status",
    "cblng",
    "nname",
    "ename",
    "vid",
    "exp",
    "sms",
    "crole",
    "contractid",
    "cardhash",
    "prodcode",
    "prodname",
    "smsphone",
    "gd",
    "ablock",
    "odbt",
    "prconrest",
    "mark",
    "techover",
    "contractstatus",
    "carholderid",
    "dcttype",
    "dctnum",
    "dctser",
    "dctorg",
    "dctdate",
    "opc",
    "dbt",
    "prca",
    "prco",
    "ucsut",
    "datelimit",
    "adue",
    "afines",
    "apref",
    "acred",
    "aown"
})
public class Card {

    @XmlElement(name = "PROCESSING")
    protected String processing;
    @XmlElement(name = "CN")
    protected String cn;
    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "BCN")
    protected String bcn;
    @XmlElement(name = "CA")
    protected String ca;
    @XmlElement(name = "CRD")
    protected String crd;
    @XmlElement(name = "CUR")
    protected String cur;
    @XmlElement(name = "BD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bd;
    @XmlElement(name = "ED")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ed;
    @XmlElement(name = "R")
    protected BigDecimal r;
    @XmlElement(name = "CRLM")
    protected BigDecimal crlm;
    @XmlElement(name = "PC")
    protected BigDecimal pc;
    @XmlElement(name = "TYPE")
    protected String type;
    @XmlElement(name = "TYPENAME")
    protected String typename;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "CBLNG")
    protected Integer cblng;
    @XmlElement(name = "NNAME")
    protected String nname;
    @XmlElement(name = "ENAME")
    protected String ename;
    @XmlElement(name = "VID")
    protected String vid;
    @XmlElement(name = "EXP")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exp;
    @XmlElement(name = "SMS")
    protected Boolean sms;
    @XmlElement(name = "CROLE")
    protected Integer crole;
    @XmlElement(name = "CONTRACTID")
    protected String contractid;
    @XmlElement(name = "CARDHASH")
    protected String cardhash;
    @XmlElement(name = "PRODCODE")
    protected String prodcode;
    @XmlElement(name = "PRODNAME")
    protected String prodname;
    @XmlElement(name = "SMSPHONE")
    protected String smsphone;
    @XmlElement(name = "GD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gd;
    @XmlElement(name = "ABLOCK")
    protected BigDecimal ablock;
    @XmlElement(name = "ODBT")
    protected BigDecimal odbt;
    @XmlElement(name = "PRCONREST")
    protected BigDecimal prconrest;
    @XmlElement(name = "MARK")
    protected String mark;
    @XmlElement(name = "TECHOVER")
    protected String techover;
    @XmlElement(name = "CONTRACTSTATUS")
    protected String contractstatus;
    @XmlElement(name = "CARHOLDERID")
    protected String carholderid;
    @XmlElement(name = "DCTTYPE")
    protected String dcttype;
    @XmlElement(name = "DCTNUM")
    protected String dctnum;
    @XmlElement(name = "DCTSER")
    protected String dctser;
    @XmlElement(name = "DCTORG")
    protected String dctorg;
    @XmlElement(name = "DCTDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dctdate;
    @XmlElement(name = "OPC")
    protected BigDecimal opc;
    @XmlElement(name = "DBT")
    protected BigDecimal dbt;
    @XmlElement(name = "PRCA")
    protected BigDecimal prca;
    @XmlElement(name = "PRCO")
    protected BigDecimal prco;
    @XmlElement(name = "UCSUT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ucsut;
    @XmlElement(name = "DATELIMIT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datelimit;
    @XmlElement(name = "ADUE")
    protected BigDecimal adue;
    @XmlElement(name = "AFINES")
    protected BigDecimal afines;
    @XmlElement(name = "APREF")
    protected BigDecimal apref;
    @XmlElement(name = "ACRED")
    protected BigDecimal acred;
    @XmlElement(name = "AOWN")
    protected BigDecimal aown;

    /**
     * Gets the value of the processing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCESSING() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCESSING(String value) {
        this.processing = value;
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
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the bcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCN() {
        return bcn;
    }

    /**
     * Sets the value of the bcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCN(String value) {
        this.bcn = value;
    }

    /**
     * Gets the value of the ca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCA() {
        return ca;
    }

    /**
     * Sets the value of the ca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCA(String value) {
        this.ca = value;
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
     * Gets the value of the bd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBD() {
        return bd;
    }

    /**
     * Sets the value of the bd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBD(XMLGregorianCalendar value) {
        this.bd = value;
    }

    /**
     * Gets the value of the ed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getED() {
        return ed;
    }

    /**
     * Sets the value of the ed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setED(XMLGregorianCalendar value) {
        this.ed = value;
    }

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setR(BigDecimal value) {
        this.r = value;
    }

    /**
     * Gets the value of the crlm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRLM() {
        return crlm;
    }

    /**
     * Sets the value of the crlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRLM(BigDecimal value) {
        this.crlm = value;
    }

    /**
     * Gets the value of the pc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPC() {
        return pc;
    }

    /**
     * Sets the value of the pc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPC(BigDecimal value) {
        this.pc = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPENAME() {
        return typename;
    }

    /**
     * Sets the value of the typename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPENAME(String value) {
        this.typename = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the cblng property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCBLNG() {
        return cblng;
    }

    /**
     * Sets the value of the cblng property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCBLNG(Integer value) {
        this.cblng = value;
    }

    /**
     * Gets the value of the nname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNNAME() {
        return nname;
    }

    /**
     * Sets the value of the nname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNNAME(String value) {
        this.nname = value;
    }

    /**
     * Gets the value of the ename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENAME() {
        return ename;
    }

    /**
     * Sets the value of the ename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENAME(String value) {
        this.ename = value;
    }

    /**
     * Gets the value of the vid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVID() {
        return vid;
    }

    /**
     * Sets the value of the vid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVID(String value) {
        this.vid = value;
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
     * Gets the value of the sms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSMS() {
        return sms;
    }

    /**
     * Sets the value of the sms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSMS(Boolean value) {
        this.sms = value;
    }

    /**
     * Gets the value of the crole property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCROLE() {
        return crole;
    }

    /**
     * Sets the value of the crole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCROLE(Integer value) {
        this.crole = value;
    }

    /**
     * Gets the value of the contractid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTID() {
        return contractid;
    }

    /**
     * Sets the value of the contractid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTID(String value) {
        this.contractid = value;
    }

    /**
     * Gets the value of the cardhash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDHASH() {
        return cardhash;
    }

    /**
     * Sets the value of the cardhash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDHASH(String value) {
        this.cardhash = value;
    }

    /**
     * Gets the value of the prodcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODCODE() {
        return prodcode;
    }

    /**
     * Sets the value of the prodcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODCODE(String value) {
        this.prodcode = value;
    }

    /**
     * Gets the value of the prodname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODNAME() {
        return prodname;
    }

    /**
     * Sets the value of the prodname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODNAME(String value) {
        this.prodname = value;
    }

    /**
     * Gets the value of the smsphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSPHONE() {
        return smsphone;
    }

    /**
     * Sets the value of the smsphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSPHONE(String value) {
        this.smsphone = value;
    }

    /**
     * Gets the value of the gd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGD() {
        return gd;
    }

    /**
     * Sets the value of the gd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGD(XMLGregorianCalendar value) {
        this.gd = value;
    }

    /**
     * Gets the value of the ablock property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getABLOCK() {
        return ablock;
    }

    /**
     * Sets the value of the ablock property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setABLOCK(BigDecimal value) {
        this.ablock = value;
    }

    /**
     * Gets the value of the odbt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getODBT() {
        return odbt;
    }

    /**
     * Sets the value of the odbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setODBT(BigDecimal value) {
        this.odbt = value;
    }

    /**
     * Gets the value of the prconrest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRCONREST() {
        return prconrest;
    }

    /**
     * Sets the value of the prconrest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRCONREST(BigDecimal value) {
        this.prconrest = value;
    }

    /**
     * Gets the value of the mark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARK() {
        return mark;
    }

    /**
     * Sets the value of the mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARK(String value) {
        this.mark = value;
    }

    /**
     * Gets the value of the techover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTECHOVER() {
        return techover;
    }

    /**
     * Sets the value of the techover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTECHOVER(String value) {
        this.techover = value;
    }

    /**
     * Gets the value of the contractstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACTSTATUS() {
        return contractstatus;
    }

    /**
     * Sets the value of the contractstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACTSTATUS(String value) {
        this.contractstatus = value;
    }

    /**
     * Gets the value of the carholderid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARHOLDERID() {
        return carholderid;
    }

    /**
     * Sets the value of the carholderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARHOLDERID(String value) {
        this.carholderid = value;
    }

    /**
     * Gets the value of the dcttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCTTYPE() {
        return dcttype;
    }

    /**
     * Sets the value of the dcttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCTTYPE(String value) {
        this.dcttype = value;
    }

    /**
     * Gets the value of the dctnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCTNUM() {
        return dctnum;
    }

    /**
     * Sets the value of the dctnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCTNUM(String value) {
        this.dctnum = value;
    }

    /**
     * Gets the value of the dctser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCTSER() {
        return dctser;
    }

    /**
     * Sets the value of the dctser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCTSER(String value) {
        this.dctser = value;
    }

    /**
     * Gets the value of the dctorg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCTORG() {
        return dctorg;
    }

    /**
     * Sets the value of the dctorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCTORG(String value) {
        this.dctorg = value;
    }

    /**
     * Gets the value of the dctdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDCTDATE() {
        return dctdate;
    }

    /**
     * Sets the value of the dctdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDCTDATE(XMLGregorianCalendar value) {
        this.dctdate = value;
    }

    /**
     * Gets the value of the opc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOPC() {
        return opc;
    }

    /**
     * Sets the value of the opc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOPC(BigDecimal value) {
        this.opc = value;
    }

    /**
     * Gets the value of the dbt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDBT() {
        return dbt;
    }

    /**
     * Sets the value of the dbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDBT(BigDecimal value) {
        this.dbt = value;
    }

    /**
     * Gets the value of the prca property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRCA() {
        return prca;
    }

    /**
     * Sets the value of the prca property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRCA(BigDecimal value) {
        this.prca = value;
    }

    /**
     * Gets the value of the prco property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRCO() {
        return prco;
    }

    /**
     * Sets the value of the prco property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRCO(BigDecimal value) {
        this.prco = value;
    }

    /**
     * Gets the value of the ucsut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUCSUT() {
        return ucsut;
    }

    /**
     * Sets the value of the ucsut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUCSUT(XMLGregorianCalendar value) {
        this.ucsut = value;
    }

    /**
     * Gets the value of the datelimit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATELIMIT() {
        return datelimit;
    }

    /**
     * Sets the value of the datelimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATELIMIT(XMLGregorianCalendar value) {
        this.datelimit = value;
    }

    /**
     * Gets the value of the adue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getADUE() {
        return adue;
    }

    /**
     * Sets the value of the adue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setADUE(BigDecimal value) {
        this.adue = value;
    }

    /**
     * Gets the value of the afines property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAFINES() {
        return afines;
    }

    /**
     * Sets the value of the afines property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAFINES(BigDecimal value) {
        this.afines = value;
    }

    /**
     * Gets the value of the apref property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAPREF() {
        return apref;
    }

    /**
     * Sets the value of the apref property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAPREF(BigDecimal value) {
        this.apref = value;
    }

    /**
     * Gets the value of the acred property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACRED() {
        return acred;
    }

    /**
     * Sets the value of the acred property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACRED(BigDecimal value) {
        this.acred = value;
    }

    /**
     * Gets the value of the aown property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAOWN() {
        return aown;
    }

    /**
     * Sets the value of the aown property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAOWN(BigDecimal value) {
        this.aown = value;
    }

}


package com.custsystems.integration.abs;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Deposit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Deposit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CA"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
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
 *         &lt;element name="CRD" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DO" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ED" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EDA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="BDW" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PERCENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FILIAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPACC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="34"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PERACC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="34"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CLACC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="34"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PERCN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="34"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PERCENT2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ISCAP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LPD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ISPA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IABE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IAF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ADOE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AAFD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PERDEP" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PERPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ISM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ISREM" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ISPE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PBD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PED" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ISPR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deposit", propOrder = {
    "ca",
    "cur",
    "crd",
    "name",
    "rest",
    "_do",
    "ed",
    "eda",
    "bdw",
    "limit",
    "ma",
    "percent",
    "filial",
    "oa",
    "cid",
    "cn",
    "opacc",
    "peracc",
    "clacc",
    "percn",
    "percent2",
    "pc",
    "iscap",
    "lpd",
    "ispa",
    "iabe",
    "iaf",
    "adoe",
    "aafd",
    "sname",
    "perdep",
    "perpp",
    "ret",
    "ism",
    "isrem",
    "ispe",
    "tps",
    "pbd",
    "ped",
    "cp",
    "ispr"
})
public class Deposit {

    @XmlElement(name = "CA", required = true)
    protected String ca;
    @XmlElement(name = "CUR")
    protected String cur;
    @XmlElement(name = "CRD")
    protected String crd;
    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "REST")
    protected BigDecimal rest;
    @XmlElement(name = "DO")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar _do;
    @XmlElement(name = "ED")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ed;
    @XmlElement(name = "EDA")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eda;
    @XmlElement(name = "BDW")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bdw;
    @XmlElement(name = "LIMIT")
    protected BigDecimal limit;
    @XmlElement(name = "MA")
    protected BigDecimal ma;
    @XmlElement(name = "PERCENT")
    protected String percent;
    @XmlElement(name = "FILIAL")
    protected String filial;
    @XmlElement(name = "OA")
    protected BigDecimal oa;
    @XmlElement(name = "CID")
    protected String cid;
    @XmlElement(name = "CN")
    protected String cn;
    @XmlElement(name = "OPACC")
    protected String opacc;
    @XmlElement(name = "PERACC")
    protected String peracc;
    @XmlElement(name = "CLACC")
    protected String clacc;
    @XmlElement(name = "PERCN")
    protected String percn;
    @XmlElement(name = "PERCENT2")
    protected BigDecimal percent2;
    @XmlElement(name = "PC")
    protected String pc;
    @XmlElement(name = "ISCAP")
    protected Boolean iscap;
    @XmlElement(name = "LPD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lpd;
    @XmlElement(name = "ISPA")
    protected Boolean ispa;
    @XmlElement(name = "IABE")
    protected BigDecimal iabe;
    @XmlElement(name = "IAF")
    protected BigDecimal iaf;
    @XmlElement(name = "ADOE")
    protected BigDecimal adoe;
    @XmlElement(name = "AAFD")
    protected BigDecimal aafd;
    @XmlElement(name = "SNAME")
    protected String sname;
    @XmlElement(name = "PERDEP")
    protected BigInteger perdep;
    @XmlElement(name = "PERPP")
    protected String perpp;
    @XmlElement(name = "RET")
    protected String ret;
    @XmlElement(name = "ISM")
    protected Boolean ism;
    @XmlElement(name = "ISREM")
    protected Boolean isrem;
    @XmlElement(name = "ISPE")
    protected Boolean ispe;
    @XmlElement(name = "TPS")
    protected String tps;
    @XmlElement(name = "PBD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pbd;
    @XmlElement(name = "PED")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ped;
    @XmlElement(name = "CP")
    protected BigInteger cp;
    @XmlElement(name = "ISPR")
    protected Boolean ispr;

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

    /**
     * Gets the value of the rest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getREST() {
        return rest;
    }

    /**
     * Sets the value of the rest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setREST(BigDecimal value) {
        this.rest = value;
    }

    /**
     * Gets the value of the do property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDO() {
        return _do;
    }

    /**
     * Sets the value of the do property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDO(XMLGregorianCalendar value) {
        this._do = value;
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
     * Gets the value of the eda property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEDA() {
        return eda;
    }

    /**
     * Sets the value of the eda property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEDA(XMLGregorianCalendar value) {
        this.eda = value;
    }

    /**
     * Gets the value of the bdw property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBDW() {
        return bdw;
    }

    /**
     * Sets the value of the bdw property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBDW(XMLGregorianCalendar value) {
        this.bdw = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLIMIT() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLIMIT(BigDecimal value) {
        this.limit = value;
    }

    /**
     * Gets the value of the ma property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMA() {
        return ma;
    }

    /**
     * Sets the value of the ma property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMA(BigDecimal value) {
        this.ma = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERCENT() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERCENT(String value) {
        this.percent = value;
    }

    /**
     * Gets the value of the filial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFILIAL() {
        return filial;
    }

    /**
     * Sets the value of the filial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFILIAL(String value) {
        this.filial = value;
    }

    /**
     * Gets the value of the oa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOA() {
        return oa;
    }

    /**
     * Sets the value of the oa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOA(BigDecimal value) {
        this.oa = value;
    }

    /**
     * Gets the value of the cid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCID() {
        return cid;
    }

    /**
     * Sets the value of the cid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCID(String value) {
        this.cid = value;
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
     * Gets the value of the opacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPACC() {
        return opacc;
    }

    /**
     * Sets the value of the opacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPACC(String value) {
        this.opacc = value;
    }

    /**
     * Gets the value of the peracc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERACC() {
        return peracc;
    }

    /**
     * Sets the value of the peracc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERACC(String value) {
        this.peracc = value;
    }

    /**
     * Gets the value of the clacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLACC() {
        return clacc;
    }

    /**
     * Sets the value of the clacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLACC(String value) {
        this.clacc = value;
    }

    /**
     * Gets the value of the percn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERCN() {
        return percn;
    }

    /**
     * Sets the value of the percn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERCN(String value) {
        this.percn = value;
    }

    /**
     * Gets the value of the percent2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCENT2() {
        return percent2;
    }

    /**
     * Sets the value of the percent2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCENT2(BigDecimal value) {
        this.percent2 = value;
    }

    /**
     * Gets the value of the pc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPC() {
        return pc;
    }

    /**
     * Sets the value of the pc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPC(String value) {
        this.pc = value;
    }

    /**
     * Gets the value of the iscap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISCAP() {
        return iscap;
    }

    /**
     * Sets the value of the iscap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISCAP(Boolean value) {
        this.iscap = value;
    }

    /**
     * Gets the value of the lpd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLPD() {
        return lpd;
    }

    /**
     * Sets the value of the lpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLPD(XMLGregorianCalendar value) {
        this.lpd = value;
    }

    /**
     * Gets the value of the ispa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISPA() {
        return ispa;
    }

    /**
     * Sets the value of the ispa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISPA(Boolean value) {
        this.ispa = value;
    }

    /**
     * Gets the value of the iabe property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIABE() {
        return iabe;
    }

    /**
     * Sets the value of the iabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIABE(BigDecimal value) {
        this.iabe = value;
    }

    /**
     * Gets the value of the iaf property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIAF() {
        return iaf;
    }

    /**
     * Sets the value of the iaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIAF(BigDecimal value) {
        this.iaf = value;
    }

    /**
     * Gets the value of the adoe property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getADOE() {
        return adoe;
    }

    /**
     * Sets the value of the adoe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setADOE(BigDecimal value) {
        this.adoe = value;
    }

    /**
     * Gets the value of the aafd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAAFD() {
        return aafd;
    }

    /**
     * Sets the value of the aafd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAAFD(BigDecimal value) {
        this.aafd = value;
    }

    /**
     * Gets the value of the sname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNAME() {
        return sname;
    }

    /**
     * Sets the value of the sname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNAME(String value) {
        this.sname = value;
    }

    /**
     * Gets the value of the perdep property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPERDEP() {
        return perdep;
    }

    /**
     * Sets the value of the perdep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPERDEP(BigInteger value) {
        this.perdep = value;
    }

    /**
     * Gets the value of the perpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERPP() {
        return perpp;
    }

    /**
     * Sets the value of the perpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERPP(String value) {
        this.perpp = value;
    }

    /**
     * Gets the value of the ret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRET() {
        return ret;
    }

    /**
     * Sets the value of the ret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRET(String value) {
        this.ret = value;
    }

    /**
     * Gets the value of the ism property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISM() {
        return ism;
    }

    /**
     * Sets the value of the ism property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISM(Boolean value) {
        this.ism = value;
    }

    /**
     * Gets the value of the isrem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISREM() {
        return isrem;
    }

    /**
     * Sets the value of the isrem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISREM(Boolean value) {
        this.isrem = value;
    }

    /**
     * Gets the value of the ispe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISPE() {
        return ispe;
    }

    /**
     * Sets the value of the ispe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISPE(Boolean value) {
        this.ispe = value;
    }

    /**
     * Gets the value of the tps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPS() {
        return tps;
    }

    /**
     * Sets the value of the tps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPS(String value) {
        this.tps = value;
    }

    /**
     * Gets the value of the pbd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPBD() {
        return pbd;
    }

    /**
     * Sets the value of the pbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPBD(XMLGregorianCalendar value) {
        this.pbd = value;
    }

    /**
     * Gets the value of the ped property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPED() {
        return ped;
    }

    /**
     * Sets the value of the ped property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPED(XMLGregorianCalendar value) {
        this.ped = value;
    }

    /**
     * Gets the value of the cp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCP() {
        return cp;
    }

    /**
     * Sets the value of the cp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCP(BigInteger value) {
        this.cp = value;
    }

    /**
     * Gets the value of the ispr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISPR() {
        return ispr;
    }

    /**
     * Sets the value of the ispr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISPR(Boolean value) {
        this.ispr = value;
    }

}


package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PDRBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDRBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="N"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="A" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PINN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="RINN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RTYP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RNAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RACC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RBBIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RBCA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RBTYP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RBNAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RBPT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RBP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RKPP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OKATO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="REASON" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CBCCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DOCID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="COMISSION" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PAYPURP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="URGENT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDRBO", propOrder = {
    "reqID",
    "subSys",
    "customerID",
    "d",
    "n",
    "a",
    "pinn",
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
    "rinn",
    "rtyp",
    "rname",
    "racc",
    "rbbik",
    "rbca",
    "rbtyp",
    "rbname",
    "rbpt",
    "rbp",
    "rkpp",
    "okato",
    "ts",
    "reason",
    "tp",
    "tn",
    "td",
    "tt",
    "cbccode",
    "docid",
    "comission",
    "paypurp",
    "urgent"
})
public class PDRBO {

    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "D", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar d;
    @XmlElement(name = "N", required = true)
    protected String n;
    @XmlElement(name = "A", required = true)
    protected BigDecimal a;
    @XmlElement(name = "PINN")
    protected String pinn;
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
    @XmlElement(name = "RINN")
    protected String rinn;
    @XmlElement(name = "RTYP", required = true)
    protected String rtyp;
    @XmlElement(name = "RNAME", required = true)
    protected String rname;
    @XmlElement(name = "RACC", required = true)
    protected String racc;
    @XmlElement(name = "RBBIK")
    protected String rbbik;
    @XmlElement(name = "RBCA")
    protected String rbca;
    @XmlElement(name = "RBTYP", required = true)
    protected String rbtyp;
    @XmlElement(name = "RBNAME", required = true)
    protected String rbname;
    @XmlElement(name = "RBPT", required = true)
    protected String rbpt;
    @XmlElement(name = "RBP", required = true)
    protected String rbp;
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
    @XmlElement(name = "DOCID", required = true)
    protected String docid;
    @XmlElement(name = "COMISSION", required = true)
    protected BigDecimal comission;
    @XmlElement(name = "PAYPURP", required = true)
    protected String paypurp;
    @XmlElement(name = "URGENT", required = true)
    protected String urgent;

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
     * Gets the value of the rbbik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBBIK() {
        return rbbik;
    }

    /**
     * Sets the value of the rbbik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBBIK(String value) {
        this.rbbik = value;
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
     * Gets the value of the rbtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBTYP() {
        return rbtyp;
    }

    /**
     * Sets the value of the rbtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBTYP(String value) {
        this.rbtyp = value;
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
     * Gets the value of the rbpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBPT() {
        return rbpt;
    }

    /**
     * Sets the value of the rbpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBPT(String value) {
        this.rbpt = value;
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
     * Gets the value of the urgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURGENT() {
        return urgent;
    }

    /**
     * Sets the value of the urgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURGENT(String value) {
        this.urgent = value;
    }

}


package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account"&gt;
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
 *         &lt;element name="BIC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SUBTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PLANREST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DO" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ED" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EDA" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="BDW" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PERCENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADPERC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FILIAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESTBS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "ca",
    "cur",
    "crd",
    "bic",
    "name",
    "type",
    "subtype",
    "rest",
    "planrest",
    "_do",
    "ed",
    "eda",
    "bdw",
    "limit",
    "ma",
    "percent",
    "adperc",
    "filial",
    "status",
    "restbs"
})
public class Account {

    @XmlElement(name = "CA", required = true)
    protected String ca;
    @XmlElement(name = "CUR")
    protected String cur;
    @XmlElement(name = "CRD")
    protected String crd;
    @XmlElement(name = "BIC")
    protected String bic;
    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "TYPE", required = true)
    protected String type;
    @XmlElement(name = "SUBTYPE", required = true)
    protected String subtype;
    @XmlElement(name = "REST")
    protected BigDecimal rest;
    @XmlElement(name = "PLANREST")
    protected BigDecimal planrest;
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
    @XmlElement(name = "ADPERC")
    protected BigDecimal adperc;
    @XmlElement(name = "FILIAL")
    protected String filial;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "RESTBS")
    protected BigDecimal restbs;

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
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTYPE() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTYPE(String value) {
        this.subtype = value;
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
     * Gets the value of the planrest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPLANREST() {
        return planrest;
    }

    /**
     * Sets the value of the planrest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPLANREST(BigDecimal value) {
        this.planrest = value;
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
     * Gets the value of the adperc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getADPERC() {
        return adperc;
    }

    /**
     * Sets the value of the adperc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setADPERC(BigDecimal value) {
        this.adperc = value;
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
     * Gets the value of the restbs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRESTBS() {
        return restbs;
    }

    /**
     * Sets the value of the restbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRESTBS(BigDecimal value) {
        this.restbs = value;
    }

}


package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OpenDepositBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenDepositBO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DOCDATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DOCNUMBER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AMOUNTDEBET" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AMOUNTCREDIT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="EXCHANGERATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ACCNUMBER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="34"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CARDNUMBER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PROGCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BRANCHCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PROGVALIDDAY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PERCENTVALUE" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PROGCURRISOCODE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PROGCURRCODE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PERCENTACCNUMBER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="34"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PERCENTCARDNUMBER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ENDACCNUMBER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="34"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ENDCARDNUMBER"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ISMOVE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ISREMOVE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenDepositBO", propOrder = {
    "reqID",
    "subSys",
    "customerID",
    "id",
    "docdate",
    "docnumber",
    "amountdebet",
    "amountcredit",
    "exchangerate",
    "description",
    "accnumber",
    "cardnumber",
    "progcode",
    "branchcode",
    "progvalidday",
    "percentvalue",
    "progcurrisocode",
    "progcurrcode",
    "percentaccnumber",
    "percentcardnumber",
    "endaccnumber",
    "endcardnumber",
    "ismove",
    "isremove"
})
public class OpenDepositBO {

    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "DOCDATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docdate;
    @XmlElement(name = "DOCNUMBER", required = true)
    protected String docnumber;
    @XmlElement(name = "AMOUNTDEBET", required = true)
    protected BigDecimal amountdebet;
    @XmlElement(name = "AMOUNTCREDIT", required = true)
    protected BigDecimal amountcredit;
    @XmlElement(name = "EXCHANGERATE", required = true)
    protected String exchangerate;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;
    @XmlElement(name = "ACCNUMBER", required = true)
    protected String accnumber;
    @XmlElement(name = "CARDNUMBER", required = true)
    protected String cardnumber;
    @XmlElement(name = "PROGCODE", required = true)
    protected String progcode;
    @XmlElement(name = "BRANCHCODE", required = true)
    protected String branchcode;
    @XmlElement(name = "PROGVALIDDAY", required = true)
    protected String progvalidday;
    @XmlElement(name = "PERCENTVALUE", required = true)
    protected BigDecimal percentvalue;
    @XmlElement(name = "PROGCURRISOCODE", required = true)
    protected String progcurrisocode;
    @XmlElement(name = "PROGCURRCODE", required = true)
    protected String progcurrcode;
    @XmlElement(name = "PERCENTACCNUMBER", required = true)
    protected String percentaccnumber;
    @XmlElement(name = "PERCENTCARDNUMBER", required = true)
    protected String percentcardnumber;
    @XmlElement(name = "ENDACCNUMBER", required = true)
    protected String endaccnumber;
    @XmlElement(name = "ENDCARDNUMBER", required = true)
    protected String endcardnumber;
    @XmlElement(name = "ISMOVE", required = true)
    protected String ismove;
    @XmlElement(name = "ISREMOVE", required = true)
    protected String isremove;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the docdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDOCDATE() {
        return docdate;
    }

    /**
     * Sets the value of the docdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDOCDATE(XMLGregorianCalendar value) {
        this.docdate = value;
    }

    /**
     * Gets the value of the docnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCNUMBER() {
        return docnumber;
    }

    /**
     * Sets the value of the docnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCNUMBER(String value) {
        this.docnumber = value;
    }

    /**
     * Gets the value of the amountdebet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNTDEBET() {
        return amountdebet;
    }

    /**
     * Sets the value of the amountdebet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNTDEBET(BigDecimal value) {
        this.amountdebet = value;
    }

    /**
     * Gets the value of the amountcredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNTCREDIT() {
        return amountcredit;
    }

    /**
     * Sets the value of the amountcredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNTCREDIT(BigDecimal value) {
        this.amountcredit = value;
    }

    /**
     * Gets the value of the exchangerate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXCHANGERATE() {
        return exchangerate;
    }

    /**
     * Sets the value of the exchangerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXCHANGERATE(String value) {
        this.exchangerate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the accnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCNUMBER() {
        return accnumber;
    }

    /**
     * Sets the value of the accnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCNUMBER(String value) {
        this.accnumber = value;
    }

    /**
     * Gets the value of the cardnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDNUMBER() {
        return cardnumber;
    }

    /**
     * Sets the value of the cardnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDNUMBER(String value) {
        this.cardnumber = value;
    }

    /**
     * Gets the value of the progcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROGCODE() {
        return progcode;
    }

    /**
     * Sets the value of the progcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROGCODE(String value) {
        this.progcode = value;
    }

    /**
     * Gets the value of the branchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCHCODE() {
        return branchcode;
    }

    /**
     * Sets the value of the branchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCHCODE(String value) {
        this.branchcode = value;
    }

    /**
     * Gets the value of the progvalidday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROGVALIDDAY() {
        return progvalidday;
    }

    /**
     * Sets the value of the progvalidday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROGVALIDDAY(String value) {
        this.progvalidday = value;
    }

    /**
     * Gets the value of the percentvalue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPERCENTVALUE() {
        return percentvalue;
    }

    /**
     * Sets the value of the percentvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPERCENTVALUE(BigDecimal value) {
        this.percentvalue = value;
    }

    /**
     * Gets the value of the progcurrisocode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROGCURRISOCODE() {
        return progcurrisocode;
    }

    /**
     * Sets the value of the progcurrisocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROGCURRISOCODE(String value) {
        this.progcurrisocode = value;
    }

    /**
     * Gets the value of the progcurrcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROGCURRCODE() {
        return progcurrcode;
    }

    /**
     * Sets the value of the progcurrcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROGCURRCODE(String value) {
        this.progcurrcode = value;
    }

    /**
     * Gets the value of the percentaccnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERCENTACCNUMBER() {
        return percentaccnumber;
    }

    /**
     * Sets the value of the percentaccnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERCENTACCNUMBER(String value) {
        this.percentaccnumber = value;
    }

    /**
     * Gets the value of the percentcardnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERCENTCARDNUMBER() {
        return percentcardnumber;
    }

    /**
     * Sets the value of the percentcardnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERCENTCARDNUMBER(String value) {
        this.percentcardnumber = value;
    }

    /**
     * Gets the value of the endaccnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDACCNUMBER() {
        return endaccnumber;
    }

    /**
     * Sets the value of the endaccnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDACCNUMBER(String value) {
        this.endaccnumber = value;
    }

    /**
     * Gets the value of the endcardnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDCARDNUMBER() {
        return endcardnumber;
    }

    /**
     * Sets the value of the endcardnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDCARDNUMBER(String value) {
        this.endcardnumber = value;
    }

    /**
     * Gets the value of the ismove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISMOVE() {
        return ismove;
    }

    /**
     * Sets the value of the ismove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISMOVE(String value) {
        this.ismove = value;
    }

    /**
     * Gets the value of the isremove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISREMOVE() {
        return isremove;
    }

    /**
     * Sets the value of the isremove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISREMOVE(String value) {
        this.isremove = value;
    }

}

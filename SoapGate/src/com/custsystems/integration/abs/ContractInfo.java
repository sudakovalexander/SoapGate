
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContractInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dpNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dpOtherBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dpBankDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="conNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="isConAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isConNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="сonAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="conEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="conCurrencyCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="docProvisionFormat" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="docProvisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="sendTypeDoc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sendDateDoc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ogrn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ogrnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractInfo", propOrder = {
    "dpNum",
    "dpOtherBank",
    "dpBankDate",
    "conNumber",
    "conDate",
    "isConAmount",
    "isConNumber",
    "\u0441onAmount",
    "conEndDate",
    "conCurrencyCode",
    "docProvisionFormat",
    "docProvisionDate",
    "sendTypeDoc",
    "sendDateDoc",
    "ogrn",
    "ogrnDate"
})
public class ContractInfo {

    protected String dpNum;
    protected String dpOtherBank;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dpBankDate;
    protected String conNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar conDate;
    protected Boolean isConAmount;
    protected Boolean isConNumber;
    protected BigDecimal сonAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar conEndDate;
    protected String conCurrencyCode;
    protected String docProvisionFormat;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docProvisionDate;
    protected String sendTypeDoc;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendDateDoc;
    protected String ogrn;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ogrnDate;

    /**
     * Gets the value of the dpNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpNum() {
        return dpNum;
    }

    /**
     * Sets the value of the dpNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDpNum(String value) {
        this.dpNum = value;
    }

    /**
     * Gets the value of the dpOtherBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpOtherBank() {
        return dpOtherBank;
    }

    /**
     * Sets the value of the dpOtherBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDpOtherBank(String value) {
        this.dpOtherBank = value;
    }

    /**
     * Gets the value of the dpBankDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDpBankDate() {
        return dpBankDate;
    }

    /**
     * Sets the value of the dpBankDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDpBankDate(XMLGregorianCalendar value) {
        this.dpBankDate = value;
    }

    /**
     * Gets the value of the conNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConNumber() {
        return conNumber;
    }

    /**
     * Sets the value of the conNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConNumber(String value) {
        this.conNumber = value;
    }

    /**
     * Gets the value of the conDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConDate() {
        return conDate;
    }

    /**
     * Sets the value of the conDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConDate(XMLGregorianCalendar value) {
        this.conDate = value;
    }

    /**
     * Gets the value of the isConAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConAmount() {
        return isConAmount;
    }

    /**
     * Sets the value of the isConAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConAmount(Boolean value) {
        this.isConAmount = value;
    }

    /**
     * Gets the value of the isConNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConNumber() {
        return isConNumber;
    }

    /**
     * Sets the value of the isConNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConNumber(Boolean value) {
        this.isConNumber = value;
    }

    /**
     * Gets the value of the сonAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getСonAmount() {
        return сonAmount;
    }

    /**
     * Sets the value of the сonAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setСonAmount(BigDecimal value) {
        this.сonAmount = value;
    }

    /**
     * Gets the value of the conEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConEndDate() {
        return conEndDate;
    }

    /**
     * Sets the value of the conEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConEndDate(XMLGregorianCalendar value) {
        this.conEndDate = value;
    }

    /**
     * Gets the value of the conCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConCurrencyCode() {
        return conCurrencyCode;
    }

    /**
     * Sets the value of the conCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConCurrencyCode(String value) {
        this.conCurrencyCode = value;
    }

    /**
     * Gets the value of the docProvisionFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocProvisionFormat() {
        return docProvisionFormat;
    }

    /**
     * Sets the value of the docProvisionFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocProvisionFormat(String value) {
        this.docProvisionFormat = value;
    }

    /**
     * Gets the value of the docProvisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocProvisionDate() {
        return docProvisionDate;
    }

    /**
     * Sets the value of the docProvisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocProvisionDate(XMLGregorianCalendar value) {
        this.docProvisionDate = value;
    }

    /**
     * Gets the value of the sendTypeDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendTypeDoc() {
        return sendTypeDoc;
    }

    /**
     * Sets the value of the sendTypeDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendTypeDoc(String value) {
        this.sendTypeDoc = value;
    }

    /**
     * Gets the value of the sendDateDoc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendDateDoc() {
        return sendDateDoc;
    }

    /**
     * Sets the value of the sendDateDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendDateDoc(XMLGregorianCalendar value) {
        this.sendDateDoc = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOgrn() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOgrn(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the ogrnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOgrnDate() {
        return ogrnDate;
    }

    /**
     * Sets the value of the ogrnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOgrnDate(XMLGregorianCalendar value) {
        this.ogrnDate = value;
    }

}

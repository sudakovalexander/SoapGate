
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ABSCustId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnsDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="response" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NF" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="300"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NI" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="255"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="INN" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="14"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FX" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EM" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="35"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTR" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CTD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="LC" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LS" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LP" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="35"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LA" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="255"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LZ" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="10"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LR"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LSTR"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="35"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LH"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="5"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LB"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="5"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LF"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="5"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IA" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="255"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PH" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WP" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MP" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SMSP"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CS" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="25"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PIT" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="60"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PN" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PS" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="PP" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="100"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SC" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="BP" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="100"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="GN" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Ж"/&gt;
 *                         &lt;enumeration value="М"/&gt;
 *                         &lt;enumeration value="F"/&gt;
 *                         &lt;enumeration value="M"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="BRANCH_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "CustResponse", propOrder = {
    "reqID",
    "subSys",
    "customerID",
    "absCustId",
    "branchId",
    "ansDateTime",
    "response"
})
public class CustResponse {

    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "ABSCustId")
    protected String absCustId;
    @XmlElement(name = "BranchId")
    protected String branchId;
    @XmlElement(name = "AnsDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ansDateTime;
    protected CustResponse.Response response;

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
     * Gets the value of the absCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABSCustId() {
        return absCustId;
    }

    /**
     * Sets the value of the absCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABSCustId(String value) {
        this.absCustId = value;
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
     * Gets the value of the ansDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnsDateTime() {
        return ansDateTime;
    }

    /**
     * Sets the value of the ansDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnsDateTime(XMLGregorianCalendar value) {
        this.ansDateTime = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link CustResponse.Response }
     *     
     */
    public CustResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustResponse.Response }
     *     
     */
    public void setResponse(CustResponse.Response value) {
        this.response = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="NF" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="300"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NI" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="255"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="INN" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="14"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FX" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EM" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="35"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CTR" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CTD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="LC" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="3"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LS" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LP" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="35"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LA" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="255"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LZ" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="10"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LR"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="20"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LSTR"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="35"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LH"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="5"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LB"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="5"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LF"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="5"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="IA" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="255"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PH" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WP" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MP" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SMSP"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="15"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CS" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="25"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PIT" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="60"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PN" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PS" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="PP" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="100"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SC" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="BP" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="100"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="GN" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Ж"/&gt;
     *               &lt;enumeration value="М"/&gt;
     *               &lt;enumeration value="F"/&gt;
     *               &lt;enumeration value="M"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="BRANCH_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nf",
        "ni",
        "inn",
        "fx",
        "em",
        "ctr",
        "ctd",
        "lc",
        "ls",
        "lpt",
        "lp",
        "la",
        "lz",
        "lr",
        "lstr",
        "lh",
        "lb",
        "lf",
        "ia",
        "ph",
        "wp",
        "mp",
        "smsp",
        "cs",
        "pit",
        "pn",
        "ps",
        "pd",
        "pp",
        "sc",
        "bd",
        "bp",
        "gn",
        "pc",
        "branchid"
    })
    public static class Response {

        @XmlElement(name = "NF")
        protected String nf;
        @XmlElement(name = "NI")
        protected String ni;
        @XmlElement(name = "INN")
        protected String inn;
        @XmlElement(name = "FX")
        protected String fx;
        @XmlElement(name = "EM")
        protected String em;
        @XmlElement(name = "CTR")
        protected String ctr;
        @XmlElement(name = "CTD")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar ctd;
        @XmlElement(name = "LC")
        protected String lc;
        @XmlElement(name = "LS")
        protected String ls;
        @XmlElement(name = "LPT")
        protected String lpt;
        @XmlElement(name = "LP")
        protected String lp;
        @XmlElement(name = "LA")
        protected String la;
        @XmlElement(name = "LZ")
        protected String lz;
        @XmlElement(name = "LR", required = true)
        protected String lr;
        @XmlElement(name = "LSTR", required = true)
        protected String lstr;
        @XmlElement(name = "LH", required = true)
        protected String lh;
        @XmlElement(name = "LB", required = true)
        protected String lb;
        @XmlElement(name = "LF", required = true)
        protected String lf;
        @XmlElement(name = "IA")
        protected String ia;
        @XmlElement(name = "PH")
        protected String ph;
        @XmlElement(name = "WP")
        protected String wp;
        @XmlElement(name = "MP")
        protected String mp;
        @XmlElement(name = "SMSP", required = true)
        protected String smsp;
        @XmlElement(name = "CS")
        protected String cs;
        @XmlElement(name = "PIT")
        protected String pit;
        @XmlElement(name = "PN")
        protected String pn;
        @XmlElement(name = "PS")
        protected String ps;
        @XmlElement(name = "PD")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar pd;
        @XmlElement(name = "PP")
        protected String pp;
        @XmlElement(name = "SC")
        protected String sc;
        @XmlElement(name = "BD")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar bd;
        @XmlElement(name = "BP")
        protected String bp;
        @XmlElement(name = "GN")
        protected String gn;
        @XmlElement(name = "PC")
        protected BigDecimal pc;
        @XmlElement(name = "BRANCH_ID")
        protected String branchid;

        /**
         * Gets the value of the nf property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNF() {
            return nf;
        }

        /**
         * Sets the value of the nf property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNF(String value) {
            this.nf = value;
        }

        /**
         * Gets the value of the ni property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNI() {
            return ni;
        }

        /**
         * Sets the value of the ni property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNI(String value) {
            this.ni = value;
        }

        /**
         * Gets the value of the inn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINN() {
            return inn;
        }

        /**
         * Sets the value of the inn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINN(String value) {
            this.inn = value;
        }

        /**
         * Gets the value of the fx property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFX() {
            return fx;
        }

        /**
         * Sets the value of the fx property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFX(String value) {
            this.fx = value;
        }

        /**
         * Gets the value of the em property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEM() {
            return em;
        }

        /**
         * Sets the value of the em property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEM(String value) {
            this.em = value;
        }

        /**
         * Gets the value of the ctr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTR() {
            return ctr;
        }

        /**
         * Sets the value of the ctr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTR(String value) {
            this.ctr = value;
        }

        /**
         * Gets the value of the ctd property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCTD() {
            return ctd;
        }

        /**
         * Sets the value of the ctd property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCTD(XMLGregorianCalendar value) {
            this.ctd = value;
        }

        /**
         * Gets the value of the lc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLC() {
            return lc;
        }

        /**
         * Sets the value of the lc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLC(String value) {
            this.lc = value;
        }

        /**
         * Gets the value of the ls property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLS() {
            return ls;
        }

        /**
         * Sets the value of the ls property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLS(String value) {
            this.ls = value;
        }

        /**
         * Gets the value of the lpt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLPT() {
            return lpt;
        }

        /**
         * Sets the value of the lpt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLPT(String value) {
            this.lpt = value;
        }

        /**
         * Gets the value of the lp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLP() {
            return lp;
        }

        /**
         * Sets the value of the lp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLP(String value) {
            this.lp = value;
        }

        /**
         * Gets the value of the la property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLA() {
            return la;
        }

        /**
         * Sets the value of the la property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLA(String value) {
            this.la = value;
        }

        /**
         * Gets the value of the lz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLZ() {
            return lz;
        }

        /**
         * Sets the value of the lz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLZ(String value) {
            this.lz = value;
        }

        /**
         * Gets the value of the lr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLR() {
            return lr;
        }

        /**
         * Sets the value of the lr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLR(String value) {
            this.lr = value;
        }

        /**
         * Gets the value of the lstr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLSTR() {
            return lstr;
        }

        /**
         * Sets the value of the lstr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLSTR(String value) {
            this.lstr = value;
        }

        /**
         * Gets the value of the lh property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLH() {
            return lh;
        }

        /**
         * Sets the value of the lh property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLH(String value) {
            this.lh = value;
        }

        /**
         * Gets the value of the lb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLB() {
            return lb;
        }

        /**
         * Sets the value of the lb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLB(String value) {
            this.lb = value;
        }

        /**
         * Gets the value of the lf property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLF() {
            return lf;
        }

        /**
         * Sets the value of the lf property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLF(String value) {
            this.lf = value;
        }

        /**
         * Gets the value of the ia property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIA() {
            return ia;
        }

        /**
         * Sets the value of the ia property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIA(String value) {
            this.ia = value;
        }

        /**
         * Gets the value of the ph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPH() {
            return ph;
        }

        /**
         * Sets the value of the ph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPH(String value) {
            this.ph = value;
        }

        /**
         * Gets the value of the wp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWP() {
            return wp;
        }

        /**
         * Sets the value of the wp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWP(String value) {
            this.wp = value;
        }

        /**
         * Gets the value of the mp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMP() {
            return mp;
        }

        /**
         * Sets the value of the mp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMP(String value) {
            this.mp = value;
        }

        /**
         * Gets the value of the smsp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSMSP() {
            return smsp;
        }

        /**
         * Sets the value of the smsp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSMSP(String value) {
            this.smsp = value;
        }

        /**
         * Gets the value of the cs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCS() {
            return cs;
        }

        /**
         * Sets the value of the cs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCS(String value) {
            this.cs = value;
        }

        /**
         * Gets the value of the pit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPIT() {
            return pit;
        }

        /**
         * Sets the value of the pit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPIT(String value) {
            this.pit = value;
        }

        /**
         * Gets the value of the pn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPN() {
            return pn;
        }

        /**
         * Sets the value of the pn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPN(String value) {
            this.pn = value;
        }

        /**
         * Gets the value of the ps property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPS() {
            return ps;
        }

        /**
         * Sets the value of the ps property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPS(String value) {
            this.ps = value;
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
         * Gets the value of the pp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPP() {
            return pp;
        }

        /**
         * Sets the value of the pp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPP(String value) {
            this.pp = value;
        }

        /**
         * Gets the value of the sc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSC() {
            return sc;
        }

        /**
         * Sets the value of the sc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSC(String value) {
            this.sc = value;
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
         * Gets the value of the bp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBP() {
            return bp;
        }

        /**
         * Sets the value of the bp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBP(String value) {
            this.bp = value;
        }

        /**
         * Gets the value of the gn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGN() {
            return gn;
        }

        /**
         * Sets the value of the gn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGN(String value) {
            this.gn = value;
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
         * Gets the value of the branchid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRANCHID() {
            return branchid;
        }

        /**
         * Sets the value of the branchid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRANCHID(String value) {
            this.branchid = value;
        }

    }

}

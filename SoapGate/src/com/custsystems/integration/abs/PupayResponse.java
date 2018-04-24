
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PupayResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PupayResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnsDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FlagComiss" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="response" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="REF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SDREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AmmountComiss" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "PupayResponse", propOrder = {
    "reqID",
    "subSys",
    "customerID",
    "ansDateTime",
    "branchId",
    "flagComiss",
    "response"
})
public class PupayResponse {

    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "AnsDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ansDateTime;
    @XmlElement(name = "BranchId", required = true)
    protected String branchId;
    @XmlElement(name = "FlagComiss")
    protected int flagComiss;
    protected PupayResponse.Response response;

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
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link PupayResponse.Response }
     *     
     */
    public PupayResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link PupayResponse.Response }
     *     
     */
    public void setResponse(PupayResponse.Response value) {
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
     *         &lt;element name="REF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SDREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AmmountComiss" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "ref",
        "status",
        "sdref",
        "ammountComiss"
    })
    public static class Response {

        @XmlElement(name = "REF")
        protected String ref;
        @XmlElement(name = "Status")
        protected String status;
        @XmlElement(name = "SDREF")
        protected String sdref;
        @XmlElement(name = "AmmountComiss")
        protected BigDecimal ammountComiss;

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREF() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREF(String value) {
            this.ref = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
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
        public void setStatus(String value) {
            this.status = value;
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
         * Gets the value of the ammountComiss property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmmountComiss() {
            return ammountComiss;
        }

        /**
         * Sets the value of the ammountComiss property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmmountComiss(BigDecimal value) {
            this.ammountComiss = value;
        }

    }

}

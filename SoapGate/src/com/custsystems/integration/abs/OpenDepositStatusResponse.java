
package com.custsystems.integration.abs;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenDepositStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenDepositStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="response" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DOC_REF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *                   &lt;element name="ACCOUNT" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="34"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CONTRACT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CONTRACT_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "OpenDepositStatusResponse", propOrder = {
    "reqID",
    "subSys",
    "customerID",
    "response"
})
public class OpenDepositStatusResponse {

    @XmlElement(required = true)
    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    protected OpenDepositStatusResponse.Response response;

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
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link OpenDepositStatusResponse.Response }
     *     
     */
    public OpenDepositStatusResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenDepositStatusResponse.Response }
     *     
     */
    public void setResponse(OpenDepositStatusResponse.Response value) {
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
     *         &lt;element name="DOC_REF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
     *         &lt;element name="ACCOUNT" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="34"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CONTRACT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CONTRACT_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "docref",
        "status",
        "account",
        "contractnumber",
        "contractdate"
    })
    public static class Response {

        @XmlElement(name = "DOC_REF")
        protected String docref;
        @XmlElement(name = "STATUS")
        protected BigInteger status;
        @XmlElement(name = "ACCOUNT")
        protected String account;
        @XmlElement(name = "CONTRACT_NUMBER")
        protected String contractnumber;
        @XmlElement(name = "CONTRACT_DATE")
        protected String contractdate;

        /**
         * Gets the value of the docref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCREF() {
            return docref;
        }

        /**
         * Sets the value of the docref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCREF(String value) {
            this.docref = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSTATUS(BigInteger value) {
            this.status = value;
        }

        /**
         * Gets the value of the account property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCOUNT() {
            return account;
        }

        /**
         * Sets the value of the account property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCOUNT(String value) {
            this.account = value;
        }

        /**
         * Gets the value of the contractnumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONTRACTNUMBER() {
            return contractnumber;
        }

        /**
         * Sets the value of the contractnumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONTRACTNUMBER(String value) {
            this.contractnumber = value;
        }

        /**
         * Gets the value of the contractdate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONTRACTDATE() {
            return contractdate;
        }

        /**
         * Sets the value of the contractdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONTRACTDATE(String value) {
            this.contractdate = value;
        }

    }

}

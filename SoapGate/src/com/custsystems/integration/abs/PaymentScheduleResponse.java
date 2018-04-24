
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentScheduleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentScheduleResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnsDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="response" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BEGIN_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="END_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="CONTRACT_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CUR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="TOTAL_PRINCIPIAL_PERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="TOTAL_PRINCIPIAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="TOTAL_PERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="TOTAL_COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="TOTAL_REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="FACT_PAYS"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="PRINCIPIAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="PAYS" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PAY_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                                       &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="PRINCIPIAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PLAN_PAYS"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="PRINCIPIAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="PAYS" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="PAY_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                                       &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "PaymentScheduleResponse", propOrder = {
    "reqID",
    "subSys",
    "customerID",
    "ansDateTime",
    "response"
})
public class PaymentScheduleResponse {

    @XmlElement(required = true)
    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "AnsDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ansDateTime;
    protected PaymentScheduleResponse.Response response;

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
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentScheduleResponse.Response }
     *     
     */
    public PaymentScheduleResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentScheduleResponse.Response }
     *     
     */
    public void setResponse(PaymentScheduleResponse.Response value) {
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
     *         &lt;element name="BEGIN_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="END_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="CONTRACT_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CUR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="TOTAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="TOTAL_PRINCIPIAL_PERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="TOTAL_PRINCIPIAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="TOTAL_PERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="TOTAL_COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="TOTAL_REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="FACT_PAYS"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="PRINCIPIAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="PAYS" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="PAY_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="PRINCIPIAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PLAN_PAYS"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="PRINCIPIAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="PAYS" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="PAY_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
    @XmlType(name = "", propOrder = {
        "begindate",
        "enddate",
        "contractnum",
        "account",
        "cur",
        "amount",
        "prcnt",
        "commis",
        "totalamount",
        "totalprincipialpercent",
        "totalprincipial",
        "totalpercent",
        "totalcommis",
        "totalrest",
        "factpays",
        "planpays"
    })
    public static class Response {

        @XmlElement(name = "BEGIN_DATE", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar begindate;
        @XmlElement(name = "END_DATE", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar enddate;
        @XmlElement(name = "CONTRACT_NUM", required = true)
        protected String contractnum;
        @XmlElement(name = "ACCOUNT", required = true)
        protected String account;
        @XmlElement(name = "CUR", required = true)
        protected String cur;
        @XmlElement(name = "AMOUNT", required = true)
        protected BigDecimal amount;
        @XmlElement(name = "PRCNT", required = true)
        protected BigDecimal prcnt;
        @XmlElement(name = "COMMIS", required = true)
        protected BigDecimal commis;
        @XmlElement(name = "TOTAL_AMOUNT", required = true)
        protected BigDecimal totalamount;
        @XmlElement(name = "TOTAL_PRINCIPIAL_PERCENT", required = true)
        protected BigDecimal totalprincipialpercent;
        @XmlElement(name = "TOTAL_PRINCIPIAL", required = true)
        protected BigDecimal totalprincipial;
        @XmlElement(name = "TOTAL_PERCENT", required = true)
        protected BigDecimal totalpercent;
        @XmlElement(name = "TOTAL_COMMIS", required = true)
        protected BigDecimal totalcommis;
        @XmlElement(name = "TOTAL_REST", required = true)
        protected BigDecimal totalrest;
        @XmlElement(name = "FACT_PAYS", required = true)
        protected PaymentScheduleResponse.Response.FACTPAYS factpays;
        @XmlElement(name = "PLAN_PAYS", required = true)
        protected PaymentScheduleResponse.Response.PLANPAYS planpays;

        /**
         * Gets the value of the begindate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBEGINDATE() {
            return begindate;
        }

        /**
         * Sets the value of the begindate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBEGINDATE(XMLGregorianCalendar value) {
            this.begindate = value;
        }

        /**
         * Gets the value of the enddate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getENDDATE() {
            return enddate;
        }

        /**
         * Sets the value of the enddate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setENDDATE(XMLGregorianCalendar value) {
            this.enddate = value;
        }

        /**
         * Gets the value of the contractnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONTRACTNUM() {
            return contractnum;
        }

        /**
         * Sets the value of the contractnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONTRACTNUM(String value) {
            this.contractnum = value;
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
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNT(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the prcnt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPRCNT() {
            return prcnt;
        }

        /**
         * Sets the value of the prcnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPRCNT(BigDecimal value) {
            this.prcnt = value;
        }

        /**
         * Gets the value of the commis property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCOMMIS() {
            return commis;
        }

        /**
         * Sets the value of the commis property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCOMMIS(BigDecimal value) {
            this.commis = value;
        }

        /**
         * Gets the value of the totalamount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTOTALAMOUNT() {
            return totalamount;
        }

        /**
         * Sets the value of the totalamount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTOTALAMOUNT(BigDecimal value) {
            this.totalamount = value;
        }

        /**
         * Gets the value of the totalprincipialpercent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTOTALPRINCIPIALPERCENT() {
            return totalprincipialpercent;
        }

        /**
         * Sets the value of the totalprincipialpercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTOTALPRINCIPIALPERCENT(BigDecimal value) {
            this.totalprincipialpercent = value;
        }

        /**
         * Gets the value of the totalprincipial property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTOTALPRINCIPIAL() {
            return totalprincipial;
        }

        /**
         * Sets the value of the totalprincipial property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTOTALPRINCIPIAL(BigDecimal value) {
            this.totalprincipial = value;
        }

        /**
         * Gets the value of the totalpercent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTOTALPERCENT() {
            return totalpercent;
        }

        /**
         * Sets the value of the totalpercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTOTALPERCENT(BigDecimal value) {
            this.totalpercent = value;
        }

        /**
         * Gets the value of the totalcommis property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTOTALCOMMIS() {
            return totalcommis;
        }

        /**
         * Sets the value of the totalcommis property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTOTALCOMMIS(BigDecimal value) {
            this.totalcommis = value;
        }

        /**
         * Gets the value of the totalrest property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTOTALREST() {
            return totalrest;
        }

        /**
         * Sets the value of the totalrest property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTOTALREST(BigDecimal value) {
            this.totalrest = value;
        }

        /**
         * Gets the value of the factpays property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentScheduleResponse.Response.FACTPAYS }
         *     
         */
        public PaymentScheduleResponse.Response.FACTPAYS getFACTPAYS() {
            return factpays;
        }

        /**
         * Sets the value of the factpays property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentScheduleResponse.Response.FACTPAYS }
         *     
         */
        public void setFACTPAYS(PaymentScheduleResponse.Response.FACTPAYS value) {
            this.factpays = value;
        }

        /**
         * Gets the value of the planpays property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentScheduleResponse.Response.PLANPAYS }
         *     
         */
        public PaymentScheduleResponse.Response.PLANPAYS getPLANPAYS() {
            return planpays;
        }

        /**
         * Sets the value of the planpays property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentScheduleResponse.Response.PLANPAYS }
         *     
         */
        public void setPLANPAYS(PaymentScheduleResponse.Response.PLANPAYS value) {
            this.planpays = value;
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
         *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="PRINCIPIAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="PAYS" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="PAY_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="PRINCIPIAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
        @XmlType(name = "", propOrder = {
            "amount",
            "principial",
            "prcnt",
            "commis",
            "rest",
            "pays"
        })
        public static class FACTPAYS {

            @XmlElement(name = "AMOUNT", required = true)
            protected BigDecimal amount;
            @XmlElement(name = "PRINCIPIAL", required = true)
            protected BigDecimal principial;
            @XmlElement(name = "PRCNT", required = true)
            protected BigDecimal prcnt;
            @XmlElement(name = "COMMIS", required = true)
            protected BigDecimal commis;
            @XmlElement(name = "REST", required = true)
            protected BigDecimal rest;
            @XmlElement(name = "PAYS", required = true)
            protected List<PaymentScheduleResponse.Response.FACTPAYS.PAYS> pays;

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAMOUNT() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAMOUNT(BigDecimal value) {
                this.amount = value;
            }

            /**
             * Gets the value of the principial property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPRINCIPIAL() {
                return principial;
            }

            /**
             * Sets the value of the principial property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPRINCIPIAL(BigDecimal value) {
                this.principial = value;
            }

            /**
             * Gets the value of the prcnt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPRCNT() {
                return prcnt;
            }

            /**
             * Sets the value of the prcnt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPRCNT(BigDecimal value) {
                this.prcnt = value;
            }

            /**
             * Gets the value of the commis property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCOMMIS() {
                return commis;
            }

            /**
             * Sets the value of the commis property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCOMMIS(BigDecimal value) {
                this.commis = value;
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
             * Gets the value of the pays property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pays property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPAYS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PaymentScheduleResponse.Response.FACTPAYS.PAYS }
             * 
             * 
             */
            public List<PaymentScheduleResponse.Response.FACTPAYS.PAYS> getPAYS() {
                if (pays == null) {
                    pays = new ArrayList<PaymentScheduleResponse.Response.FACTPAYS.PAYS>();
                }
                return this.pays;
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
             *         &lt;element name="PAY_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
             *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="PRINCIPIAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
                "paydate",
                "amount",
                "principial",
                "prcnt",
                "commis",
                "rest"
            })
            public static class PAYS {

                @XmlElement(name = "PAY_DATE", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar paydate;
                @XmlElement(name = "AMOUNT", required = true)
                protected BigDecimal amount;
                @XmlElement(name = "PRINCIPIAL", required = true)
                protected BigDecimal principial;
                @XmlElement(name = "PRCNT", required = true)
                protected BigDecimal prcnt;
                @XmlElement(name = "COMMIS", required = true)
                protected BigDecimal commis;
                @XmlElement(name = "REST", required = true)
                protected BigDecimal rest;

                /**
                 * Gets the value of the paydate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getPAYDATE() {
                    return paydate;
                }

                /**
                 * Sets the value of the paydate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setPAYDATE(XMLGregorianCalendar value) {
                    this.paydate = value;
                }

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAMOUNT() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAMOUNT(BigDecimal value) {
                    this.amount = value;
                }

                /**
                 * Gets the value of the principial property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPRINCIPIAL() {
                    return principial;
                }

                /**
                 * Sets the value of the principial property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPRINCIPIAL(BigDecimal value) {
                    this.principial = value;
                }

                /**
                 * Gets the value of the prcnt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPRCNT() {
                    return prcnt;
                }

                /**
                 * Sets the value of the prcnt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPRCNT(BigDecimal value) {
                    this.prcnt = value;
                }

                /**
                 * Gets the value of the commis property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCOMMIS() {
                    return commis;
                }

                /**
                 * Sets the value of the commis property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCOMMIS(BigDecimal value) {
                    this.commis = value;
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

            }

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
         *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="PRINCIPIAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="PAYS" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="PAY_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
        @XmlType(name = "", propOrder = {
            "amount",
            "principial",
            "prcnt",
            "commis",
            "rest",
            "pays"
        })
        public static class PLANPAYS {

            @XmlElement(name = "AMOUNT", required = true)
            protected BigDecimal amount;
            @XmlElement(name = "PRINCIPIAL", required = true)
            protected BigDecimal principial;
            @XmlElement(name = "PRCNT", required = true)
            protected BigDecimal prcnt;
            @XmlElement(name = "COMMIS", required = true)
            protected BigDecimal commis;
            @XmlElement(name = "REST", required = true)
            protected BigDecimal rest;
            @XmlElement(name = "PAYS", required = true)
            protected List<PaymentScheduleResponse.Response.PLANPAYS.PAYS> pays;

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAMOUNT() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAMOUNT(BigDecimal value) {
                this.amount = value;
            }

            /**
             * Gets the value of the principial property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPRINCIPIAL() {
                return principial;
            }

            /**
             * Sets the value of the principial property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPRINCIPIAL(BigDecimal value) {
                this.principial = value;
            }

            /**
             * Gets the value of the prcnt property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPRCNT() {
                return prcnt;
            }

            /**
             * Sets the value of the prcnt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPRCNT(BigDecimal value) {
                this.prcnt = value;
            }

            /**
             * Gets the value of the commis property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCOMMIS() {
                return commis;
            }

            /**
             * Sets the value of the commis property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCOMMIS(BigDecimal value) {
                this.commis = value;
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
             * Gets the value of the pays property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pays property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPAYS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PaymentScheduleResponse.Response.PLANPAYS.PAYS }
             * 
             * 
             */
            public List<PaymentScheduleResponse.Response.PLANPAYS.PAYS> getPAYS() {
                if (pays == null) {
                    pays = new ArrayList<PaymentScheduleResponse.Response.PLANPAYS.PAYS>();
                }
                return this.pays;
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
             *         &lt;element name="PAY_DATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
             *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="PRCNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="COMMIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="REST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
                "paydate",
                "amount",
                "prcnt",
                "commis",
                "rest"
            })
            public static class PAYS {

                @XmlElement(name = "PAY_DATE", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar paydate;
                @XmlElement(name = "AMOUNT", required = true)
                protected BigDecimal amount;
                @XmlElement(name = "PRCNT", required = true)
                protected BigDecimal prcnt;
                @XmlElement(name = "COMMIS", required = true)
                protected BigDecimal commis;
                @XmlElement(name = "REST", required = true)
                protected BigDecimal rest;

                /**
                 * Gets the value of the paydate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getPAYDATE() {
                    return paydate;
                }

                /**
                 * Sets the value of the paydate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setPAYDATE(XMLGregorianCalendar value) {
                    this.paydate = value;
                }

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAMOUNT() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAMOUNT(BigDecimal value) {
                    this.amount = value;
                }

                /**
                 * Gets the value of the prcnt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPRCNT() {
                    return prcnt;
                }

                /**
                 * Sets the value of the prcnt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPRCNT(BigDecimal value) {
                    this.prcnt = value;
                }

                /**
                 * Gets the value of the commis property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCOMMIS() {
                    return commis;
                }

                /**
                 * Sets the value of the commis property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCOMMIS(BigDecimal value) {
                    this.commis = value;
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

            }

        }

    }

}


package com.custsystems.integration.abs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CardCustResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardCustResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnsDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="response" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CardCustResponse", propOrder = {
    "reqID",
    "subSys",
    "ansDateTime",
    "card",
    "branchId",
    "response"
})
public class CardCustResponse {

    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "AnsDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ansDateTime;
    @XmlElement(name = "CARD")
    protected String card;
    @XmlElement(name = "BranchId")
    protected String branchId;
    protected CardCustResponse.Response response;

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
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARD() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARD(String value) {
        this.card = value;
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
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link CardCustResponse.Response }
     *     
     */
    public CardCustResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardCustResponse.Response }
     *     
     */
    public void setResponse(CardCustResponse.Response value) {
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
     *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "customerID",
        "branchId",
        "acc",
        "card"
    })
    public static class Response {

        @XmlElement(name = "CustomerID")
        protected String customerID;
        @XmlElement(name = "BranchId")
        protected String branchId;
        @XmlElement(name = "ACC")
        protected String acc;
        @XmlElement(name = "CARD")
        protected String card;

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
         * Gets the value of the acc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACC() {
            return acc;
        }

        /**
         * Sets the value of the acc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACC(String value) {
            this.acc = value;
        }

        /**
         * Gets the value of the card property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCARD() {
            return card;
        }

        /**
         * Sets the value of the card property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCARD(String value) {
            this.card = value;
        }

    }

}

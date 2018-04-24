
package com.custsystems.integration.abs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClientInfoByPhoneResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientInfoByPhoneResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnsDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="response"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="accNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="accClientId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ClientInfoByPhoneResponse", propOrder = {
    "reqID",
    "subSys",
    "ansDateTime",
    "response"
})
public class ClientInfoByPhoneResponse {

    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "AnsDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ansDateTime;
    @XmlElement(required = true)
    protected ClientInfoByPhoneResponse.Response response;

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
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ClientInfoByPhoneResponse.Response }
     *     
     */
    public ClientInfoByPhoneResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientInfoByPhoneResponse.Response }
     *     
     */
    public void setResponse(ClientInfoByPhoneResponse.Response value) {
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
     *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="accNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="accClientId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "clientId",
        "accNumber",
        "accClientId",
        "cardNumber"
    })
    public static class Response {

        @XmlElement(required = true)
        protected String clientId;
        @XmlElement(required = true)
        protected String accNumber;
        @XmlElement(required = true)
        protected String accClientId;
        @XmlElement(required = true)
        protected String cardNumber;

        /**
         * Gets the value of the clientId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientId() {
            return clientId;
        }

        /**
         * Sets the value of the clientId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientId(String value) {
            this.clientId = value;
        }

        /**
         * Gets the value of the accNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccNumber() {
            return accNumber;
        }

        /**
         * Sets the value of the accNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccNumber(String value) {
            this.accNumber = value;
        }

        /**
         * Gets the value of the accClientId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccClientId() {
            return accClientId;
        }

        /**
         * Sets the value of the accClientId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccClientId(String value) {
            this.accClientId = value;
        }

        /**
         * Gets the value of the cardNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardNumber() {
            return cardNumber;
        }

        /**
         * Sets the value of the cardNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardNumber(String value) {
            this.cardNumber = value;
        }

    }

}

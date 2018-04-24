
package com.custsystems.integration.abs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CardInfoRequestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardInfoRequestResponse"&gt;
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
 *                   &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="accNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="bic" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="embossedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="secondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="kpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CardInfoRequestResponse", propOrder = {
    "reqID",
    "subSys",
    "ansDateTime",
    "response"
})
public class CardInfoRequestResponse {

    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "AnsDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ansDateTime;
    @XmlElement(required = true)
    protected CardInfoRequestResponse.Response response;

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
     *     {@link CardInfoRequestResponse.Response }
     *     
     */
    public CardInfoRequestResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardInfoRequestResponse.Response }
     *     
     */
    public void setResponse(CardInfoRequestResponse.Response value) {
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
     *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="accNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="bic" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="embossedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="secondName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="kpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "customerId",
        "accNumber",
        "cardNumber",
        "bic",
        "fullname",
        "embossedName",
        "firstName",
        "secondName",
        "lastName",
        "inn",
        "kpp"
    })
    public static class Response {

        @XmlElement(required = true)
        protected String customerId;
        @XmlElement(required = true)
        protected String accNumber;
        @XmlElement(required = true)
        protected String cardNumber;
        @XmlElement(required = true)
        protected String bic;
        @XmlElement(required = true)
        protected String fullname;
        protected String embossedName;
        protected String firstName;
        protected String secondName;
        protected String lastName;
        protected String inn;
        protected String kpp;

        /**
         * Gets the value of the customerId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerId() {
            return customerId;
        }

        /**
         * Sets the value of the customerId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerId(String value) {
            this.customerId = value;
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

        /**
         * Gets the value of the bic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBic() {
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
        public void setBic(String value) {
            this.bic = value;
        }

        /**
         * Gets the value of the fullname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullname() {
            return fullname;
        }

        /**
         * Sets the value of the fullname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullname(String value) {
            this.fullname = value;
        }

        /**
         * Gets the value of the embossedName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmbossedName() {
            return embossedName;
        }

        /**
         * Sets the value of the embossedName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmbossedName(String value) {
            this.embossedName = value;
        }

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the secondName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecondName() {
            return secondName;
        }

        /**
         * Sets the value of the secondName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecondName(String value) {
            this.secondName = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the inn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInn() {
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
        public void setInn(String value) {
            this.inn = value;
        }

        /**
         * Gets the value of the kpp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKpp() {
            return kpp;
        }

        /**
         * Sets the value of the kpp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKpp(String value) {
            this.kpp = value;
        }

    }

}

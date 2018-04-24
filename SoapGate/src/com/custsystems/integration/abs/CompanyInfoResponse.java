
package com.custsystems.integration.abs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CompanyInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyInfoResponse"&gt;
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
 *                   &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IntName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="KPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="KPP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="KPP3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="KPP4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OGRN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="OKPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OKATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IFNS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Telex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PhoneHome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PhoneMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PhoneWork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LawAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LawCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LawCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LawZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LawRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LawArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LawCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LawCityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LawStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LawHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LawFrame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LawFlat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IntAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IntCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IntCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IntZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IntRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IntArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IntCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IntCityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IntStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IntHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IntFrame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IntFlat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Resident" type="{http://custsystems.com/integration/abs}logical" minOccurs="0"/&gt;
 *                   &lt;element name="SmsInformOn" type="{http://custsystems.com/integration/abs}logical" minOccurs="0"/&gt;
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
@XmlType(name = "CompanyInfoResponse", propOrder = {
    "reqID",
    "subSys",
    "customerID",
    "ansDateTime",
    "response"
})
public class CompanyInfoResponse {

    @XmlElement(required = true)
    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "AnsDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ansDateTime;
    protected CompanyInfoResponse.Response response;

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
     *     {@link CompanyInfoResponse.Response }
     *     
     */
    public CompanyInfoResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInfoResponse.Response }
     *     
     */
    public void setResponse(CompanyInfoResponse.Response value) {
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
     *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IntName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="KPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="KPP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="KPP3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="KPP4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OGRN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="OKPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OKATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IFNS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Telex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PhoneHome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PhoneMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PhoneWork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LawAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LawCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LawCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LawZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LawRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LawArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LawCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LawCityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LawStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LawHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LawFrame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LawFlat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IntAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IntCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IntCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IntZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IntRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IntArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IntCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IntCityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IntStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IntHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IntFrame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IntFlat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Resident" type="{http://custsystems.com/integration/abs}logical" minOccurs="0"/&gt;
     *         &lt;element name="SmsInformOn" type="{http://custsystems.com/integration/abs}logical" minOccurs="0"/&gt;
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
        "clientID",
        "fullName",
        "shortName",
        "intName",
        "inn",
        "kpp",
        "kpp2",
        "kpp3",
        "kpp4",
        "ogrn",
        "ogrndate",
        "okpo",
        "okato",
        "ifns",
        "fax",
        "telex",
        "phoneHome",
        "phoneMobile",
        "phoneWork",
        "email",
        "lawAddress",
        "lawCountry",
        "lawCountryCode",
        "lawZIP",
        "lawRegion",
        "lawArea",
        "lawCity",
        "lawCityType",
        "lawStreet",
        "lawHouse",
        "lawFrame",
        "lawFlat",
        "intAddress",
        "intCountry",
        "intCountryCode",
        "intZIP",
        "intRegion",
        "intArea",
        "intCity",
        "intCityType",
        "intStreet",
        "intHouse",
        "intFrame",
        "intFlat",
        "resident",
        "smsInformOn"
    })
    public static class Response {

        @XmlElement(name = "ClientID", required = true)
        protected String clientID;
        @XmlElement(name = "FullName")
        protected String fullName;
        @XmlElement(name = "ShortName")
        protected String shortName;
        @XmlElement(name = "IntName")
        protected String intName;
        @XmlElement(name = "INN")
        protected String inn;
        @XmlElement(name = "KPP")
        protected String kpp;
        @XmlElement(name = "KPP2")
        protected String kpp2;
        @XmlElement(name = "KPP3")
        protected String kpp3;
        @XmlElement(name = "KPP4")
        protected String kpp4;
        @XmlElement(name = "OGRN")
        protected String ogrn;
        @XmlElement(name = "OGRN_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar ogrndate;
        @XmlElement(name = "OKPO")
        protected String okpo;
        @XmlElement(name = "OKATO")
        protected String okato;
        @XmlElement(name = "IFNS")
        protected String ifns;
        @XmlElement(name = "Fax")
        protected String fax;
        @XmlElement(name = "Telex")
        protected String telex;
        @XmlElement(name = "PhoneHome")
        protected String phoneHome;
        @XmlElement(name = "PhoneMobile")
        protected String phoneMobile;
        @XmlElement(name = "PhoneWork")
        protected String phoneWork;
        @XmlElement(name = "Email")
        protected String email;
        @XmlElement(name = "LawAddress")
        protected String lawAddress;
        @XmlElement(name = "LawCountry")
        protected String lawCountry;
        @XmlElement(name = "LawCountryCode")
        protected String lawCountryCode;
        @XmlElement(name = "LawZIP")
        protected String lawZIP;
        @XmlElement(name = "LawRegion")
        protected String lawRegion;
        @XmlElement(name = "LawArea")
        protected String lawArea;
        @XmlElement(name = "LawCity")
        protected String lawCity;
        @XmlElement(name = "LawCityType")
        protected String lawCityType;
        @XmlElement(name = "LawStreet")
        protected String lawStreet;
        @XmlElement(name = "LawHouse")
        protected String lawHouse;
        @XmlElement(name = "LawFrame")
        protected String lawFrame;
        @XmlElement(name = "LawFlat")
        protected String lawFlat;
        @XmlElement(name = "IntAddress")
        protected String intAddress;
        @XmlElement(name = "IntCountry")
        protected String intCountry;
        @XmlElement(name = "IntCountryCode")
        protected String intCountryCode;
        @XmlElement(name = "IntZIP")
        protected String intZIP;
        @XmlElement(name = "IntRegion")
        protected String intRegion;
        @XmlElement(name = "IntArea")
        protected String intArea;
        @XmlElement(name = "IntCity")
        protected String intCity;
        @XmlElement(name = "IntCityType")
        protected String intCityType;
        @XmlElement(name = "IntStreet")
        protected String intStreet;
        @XmlElement(name = "IntHouse")
        protected String intHouse;
        @XmlElement(name = "IntFrame")
        protected String intFrame;
        @XmlElement(name = "IntFlat")
        protected String intFlat;
        @XmlElement(name = "Resident")
        protected String resident;
        @XmlElement(name = "SmsInformOn")
        protected String smsInformOn;

        /**
         * Gets the value of the clientID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientID() {
            return clientID;
        }

        /**
         * Sets the value of the clientID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientID(String value) {
            this.clientID = value;
        }

        /**
         * Gets the value of the fullName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullName() {
            return fullName;
        }

        /**
         * Sets the value of the fullName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullName(String value) {
            this.fullName = value;
        }

        /**
         * Gets the value of the shortName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortName() {
            return shortName;
        }

        /**
         * Sets the value of the shortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShortName(String value) {
            this.shortName = value;
        }

        /**
         * Gets the value of the intName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntName() {
            return intName;
        }

        /**
         * Sets the value of the intName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntName(String value) {
            this.intName = value;
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
         * Gets the value of the kpp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKPP() {
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
        public void setKPP(String value) {
            this.kpp = value;
        }

        /**
         * Gets the value of the kpp2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKPP2() {
            return kpp2;
        }

        /**
         * Sets the value of the kpp2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKPP2(String value) {
            this.kpp2 = value;
        }

        /**
         * Gets the value of the kpp3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKPP3() {
            return kpp3;
        }

        /**
         * Sets the value of the kpp3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKPP3(String value) {
            this.kpp3 = value;
        }

        /**
         * Gets the value of the kpp4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKPP4() {
            return kpp4;
        }

        /**
         * Sets the value of the kpp4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKPP4(String value) {
            this.kpp4 = value;
        }

        /**
         * Gets the value of the ogrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOGRN() {
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
        public void setOGRN(String value) {
            this.ogrn = value;
        }

        /**
         * Gets the value of the ogrndate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOGRNDATE() {
            return ogrndate;
        }

        /**
         * Sets the value of the ogrndate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOGRNDATE(XMLGregorianCalendar value) {
            this.ogrndate = value;
        }

        /**
         * Gets the value of the okpo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOKPO() {
            return okpo;
        }

        /**
         * Sets the value of the okpo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOKPO(String value) {
            this.okpo = value;
        }

        /**
         * Gets the value of the okato property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOKATO() {
            return okato;
        }

        /**
         * Sets the value of the okato property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOKATO(String value) {
            this.okato = value;
        }

        /**
         * Gets the value of the ifns property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIFNS() {
            return ifns;
        }

        /**
         * Sets the value of the ifns property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIFNS(String value) {
            this.ifns = value;
        }

        /**
         * Gets the value of the fax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFax() {
            return fax;
        }

        /**
         * Sets the value of the fax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFax(String value) {
            this.fax = value;
        }

        /**
         * Gets the value of the telex property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelex() {
            return telex;
        }

        /**
         * Sets the value of the telex property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelex(String value) {
            this.telex = value;
        }

        /**
         * Gets the value of the phoneHome property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneHome() {
            return phoneHome;
        }

        /**
         * Sets the value of the phoneHome property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneHome(String value) {
            this.phoneHome = value;
        }

        /**
         * Gets the value of the phoneMobile property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneMobile() {
            return phoneMobile;
        }

        /**
         * Sets the value of the phoneMobile property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneMobile(String value) {
            this.phoneMobile = value;
        }

        /**
         * Gets the value of the phoneWork property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneWork() {
            return phoneWork;
        }

        /**
         * Sets the value of the phoneWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneWork(String value) {
            this.phoneWork = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the lawAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLawAddress() {
            return lawAddress;
        }

        /**
         * Sets the value of the lawAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLawAddress(String value) {
            this.lawAddress = value;
        }

        /**
         * Gets the value of the lawCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLawCountry() {
            return lawCountry;
        }

        /**
         * Sets the value of the lawCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLawCountry(String value) {
            this.lawCountry = value;
        }

        /**
         * Gets the value of the lawCountryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLawCountryCode() {
            return lawCountryCode;
        }

        /**
         * Sets the value of the lawCountryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLawCountryCode(String value) {
            this.lawCountryCode = value;
        }

        /**
         * Gets the value of the lawZIP property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLawZIP() {
            return lawZIP;
        }

        /**
         * Sets the value of the lawZIP property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLawZIP(String value) {
            this.lawZIP = value;
        }

        /**
         * Gets the value of the lawRegion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLawRegion() {
            return lawRegion;
        }

        /**
         * Sets the value of the lawRegion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLawRegion(String value) {
            this.lawRegion = value;
        }

        /**
         * Gets the value of the lawArea property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLawArea() {
            return lawArea;
        }

        /**
         * Sets the value of the lawArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLawArea(String value) {
            this.lawArea = value;
        }

        /**
         * Gets the value of the lawCity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLawCity() {
            return lawCity;
        }

        /**
         * Sets the value of the lawCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLawCity(String value) {
            this.lawCity = value;
        }

        /**
         * Gets the value of the lawCityType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLawCityType() {
            return lawCityType;
        }

        /**
         * Sets the value of the lawCityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLawCityType(String value) {
            this.lawCityType = value;
        }

        /**
         * Gets the value of the lawStreet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLawStreet() {
            return lawStreet;
        }

        /**
         * Sets the value of the lawStreet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLawStreet(String value) {
            this.lawStreet = value;
        }

        /**
         * Gets the value of the lawHouse property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLawHouse() {
            return lawHouse;
        }

        /**
         * Sets the value of the lawHouse property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLawHouse(String value) {
            this.lawHouse = value;
        }

        /**
         * Gets the value of the lawFrame property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLawFrame() {
            return lawFrame;
        }

        /**
         * Sets the value of the lawFrame property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLawFrame(String value) {
            this.lawFrame = value;
        }

        /**
         * Gets the value of the lawFlat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLawFlat() {
            return lawFlat;
        }

        /**
         * Sets the value of the lawFlat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLawFlat(String value) {
            this.lawFlat = value;
        }

        /**
         * Gets the value of the intAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntAddress() {
            return intAddress;
        }

        /**
         * Sets the value of the intAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntAddress(String value) {
            this.intAddress = value;
        }

        /**
         * Gets the value of the intCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntCountry() {
            return intCountry;
        }

        /**
         * Sets the value of the intCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntCountry(String value) {
            this.intCountry = value;
        }

        /**
         * Gets the value of the intCountryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntCountryCode() {
            return intCountryCode;
        }

        /**
         * Sets the value of the intCountryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntCountryCode(String value) {
            this.intCountryCode = value;
        }

        /**
         * Gets the value of the intZIP property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntZIP() {
            return intZIP;
        }

        /**
         * Sets the value of the intZIP property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntZIP(String value) {
            this.intZIP = value;
        }

        /**
         * Gets the value of the intRegion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntRegion() {
            return intRegion;
        }

        /**
         * Sets the value of the intRegion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntRegion(String value) {
            this.intRegion = value;
        }

        /**
         * Gets the value of the intArea property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntArea() {
            return intArea;
        }

        /**
         * Sets the value of the intArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntArea(String value) {
            this.intArea = value;
        }

        /**
         * Gets the value of the intCity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntCity() {
            return intCity;
        }

        /**
         * Sets the value of the intCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntCity(String value) {
            this.intCity = value;
        }

        /**
         * Gets the value of the intCityType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntCityType() {
            return intCityType;
        }

        /**
         * Sets the value of the intCityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntCityType(String value) {
            this.intCityType = value;
        }

        /**
         * Gets the value of the intStreet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntStreet() {
            return intStreet;
        }

        /**
         * Sets the value of the intStreet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntStreet(String value) {
            this.intStreet = value;
        }

        /**
         * Gets the value of the intHouse property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntHouse() {
            return intHouse;
        }

        /**
         * Sets the value of the intHouse property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntHouse(String value) {
            this.intHouse = value;
        }

        /**
         * Gets the value of the intFrame property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntFrame() {
            return intFrame;
        }

        /**
         * Sets the value of the intFrame property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntFrame(String value) {
            this.intFrame = value;
        }

        /**
         * Gets the value of the intFlat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntFlat() {
            return intFlat;
        }

        /**
         * Sets the value of the intFlat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntFlat(String value) {
            this.intFlat = value;
        }

        /**
         * Gets the value of the resident property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResident() {
            return resident;
        }

        /**
         * Sets the value of the resident property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResident(String value) {
            this.resident = value;
        }

        /**
         * Gets the value of the smsInformOn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSmsInformOn() {
            return smsInformOn;
        }

        /**
         * Sets the value of the smsInformOn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSmsInformOn(String value) {
            this.smsInformOn = value;
        }

    }

}

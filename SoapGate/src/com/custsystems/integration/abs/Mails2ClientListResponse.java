
package com.custsystems.integration.abs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Mails2ClientListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mails2ClientListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubSys" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnsDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="response" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mail2Client" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="corporateId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="roleId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="branchId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="isRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                             &lt;element name="attachment" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="fileHash" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="sign" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "Mails2ClientListResponse", propOrder = {
    "reqID",
    "subSys",
    "ansDateTime",
    "response"
})
public class Mails2ClientListResponse {

    protected String reqID;
    @XmlElement(name = "SubSys")
    protected String subSys;
    @XmlElement(name = "AnsDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ansDateTime;
    protected Mails2ClientListResponse.Response response;

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
     *     {@link Mails2ClientListResponse.Response }
     *     
     */
    public Mails2ClientListResponse.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mails2ClientListResponse.Response }
     *     
     */
    public void setResponse(Mails2ClientListResponse.Response value) {
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
     *         &lt;element name="mail2Client" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="corporateId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="roleId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="branchId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="isRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *                   &lt;element name="attachment" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="fileHash" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="sign" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "mail2Client"
    })
    public static class Response {

        protected List<Mails2ClientListResponse.Response.Mail2Client> mail2Client;

        /**
         * Gets the value of the mail2Client property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mail2Client property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMail2Client().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Mails2ClientListResponse.Response.Mail2Client }
         * 
         * 
         */
        public List<Mails2ClientListResponse.Response.Mail2Client> getMail2Client() {
            if (mail2Client == null) {
                mail2Client = new ArrayList<Mails2ClientListResponse.Response.Mail2Client>();
            }
            return this.mail2Client;
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
         *         &lt;element name="corporateId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="roleId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="branchId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="isRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
         *         &lt;element name="attachment" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="fileHash" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="sign" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "corporateId",
            "groupId",
            "roleId",
            "branchId",
            "date",
            "title",
            "body",
            "isRequired",
            "attachment",
            "sign"
        })
        public static class Mail2Client {

            protected List<String> corporateId;
            protected List<String> groupId;
            protected List<String> roleId;
            @XmlElement(required = true)
            protected String branchId;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar date;
            @XmlElement(required = true)
            protected String title;
            @XmlElement(required = true)
            protected String body;
            protected Boolean isRequired;
            protected List<Mails2ClientListResponse.Response.Mail2Client.Attachment> attachment;
            protected Mails2ClientListResponse.Response.Mail2Client.Sign sign;

            /**
             * Gets the value of the corporateId property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the corporateId property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCorporateId().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getCorporateId() {
                if (corporateId == null) {
                    corporateId = new ArrayList<String>();
                }
                return this.corporateId;
            }

            /**
             * Gets the value of the groupId property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the groupId property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGroupId().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getGroupId() {
                if (groupId == null) {
                    groupId = new ArrayList<String>();
                }
                return this.groupId;
            }

            /**
             * Gets the value of the roleId property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the roleId property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRoleId().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getRoleId() {
                if (roleId == null) {
                    roleId = new ArrayList<String>();
                }
                return this.roleId;
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
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the body property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBody() {
                return body;
            }

            /**
             * Sets the value of the body property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBody(String value) {
                this.body = value;
            }

            /**
             * Gets the value of the isRequired property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsRequired() {
                return isRequired;
            }

            /**
             * Sets the value of the isRequired property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsRequired(Boolean value) {
                this.isRequired = value;
            }

            /**
             * Gets the value of the attachment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attachment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAttachment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Mails2ClientListResponse.Response.Mail2Client.Attachment }
             * 
             * 
             */
            public List<Mails2ClientListResponse.Response.Mail2Client.Attachment> getAttachment() {
                if (attachment == null) {
                    attachment = new ArrayList<Mails2ClientListResponse.Response.Mail2Client.Attachment>();
                }
                return this.attachment;
            }

            /**
             * Gets the value of the sign property.
             * 
             * @return
             *     possible object is
             *     {@link Mails2ClientListResponse.Response.Mail2Client.Sign }
             *     
             */
            public Mails2ClientListResponse.Response.Mail2Client.Sign getSign() {
                return sign;
            }

            /**
             * Sets the value of the sign property.
             * 
             * @param value
             *     allowed object is
             *     {@link Mails2ClientListResponse.Response.Mail2Client.Sign }
             *     
             */
            public void setSign(Mails2ClientListResponse.Response.Mail2Client.Sign value) {
                this.sign = value;
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
             *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="fileHash" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "fileName",
                "fileHash"
            })
            public static class Attachment {

                @XmlElement(required = true)
                protected String fileName;
                @XmlElement(required = true)
                protected String fileHash;

                /**
                 * Gets the value of the fileName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFileName() {
                    return fileName;
                }

                /**
                 * Sets the value of the fileName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFileName(String value) {
                    this.fileName = value;
                }

                /**
                 * Gets the value of the fileHash property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFileHash() {
                    return fileHash;
                }

                /**
                 * Sets the value of the fileHash property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFileHash(String value) {
                    this.fileHash = value;
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
             *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "type",
                "fullname"
            })
            public static class Sign {

                @XmlElement(required = true)
                protected String type;
                @XmlElement(required = true)
                protected String fullname;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
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

            }

        }

    }

}

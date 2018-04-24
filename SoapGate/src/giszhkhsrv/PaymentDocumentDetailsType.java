
package giszhkhsrv;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Реквизиты и свойства платежного документа
 * 
 * <p>Java class for PaymentDocumentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDocumentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}PaymentDocumentID"/&gt;
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}AccountNumber"/&gt;
 *         &lt;element name="ExecutorInformation"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}INN"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="Entpr" type="{http://smev.gosuslugi.ru/rev120315}FIOType"/&gt;
 *                     &lt;element name="Legal"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element ref="{http://smev.gosuslugi.ru/rev120315}KPP"/&gt;
 *                               &lt;element name="Name"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;maxLength value="160"/&gt;
 *                                     &lt;minLength value="1"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="PaymentInformation"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://smev.gosuslugi.ru/rev120315}PaymentInformationType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MailingAddress"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1000"/&gt;
 *                         &lt;minLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://smev.gosuslugi.ru/rev120315}ErrorMessage"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Reminder" type="{http://smev.gosuslugi.ru/rev120315}MoneyPositiveType" minOccurs="0"/&gt;
 *             &lt;element name="Debt" type="{http://smev.gosuslugi.ru/rev120315}MoneyPositiveType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Purpose" minOccurs="0"/&gt;
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}PDServiceName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDocumentDetailsType", propOrder = {
    "paymentDocumentID",
    "accountNumber",
    "executorInformation",
    "errorMessage",
    "reminder",
    "debt",
    "purpose",
    "pdServiceName"
})
public class PaymentDocumentDetailsType {

    @XmlElement(name = "PaymentDocumentID", required = true)
    protected String paymentDocumentID;
    @XmlElement(name = "AccountNumber", required = true)
    protected String accountNumber;
    @XmlElement(name = "ExecutorInformation", required = true)
    protected PaymentDocumentDetailsType.ExecutorInformation executorInformation;
    @XmlElement(name = "ErrorMessage")
    protected ErrorMessage errorMessage;
    @XmlElement(name = "Reminder")
    protected BigDecimal reminder;
    @XmlElement(name = "Debt")
    protected BigDecimal debt;
    @XmlElement(name = "Purpose")
    protected String purpose;
    @XmlElement(name = "PDServiceName")
    protected String pdServiceName;

    /**
     * Gets the value of the paymentDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDocumentID() {
        return paymentDocumentID;
    }

    /**
     * Sets the value of the paymentDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDocumentID(String value) {
        this.paymentDocumentID = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the executorInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDocumentDetailsType.ExecutorInformation }
     *     
     */
    public PaymentDocumentDetailsType.ExecutorInformation getExecutorInformation() {
        return executorInformation;
    }

    /**
     * Sets the value of the executorInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDocumentDetailsType.ExecutorInformation }
     *     
     */
    public void setExecutorInformation(PaymentDocumentDetailsType.ExecutorInformation value) {
        this.executorInformation = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessage }
     *     
     */
    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessage }
     *     
     */
    public void setErrorMessage(ErrorMessage value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the reminder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReminder() {
        return reminder;
    }

    /**
     * Sets the value of the reminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReminder(BigDecimal value) {
        this.reminder = value;
    }

    /**
     * Gets the value of the debt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebt() {
        return debt;
    }

    /**
     * Sets the value of the debt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebt(BigDecimal value) {
        this.debt = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the pdServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDServiceName() {
        return pdServiceName;
    }

    /**
     * Sets the value of the pdServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDServiceName(String value) {
        this.pdServiceName = value;
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
     *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}INN"/&gt;
     *         &lt;choice&gt;
     *           &lt;element name="Entpr" type="{http://smev.gosuslugi.ru/rev120315}FIOType"/&gt;
     *           &lt;element name="Legal"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element ref="{http://smev.gosuslugi.ru/rev120315}KPP"/&gt;
     *                     &lt;element name="Name"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                           &lt;maxLength value="160"/&gt;
     *                           &lt;minLength value="1"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="PaymentInformation"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://smev.gosuslugi.ru/rev120315}PaymentInformationType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MailingAddress"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1000"/&gt;
     *               &lt;minLength value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
        "inn",
        "entpr",
        "legal",
        "paymentInformation",
        "mailingAddress"
    })
    public static class ExecutorInformation {

        @XmlElement(name = "INN", required = true)
        protected String inn;
        @XmlElement(name = "Entpr")
        protected FIOType entpr;
        @XmlElement(name = "Legal")
        protected PaymentDocumentDetailsType.ExecutorInformation.Legal legal;
        @XmlElement(name = "PaymentInformation", required = true)
        protected PaymentDocumentDetailsType.ExecutorInformation.PaymentInformation paymentInformation;
        @XmlElement(name = "MailingAddress", required = true)
        protected String mailingAddress;

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
         * Gets the value of the entpr property.
         * 
         * @return
         *     possible object is
         *     {@link FIOType }
         *     
         */
        public FIOType getEntpr() {
            return entpr;
        }

        /**
         * Sets the value of the entpr property.
         * 
         * @param value
         *     allowed object is
         *     {@link FIOType }
         *     
         */
        public void setEntpr(FIOType value) {
            this.entpr = value;
        }

        /**
         * Gets the value of the legal property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentDocumentDetailsType.ExecutorInformation.Legal }
         *     
         */
        public PaymentDocumentDetailsType.ExecutorInformation.Legal getLegal() {
            return legal;
        }

        /**
         * Sets the value of the legal property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentDocumentDetailsType.ExecutorInformation.Legal }
         *     
         */
        public void setLegal(PaymentDocumentDetailsType.ExecutorInformation.Legal value) {
            this.legal = value;
        }

        /**
         * Gets the value of the paymentInformation property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentDocumentDetailsType.ExecutorInformation.PaymentInformation }
         *     
         */
        public PaymentDocumentDetailsType.ExecutorInformation.PaymentInformation getPaymentInformation() {
            return paymentInformation;
        }

        /**
         * Sets the value of the paymentInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentDocumentDetailsType.ExecutorInformation.PaymentInformation }
         *     
         */
        public void setPaymentInformation(PaymentDocumentDetailsType.ExecutorInformation.PaymentInformation value) {
            this.paymentInformation = value;
        }

        /**
         * Gets the value of the mailingAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMailingAddress() {
            return mailingAddress;
        }

        /**
         * Sets the value of the mailingAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMailingAddress(String value) {
            this.mailingAddress = value;
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
         *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}KPP"/&gt;
         *         &lt;element name="Name"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="160"/&gt;
         *               &lt;minLength value="1"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
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
            "kpp",
            "name"
        })
        public static class Legal {

            @XmlElement(name = "KPP", required = true)
            protected String kpp;
            @XmlElement(name = "Name", required = true)
            protected String name;

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
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
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
         *     &lt;extension base="{http://smev.gosuslugi.ru/rev120315}PaymentInformationType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PaymentInformation
            extends PaymentInformationType
        {


        }

    }

}


package giszhkhsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;choice&gt;
 *           &lt;element ref="{http://smev.gosuslugi.ru/rev120315}PaymentDocumentID"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Year" minOccurs="0"/&gt;
 *             &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Month" minOccurs="0"/&gt;
 *             &lt;choice&gt;
 *               &lt;element ref="{http://smev.gosuslugi.ru/rev120315}UnifiedAccountNumber"/&gt;
 *               &lt;sequence&gt;
 *                 &lt;element name="FIASHouseGuid" type="{http://smev.gosuslugi.ru/rev120315}FIASHouseGUIDType"/&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}PaymentDocumentNumber"/&gt;
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}AccountNumber"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/sequence&gt;
 *               &lt;element ref="{http://smev.gosuslugi.ru/rev120315}ServiceID"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="AmountRequired" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Individual"/&gt;
 *                   &lt;element name="Legal"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://smev.gosuslugi.ru/rev120315}INN"/&gt;
 *                             &lt;element ref="{http://smev.gosuslugi.ru/rev120315}KPP"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
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
    "paymentDocumentID",
    "year",
    "month",
    "unifiedAccountNumber",
    "fiasHouseGuid",
    "paymentDocumentNumber",
    "accountNumber",
    "serviceID",
    "amountRequired"
})
@XmlRootElement(name = "PaymentDocumentDetailsRequest")
public class PaymentDocumentDetailsRequest {

    @XmlElement(name = "PaymentDocumentID")
    protected String paymentDocumentID;
    @XmlElement(name = "Year")
    protected Short year;
    @XmlElement(name = "Month")
    protected Integer month;
    @XmlElement(name = "UnifiedAccountNumber")
    protected String unifiedAccountNumber;
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    @XmlElement(name = "PaymentDocumentNumber")
    protected String paymentDocumentNumber;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "ServiceID")
    protected String serviceID;
    @XmlElement(name = "AmountRequired")
    protected PaymentDocumentDetailsRequest.AmountRequired amountRequired;

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
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setYear(Short value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonth(Integer value) {
        this.month = value;
    }

    /**
     * Gets the value of the unifiedAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnifiedAccountNumber() {
        return unifiedAccountNumber;
    }

    /**
     * Sets the value of the unifiedAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnifiedAccountNumber(String value) {
        this.unifiedAccountNumber = value;
    }

    /**
     * Gets the value of the fiasHouseGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASHouseGuid() {
        return fiasHouseGuid;
    }

    /**
     * Sets the value of the fiasHouseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIASHouseGuid(String value) {
        this.fiasHouseGuid = value;
    }

    /**
     * Gets the value of the paymentDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDocumentNumber() {
        return paymentDocumentNumber;
    }

    /**
     * Sets the value of the paymentDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDocumentNumber(String value) {
        this.paymentDocumentNumber = value;
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
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the amountRequired property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDocumentDetailsRequest.AmountRequired }
     *     
     */
    public PaymentDocumentDetailsRequest.AmountRequired getAmountRequired() {
        return amountRequired;
    }

    /**
     * Sets the value of the amountRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDocumentDetailsRequest.AmountRequired }
     *     
     */
    public void setAmountRequired(PaymentDocumentDetailsRequest.AmountRequired value) {
        this.amountRequired = value;
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
     *       &lt;choice&gt;
     *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Individual"/&gt;
     *         &lt;element name="Legal"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}INN"/&gt;
     *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}KPP"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "individual",
        "legal"
    })
    public static class AmountRequired {

        @XmlElement(name = "Individual")
        protected Individual individual;
        @XmlElement(name = "Legal")
        protected PaymentDocumentDetailsRequest.AmountRequired.Legal legal;

        /**
         * Gets the value of the individual property.
         * 
         * @return
         *     possible object is
         *     {@link Individual }
         *     
         */
        public Individual getIndividual() {
            return individual;
        }

        /**
         * Sets the value of the individual property.
         * 
         * @param value
         *     allowed object is
         *     {@link Individual }
         *     
         */
        public void setIndividual(Individual value) {
            this.individual = value;
        }

        /**
         * Gets the value of the legal property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentDocumentDetailsRequest.AmountRequired.Legal }
         *     
         */
        public PaymentDocumentDetailsRequest.AmountRequired.Legal getLegal() {
            return legal;
        }

        /**
         * Sets the value of the legal property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentDocumentDetailsRequest.AmountRequired.Legal }
         *     
         */
        public void setLegal(PaymentDocumentDetailsRequest.AmountRequired.Legal value) {
            this.legal = value;
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
         *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}KPP"/&gt;
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
            "kpp"
        })
        public static class Legal {

            @XmlElement(name = "INN", required = true)
            protected String inn;
            @XmlElement(name = "KPP", required = true)
            protected String kpp;

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

        }

    }

}

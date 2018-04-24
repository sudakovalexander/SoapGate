
package giszhkhsrv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип получателя платежа
 * 
 * <p>Java class for PaymentReceiverType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentReceiverType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}OGRN"/&gt;
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}INN"/&gt;
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}KPP"/&gt;
 *         &lt;element name="F" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="N" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PI" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BN"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="45"/&gt;
 *                         &lt;minLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BBIK" type="{http://smev.gosuslugi.ru/rev120315}BIKType"/&gt;
 *                   &lt;element name="BINN" type="{http://smev.gosuslugi.ru/rev120315}INNType"/&gt;
 *                   &lt;element name="BPP" type="{http://smev.gosuslugi.ru/rev120315}KPPType"/&gt;
 *                   &lt;element name="AN"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;length value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CBA" type="{http://smev.gosuslugi.ru/rev120315}AccountType" minOccurs="0"/&gt;
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
@XmlType(name = "PaymentReceiverType", propOrder = {
    "ogrn",
    "inn",
    "kpp",
    "f",
    "n",
    "pi"
})
public class PaymentReceiverType {

    @XmlElement(name = "OGRN", required = true)
    protected String ogrn;
    @XmlElement(name = "INN", required = true)
    protected String inn;
    @XmlElement(name = "KPP", required = true)
    protected String kpp;
    @XmlElement(name = "F", required = true)
    protected List<String> f;
    @XmlElement(name = "N", required = true)
    protected String n;
    @XmlElement(name = "PI")
    protected List<PaymentReceiverType.PI> pi;

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
     * Gets the value of the f property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getF() {
        if (f == null) {
            f = new ArrayList<String>();
        }
        return this.f;
    }

    /**
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN(String value) {
        this.n = value;
    }

    /**
     * Gets the value of the pi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReceiverType.PI }
     * 
     * 
     */
    public List<PaymentReceiverType.PI> getPI() {
        if (pi == null) {
            pi = new ArrayList<PaymentReceiverType.PI>();
        }
        return this.pi;
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
     *         &lt;element name="BN"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="45"/&gt;
     *               &lt;minLength value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BBIK" type="{http://smev.gosuslugi.ru/rev120315}BIKType"/&gt;
     *         &lt;element name="BINN" type="{http://smev.gosuslugi.ru/rev120315}INNType"/&gt;
     *         &lt;element name="BPP" type="{http://smev.gosuslugi.ru/rev120315}KPPType"/&gt;
     *         &lt;element name="AN"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;length value="20"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CBA" type="{http://smev.gosuslugi.ru/rev120315}AccountType" minOccurs="0"/&gt;
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
        "bn",
        "bbik",
        "binn",
        "bpp",
        "an",
        "cba"
    })
    public static class PI {

        @XmlElement(name = "BN", required = true)
        protected String bn;
        @XmlElement(name = "BBIK", required = true)
        protected String bbik;
        @XmlElement(name = "BINN", required = true)
        protected String binn;
        @XmlElement(name = "BPP", required = true)
        protected String bpp;
        @XmlElement(name = "AN", required = true)
        protected String an;
        @XmlElement(name = "CBA")
        protected String cba;

        /**
         * Gets the value of the bn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBN() {
            return bn;
        }

        /**
         * Sets the value of the bn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBN(String value) {
            this.bn = value;
        }

        /**
         * Gets the value of the bbik property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBBIK() {
            return bbik;
        }

        /**
         * Sets the value of the bbik property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBBIK(String value) {
            this.bbik = value;
        }

        /**
         * Gets the value of the binn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBINN() {
            return binn;
        }

        /**
         * Sets the value of the binn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBINN(String value) {
            this.binn = value;
        }

        /**
         * Gets the value of the bpp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBPP() {
            return bpp;
        }

        /**
         * Sets the value of the bpp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBPP(String value) {
            this.bpp = value;
        }

        /**
         * Gets the value of the an property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAN() {
            return an;
        }

        /**
         * Sets the value of the an property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAN(String value) {
            this.an = value;
        }

        /**
         * Gets the value of the cba property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCBA() {
            return cba;
        }

        /**
         * Sets the value of the cba property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCBA(String value) {
            this.cba = value;
        }

    }

}


package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация об отправителе и получателе перевода/платежа.
 * 
 * <p>Java class for senderReceiverInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="senderReceiverInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="senderName" type="{http://www.bpc.ru/apigate/general/}senderNameType" minOccurs="0"/&gt;
 *         &lt;element name="senderAddress" type="{http://www.bpc.ru/apigate/general/}senderAddressType" minOccurs="0"/&gt;
 *         &lt;element name="senderCity" type="{http://www.bpc.ru/apigate/general/}senderCityType" minOccurs="0"/&gt;
 *         &lt;element name="senderCountry" type="{http://www.bpc.ru/apigate/general/}countryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="senderPostalCode" type="{http://www.bpc.ru/apigate/general/}postalCodeType" minOccurs="0"/&gt;
 *         &lt;element name="receiverName" type="{http://www.bpc.ru/apigate/general/}receiverNameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "senderReceiverInfoType", propOrder = {
    "senderName",
    "senderAddress",
    "senderCity",
    "senderCountry",
    "senderPostalCode",
    "receiverName"
})
public class SenderReceiverInfoType {

    protected String senderName;
    protected String senderAddress;
    protected String senderCity;
    protected String senderCountry;
    protected String senderPostalCode;
    protected String receiverName;

    /**
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Gets the value of the senderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * Sets the value of the senderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddress(String value) {
        this.senderAddress = value;
    }

    /**
     * Gets the value of the senderCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCity() {
        return senderCity;
    }

    /**
     * Sets the value of the senderCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCity(String value) {
        this.senderCity = value;
    }

    /**
     * Gets the value of the senderCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderCountry() {
        return senderCountry;
    }

    /**
     * Sets the value of the senderCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderCountry(String value) {
        this.senderCountry = value;
    }

    /**
     * Gets the value of the senderPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderPostalCode() {
        return senderPostalCode;
    }

    /**
     * Sets the value of the senderPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderPostalCode(String value) {
        this.senderPostalCode = value;
    }

    /**
     * Gets the value of the receiverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Sets the value of the receiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverName(String value) {
        this.receiverName = value;
    }

}

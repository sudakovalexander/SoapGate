
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Параметры терминала.
 * 
 * <p>Java class for cardAcceptorParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cardAcceptorParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="terminalIdentification" type="{http://www.bpc.ru/apigate/general/}cardAcceptorTerminalIdentificationType"/&gt;
 *         &lt;element name="merchantIdentification" type="{http://www.bpc.ru/apigate/general/}merchantIdType"/&gt;
 *         &lt;element name="merchantType" type="{http://www.bpc.ru/apigate/general/}merchantTypeType"/&gt;
 *         &lt;element name="nameAndLocation" type="{http://www.bpc.ru/apigate/general/}cardAcceptorNameAndLocationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cardAcceptorParametersType", propOrder = {
    "terminalIdentification",
    "merchantIdentification",
    "merchantType",
    "nameAndLocation"
})
public class CardAcceptorParametersType {

    @XmlElement(required = true)
    protected String terminalIdentification;
    @XmlElement(required = true)
    protected String merchantIdentification;
    @XmlElement(required = true)
    protected String merchantType;
    protected String nameAndLocation;

    /**
     * Gets the value of the terminalIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalIdentification() {
        return terminalIdentification;
    }

    /**
     * Sets the value of the terminalIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalIdentification(String value) {
        this.terminalIdentification = value;
    }

    /**
     * Gets the value of the merchantIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantIdentification() {
        return merchantIdentification;
    }

    /**
     * Sets the value of the merchantIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantIdentification(String value) {
        this.merchantIdentification = value;
    }

    /**
     * Gets the value of the merchantType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantType() {
        return merchantType;
    }

    /**
     * Sets the value of the merchantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantType(String value) {
        this.merchantType = value;
    }

    /**
     * Gets the value of the nameAndLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAndLocation() {
        return nameAndLocation;
    }

    /**
     * Sets the value of the nameAndLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAndLocation(String value) {
        this.nameAndLocation = value;
    }

}

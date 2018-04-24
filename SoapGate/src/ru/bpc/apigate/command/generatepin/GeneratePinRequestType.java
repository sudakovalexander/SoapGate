
package ru.bpc.apigate.command.generatepin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.bpc.apigate.general.CardAcceptorParametersType;
import ru.bpc.apigate.general.CardIdentificationType;
import ru.bpc.apigate.general.PinDeliveryMethodType;


/**
 * <p>Java class for generatePinRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generatePinRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardIdentification" type="{http://www.bpc.ru/apigate/general/}cardIdentificationType"/&gt;
 *         &lt;element name="pinDeliveryMethod" type="{http://www.bpc.ru/apigate/general/}pinDeliveryMethodType" minOccurs="0"/&gt;
 *         &lt;element name="pinValue" type="{http://www.bpc.ru/apigate/general/}pinValueType" minOccurs="0"/&gt;
 *         &lt;element name="cardAcceptorParameters" type="{http://www.bpc.ru/apigate/general/}cardAcceptorParametersType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generatePinRequestType", propOrder = {
    "cardIdentification",
    "pinDeliveryMethod",
    "pinValue",
    "cardAcceptorParameters"
})
public class GeneratePinRequestType {

    @XmlElement(required = true)
    protected CardIdentificationType cardIdentification;
    @XmlSchemaType(name = "string")
    protected PinDeliveryMethodType pinDeliveryMethod;
    protected String pinValue;
    protected CardAcceptorParametersType cardAcceptorParameters;

    /**
     * Gets the value of the cardIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link CardIdentificationType }
     *     
     */
    public CardIdentificationType getCardIdentification() {
        return cardIdentification;
    }

    /**
     * Sets the value of the cardIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIdentificationType }
     *     
     */
    public void setCardIdentification(CardIdentificationType value) {
        this.cardIdentification = value;
    }

    /**
     * Gets the value of the pinDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PinDeliveryMethodType }
     *     
     */
    public PinDeliveryMethodType getPinDeliveryMethod() {
        return pinDeliveryMethod;
    }

    /**
     * Sets the value of the pinDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDeliveryMethodType }
     *     
     */
    public void setPinDeliveryMethod(PinDeliveryMethodType value) {
        this.pinDeliveryMethod = value;
    }

    /**
     * Gets the value of the pinValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinValue() {
        return pinValue;
    }

    /**
     * Sets the value of the pinValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinValue(String value) {
        this.pinValue = value;
    }

    /**
     * Gets the value of the cardAcceptorParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcceptorParametersType }
     *     
     */
    public CardAcceptorParametersType getCardAcceptorParameters() {
        return cardAcceptorParameters;
    }

    /**
     * Sets the value of the cardAcceptorParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcceptorParametersType }
     *     
     */
    public void setCardAcceptorParameters(CardAcceptorParametersType value) {
        this.cardAcceptorParameters = value;
    }

}

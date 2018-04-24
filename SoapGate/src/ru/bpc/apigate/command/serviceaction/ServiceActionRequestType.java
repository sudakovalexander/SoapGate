
package ru.bpc.apigate.command.serviceaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.bpc.apigate.general.ActionCodeType;
import ru.bpc.apigate.general.CardAcceptorParametersType;
import ru.bpc.apigate.general.CardIdentificationType;
import ru.bpc.apigate.general.ServiceIdentificationType;
import ru.bpc.apigate.general.ServiceParametersType;


/**
 * <p>Java class for serviceActionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceActionRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceIdentification" type="{http://www.bpc.ru/apigate/general/}serviceIdentificationType"/&gt;
 *         &lt;element name="actionCode" type="{http://www.bpc.ru/apigate/general/}actionCodeType"/&gt;
 *         &lt;element name="cardIdentification" type="{http://www.bpc.ru/apigate/general/}cardIdentificationType"/&gt;
 *         &lt;element name="accountNumber" type="{http://www.bpc.ru/apigate/general/}accountNumberType" minOccurs="0"/&gt;
 *         &lt;element name="serviceParameters" type="{http://www.bpc.ru/apigate/general/}serviceParametersType" minOccurs="0"/&gt;
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
@XmlType(name = "serviceActionRequestType", propOrder = {
    "serviceIdentification",
    "actionCode",
    "cardIdentification",
    "accountNumber",
    "serviceParameters",
    "cardAcceptorParameters"
})
public class ServiceActionRequestType {

    @XmlElement(required = true)
    protected ServiceIdentificationType serviceIdentification;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ActionCodeType actionCode;
    @XmlElement(required = true)
    protected CardIdentificationType cardIdentification;
    protected String accountNumber;
    protected ServiceParametersType serviceParameters;
    protected CardAcceptorParametersType cardAcceptorParameters;

    /**
     * Gets the value of the serviceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIdentificationType }
     *     
     */
    public ServiceIdentificationType getServiceIdentification() {
        return serviceIdentification;
    }

    /**
     * Sets the value of the serviceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIdentificationType }
     *     
     */
    public void setServiceIdentification(ServiceIdentificationType value) {
        this.serviceIdentification = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCodeType }
     *     
     */
    public ActionCodeType getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCodeType }
     *     
     */
    public void setActionCode(ActionCodeType value) {
        this.actionCode = value;
    }

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
     * Gets the value of the serviceParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceParametersType }
     *     
     */
    public ServiceParametersType getServiceParameters() {
        return serviceParameters;
    }

    /**
     * Sets the value of the serviceParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceParametersType }
     *     
     */
    public void setServiceParameters(ServiceParametersType value) {
        this.serviceParameters = value;
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

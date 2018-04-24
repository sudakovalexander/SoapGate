
package ru.bpc.apigate.command.changecardlimit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.bpc.apigate.general.CardAcceptorParametersType;
import ru.bpc.apigate.general.CardIdentificationType;
import ru.bpc.apigate.general.LimitBaseDataType;


/**
 * <p>Java class for changeCardLimitRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeCardLimitRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardIdentification" type="{http://www.bpc.ru/apigate/general/}cardIdentificationType"/&gt;
 *         &lt;element name="limit" type="{http://www.bpc.ru/apigate/general/}limitBaseDataType"/&gt;
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
@XmlType(name = "changeCardLimitRequestType", propOrder = {
    "cardIdentification",
    "limit",
    "cardAcceptorParameters"
})
public class ChangeCardLimitRequestType {

    @XmlElement(required = true)
    protected CardIdentificationType cardIdentification;
    @XmlElement(required = true)
    protected LimitBaseDataType limit;
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
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link LimitBaseDataType }
     *     
     */
    public LimitBaseDataType getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitBaseDataType }
     *     
     */
    public void setLimit(LimitBaseDataType value) {
        this.limit = value;
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

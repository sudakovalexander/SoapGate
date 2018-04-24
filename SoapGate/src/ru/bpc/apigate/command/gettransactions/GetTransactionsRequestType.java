
package ru.bpc.apigate.command.gettransactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.bpc.apigate.general.CardIdentificationType;
import ru.bpc.apigate.general.TransactionDateStrictPeriodType;


/**
 * <p>Java class for getTransactionsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTransactionsRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardIdentification" type="{http://www.bpc.ru/apigate/general/}cardIdentificationType"/&gt;
 *         &lt;element name="period" type="{http://www.bpc.ru/apigate/general/}transactionDateStrictPeriodType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTransactionsRequestType", propOrder = {
    "cardIdentification",
    "period"
})
public class GetTransactionsRequestType {

    @XmlElement(required = true)
    protected CardIdentificationType cardIdentification;
    @XmlElement(required = true)
    protected TransactionDateStrictPeriodType period;

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
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDateStrictPeriodType }
     *     
     */
    public TransactionDateStrictPeriodType getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDateStrictPeriodType }
     *     
     */
    public void setPeriod(TransactionDateStrictPeriodType value) {
        this.period = value;
    }

}


package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Детальные параметры транзакции.
 * 
 * <p>Java class for transactionDetailsBDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionDetailsBDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bpc.ru/apigate/general/}transactionBDataType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardAcceptorTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardAcceptorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardAcceptorNameAndCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionDetailsBDataType", propOrder = {
    "cardAcceptorTerminalId",
    "cardAcceptorCode",
    "cardAcceptorNameAndCode"
})
public class TransactionDetailsBDataType
    extends TransactionBDataType
{

    protected String cardAcceptorTerminalId;
    protected String cardAcceptorCode;
    protected String cardAcceptorNameAndCode;

    /**
     * Gets the value of the cardAcceptorTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcceptorTerminalId() {
        return cardAcceptorTerminalId;
    }

    /**
     * Sets the value of the cardAcceptorTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcceptorTerminalId(String value) {
        this.cardAcceptorTerminalId = value;
    }

    /**
     * Gets the value of the cardAcceptorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcceptorCode() {
        return cardAcceptorCode;
    }

    /**
     * Sets the value of the cardAcceptorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcceptorCode(String value) {
        this.cardAcceptorCode = value;
    }

    /**
     * Gets the value of the cardAcceptorNameAndCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAcceptorNameAndCode() {
        return cardAcceptorNameAndCode;
    }

    /**
     * Sets the value of the cardAcceptorNameAndCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAcceptorNameAndCode(String value) {
        this.cardAcceptorNameAndCode = value;
    }

}

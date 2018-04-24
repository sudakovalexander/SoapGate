
package ru.unitarius.integration.schema.cards;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.unitarius.integration.schema.common.AbstractResponseType;


/**
 * <p>Java class for CheckCodewordResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckCodewordResType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://unitarius.ru/integration/schema/common}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardNumber" type="{http://unitarius.ru/integration/schema/cards}CardNumberType"/&gt;
 *         &lt;element name="CodeWord" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsCorrect" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckCodewordResType", propOrder = {
    "cardNumber",
    "codeWord",
    "isCorrect"
})
public class CheckCodewordResType
    extends AbstractResponseType
{

    @XmlElement(name = "CardNumber", required = true)
    protected CardNumberType cardNumber;
    @XmlElement(name = "CodeWord", required = true)
    protected String codeWord;
    @XmlElement(name = "IsCorrect")
    protected boolean isCorrect;

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CardNumberType }
     *     
     */
    public CardNumberType getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardNumberType }
     *     
     */
    public void setCardNumber(CardNumberType value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the codeWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeWord() {
        return codeWord;
    }

    /**
     * Sets the value of the codeWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeWord(String value) {
        this.codeWord = value;
    }

    /**
     * Gets the value of the isCorrect property.
     * 
     */
    public boolean isIsCorrect() {
        return isCorrect;
    }

    /**
     * Sets the value of the isCorrect property.
     * 
     */
    public void setIsCorrect(boolean value) {
        this.isCorrect = value;
    }

}


package ru.bpc.apigate.general;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Параметры комисии.
 * 
 * <p>Java class for feeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="feeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feeAmount" type="{http://www.bpc.ru/apigate/general/}amountType"/&gt;
 *         &lt;element name="feeCurrency" type="{http://www.bpc.ru/apigate/general/}currencyN3CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feeType", propOrder = {
    "feeAmount",
    "feeCurrency"
})
public class FeeType {

    @XmlElement(required = true)
    protected BigInteger feeAmount;
    protected Integer feeCurrency;

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFeeAmount(BigInteger value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the feeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeeCurrency() {
        return feeCurrency;
    }

    /**
     * Sets the value of the feeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeeCurrency(Integer value) {
        this.feeCurrency = value;
    }

}

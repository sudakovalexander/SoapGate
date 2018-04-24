
package giszhkh;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Запрос на квитирование
 * 
 * <p>Java class for AcknowledgmentRequestInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcknowledgmentRequestInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}OrderID"/&gt;
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}PaymentDocumentNumber"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="HSType" type="{http://smev.gosuslugi.ru/rev120315}GUIDType"/&gt;
 *           &lt;element name="MSType" type="{http://smev.gosuslugi.ru/rev120315}GUIDType"/&gt;
 *           &lt;element name="ASType" type="{http://smev.gosuslugi.ru/rev120315}GUIDType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Amount"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;totalDigits value="13"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "AcknowledgmentRequestInfoType", propOrder = {
    "orderID",
    "paymentDocumentNumber",
    "hsType",
    "msType",
    "asType",
    "amount"
})
public class AcknowledgmentRequestInfoType {

    @XmlElement(name = "OrderID", required = true)
    protected String orderID;
    @XmlElement(name = "PaymentDocumentNumber", required = true)
    protected String paymentDocumentNumber;
    @XmlElement(name = "HSType")
    protected String hsType;
    @XmlElement(name = "MSType")
    protected String msType;
    @XmlElement(name = "ASType")
    protected String asType;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;

    /**
     * Уникальный идентификатор извещения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the paymentDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDocumentNumber() {
        return paymentDocumentNumber;
    }

    /**
     * Sets the value of the paymentDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDocumentNumber(String value) {
        this.paymentDocumentNumber = value;
    }

    /**
     * Gets the value of the hsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSType() {
        return hsType;
    }

    /**
     * Sets the value of the hsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSType(String value) {
        this.hsType = value;
    }

    /**
     * Gets the value of the msType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSType() {
        return msType;
    }

    /**
     * Sets the value of the msType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSType(String value) {
        this.msType = value;
    }

    /**
     * Gets the value of the asType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASType() {
        return asType;
    }

    /**
     * Sets the value of the asType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASType(String value) {
        this.asType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

}

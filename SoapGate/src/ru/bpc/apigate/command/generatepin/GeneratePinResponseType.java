
package ru.bpc.apigate.command.generatepin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.bpc.apigate.general.SimpleResponseType;


/**
 * <p>Java class for generatePinResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generatePinResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.bpc.ru/apigate/general/}simpleResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pinValue" type="{http://www.bpc.ru/apigate/general/}pinValueType" minOccurs="0"/&gt;
 *         &lt;element name="encryptedPinValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generatePinResponseType", propOrder = {
    "pinValue",
    "encryptedPinValue"
})
public class GeneratePinResponseType
    extends SimpleResponseType
{

    protected String pinValue;
    protected byte[] encryptedPinValue;

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
     * Gets the value of the encryptedPinValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncryptedPinValue() {
        return encryptedPinValue;
    }

    /**
     * Sets the value of the encryptedPinValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncryptedPinValue(byte[] value) {
        this.encryptedPinValue = value;
    }

}

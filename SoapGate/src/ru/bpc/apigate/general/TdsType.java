
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Параметры транзакции 3DS.
 * 
 * <p>Java class for tdsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tdsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ucaf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authenticationIndicator" type="{http://www.bpc.ru/apigate/general/}ecAuthenticationIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tdsType", propOrder = {
    "xid",
    "cavv",
    "ucaf",
    "authenticationIndicator"
})
public class TdsType {

    protected String xid;
    protected String cavv;
    protected String ucaf;
    @XmlSchemaType(name = "string")
    protected EcAuthenticationIndicator authenticationIndicator;

    /**
     * Gets the value of the xid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXid() {
        return xid;
    }

    /**
     * Sets the value of the xid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXid(String value) {
        this.xid = value;
    }

    /**
     * Gets the value of the cavv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavv() {
        return cavv;
    }

    /**
     * Sets the value of the cavv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavv(String value) {
        this.cavv = value;
    }

    /**
     * Gets the value of the ucaf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUcaf() {
        return ucaf;
    }

    /**
     * Sets the value of the ucaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUcaf(String value) {
        this.ucaf = value;
    }

    /**
     * Gets the value of the authenticationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link EcAuthenticationIndicator }
     *     
     */
    public EcAuthenticationIndicator getAuthenticationIndicator() {
        return authenticationIndicator;
    }

    /**
     * Sets the value of the authenticationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link EcAuthenticationIndicator }
     *     
     */
    public void setAuthenticationIndicator(EcAuthenticationIndicator value) {
        this.authenticationIndicator = value;
    }

}

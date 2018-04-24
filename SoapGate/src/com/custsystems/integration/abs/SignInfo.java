
package com.custsystems.integration.abs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for signInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="signInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sign_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sign_owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sign_data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signInfo", propOrder = {
    "signType",
    "signOwner",
    "signData"
})
public class SignInfo {

    @XmlElement(name = "sign_type")
    protected String signType;
    @XmlElement(name = "sign_owner")
    protected String signOwner;
    @XmlElement(name = "sign_data")
    protected String signData;

    /**
     * Gets the value of the signType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignType() {
        return signType;
    }

    /**
     * Sets the value of the signType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignType(String value) {
        this.signType = value;
    }

    /**
     * Gets the value of the signOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignOwner() {
        return signOwner;
    }

    /**
     * Sets the value of the signOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignOwner(String value) {
        this.signOwner = value;
    }

    /**
     * Gets the value of the signData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignData() {
        return signData;
    }

    /**
     * Sets the value of the signData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignData(String value) {
        this.signData = value;
    }

}

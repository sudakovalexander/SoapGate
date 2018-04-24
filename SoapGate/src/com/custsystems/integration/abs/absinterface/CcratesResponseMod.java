package com.custsystems.integration.abs.absinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.custsystems.integration.abs.CCRatesResponseMod;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="response" type="{http://custsystems.com/integration/abs}CCRatesResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "response"
})
@XmlRootElement(name = "CCRatesResponseMod")
public class CcratesResponseMod {

    @XmlElement(required = true, nillable = true)
    protected CCRatesResponseMod response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link CCRatesResponse }
     *     
     */
    public CCRatesResponseMod getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCRatesResponse }
     *     
     */
    public void setResponse(CCRatesResponseMod value) {
        this.response = value;
    }

}

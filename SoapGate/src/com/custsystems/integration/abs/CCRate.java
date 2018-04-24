
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="C"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CB"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRB"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="R" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="O"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="SELL"/&gt;
 *               &lt;enumeration value="BUY"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCRate", propOrder = {
    "c",
    "crc",
    "cb",
    "crb",
    "r",
    "o",
    "cd",
    "sc"
})
public class CCRate {

    @XmlElement(name = "C", required = true)
    protected String c;
    @XmlElement(name = "CRC", required = true)
    protected String crc;
    @XmlElement(name = "CB", required = true)
    protected String cb;
    @XmlElement(name = "CRB", required = true)
    protected String crb;
    @XmlElement(name = "R", required = true)
    protected BigDecimal r;
    @XmlElement(name = "O", required = true)
    protected String o;
    @XmlElement(name = "SC", required = true)
    protected BigDecimal sc;

    //<isimple-type:CD>2013-10-03T09:08:00</isimple-type:CD>
    @XmlElement(name = "CD", required = true)
    protected String cd;

	/**
     * Gets the value of the c property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC(String value) {
        this.c = value;
    }

    /**
     * Gets the value of the crc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRC() {
        return crc;
    }

    /**
     * Sets the value of the crc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRC(String value) {
        this.crc = value;
    }

    /**
     * Gets the value of the cb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCB() {
        return cb;
    }

    /**
     * Sets the value of the cb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCB(String value) {
        this.cb = value;
    }

    /**
     * Gets the value of the crb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRB() {
        return crb;
    }

    /**
     * Sets the value of the crb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRB(String value) {
        this.crb = value;
    }

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setR(BigDecimal value) {
        this.r = value;
    }

    /**
     * Gets the value of the o property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getO() {
        return o;
    }

    /**
     * Sets the value of the o property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setO(String value) {
        this.o = value;
    }

    /**
     * Gets the value of the sc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSC() {
        return sc;
    }

    /**
     * Sets the value of the sc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSC(BigDecimal value) {
        this.sc = value;
    }
    
    public String getCD() {
		return cd;
	}

	public void setCD(String value) {
		this.cd = value;
	}
}

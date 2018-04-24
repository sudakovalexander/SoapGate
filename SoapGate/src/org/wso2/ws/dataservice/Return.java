
package org.wso2.ws.dataservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for return complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="return"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{actioncode}actioncode"/&gt;
 *         &lt;element ref="{avlbal}avlbal"/&gt;
 *         &lt;element ref="{blkamt}blkamt"/&gt;
 *         &lt;element ref="{currcode}currcode"/&gt;
 *         &lt;element ref="{pan}pan"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "return", propOrder = {
    "accno",
    "actioncode",
    "avlbal",
    "blkamt",
    "currcode",
    "pan"
})
public class Return {

    @XmlElement(required = true, nillable = true)
    protected String accno;
    @XmlElement(namespace = "actioncode", required = true, nillable = true)
    protected String actioncode;
    @XmlElement(namespace = "avlbal", required = true, nillable = true)
    protected String avlbal;
    @XmlElement(namespace = "blkamt", required = true, nillable = true)
    protected String blkamt;
    @XmlElement(namespace = "currcode", required = true, nillable = true)
    protected String currcode;
    @XmlElement(namespace = "pan", required = true, nillable = true)
    protected String pan;

    /**
     * Gets the value of the accno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccno() {
        return accno;
    }

    /**
     * Sets the value of the accno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccno(String value) {
        this.accno = value;
    }

    /**
     * Gets the value of the actioncode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActioncode() {
        return actioncode;
    }

    /**
     * Sets the value of the actioncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActioncode(String value) {
        this.actioncode = value;
    }

    /**
     * Gets the value of the avlbal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvlbal() {
        return avlbal;
    }

    /**
     * Sets the value of the avlbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvlbal(String value) {
        this.avlbal = value;
    }

    /**
     * Gets the value of the blkamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlkamt() {
        return blkamt;
    }

    /**
     * Sets the value of the blkamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlkamt(String value) {
        this.blkamt = value;
    }

    /**
     * Gets the value of the currcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrcode() {
        return currcode;
    }

    /**
     * Sets the value of the currcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrcode(String value) {
        this.currcode = value;
    }

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
    }

}

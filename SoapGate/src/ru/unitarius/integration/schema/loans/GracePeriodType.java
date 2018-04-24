
package ru.unitarius.integration.schema.loans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GracePeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GracePeriodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoanID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="InterestRateTypeCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InterestRateType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GracePeriodDateEnd" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="PayGracePeriodType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PayGracePeriodTerm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GracePeriodType", propOrder = {
    "loanID",
    "interestRateTypeCode",
    "interestRateType",
    "gracePeriodDateEnd",
    "payGracePeriodType",
    "payGracePeriodTerm"
})
public class GracePeriodType {

    @XmlElement(name = "LoanID")
    protected long loanID;
    @XmlElement(name = "InterestRateTypeCode")
    protected int interestRateTypeCode;
    @XmlElement(name = "InterestRateType", required = true)
    protected String interestRateType;
    @XmlElement(name = "GracePeriodDateEnd", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gracePeriodDateEnd;
    @XmlElement(name = "PayGracePeriodType", required = true)
    protected String payGracePeriodType;
    @XmlElement(name = "PayGracePeriodTerm")
    protected int payGracePeriodTerm;

    /**
     * Gets the value of the loanID property.
     * 
     */
    public long getLoanID() {
        return loanID;
    }

    /**
     * Sets the value of the loanID property.
     * 
     */
    public void setLoanID(long value) {
        this.loanID = value;
    }

    /**
     * Gets the value of the interestRateTypeCode property.
     * 
     */
    public int getInterestRateTypeCode() {
        return interestRateTypeCode;
    }

    /**
     * Sets the value of the interestRateTypeCode property.
     * 
     */
    public void setInterestRateTypeCode(int value) {
        this.interestRateTypeCode = value;
    }

    /**
     * Gets the value of the interestRateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRateType() {
        return interestRateType;
    }

    /**
     * Sets the value of the interestRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRateType(String value) {
        this.interestRateType = value;
    }

    /**
     * Gets the value of the gracePeriodDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGracePeriodDateEnd() {
        return gracePeriodDateEnd;
    }

    /**
     * Sets the value of the gracePeriodDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGracePeriodDateEnd(XMLGregorianCalendar value) {
        this.gracePeriodDateEnd = value;
    }

    /**
     * Gets the value of the payGracePeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayGracePeriodType() {
        return payGracePeriodType;
    }

    /**
     * Sets the value of the payGracePeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayGracePeriodType(String value) {
        this.payGracePeriodType = value;
    }

    /**
     * Gets the value of the payGracePeriodTerm property.
     * 
     */
    public int getPayGracePeriodTerm() {
        return payGracePeriodTerm;
    }

    /**
     * Sets the value of the payGracePeriodTerm property.
     * 
     */
    public void setPayGracePeriodTerm(int value) {
        this.payGracePeriodTerm = value;
    }

}


package ru.unitarius.integration.schema.loans;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CalcParamType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalcParamType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoanID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="AlgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlgBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlgNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AlgPeriodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AlgDateStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AlgDateEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AlgPeriodKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PeriodValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCalcType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PaymentPrc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcParamType", propOrder = {
    "loanID",
    "algName",
    "algBrief",
    "algNumber",
    "algPeriodType",
    "algDateStart",
    "algDateEnd",
    "algPeriodKind",
    "periodValue",
    "paymentCalcType",
    "paymentAmount",
    "paymentPrc"
})
public class CalcParamType {

    @XmlElement(name = "LoanID")
    protected long loanID;
    @XmlElement(name = "AlgName")
    protected String algName;
    @XmlElement(name = "AlgBrief")
    protected String algBrief;
    @XmlElement(name = "AlgNumber")
    protected Long algNumber;
    @XmlElement(name = "AlgPeriodType")
    protected String algPeriodType;
    @XmlElement(name = "AlgDateStart")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar algDateStart;
    @XmlElement(name = "AlgDateEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar algDateEnd;
    @XmlElement(name = "AlgPeriodKind")
    protected String algPeriodKind;
    @XmlElement(name = "PeriodValue")
    protected Long periodValue;
    @XmlElement(name = "PaymentCalcType")
    protected String paymentCalcType;
    @XmlElement(name = "PaymentAmount")
    protected BigDecimal paymentAmount;
    @XmlElement(name = "PaymentPrc")
    protected BigDecimal paymentPrc;

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
     * Gets the value of the algName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgName() {
        return algName;
    }

    /**
     * Sets the value of the algName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgName(String value) {
        this.algName = value;
    }

    /**
     * Gets the value of the algBrief property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgBrief() {
        return algBrief;
    }

    /**
     * Sets the value of the algBrief property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgBrief(String value) {
        this.algBrief = value;
    }

    /**
     * Gets the value of the algNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAlgNumber() {
        return algNumber;
    }

    /**
     * Sets the value of the algNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAlgNumber(Long value) {
        this.algNumber = value;
    }

    /**
     * Gets the value of the algPeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgPeriodType() {
        return algPeriodType;
    }

    /**
     * Sets the value of the algPeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgPeriodType(String value) {
        this.algPeriodType = value;
    }

    /**
     * Gets the value of the algDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlgDateStart() {
        return algDateStart;
    }

    /**
     * Sets the value of the algDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlgDateStart(XMLGregorianCalendar value) {
        this.algDateStart = value;
    }

    /**
     * Gets the value of the algDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlgDateEnd() {
        return algDateEnd;
    }

    /**
     * Sets the value of the algDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlgDateEnd(XMLGregorianCalendar value) {
        this.algDateEnd = value;
    }

    /**
     * Gets the value of the algPeriodKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgPeriodKind() {
        return algPeriodKind;
    }

    /**
     * Sets the value of the algPeriodKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgPeriodKind(String value) {
        this.algPeriodKind = value;
    }

    /**
     * Gets the value of the periodValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodValue() {
        return periodValue;
    }

    /**
     * Sets the value of the periodValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodValue(Long value) {
        this.periodValue = value;
    }

    /**
     * Gets the value of the paymentCalcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCalcType() {
        return paymentCalcType;
    }

    /**
     * Sets the value of the paymentCalcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCalcType(String value) {
        this.paymentCalcType = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentAmount(BigDecimal value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the paymentPrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentPrc() {
        return paymentPrc;
    }

    /**
     * Sets the value of the paymentPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentPrc(BigDecimal value) {
        this.paymentPrc = value;
    }

}

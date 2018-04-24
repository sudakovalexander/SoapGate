
package com.custsystems.integration.abs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditPayResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditPayResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="N" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Acc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="A" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Prc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Commis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PaysTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaysTAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaysTCP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaysTPrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaysTCommis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaysR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FactTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FactTCP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FactTPrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FactTCommis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FactR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FactPay" type="{http://custsystems.com/integration/abs}CreditPayRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PlanTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanTCP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanTPrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanTCommis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanPay" type="{http://custsystems.com/integration/abs}CreditPayRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditPayResponse", propOrder = {
    "d",
    "dEnd",
    "n",
    "cur",
    "acc",
    "a",
    "prc",
    "commis",
    "paysTA",
    "paysTAP",
    "paysTCP",
    "paysTPrc",
    "paysTCommis",
    "paysR",
    "factTA",
    "factTCP",
    "factTPrc",
    "factTCommis",
    "factR",
    "factPay",
    "planTA",
    "planTCP",
    "planTPrc",
    "planTCommis",
    "planR",
    "planPay"
})
public class CreditPayResponse {

    @XmlElement(name = "D")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar d;
    @XmlElement(name = "DEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dEnd;
    @XmlElement(name = "N")
    protected String n;
    @XmlElement(name = "CUR")
    protected String cur;
    @XmlElement(name = "Acc")
    protected String acc;
    @XmlElement(name = "A")
    protected BigDecimal a;
    @XmlElement(name = "Prc")
    protected BigDecimal prc;
    @XmlElement(name = "Commis")
    protected BigDecimal commis;
    @XmlElement(name = "PaysTA")
    protected String paysTA;
    @XmlElement(name = "PaysTAP")
    protected String paysTAP;
    @XmlElement(name = "PaysTCP")
    protected String paysTCP;
    @XmlElement(name = "PaysTPrc")
    protected String paysTPrc;
    @XmlElement(name = "PaysTCommis")
    protected String paysTCommis;
    @XmlElement(name = "PaysR")
    protected String paysR;
    @XmlElement(name = "FactTA")
    protected String factTA;
    @XmlElement(name = "FactTCP")
    protected String factTCP;
    @XmlElement(name = "FactTPrc")
    protected String factTPrc;
    @XmlElement(name = "FactTCommis")
    protected String factTCommis;
    @XmlElement(name = "FactR")
    protected String factR;
    @XmlElement(name = "FactPay")
    protected List<CreditPayRecord> factPay;
    @XmlElement(name = "PlanTA")
    protected String planTA;
    @XmlElement(name = "PlanTCP")
    protected String planTCP;
    @XmlElement(name = "PlanTPrc")
    protected String planTPrc;
    @XmlElement(name = "PlanTCommis")
    protected String planTCommis;
    @XmlElement(name = "PlanR")
    protected String planR;
    @XmlElement(name = "PlanPay")
    protected List<CreditPayRecord> planPay;

    /**
     * Gets the value of the d property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setD(XMLGregorianCalendar value) {
        this.d = value;
    }

    /**
     * Gets the value of the dEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDEnd() {
        return dEnd;
    }

    /**
     * Sets the value of the dEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDEnd(XMLGregorianCalendar value) {
        this.dEnd = value;
    }

    /**
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN(String value) {
        this.n = value;
    }

    /**
     * Gets the value of the cur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUR() {
        return cur;
    }

    /**
     * Sets the value of the cur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUR(String value) {
        this.cur = value;
    }

    /**
     * Gets the value of the acc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcc() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcc(String value) {
        this.acc = value;
    }

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setA(BigDecimal value) {
        this.a = value;
    }

    /**
     * Gets the value of the prc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrc() {
        return prc;
    }

    /**
     * Sets the value of the prc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrc(BigDecimal value) {
        this.prc = value;
    }

    /**
     * Gets the value of the commis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommis() {
        return commis;
    }

    /**
     * Sets the value of the commis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommis(BigDecimal value) {
        this.commis = value;
    }

    /**
     * Gets the value of the paysTA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaysTA() {
        return paysTA;
    }

    /**
     * Sets the value of the paysTA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaysTA(String value) {
        this.paysTA = value;
    }

    /**
     * Gets the value of the paysTAP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaysTAP() {
        return paysTAP;
    }

    /**
     * Sets the value of the paysTAP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaysTAP(String value) {
        this.paysTAP = value;
    }

    /**
     * Gets the value of the paysTCP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaysTCP() {
        return paysTCP;
    }

    /**
     * Sets the value of the paysTCP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaysTCP(String value) {
        this.paysTCP = value;
    }

    /**
     * Gets the value of the paysTPrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaysTPrc() {
        return paysTPrc;
    }

    /**
     * Sets the value of the paysTPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaysTPrc(String value) {
        this.paysTPrc = value;
    }

    /**
     * Gets the value of the paysTCommis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaysTCommis() {
        return paysTCommis;
    }

    /**
     * Sets the value of the paysTCommis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaysTCommis(String value) {
        this.paysTCommis = value;
    }

    /**
     * Gets the value of the paysR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaysR() {
        return paysR;
    }

    /**
     * Sets the value of the paysR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaysR(String value) {
        this.paysR = value;
    }

    /**
     * Gets the value of the factTA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactTA() {
        return factTA;
    }

    /**
     * Sets the value of the factTA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactTA(String value) {
        this.factTA = value;
    }

    /**
     * Gets the value of the factTCP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactTCP() {
        return factTCP;
    }

    /**
     * Sets the value of the factTCP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactTCP(String value) {
        this.factTCP = value;
    }

    /**
     * Gets the value of the factTPrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactTPrc() {
        return factTPrc;
    }

    /**
     * Sets the value of the factTPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactTPrc(String value) {
        this.factTPrc = value;
    }

    /**
     * Gets the value of the factTCommis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactTCommis() {
        return factTCommis;
    }

    /**
     * Sets the value of the factTCommis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactTCommis(String value) {
        this.factTCommis = value;
    }

    /**
     * Gets the value of the factR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactR() {
        return factR;
    }

    /**
     * Sets the value of the factR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactR(String value) {
        this.factR = value;
    }

    /**
     * Gets the value of the factPay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factPay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactPay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditPayRecord }
     * 
     * 
     */
    public List<CreditPayRecord> getFactPay() {
        if (factPay == null) {
            factPay = new ArrayList<CreditPayRecord>();
        }
        return this.factPay;
    }

    /**
     * Gets the value of the planTA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanTA() {
        return planTA;
    }

    /**
     * Sets the value of the planTA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanTA(String value) {
        this.planTA = value;
    }

    /**
     * Gets the value of the planTCP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanTCP() {
        return planTCP;
    }

    /**
     * Sets the value of the planTCP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanTCP(String value) {
        this.planTCP = value;
    }

    /**
     * Gets the value of the planTPrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanTPrc() {
        return planTPrc;
    }

    /**
     * Sets the value of the planTPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanTPrc(String value) {
        this.planTPrc = value;
    }

    /**
     * Gets the value of the planTCommis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanTCommis() {
        return planTCommis;
    }

    /**
     * Sets the value of the planTCommis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanTCommis(String value) {
        this.planTCommis = value;
    }

    /**
     * Gets the value of the planR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanR() {
        return planR;
    }

    /**
     * Sets the value of the planR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanR(String value) {
        this.planR = value;
    }

    /**
     * Gets the value of the planPay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planPay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanPay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditPayRecord }
     * 
     * 
     */
    public List<CreditPayRecord> getPlanPay() {
        if (planPay == null) {
            planPay = new ArrayList<CreditPayRecord>();
        }
        return this.planPay;
    }

}

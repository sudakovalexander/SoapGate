
package ru.bpc.apigate.command.reversal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for reversalResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reversalResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseCode" type="{http://www.bpc.ru/apigate/general/}responseCodeType"/&gt;
 *         &lt;element name="processingCode" type="{http://www.bpc.ru/apigate/general/}processingCodeType"/&gt;
 *         &lt;element name="systemTraceAuditNumber" type="{http://www.bpc.ru/apigate/general/}systemTraceAuditNumberType"/&gt;
 *         &lt;element name="transactionDate" type="{http://www.bpc.ru/apigate/general/}transactionDateType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reversalResponseType", propOrder = {
    "responseCode",
    "processingCode",
    "systemTraceAuditNumber",
    "transactionDate"
})
public class ReversalResponseType {

    @XmlElement(required = true)
    protected String responseCode;
    @XmlElement(required = true)
    protected String processingCode;
    protected int systemTraceAuditNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the processingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingCode() {
        return processingCode;
    }

    /**
     * Sets the value of the processingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingCode(String value) {
        this.processingCode = value;
    }

    /**
     * Gets the value of the systemTraceAuditNumber property.
     * 
     */
    public int getSystemTraceAuditNumber() {
        return systemTraceAuditNumber;
    }

    /**
     * Sets the value of the systemTraceAuditNumber property.
     * 
     */
    public void setSystemTraceAuditNumber(int value) {
        this.systemTraceAuditNumber = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

}

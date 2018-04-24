
package ru.unitarius.integration.schema.loans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentScheduleReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentScheduleReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoanID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentScheduleReqType", propOrder = {
    "loanID"
})
public class PaymentScheduleReqType {

    @XmlElement(name = "LoanID")
    protected long loanID;

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

}

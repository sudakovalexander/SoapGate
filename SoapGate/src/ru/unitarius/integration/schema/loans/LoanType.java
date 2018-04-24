
package ru.unitarius.integration.schema.loans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.unitarius.integration.schema.common.AbstractResponseType;


/**
 * <p>Java class for LoanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://unitarius.ru/integration/schema/common}AbstractResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Loan" type="{http://unitarius.ru/integration/schema/loans}LoanFullInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanType", propOrder = {
    "loan"
})
public class LoanType
    extends AbstractResponseType
{

    @XmlElement(name = "Loan")
    protected LoanFullInfoType loan;

    /**
     * Gets the value of the loan property.
     * 
     * @return
     *     possible object is
     *     {@link LoanFullInfoType }
     *     
     */
    public LoanFullInfoType getLoan() {
        return loan;
    }

    /**
     * Sets the value of the loan property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanFullInfoType }
     *     
     */
    public void setLoan(LoanFullInfoType value) {
        this.loan = value;
    }

}

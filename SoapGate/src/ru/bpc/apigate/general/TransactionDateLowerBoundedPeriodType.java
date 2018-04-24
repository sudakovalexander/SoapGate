
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Диапазон дат со строго ограниченным началом.
 * 
 * <p>Java class for transactionDateLowerBoundedPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionDateLowerBoundedPeriodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.bpc.ru/apigate/general/}transactionDatePeriodType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionDateLowerBoundedPeriodType")
public class TransactionDateLowerBoundedPeriodType
    extends TransactionDatePeriodType
{


}

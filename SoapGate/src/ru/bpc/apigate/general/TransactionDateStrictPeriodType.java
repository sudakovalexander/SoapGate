
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Диапазон дат со строгими границами.
 * 
 * <p>Java class for transactionDateStrictPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionDateStrictPeriodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.bpc.ru/apigate/general/}transactionDatePeriodType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionDateStrictPeriodType")
public class TransactionDateStrictPeriodType
    extends TransactionDatePeriodType
{


}

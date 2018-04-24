
package ru.bpc.apigate.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Временной диапазон со строгими границами.
 * 
 * <p>Java class for transactionDateTimeStrictPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionDateTimeStrictPeriodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.bpc.ru/apigate/general/}transactionDateTimePeriodType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionDateTimeStrictPeriodType")
public class TransactionDateTimeStrictPeriodType
    extends TransactionDateTimePeriodType
{


}

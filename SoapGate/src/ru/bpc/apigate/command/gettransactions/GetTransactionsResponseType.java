
package ru.bpc.apigate.command.gettransactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.bpc.apigate.general.TransactionsType;


/**
 * <p>Java class for getTransactionsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTransactionsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactions" type="{http://www.bpc.ru/apigate/general/}transactionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTransactionsResponseType", propOrder = {
    "transactions"
})
public class GetTransactionsResponseType {

    @XmlElement(required = true)
    protected TransactionsType transactions;

    /**
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionsType }
     *     
     */
    public TransactionsType getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionsType }
     *     
     */
    public void setTransactions(TransactionsType value) {
        this.transactions = value;
    }

}

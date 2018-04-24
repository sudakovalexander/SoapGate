
package ru.bpc.apigate.command.ministatement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for miniStatementResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="miniStatementResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.bpc.ru/apigate/command/miniStatement/}miniStatementRecords"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "miniStatementResponseType", propOrder = {
    "miniStatementRecords"
})
public class MiniStatementResponseType {

    @XmlElement(required = true)
    protected MiniStatementRecords miniStatementRecords;

    /**
     * Gets the value of the miniStatementRecords property.
     * 
     * @return
     *     possible object is
     *     {@link MiniStatementRecords }
     *     
     */
    public MiniStatementRecords getMiniStatementRecords() {
        return miniStatementRecords;
    }

    /**
     * Sets the value of the miniStatementRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiniStatementRecords }
     *     
     */
    public void setMiniStatementRecords(MiniStatementRecords value) {
        this.miniStatementRecords = value;
    }

}

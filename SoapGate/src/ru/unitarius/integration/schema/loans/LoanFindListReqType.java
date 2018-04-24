
package ru.unitarius.integration.schema.loans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LoanFindListReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanFindListReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FindByClientList" type="{http://unitarius.ru/integration/schema/loans}LoansListFindByClientType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FindByApplication" type="{http://unitarius.ru/integration/schema/loans}LoansListFindByApplicationType" minOccurs="0"/&gt;
 *         &lt;element name="FindByContractNumber" type="{http://unitarius.ru/integration/schema/loans}LoansListFindByContractNumberType" minOccurs="0"/&gt;
 *         &lt;element name="FindByProduct" type="{http://unitarius.ru/integration/schema/loans}LoansListFindByProductType" minOccurs="0"/&gt;
 *         &lt;element name="FilterDateStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FilterDateEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanFindListReqType", propOrder = {
    "findByClientList",
    "findByApplication",
    "findByContractNumber",
    "findByProduct",
    "filterDateStart",
    "filterDateEnd"
})
public class LoanFindListReqType {

    @XmlElement(name = "FindByClientList")
    protected List<LoansListFindByClientType> findByClientList;
    @XmlElement(name = "FindByApplication")
    protected LoansListFindByApplicationType findByApplication;
    @XmlElement(name = "FindByContractNumber")
    protected LoansListFindByContractNumberType findByContractNumber;
    @XmlElement(name = "FindByProduct")
    protected LoansListFindByProductType findByProduct;
    @XmlElement(name = "FilterDateStart")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar filterDateStart;
    @XmlElement(name = "FilterDateEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar filterDateEnd;

    /**
     * Gets the value of the findByClientList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the findByClientList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFindByClientList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoansListFindByClientType }
     * 
     * 
     */
    public List<LoansListFindByClientType> getFindByClientList() {
        if (findByClientList == null) {
            findByClientList = new ArrayList<LoansListFindByClientType>();
        }
        return this.findByClientList;
    }

    /**
     * Gets the value of the findByApplication property.
     * 
     * @return
     *     possible object is
     *     {@link LoansListFindByApplicationType }
     *     
     */
    public LoansListFindByApplicationType getFindByApplication() {
        return findByApplication;
    }

    /**
     * Sets the value of the findByApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoansListFindByApplicationType }
     *     
     */
    public void setFindByApplication(LoansListFindByApplicationType value) {
        this.findByApplication = value;
    }

    /**
     * Gets the value of the findByContractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link LoansListFindByContractNumberType }
     *     
     */
    public LoansListFindByContractNumberType getFindByContractNumber() {
        return findByContractNumber;
    }

    /**
     * Sets the value of the findByContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoansListFindByContractNumberType }
     *     
     */
    public void setFindByContractNumber(LoansListFindByContractNumberType value) {
        this.findByContractNumber = value;
    }

    /**
     * Gets the value of the findByProduct property.
     * 
     * @return
     *     possible object is
     *     {@link LoansListFindByProductType }
     *     
     */
    public LoansListFindByProductType getFindByProduct() {
        return findByProduct;
    }

    /**
     * Sets the value of the findByProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoansListFindByProductType }
     *     
     */
    public void setFindByProduct(LoansListFindByProductType value) {
        this.findByProduct = value;
    }

    /**
     * Gets the value of the filterDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterDateStart() {
        return filterDateStart;
    }

    /**
     * Sets the value of the filterDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterDateStart(XMLGregorianCalendar value) {
        this.filterDateStart = value;
    }

    /**
     * Gets the value of the filterDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilterDateEnd() {
        return filterDateEnd;
    }

    /**
     * Sets the value of the filterDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilterDateEnd(XMLGregorianCalendar value) {
        this.filterDateEnd = value;
    }

}

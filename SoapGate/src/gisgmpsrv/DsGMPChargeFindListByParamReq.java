
package gisgmpsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataRequest" type="{http://support.diasoft.ru}DataRequestType"/&gt;
 *         &lt;element name="SupplierBillIDList" type="{http://support.diasoft.ru}SupplierBillIDListType" minOccurs="0"/&gt;
 *         &lt;element name="PayerList" type="{http://support.diasoft.ru}PayerListType" minOccurs="0"/&gt;
 *         &lt;element name="ExtApplicationIDList" type="{http://support.diasoft.ru}ExtApplicationIDListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataRequest",
    "supplierBillIDList",
    "payerList",
    "extApplicationIDList"
})
@XmlRootElement(name = "dsGMPChargeFindListByParamReq")
public class DsGMPChargeFindListByParamReq {

    @XmlElement(name = "DataRequest", required = true)
    protected DataRequestType dataRequest;
    @XmlElement(name = "SupplierBillIDList")
    protected SupplierBillIDListType supplierBillIDList;
    @XmlElement(name = "PayerList")
    protected PayerListType payerList;
    @XmlElement(name = "ExtApplicationIDList")
    protected ExtApplicationIDListType extApplicationIDList;

    /**
     * Gets the value of the dataRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DataRequestType }
     *     
     */
    public DataRequestType getDataRequest() {
        return dataRequest;
    }

    /**
     * Sets the value of the dataRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataRequestType }
     *     
     */
    public void setDataRequest(DataRequestType value) {
        this.dataRequest = value;
    }

    /**
     * Gets the value of the supplierBillIDList property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierBillIDListType }
     *     
     */
    public SupplierBillIDListType getSupplierBillIDList() {
        return supplierBillIDList;
    }

    /**
     * Sets the value of the supplierBillIDList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierBillIDListType }
     *     
     */
    public void setSupplierBillIDList(SupplierBillIDListType value) {
        this.supplierBillIDList = value;
    }

    /**
     * Gets the value of the payerList property.
     * 
     * @return
     *     possible object is
     *     {@link PayerListType }
     *     
     */
    public PayerListType getPayerList() {
        return payerList;
    }

    /**
     * Sets the value of the payerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerListType }
     *     
     */
    public void setPayerList(PayerListType value) {
        this.payerList = value;
    }

    /**
     * Gets the value of the extApplicationIDList property.
     * 
     * @return
     *     possible object is
     *     {@link ExtApplicationIDListType }
     *     
     */
    public ExtApplicationIDListType getExtApplicationIDList() {
        return extApplicationIDList;
    }

    /**
     * Sets the value of the extApplicationIDList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtApplicationIDListType }
     *     
     */
    public void setExtApplicationIDList(ExtApplicationIDListType value) {
        this.extApplicationIDList = value;
    }

}

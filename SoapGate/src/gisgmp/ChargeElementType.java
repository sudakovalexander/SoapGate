
package gisgmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GMPChargeDataMainList" type="{http://support.diasoft.ru}GMPChargeMainListType" minOccurs="0"/&gt;
 *         &lt;element name="PayeeAccountList" type="{http://support.diasoft.ru}PayeeAccountListType" minOccurs="0"/&gt;
 *         &lt;element name="PayeeAddressList" type="{http://support.diasoft.ru}PayeeAddressListType" minOccurs="0"/&gt;
 *         &lt;element name="PayeeContactList" type="{http://support.diasoft.ru}PayeeContactListType" minOccurs="0"/&gt;
 *         &lt;element name="GMPChargeAdditionalDataList" type="{http://support.diasoft.ru}GMPChargeAdditionalDataListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeElementType", propOrder = {
    "gmpChargeDataMainList",
    "payeeAccountList",
    "payeeAddressList",
    "payeeContactList",
    "gmpChargeAdditionalDataList"
})
public class ChargeElementType {

    @XmlElement(name = "GMPChargeDataMainList")
    protected GMPChargeMainListType gmpChargeDataMainList;
    @XmlElement(name = "PayeeAccountList")
    protected PayeeAccountListType payeeAccountList;
    @XmlElement(name = "PayeeAddressList")
    protected PayeeAddressListType payeeAddressList;
    @XmlElement(name = "PayeeContactList")
    protected PayeeContactListType payeeContactList;
    @XmlElement(name = "GMPChargeAdditionalDataList")
    protected GMPChargeAdditionalDataListType gmpChargeAdditionalDataList;

    /**
     * Gets the value of the gmpChargeDataMainList property.
     * 
     * @return
     *     possible object is
     *     {@link GMPChargeMainListType }
     *     
     */
    public GMPChargeMainListType getGMPChargeDataMainList() {
        return gmpChargeDataMainList;
    }

    /**
     * Sets the value of the gmpChargeDataMainList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMPChargeMainListType }
     *     
     */
    public void setGMPChargeDataMainList(GMPChargeMainListType value) {
        this.gmpChargeDataMainList = value;
    }

    /**
     * Gets the value of the payeeAccountList property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeAccountListType }
     *     
     */
    public PayeeAccountListType getPayeeAccountList() {
        return payeeAccountList;
    }

    /**
     * Sets the value of the payeeAccountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeAccountListType }
     *     
     */
    public void setPayeeAccountList(PayeeAccountListType value) {
        this.payeeAccountList = value;
    }

    /**
     * Gets the value of the payeeAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeAddressListType }
     *     
     */
    public PayeeAddressListType getPayeeAddressList() {
        return payeeAddressList;
    }

    /**
     * Sets the value of the payeeAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeAddressListType }
     *     
     */
    public void setPayeeAddressList(PayeeAddressListType value) {
        this.payeeAddressList = value;
    }

    /**
     * Gets the value of the payeeContactList property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeContactListType }
     *     
     */
    public PayeeContactListType getPayeeContactList() {
        return payeeContactList;
    }

    /**
     * Sets the value of the payeeContactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeContactListType }
     *     
     */
    public void setPayeeContactList(PayeeContactListType value) {
        this.payeeContactList = value;
    }

    /**
     * Gets the value of the gmpChargeAdditionalDataList property.
     * 
     * @return
     *     possible object is
     *     {@link GMPChargeAdditionalDataListType }
     *     
     */
    public GMPChargeAdditionalDataListType getGMPChargeAdditionalDataList() {
        return gmpChargeAdditionalDataList;
    }

    /**
     * Sets the value of the gmpChargeAdditionalDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMPChargeAdditionalDataListType }
     *     
     */
    public void setGMPChargeAdditionalDataList(GMPChargeAdditionalDataListType value) {
        this.gmpChargeAdditionalDataList = value;
    }

}

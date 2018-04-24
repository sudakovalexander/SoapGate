
package ru.unitarius.integration.schema.loans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoansListFindByProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoansListFindByProductType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Product"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BankProductID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="BankProductBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProductType" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ProductTypeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                   &lt;element name="ProductTypeBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoansListFindByProductType", propOrder = {
    "product",
    "productType"
})
public class LoansListFindByProductType {

    @XmlElement(name = "Product", required = true)
    protected LoansListFindByProductType.Product product;
    @XmlElement(name = "ProductType")
    protected LoansListFindByProductType.ProductType productType;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link LoansListFindByProductType.Product }
     *     
     */
    public LoansListFindByProductType.Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoansListFindByProductType.Product }
     *     
     */
    public void setProduct(LoansListFindByProductType.Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link LoansListFindByProductType.ProductType }
     *     
     */
    public LoansListFindByProductType.ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoansListFindByProductType.ProductType }
     *     
     */
    public void setProductType(LoansListFindByProductType.ProductType value) {
        this.productType = value;
    }


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
     *         &lt;element name="BankProductID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="BankProductBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "bankProductID",
        "bankProductBrief"
    })
    public static class Product {

        @XmlElement(name = "BankProductID")
        protected Long bankProductID;
        @XmlElement(name = "BankProductBrief")
        protected String bankProductBrief;

        /**
         * Gets the value of the bankProductID property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getBankProductID() {
            return bankProductID;
        }

        /**
         * Sets the value of the bankProductID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setBankProductID(Long value) {
            this.bankProductID = value;
        }

        /**
         * Gets the value of the bankProductBrief property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankProductBrief() {
            return bankProductBrief;
        }

        /**
         * Sets the value of the bankProductBrief property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankProductBrief(String value) {
            this.bankProductBrief = value;
        }

    }


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
     *         &lt;element name="ProductTypeID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
     *         &lt;element name="ProductTypeBrief" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "productTypeID",
        "productTypeBrief"
    })
    public static class ProductType {

        @XmlElement(name = "ProductTypeID")
        protected Long productTypeID;
        @XmlElement(name = "ProductTypeBrief")
        protected String productTypeBrief;

        /**
         * Gets the value of the productTypeID property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getProductTypeID() {
            return productTypeID;
        }

        /**
         * Sets the value of the productTypeID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setProductTypeID(Long value) {
            this.productTypeID = value;
        }

        /**
         * Gets the value of the productTypeBrief property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductTypeBrief() {
            return productTypeBrief;
        }

        /**
         * Sets the value of the productTypeBrief property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductTypeBrief(String value) {
            this.productTypeBrief = value;
        }

    }

}

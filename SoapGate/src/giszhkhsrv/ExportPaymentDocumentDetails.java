
package giszhkhsrv;

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
 *       &lt;choice&gt;
 *         &lt;element name="Charge"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://smev.gosuslugi.ru/rev120315}ChargeType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Year"/&gt;
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Month"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}ErrorMessage"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "charge",
    "errorMessage"
})
@XmlRootElement(name = "ExportPaymentDocumentDetails")
public class ExportPaymentDocumentDetails {

    @XmlElement(name = "Charge")
    protected ExportPaymentDocumentDetails.Charge charge;
    @XmlElement(name = "ErrorMessage")
    protected ErrorMessage errorMessage;

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link ExportPaymentDocumentDetails.Charge }
     *     
     */
    public ExportPaymentDocumentDetails.Charge getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPaymentDocumentDetails.Charge }
     *     
     */
    public void setCharge(ExportPaymentDocumentDetails.Charge value) {
        this.charge = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessage }
     *     
     */
    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessage }
     *     
     */
    public void setErrorMessage(ErrorMessage value) {
        this.errorMessage = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://smev.gosuslugi.ru/rev120315}ChargeType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Year"/&gt;
     *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}Month"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "year",
        "month"
    })
    public static class Charge
        extends ChargeType
    {

        @XmlElement(name = "Year")
        protected short year;
        @XmlElement(name = "Month")
        protected int month;

        /**
         * Gets the value of the year property.
         * 
         */
        public short getYear() {
            return year;
        }

        /**
         * Sets the value of the year property.
         * 
         */
        public void setYear(short value) {
            this.year = value;
        }

        /**
         * Gets the value of the month property.
         * 
         */
        public int getMonth() {
            return month;
        }

        /**
         * Sets the value of the month property.
         * 
         */
        public void setMonth(int value) {
            this.month = value;
        }

    }

}

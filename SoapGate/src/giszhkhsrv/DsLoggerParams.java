
package giszhkhsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dsLoggerParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dsLoggerParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operatorLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operatorLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operatorFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operatorMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dsLoggerParams", namespace = "http://support.ftgiszhkhreqprocws.V01.diasoft.ru", propOrder = {
    "operatorLogin",
    "operatorLastName",
    "operatorFirstName",
    "operatorMiddleName"
})
@XmlSeeAlso({
	/*
    DsGISZHKHPaymentNotificationGetByIDReq.class,
    DsGISZHKHSinglePaymentNotificationInsertAsyncReq.class,
    DsGISZHKHPackPaymentNotificationInsertAsyncReq.class,
    DsGISZHKHPackPaymentNotificationGetByIDReq.class,
    DsGISZHKHRecipientDirectoryReq.class,
    DsGISZHKHRecipientListByParamReq.class
    */
})
public class DsLoggerParams {

    protected String operatorLogin;
    protected String operatorLastName;
    protected String operatorFirstName;
    protected String operatorMiddleName;

    /**
     * Gets the value of the operatorLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorLogin() {
        return operatorLogin;
    }

    /**
     * Sets the value of the operatorLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorLogin(String value) {
        this.operatorLogin = value;
    }

    /**
     * Gets the value of the operatorLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorLastName() {
        return operatorLastName;
    }

    /**
     * Sets the value of the operatorLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorLastName(String value) {
        this.operatorLastName = value;
    }

    /**
     * Gets the value of the operatorFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorFirstName() {
        return operatorFirstName;
    }

    /**
     * Sets the value of the operatorFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorFirstName(String value) {
        this.operatorFirstName = value;
    }

    /**
     * Gets the value of the operatorMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorMiddleName() {
        return operatorMiddleName;
    }

    /**
     * Sets the value of the operatorMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorMiddleName(String value) {
        this.operatorMiddleName = value;
    }

}

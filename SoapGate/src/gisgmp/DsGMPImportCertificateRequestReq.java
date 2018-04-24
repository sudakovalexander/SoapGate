
package gisgmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="ImportCertPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Operation" type="{http://support.diasoft.ru}DsOperationType"/&gt;
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
    "importCertPath",
    "operation"
})
@XmlRootElement(name = "dsGMPImportCertificateRequestReq")
public class DsGMPImportCertificateRequestReq {

    @XmlElement(name = "ImportCertPath", required = true)
    protected String importCertPath;
    @XmlElement(name = "Operation", required = true)
    @XmlSchemaType(name = "string")
    protected DsOperationType operation;

    /**
     * Gets the value of the importCertPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportCertPath() {
        return importCertPath;
    }

    /**
     * Sets the value of the importCertPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportCertPath(String value) {
        this.importCertPath = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link DsOperationType }
     *     
     */
    public DsOperationType getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsOperationType }
     *     
     */
    public void setOperation(DsOperationType value) {
        this.operation = value;
    }

}

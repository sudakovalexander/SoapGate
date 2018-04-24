
package giszhkhsrv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegOrgVersionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegOrgVersionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}orgVersionGUID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegOrgVersionType", propOrder = {
    "orgVersionGUID"
})
public class RegOrgVersionType {

    @XmlElement(required = true)
    protected String orgVersionGUID;

    /**
     * Gets the value of the orgVersionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgVersionGUID() {
        return orgVersionGUID;
    }

    /**
     * Sets the value of the orgVersionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgVersionGUID(String value) {
        this.orgVersionGUID = value;
    }

}

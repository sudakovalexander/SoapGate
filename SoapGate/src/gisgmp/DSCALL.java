
package gisgmp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DSCALL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSCALL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commandtext" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="commanddata" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSCALL", propOrder = {
    "commandtext",
    "commanddata"
})
public class DSCALL {

    @XmlElement(required = true)
    protected String commandtext;
    @XmlElement(required = true)
    protected String commanddata;

    /**
     * Gets the value of the commandtext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandtext() {
        return commandtext;
    }

    /**
     * Sets the value of the commandtext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandtext(String value) {
        this.commandtext = value;
    }

    /**
     * Gets the value of the commanddata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommanddata() {
        return commanddata;
    }

    /**
     * Sets the value of the commanddata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommanddata(String value) {
        this.commanddata = value;
    }

}

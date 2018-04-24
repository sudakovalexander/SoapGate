
package currency;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonWSInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonWSInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://valueobj.ws.d8.lv/xsd}CommonInfo"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonWSInfo", namespace = "http://valueobj.ws.d8.lv/xsd")
@XmlSeeAlso({
    CommonRqstInfo.class,
    CommonRspsInfo.class
})
public class CommonWSInfo
    extends CommonInfo
{


}

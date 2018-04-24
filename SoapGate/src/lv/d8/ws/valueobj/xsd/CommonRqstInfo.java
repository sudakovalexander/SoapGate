
package lv.d8.ws.valueobj.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import lv.d8.cortexws.common.valueobj.xsd.CortexWSRqstInfo;


/**
 * <p>Java class for CommonRqstInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonRqstInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://valueobj.ws.d8.lv/xsd}CommonWSInfo"&gt;
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
@XmlType(name = "CommonRqstInfo")
@XmlSeeAlso({
    CortexWSRqstInfo.class
})
public class CommonRqstInfo
    extends CommonWSInfo
{


}

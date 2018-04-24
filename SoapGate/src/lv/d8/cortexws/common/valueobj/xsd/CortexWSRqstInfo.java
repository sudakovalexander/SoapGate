
package lv.d8.cortexws.common.valueobj.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import lv.d8.cortexws.card.valueobj.xsd.GetBalanceRqstInfo;
import lv.d8.cortexws.card.valueobj.xsd.GetStatusRqstInfo;
import lv.d8.cortexws.card.valueobj.xsd.NewStatusRqstInfo;
import lv.d8.ws.valueobj.xsd.CommonRqstInfo;


/**
 * <p>Java class for CortexWSRqstInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CortexWSRqstInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://valueobj.ws.d8.lv/xsd}CommonRqstInfo"&gt;
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
@XmlType(name = "CortexWSRqstInfo")
@XmlSeeAlso({
    GetBalanceRqstInfo.class,
    GetStatusRqstInfo.class,
    NewStatusRqstInfo.class
})
public class CortexWSRqstInfo
    extends CommonRqstInfo
{


}

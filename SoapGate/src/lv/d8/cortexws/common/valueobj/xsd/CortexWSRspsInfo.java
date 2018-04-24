
package lv.d8.cortexws.common.valueobj.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import lv.d8.cortexws.card.valueobj.xsd.GetBalanceRspsInfo;
import lv.d8.cortexws.card.valueobj.xsd.GetStatusRspsInfo;
import lv.d8.cortexws.card.valueobj.xsd.NewStatusRspsInfo;
import lv.d8.ws.valueobj.xsd.CommonRspsInfo;


/**
 * <p>Java class for CortexWSRspsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CortexWSRspsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://valueobj.ws.d8.lv/xsd}CommonRspsInfo"&gt;
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
@XmlType(name = "CortexWSRspsInfo")
@XmlSeeAlso({
    GetBalanceRspsInfo.class,
    GetStatusRspsInfo.class,
    NewStatusRspsInfo.class
})
public class CortexWSRspsInfo
    extends CommonRspsInfo
{


}

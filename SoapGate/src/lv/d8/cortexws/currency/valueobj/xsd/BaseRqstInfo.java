
package lv.d8.cortexws.currency.valueobj.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import lv.d8.cortexws.common.valueobj.xsd.CortexWSRqstInfo;


/**
 * <p>Java class for BaseRqstInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRqstInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://valueobj.common.cortexws.d8.lv/xsd}CortexWSRqstInfo"&gt;
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
@XmlType(name = "BaseRqstInfo")
@XmlSeeAlso({
    GetAddCurrencyRateRqstInfo.class,
    GetCurrenciesRqstInfo.class,
    GetGetCurrencyAlphaRqstInfo.class,
    GetGetCurrencyNumRqstInfo.class,
    GetGetCurrencyRateRqstInfo.class
})
public class BaseRqstInfo
    extends CortexWSRqstInfo
{


}

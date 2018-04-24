
package com.custsystems.integration.abs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCRatesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCRatesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rates" type="{http://custsystems.com/integration/abs}CCRate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCRatesResponseMod", propOrder = {
	    "reqID",
	    "SubSys",
	    "resp"
})
public class CCRatesResponseMod {

	@XmlElement(name = "reqID")
	protected String reqID;
	
    public String getReqID() {
		return reqID;
	}

	public void setReqID(String reqID) {
		this.reqID = reqID;
	}
	
	@XmlElement(name = "SubSys")
	protected String SubSys;
	
    public String getSubSys() {
		return SubSys;
	}

	public void setSubSys(String SubSys) {
		this.SubSys = SubSys;
	}
	
	@XmlElement(name = "response")
	CCRatesResponse resp;

	public CCRatesResponse getResp() {
		return resp;
	}

	public void setResp(CCRatesResponse resp) {
		this.resp = resp;
	}
	
	/*
	 * @XmlElement(name = "CCRate")
	protected List<CCRate> rates;
    public List<CCRate> getRates() {
        if (rates == null) {
            rates = new ArrayList<CCRate>();
        }
        return this.rates;
    }

	 */


}

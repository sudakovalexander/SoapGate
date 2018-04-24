package service.impl;


import currency.*;

//import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java.util.List;

import javax.jws.WebService;

import ctxdbo.CTXDBO;
import ctxdbo.CTXDBOPortType;
import ctxdbo.DataServiceFault_Exception;

@WebService(serviceName = "Currency", endpointInterface = "currency.CurrencyPortType", targetNamespace = "http://service.currency.cortexws.d8.lv")
public class CurrencyImpl implements CurrencyPortType {

	public currency.GetGetCurrencyRateRspsInfo getCurrencyRate(currency.GetGetCurrencyRateRqstInfo param0) {
		currency.GetGetCurrencyRateRspsInfo rri = new currency.GetGetCurrencyRateRspsInfo();
		
		//String path=getServletContext().getRealPath();
		
        CTXDBO service1 = new CTXDBO();
        CTXDBOPortType port1 = service1.getHTTPEndpoint();
        try {
        	ObjectFactory of = new ObjectFactory();
        	
        	System.out.println("getCurrencyRate");
        	System.out.println("URL: "+service1.getWSDLDocumentLocation().toString());
        	System.out.println("> "+param0.getBasecurcode().getValue()+", "+param0.getCurcode().getValue());
        	
        	ctxdbo.Return rr=port1.getCurrencyRate(param0.getBasecurcode().getValue(),param0.getCurcode().getValue()).get(0);
        	
        	System.out.println("< "+rr.toString());
        	
        	String epdate=param0.getDate().getValue();
        	Date dt=new Date(Long.parseLong(epdate));
    		Calendar cln=Calendar.getInstance();
    		cln.setTime(dt);
    		cln.add(Calendar.DATE,1);
    		String epdate14=String.valueOf(cln.getTime().getTime());
    				
    		rri.setAction(of.createBaseRspsInfoAction(""));
    		rri.setActioncode(of.createBaseRspsInfoActioncode("000"));
    		rri.setActionmessage(of.createBaseRspsInfoActionmessage(null));
    		rri.setBasecurcode(of.createGetGetCurrencyRateRspsInfoBasecurcode(rr.getBasecurcode()));
    		rri.setCurcode(of.createGetGetCurrencyRateRspsInfoCurcode(rr.getCurcode()));
    		rri.setBuyrate(of.createGetGetCurrencyRateRspsInfoBuyrate(rr.getBuyrate()));
    		rri.setSellrate(of.createGetGetCurrencyRateRspsInfoSellrate(rr.getSellrate()));
    		rri.setStartdate(of.createGetGetCurrencyRateRspsInfoStartdate(epdate));
    		rri.setEnddate(of.createGetGetCurrencyRateRspsInfoEnddate(epdate14));
    		
		} catch (DataServiceFault_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rri;
	}

}
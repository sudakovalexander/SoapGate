package service.impl;


import lv.d8.cortexws.card.service.*;
import ru.bpc.apigate.Apigate;
import ru.bpc.apigate.Apigate_Service;
import ru.bpc.apigate.ServiceLevelException;
import ru.bpc.apigate.SvfeProcessingException;
import ru.bpc.apigate.command.cardstatusinquiry.CardStatusInquiryRequestType;
import ru.bpc.apigate.command.cardstatusinquiry.CardStatusInquiryResponseType;
import ru.bpc.apigate.command.getcardbalance.GetCardBalanceRequestType;
import ru.bpc.apigate.command.getcardbalance.GetCardBalanceResponseType;
import ru.bpc.apigate.general.CardIdentificationType;
import ru.bpc.apigate.general.ChangeCardStatusRequestType;
import ru.bpc.apigate.general.SimpleResponseType;

import java.math.BigDecimal;
import javax.jws.WebService;

@WebService(serviceName = "Card", endpointInterface = "lv.d8.cortexws.card.service.CardPortType", targetNamespace = "http://service.card.cortexws.d8.lv")
public class CardPortTypeImpl implements CardPortType {
	public lv.d8.cortexws.card.valueobj.xsd.GetBalanceRspsInfo getBalance(
			lv.d8.cortexws.card.valueobj.xsd.GetBalanceRqstInfo param0) {
		lv.d8.cortexws.card.valueobj.xsd.GetBalanceRspsInfo rsp=new lv.d8.cortexws.card.valueobj.xsd.GetBalanceRspsInfo();
		lv.d8.cortexws.card.valueobj.xsd.ObjectFactory of = new lv.d8.cortexws.card.valueobj.xsd.ObjectFactory();
		//rsp.setAvlbal(of.createGetBalanceRspsInfoAvlbal(new BigDecimal (1.23)));

		boolean ivanovCard=SpecialCard.isSpecial(param0.getPan().getValue());
		
		if (ivanovCard){
			// apigate response
	        Apigate_Service service1 = new Apigate_Service();
	        Apigate port1 = service1.getApigate();
	        try {
	        	GetCardBalanceRequestType apiReq = new GetCardBalanceRequestType();
	        	CardIdentificationType apiCard = new CardIdentificationType(); 
	        	apiCard.setCardNumber(param0.getPan().getValue());
	        	apiReq.setCardIdentification(apiCard);
	        	
	        	GetCardBalanceResponseType apiRsp = port1.getCardBalance(apiReq);
	        	rsp.setAvlbal(of.createGetBalanceRspsInfoAvlbal((new BigDecimal(apiRsp.getBalance()).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP))));
	        	rsp.setCurrcode(of.createGetBalanceRspsInfoCurrcode(apiRsp.getCurrency().toString()));
	        	rsp.setPan(of.createGetBalanceRqstInfoPan(apiReq.getCardIdentification().getCardNumber()));
	        	rsp.setActioncode(of.createGetBalanceRspsInfoActioncode("000"));
	        	rsp.setActionmessage(of.createGetBalanceRspsInfoActionmessage(null));
	        	rsp.setBlkamt(of.createGetBalanceRspsInfoBlkamt(new BigDecimal(0)));
	        	
			} catch (SvfeProcessingException | ServiceLevelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			// fake response
	    	rsp.setAvlbal(of.createGetBalanceRspsInfoAvlbal((new BigDecimal(12345))));
	    	rsp.setCurrcode(of.createGetBalanceRspsInfoCurrcode("643"));
	    	rsp.setPan(of.createGetBalanceRqstInfoPan(param0.getPan().getValue()));
	    	rsp.setActioncode(of.createGetBalanceRspsInfoActioncode("000"));
	    	rsp.setActionmessage(of.createGetBalanceRspsInfoActionmessage(null));
	    	rsp.setBlkamt(of.createGetBalanceRspsInfoBlkamt(new BigDecimal(0)));
		}
	    

		
		/*      <ns12:getCardBalanceResponse xmlns:ns12="http://www.bpc.ru/apigate/command/getCardBalance/" xmlns:ns1="http://www.bpc.ru/apigate/general/">
         <ns12:cardIdentification>
            <ns1:cardNumber>4256911071000062</ns1:cardNumber>
         </ns12:cardIdentification>
         <ns12:balance>923421</ns12:balance>
         <ns12:currency>643</ns12:currency>
         <ns12:availableExceedLimit>200000</ns12:availableExceedLimit>
         <ns12:availableExceedLimitCurrency>643</ns12:availableExceedLimitCurrency>
         <ns12:ownFunds>723421</ns12:ownFunds>
         <ns12:ownFundsCurrency>643</ns12:ownFundsCurrency>
      </ns12:getCardBalanceResponse>
*/
		/*
      <ns2:getBalanceResponse xmlns="http://valueobj.card.cortexws.d8.lv/xsd" xmlns:ns2="http://service.card.cortexws.d8.lv">
         <ns2:return>
            <accno>42569110710001268391</accno>
            <actioncode>000</actioncode>
            <actionmessage xsi:nil="true" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"/>
            <avlbal>1782.23</avlbal>
            <blkamt>0</blkamt>
            <currcode>643</currcode>
            <pan>4256911071000062</pan>
         </ns2:return>
      </ns2:getBalanceResponse>
   </soap:Body>
</soap:Envelope>
		*/
		
		// getBalance from http://192.168.77.159:9763/services/CTX_DBO_NEW
		/*
		org.wso2.ws.dataservice.CTXDBONEW service1 = new org.wso2.ws.dataservice.CTXDBONEW();
		org.wso2.ws.dataservice.CTXDBONEWPortType port1 = service1.getSOAP11Endpoint();
		try {
			org.wso2.ws.dataservice.Return innerBal = port1.getBalance(param0.getPan().getValue(),param0.getInstcode().getValue()).get(0);
			rsp.setAccno(of.createGetBalanceRspsInfoAccno(innerBal.getAccno()));
			rsp.setActioncode(of.createGetBalanceRspsInfoActioncode(innerBal.getActioncode()));
			rsp.setActionmessage(of.createGetBalanceRspsInfoActionmessage(null));
			rsp.setAvlbal(of.createGetBalanceRspsInfoAvlbal(new BigDecimal(innerBal.getAvlbal())));
			rsp.setBlkamt(of.createGetBalanceRspsInfoBlkamt(new BigDecimal(innerBal.getBlkamt())));
			rsp.setCurrcode(of.createGetBalanceRspsInfoCurrcode(innerBal.getCurrcode()));
			rsp.setPan(of.createGetBalanceRspsInfoPan(innerBal.getPan()));
		} catch (DataServiceFault_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		return rsp; 
	}

	public lv.d8.cortexws.card.valueobj.xsd.NewStatusRspsInfo newStatus(
			lv.d8.cortexws.card.valueobj.xsd.NewStatusRqstInfo param0) {
		lv.d8.cortexws.card.valueobj.xsd.NewStatusRspsInfo rsp=new lv.d8.cortexws.card.valueobj.xsd.NewStatusRspsInfo();
		lv.d8.cortexws.card.valueobj.xsd.ObjectFactory of = new lv.d8.cortexws.card.valueobj.xsd.ObjectFactory();
		
		rsp.setActionmessage(of.createGetBalanceRspsInfoActionmessage(null));
		rsp.setPan(of.createGetBalanceRqstInfoPan(param0.getPan().getValue()));
		
		String newStatus=param0.getNewstatcode().toString();
		
		if (newStatus.equals("00") || newStatus.equals("92")){
	        Apigate_Service service1 = new Apigate_Service();
	        Apigate port1 = service1.getApigate();
	        try {
	        	ChangeCardStatusRequestType apiReq = new ChangeCardStatusRequestType();
	        	CardIdentificationType apiCard = new CardIdentificationType(); 
	        	apiCard.setCardNumber(param0.getPan().getValue());
	        	apiReq.setCardIdentification(apiCard);
	        	if (newStatus.equals("00")) {
	        		apiReq.setHotCardStatus(0);
	        	}
	        	if (newStatus.equals("92")) {
	        		apiReq.setHotCardStatus(20);
	        	}
	        	SimpleResponseType apiRsp = port1.changeCardStatus(apiReq);
	        	
	        	String responseCode=apiRsp.getResponseCode();
	        	if (responseCode.equals("00")){
	        		rsp.setActioncode(of.createGetBalanceRspsInfoActioncode("000"));
	        	}
	        	else{
	        		rsp.setActioncode(of.createGetBalanceRspsInfoActioncode("118"));
	        		rsp.setActioncode(of.createGetBalanceRspsInfoActioncode("error responseCode: "+responseCode));
	        	}
	        	
	        	
	        	//rsp.statcode(of.createncreateGetBalanceRspsInfoBlkamt(new BigDecimal(0)));
	        	//
	        	
			} catch (SvfeProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				rsp.setActioncode(of.createGetBalanceRspsInfoActioncode("118"));
				rsp.setActioncode(of.createGetBalanceRspsInfoActioncode(e.getFaultInfo().getMessage()));
				
			}
	        catch (ServiceLevelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				rsp.setActioncode(of.createGetBalanceRspsInfoActioncode("118"));
				rsp.setActioncode(of.createGetBalanceRspsInfoActioncode(e.getFaultInfo().getErrorDesc()));
	        }
		}
		else{
			rsp.setActioncode(of.createGetBalanceRspsInfoActioncode("118"));
			rsp.setActionmessage(of.createGetBalanceRspsInfoActionmessage("only 00 and 92 allowed"));
		}

		/*2017-12-20 11:54:22.095 TRACE com.custsystems.integration.card.ProcessingConnector,[QuartzScheduler_Worker-10:]  Request: <ns3:newStatus xmlns:ns3="http://service.card.cortexws.d8.lv" xmlns:ns2="http://valueobj.card.cortexws.d8.lv/xsd" xmlns:ns4="http://valueobj.currency.cortexws.d8.lv/xsd" xmlns:ns5="http://valueobj.transaction.cortexws.d8.lv/xsd" xmlns:ns6="http://service.transaction.cortexws.d8.lv" xmlns:ns7="http://service.currency.cortexws.d8.lv" xmlns:ns8="http://ws.wso2.org/dataservice">
	    <ns3:param0>
	        <ns2:instcode>FORA</ns2:instcode>
	        <ns2:newstatcode>92</ns2:newstatcode>
	        <ns2:pan>4256901050078510</ns2:pan>
	        <ns2:whoset>DBO_FL</ns2:whoset>
	        <ns2:whyset>Быстрая блокировка</ns2:whyset>
	    </ns3:param0>
	</ns3:newStatus>
	     <ns2:getStatusResponse xmlns="http://valueobj.card.cortexws.d8.lv/xsd" xmlns:ns2="http://service.card.cortexws.d8.lv">
         <ns2:return>
            <action/>
            <actioncode>000</actioncode>
            <actionmessage xsi:nil="true" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"/>
            <pan>4256911071000062</pan>
         </ns2:return>
      </ns2:getStatusResponse>
 
	     <chan:changeCardStatusRequest>
         <gen:cardIdentification>
            <!--You have a CHOICE of the next 3 items at this level-->
            <gen:cardNumber>4256911071000062</gen:cardNumber>
        </gen:cardIdentification>
         <gen:hotCardStatus>20</gen:hotCardStatus>
      </chan:changeCardStatusRequest>
      <ns53:changeCardStatusResponse xmlns:ns0="http://www.bpc.ru/apigate/command/p2pTransfer/" xmlns:ns1="http://www.bpc.ru/apigate/general/" xmlns:ns3="http://www.bpc.ru/apigate/command/changeAccountLimit/" xmlns:ns31="http://www.bpc.ru/apigate/command/changeDefaultAccount/" xmlns:ns53="http://www.bpc.ru/apigate/command/changeCardStatus/" xmlns:ns52="http://www.bpc.ru/apigate/command/changeAccountStatus/" xmlns:ns8="http://www.bpc.ru/apigate/command/changePin/" xmlns:ns13="http://www.bpc.ru/apigate/command/activateCard/" xmlns:ns9="http://www.bpc.ru/apigate/command/debitCard/" xmlns:ns11="http://www.bpc.ru/apigate/command/creditCard/" xmlns:ns10="http://www.bpc.ru/apigate/command/serviceAction/" xmlns:ns54="http://www.bpc.ru/apigate/command/blockCard/" xmlns:ns32="http://www.bpc.ru/apigate/command/p2pDebit/" xmlns:ns39="http://www.bpc.ru/apigate/command/visaSmsDispute/" xmlns:ns16="http://www.bpc.ru/apigate/command/purchase/" xmlns:ns37="http://www.bpc.ru/apigate/command/standInMode/" xmlns:ns18="http://www.bpc.ru/apigate/command/validateCard/" xmlns:ns24="http://www.bpc.ru/apigate/command/resetPinCounter/" xmlns:ns46="http://www.bpc.ru/apigate/command/fundsTransfer/" xmlns:ns23="http://www.bpc.ru/apigate/command/changeCardLimit/" xmlns:ns21="http://www.bpc.ru/apigate/command/addCardLimitException/" xmlns:ns49="http://www.bpc.ru/apigate/command/cashDeposit/" xmlns:ns27="http://www.bpc.ru/apigate/command/bindCardToAccount/" xmlns:ns48="http://www.bpc.ru/apigate/command/p2pCredit/">
         <ns1:responseCode>00</ns1:responseCode>
      </ns53:changeCardStatusResponse>

*/
        /*
		try {
			localIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println("localIP: "+localIP);
			
			if (localIP.equals("10.1.204.19")){
				lv.d8.cortexws.card.service.Card service1 = new Card();
				lv.d8.cortexws.card.service.CardPortType port1 = service1.getCardSOAP11PortHttp();
				rsp=port1.newStatus(param0);
			}
			else{
				rsp.setActionmessage(of.createNewStatusRspsInfoActionmessage("no answer for ip: "+localIP));
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		return rsp;
	}

	public lv.d8.cortexws.card.valueobj.xsd.GetStatusRspsInfo getStatus(
			lv.d8.cortexws.card.valueobj.xsd.GetStatusRqstInfo param0) {
		/*
		lv.d8.cortexws.card.valueobj.xsd.GetStatusRspsInfo rsp=new lv.d8.cortexws.card.valueobj.xsd.GetStatusRspsInfo();
		lv.d8.cortexws.card.valueobj.xsd.ObjectFactory of = new lv.d8.cortexws.card.valueobj.xsd.ObjectFactory();
		
        String localIP;
		try {
			localIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println("localIP: "+localIP);
			
			if (localIP.equals("10.1.204.19")){
				lv.d8.cortexws.card.service.Card service1 = new Card();
				lv.d8.cortexws.card.service.CardPortType port1 = service1.getCardSOAP11PortHttp();
				rsp=port1.getStatus(param0);
			}
			else{
				rsp.setActionmessage(of.createNewStatusRspsInfoActionmessage("no answer for ip: "+localIP));
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rsp;
		*/
		
		/*
		// status from Card service
		lv.d8.cortexws.card.service.Card service1 = new Card();
		lv.d8.cortexws.card.service.CardPortType port1 = service1.getCardSOAP11PortHttp();
		return port1.getStatus(param0);
		*/ 
		lv.d8.cortexws.card.valueobj.xsd.GetStatusRspsInfo rsp=new lv.d8.cortexws.card.valueobj.xsd.GetStatusRspsInfo();
		lv.d8.cortexws.card.valueobj.xsd.ObjectFactory of = new lv.d8.cortexws.card.valueobj.xsd.ObjectFactory();
		
		boolean ivanovCard=SpecialCard.isSpecial(param0.getPan().getValue());
		
		if (ivanovCard){
			// apigate response
			
	        Apigate_Service service1 = new Apigate_Service();
	        Apigate port1 = service1.getApigate();
	        try {
	        	
	        	CardStatusInquiryRequestType apiReq = new CardStatusInquiryRequestType();
	        	CardIdentificationType apiCard = new CardIdentificationType(); 
	        	apiCard.setCardNumber(param0.getPan().getValue());
	        	apiReq.setCardIdentification(apiCard);
	        	
	        	CardStatusInquiryResponseType apiRsp = port1.cardStatusInquiry(apiReq);
	        	
	        	int hotStatus=apiRsp.getHotCardStatus();
	        	switch (hotStatus){
	        	case 0:
	        		rsp.setStatcode(of.createGetStatusRspsInfoStatcode("00"));
	        		break;
	        	case 2:
	        	case 13:
	        	case 14:
	        		rsp.setStatcode(of.createGetStatusRspsInfoStatcode("01"));
	        		break;
	        	case 12:
	        	case 17:
	        	case 18:
	        		rsp.setStatcode(of.createGetStatusRspsInfoStatcode("02"));
	        		break;
	        	case 6:
	        		rsp.setStatcode(of.createGetStatusRspsInfoStatcode("04"));
	        		break;
	        	case 7:
	        		rsp.setStatcode(of.createGetStatusRspsInfoStatcode("05"));
	        		break;
	        	case 21:
	        		rsp.setStatcode(of.createGetStatusRspsInfoStatcode("06"));
	        		break;
	        	case 1:
	        	case 3:
	        	case 4:
	        	case 5:
	        	case 8:
	        	case 9:
	        	case 10:
	        	case 11:
	        	case 15:
	        		rsp.setStatcode(of.createGetStatusRspsInfoStatcode("07"));
	        		break;
	        	case 19:
	        		rsp.setStatcode(of.createGetStatusRspsInfoStatcode("08"));
	        		break;
	        	case 20:
	        		rsp.setStatcode(of.createGetStatusRspsInfoStatcode("92"));
	        		break;
	        	default:
	        		rsp.setStatcode(of.createGetStatusRspsInfoStatcode("99"));
	        		break;
	        	}
	        	//rsp.setStatcode(of.createGetStatusRspsInfoStatcode(String.valueOf(apiRsp.getHotCardStatus())));
	        	
	        	rsp.setPan(of.createGetBalanceRqstInfoPan(param0.getPan().getValue()));
	        	rsp.setAction(of.createGetStatusRqstInfoAction(""));
	        	rsp.setActioncode(of.createGetBalanceRspsInfoActioncode("000"));
	        	rsp.setActionmessage(of.createGetBalanceRspsInfoActionmessage(null));
	        	
			} catch (SvfeProcessingException | ServiceLevelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		else{
			// fake response
	    	rsp.setStatcode(of.createGetStatusRspsInfoStatcode("00"));
	    	rsp.setPan(of.createGetBalanceRqstInfoPan(param0.getPan().getValue()));
	    	rsp.setAction(of.createGetStatusRqstInfoAction(""));
	    	rsp.setActioncode(of.createGetBalanceRspsInfoActioncode("000"));
	    	rsp.setActionmessage(of.createGetBalanceRspsInfoActionmessage(null));
		}
		
		
		
        /*
 <ns7:cardStatusInquiryResponse xmlns:ns1="http://www.bpc.ru/apigate/general/" xmlns:ns7="http://www.bpc.ru/apigate/command/cardStatusInquiry/">
         <ns7:hotCardStatus>0</ns7:hotCardStatus>
      </ns7:cardStatusInquiryResponse>

        <ns2:getStatusResponse xmlns="http://valueobj.card.cortexws.d8.lv/xsd" xmlns:ns2="http://service.card.cortexws.d8.lv">
         <ns2:return>
            <action/>
            <actioncode>000</actioncode>
            <actionmessage xsi:nil="true" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"/>
            <pan>4256911071000062</pan>
            <statcode>91</statcode>
         </ns2:return>
      </ns2:getStatusResponse>

*/

        return rsp;
	}
}
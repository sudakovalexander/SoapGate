package service.impl;


import payment.*;
//import payment.client.ReversePaymentReqstInfo;
//import payment.client.ReversePaymentRspsInfo;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import payment.MakePaymentReqstInfo;
import payment.MakePaymentRspsInfo;
import ru.bpc.apigate.Apigate;
import ru.bpc.apigate.Apigate_Service;
import ru.bpc.apigate.ServiceLevelException;
import ru.bpc.apigate.SvfeProcessingException;
import ru.bpc.apigate.command.creditcard.CreditCardRequestType;
import ru.bpc.apigate.command.debitcard.DebitCardRequestType;
import ru.bpc.apigate.command.p2ptransfer.P2PTransferRequestType;
import ru.bpc.apigate.command.purchase.PurchaseRequestType;
import ru.bpc.apigate.command.reversal.ReversalRequestType;
import ru.bpc.apigate.command.reversal.ReversalResponseType;
import ru.bpc.apigate.general.CardIdentificationType;
import ru.bpc.apigate.general.FinancialTransactionResponseType;

@WebService(serviceName = "Payment", endpointInterface = "payment.PaymentPortType", targetNamespace = "http://service.transaction.cortexws.d8.lv")
public class PaymentImpl implements payment.PaymentPortType {

		public ReversePaymentRspsInfo reversePayment(payment.ReversePaymentReqstInfo param0) {
			
		ObjectFactory of = new ObjectFactory();
		

		//through apigate
		ReversePaymentRspsInfo rsp = new ReversePaymentRspsInfo(); 
        Apigate_Service service = new Apigate_Service();
        Apigate port = service.getApigate();

    	long transactionId=Long.valueOf(param0.getRrn().getValue());
    	
		transaction tr= new transaction();
		if(tr.load(transactionId)){
			if(tr.getAmount()== (long)(Math.round(param0.getAmttxn().getValue()*100))){
		        try{
		        	ReversalRequestType apiReq = new ReversalRequestType();
		        	
		        	CardIdentificationType apiCard = new CardIdentificationType();
		        	apiCard.setCardNumber(param0.getPan().getValue());
		        	apiReq.setCardIdentification(apiCard);
		        	
		        	apiReq.setAmount(BigInteger.valueOf(tr.getAmount()));
		        	apiReq.setCurrency(new Integer(param0.getCurtxn().getValue()).intValue());
		        	apiReq.setProcessingCode(String.valueOf(tr.getProcessingCode()));
		        	apiReq.setSystemTraceAuditNumber((int)(tr.getStan()));
		        	apiReq.setTransactionDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(tr.getTransactionDate()));
		        	apiReq.setRrn(tr.getRrn());
		        	apiReq.setAuthorizationIdResponse(tr.getAuthorisationId());
		        	
		        	/*
		        	
		        	apiReq.setAmount(BigDecimal.valueOf(param0.getAmttxn().getValue()*100).toBigInteger());
		        	//String dt=d.substring(0, 4)+"-"+d.substring(4,6)+"-"+d.substring(6, 8)+"T"+t.substring(0, 2)+":"+t.substring(2,4)+":"+t.substring(4,6)+"+03:00";
		        			
		        	DateFormat format = new SimpleDateFormat("yyyyMMddhhmmss");
		        	GregorianCalendar cal = new GregorianCalendar();
		        	try {
						cal.setTime(format.parse(param0.getDateLocal().getValue()+param0.getTimeLocal().getValue()));
			        	XMLGregorianCalendar transactionDate =  DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			        	System.out.println(transactionDate.toString());
			        	apiReq.setTransactionDate(transactionDate);
						
					} catch (ParseException | DatatypeConfigurationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/
		        	
		     	
		        	/* <ns5:amttxn>25.43</ns5:amttxn>
		            <ns5:cardExpiry>1802</ns5:cardExpiry>
		            <ns5:curtxn>643</ns5:curtxn>
		            <ns5:dateLocal>20180118</ns5:dateLocal>
		            <ns5:instcode>FORA</ns5:instcode>
		            <ns5:mrchNo>410104</ns5:mrchNo>
		            <ns5:pan>4256901050010869</ns5:pan>
		            <ns5:rrn>638470</ns5:rrn>
		            <ns5:seqno>0</ns5:seqno>
		            <ns5:timeLocal>110556</ns5:timeLocal>
		    </ns6:reversePayment>

		             <rev:cardIdentification>
		                <gen:cardNumber>4256901070600509</gen:cardNumber>
		             </rev:cardIdentification>
		             <rev:amount>5600</rev:amount>
		             <rev:currency>643</rev:currency>
		             <rev:processingCode>270000</rev:processingCode>
		             <rev:systemTraceAuditNumber>203771</rev:systemTraceAuditNumber>
		             <rev:transactionDate>2018-02-01T15:40:03+03:00</rev:transactionDate>
		             <rev:rrn>000001607256</rev:rrn>
		             <rev:authorizationIdResponse>607256</rev:authorizationIdResponse>
		          </rev:reversalRequest>
		    */
		        	
		        	ReversalResponseType apiRsp = port.reversal(apiReq);
		        	
		        	rsp.setRspcode(of.createMakePaymentRspsInfoRspcode(apiRsp.getResponseCode()));
		        	rsp.setActioncode(0);
		        	rsp.setRejMsg(of.createMakePaymentRspsInfoRejMsg(null));
		        	//rsp.setTlogid(of.createMakePaymentRspsInfoTlogid(Long.valueOf(apiRsp.getRrn())));
		        	/*      
		 <ns6:reversalResponse xmlns:ns6="http://www.bpc.ru/apigate/command/reversal/" xmlns:ns1="http://www.bpc.ru/apigate/general/">
         <ns6:responseCode>00</ns6:responseCode>
         <ns6:processingCode>270000</ns6:processingCode>
         <ns6:systemTraceAuditNumber>203771</ns6:systemTraceAuditNumber>
         <ns6:transactionDate>2018-02-01T15:40:03+03:00</ns6:transactionDate>
      </ns6:reversalResponse>
      */

		        	
				} catch (SvfeProcessingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					rsp.setRspcode(of.createMakePaymentRspsInfoRspcode(e.getFaultInfo().getResponseCode()));
					rsp.setRejMsg(of.createMakePaymentRspsInfoRejMsg(e.getFaultInfo().getMessage()));

				} catch (ServiceLevelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					rsp.setRspcode(of.createMakePaymentRspsInfoRspcode("-1"));
					rsp.setRejMsg(of.createMakePaymentRspsInfoRejMsg(e.getFaultInfo().getErrorDesc()));
				}
		        catch (DatatypeConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					rsp.setRspcode(of.createMakePaymentRspsInfoRspcode("-1"));
					rsp.setRejMsg(of.createMakePaymentRspsInfoRejMsg(e.getMessage()));
				}				
			}
			else{
				rsp.setRspcode(of.createMakePaymentRspsInfoRspcode("-1"));
				rsp.setRejMsg(of.createMakePaymentRspsInfoRejMsg("Invalid amount for transaction, id="+transactionId));
			};
		}
		else{
			rsp.setRspcode(of.createMakePaymentRspsInfoRspcode("-1"));
			rsp.setRejMsg(of.createMakePaymentRspsInfoRejMsg("Can't find transaction, id="+transactionId));
		};


		
		
		/*
		//through CTXDBO & cortex-ws
		// 1: tlogid -> RRN
		String tlogid=param0.getRrn().getValue();
		String RRN="?";
		
        CTXDBO service1 = new CTXDBO();
        CTXDBOPortType port1 = service1.getHTTPEndpoint();
        try {
        	System.out.println("getRRN");
        	System.out.println("URL: "+service1.getWSDLDocumentLocation().toString());
        	System.out.println("> "+tlogid);
        	Entry ent=port1.getRRN(tlogid).get(0);
        	RRN=ent.getRRN();
        	System.out.println("< "+RRN);
		} catch (DataServiceFault_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // 2: reversePayment with RRN
        if (RRN!="?"){
	        Payment service2 = new Payment();
	        PaymentPortType port2 = service2.getPaymentHttpport();
	        	
	        ObjectFactory of = new ObjectFactory();
	        ReversePaymentReqstInfo rqst = of.createReversePaymentReqstInfo();
	    	rqst.setAmttxn(of.createReversePaymentReqstInfoAmttxn(param0.getAmttxn().getValue()));
	    	rqst.setCardExpiry(of.createReversePaymentReqstInfoCardExpiry(param0.getCardExpiry().getValue()));
	    	rqst.setCurtxn(of.createReversePaymentReqstInfoCurtxn(param0.getCurtxn().getValue()));
	    	rqst.setDateLocal(of.createReversePaymentReqstInfoDateLocal(param0.getDateLocal().getValue()));
	    	rqst.setInstcode(of.createReversePaymentReqstInfoInstcode(param0.getInstcode().getValue()));
	    	rqst.setMrchNo(of.createReversePaymentReqstInfoMrchNo(param0.getMrchNo().getValue()));
	    	rqst.setPan(of.createReversePaymentReqstInfoPan(param0.getPan().getValue()));
	    	rqst.setRrn(of.createReversePaymentReqstInfoRrn(RRN));
	    	rqst.setSeqno(of.createReversePaymentReqstInfoSeqno(param0.getSeqno().getValue()));
	    	rqst.setTimeLocal(of.createReversePaymentReqstInfoTimeLocal(param0.getTimeLocal().getValue()));
	    	
	    	
        	System.out.println("reversePayment");
        	System.out.println("URL: "+service2.getWSDLDocumentLocation().toString());
        	System.out.println("> "+RRN);
	    	ReversePaymentRspsInfo rspn=port2.reversePayment(rqst);
	    	System.out.println("< "+rspn.getRspcode().getValue());
	        
			rpri.setActioncode(rspn.getActioncode());
			rpri.setAuthcode(rspn.getAuthcode());

			String RejMsg=rspn.getRejMsg().getValue();
			if (RejMsg!="") RejMsg+=", ";
			rpri.setRejMsg(of.createReversePaymentRspsInfoRejMsg(RejMsg+"RRN: "+RRN));
			
			rpri.setRspcode(rspn.getRspcode());
			rpri.setStan(rspn.getStan());
			rpri.setTlogid(rspn.getTlogid());
        }
        */
		
		return rsp;
	}

		@Override
		public CRD2CRDPaymentRspsInfo makeCRD2CRD(CRD2CRDPaymentReqstInfo param0) {
	        ObjectFactory of = new ObjectFactory();
	        CRD2CRDPaymentRspsInfo rsp= new CRD2CRDPaymentRspsInfo();
	        
			boolean ivanovCard=SpecialCard.isSpecial(param0.getClearRecipientPan().getValue()) && SpecialCard.isSpecial(param0.getClearSenderPan().getValue());
			
		if (ivanovCard) {
			// through apigate

			Apigate_Service service = new Apigate_Service();
			Apigate port = service.getApigate();

			try {
				P2PTransferRequestType apiReq = new P2PTransferRequestType();
				CardIdentificationType apiSourceCard = new CardIdentificationType();
				CardIdentificationType apiDestinationCard = new CardIdentificationType();
				apiSourceCard.setCardNumber(param0.getClearSenderPan().getValue());
				apiDestinationCard.setCardNumber(param0.getClearRecipientPan().getValue());
				apiReq.setSourceCardIdentification(apiSourceCard);
				apiReq.setDestinationCardIdentification(apiDestinationCard);
				apiReq.setCurrency(new Integer(param0.getCurtxn().getValue()).intValue());
				apiReq.setAmount(BigDecimal.valueOf(Math.round(param0.getAmttxn().getValue() * 100)).toBigInteger());

				FinancialTransactionResponseType apiRsp = port.p2PTransfer(apiReq);

				rsp.setRspcode(of.createMakePaymentRspsInfoRspcode(apiRsp.getResponseCode()));
				rsp.setActioncode(0);
				rsp.setRejMsg(of.createMakePaymentRspsInfoRejMsg(null));
				// rsp.setTlogid(of.createMakePaymentRspsInfoTlogid(Long.valueOf(apiRsp.getRrn())));

				transaction tr = new transaction();
				tr.setAmount(apiReq.getAmount().longValue());
				tr.setStan(apiRsp.getSystemTraceAuditNumber());
				tr.setRrn(apiRsp.getRrn());
				tr.setAuthorisationId(apiRsp.getAuthorizationIdResponse());
				tr.setTransactionDate(apiRsp.getLocalTransactionDate().toString());
				tr.setProcessingCode(Long.valueOf(apiRsp.getProcessingCode()));

				// tr.save();
				// rsp.setTlogid(of.createMakePaymentRspsInfoTlogid("test
				// CRD2CRDPaymentRspsInfo"));
				rsp.setTlogid(of.createMakePaymentRspsInfoTlogid(tr.save()));
			} catch (SvfeProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				rsp.setRspcode(of.createMakePaymentRspsInfoRspcode(e.getFaultInfo().getResponseCode()));
				rsp.setRejMsg(of.createMakePaymentRspsInfoRejMsg(e.getFaultInfo().getMessage()));

			} catch (ServiceLevelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				rsp.setRspcode(of.createMakePaymentRspsInfoRspcode("-1"));
				rsp.setRejMsg(of.createMakePaymentRspsInfoRejMsg(e.getFaultInfo().getErrorDesc()));

			}
		}			
		else{
		        // fake positive
	        	rsp.setRspcode(of.createCRD2CRDPaymentRspsInfoRspcode("00"));
	        	rsp.setRejMsg(of.createCRD2CRDPaymentRspsInfoRejMsg(null));
	        	rsp.setActioncode(0);
	        	rsp.setTlogid(of.createCRD2CRDPaymentRspsInfoTlogid(123456L));
			}
        	
/*
 *  <ns6:param0>
	        <ns5:clearSenderPan>4256901050078510</ns5:clearSenderPan>
	        <ns5:cryptedSenderPan>4256901050078510</ns5:cryptedSenderPan>
	        <ns5:displaySenderPan>425690_8510</ns5:displaySenderPan>
	        <ns5:clearRecipientPan>4256901050010869</ns5:clearRecipientPan>
	        <ns5:cryptedRecipientPan>4256901050010869</ns5:cryptedRecipientPan>
	        <ns5:displayRecipientPan>425690_0869</ns5:displayRecipientPan>
	        <ns5:cardExpiry>2005</ns5:cardExpiry>
	        <ns5:amttxn>11.00</ns5:amttxn>
	        <ns5:curtxn>643</ns5:curtxn>
	        <ns5:dateLocal>20180110</ns5:dateLocal>
	        <ns5:timeLocal>120612</ns5:timeLocal>
	        <ns5:termCode>41010401</ns5:termCode>
	    </ns6:param0>
	</ns6:makeCRD2CRD>
	
	<p2p:p2pTransferRequest>
         <p2p:sourceCardIdentification>
            <gen:cardNumber>4256901070600509</gen:cardNumber>
         </p2p:sourceCardIdentification>
         <p2p:destinationCardIdentification>
            <gen:cardNumber>4256901070922903</gen:cardNumber>
         </p2p:destinationCardIdentification>
         <p2p:amount>22200</p2p:amount>
         <p2p:currency>643</p2p:currency>
      </p2p:p2pTransferRequest>
      
  <ns1:responseCode>00</ns1:responseCode>
         <ns1:processingCode>490000</ns1:processingCode>
         <ns1:systemTraceAuditNumber>738513</ns1:systemTraceAuditNumber>
         <ns1:localTransactionDate>2018-02-04T13:15:41+03:00</ns1:localTransactionDate>
         <ns1:rrn>000001632357</ns1:rrn>
         <ns1:authorizationIdResponse>632359</ns1:authorizationIdResponse>
      </ns0:p2pTransferResponse>
      
      <ns2:return>
        <actioncode xmlns:ax210="http://valueobj.transaction.cortexws.d8.lv/xsd" xmlns:ns="http://service.transaction.cortexws.d8.lv">0</actioncode>
        <rejMsg xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:nil="true"/>
        <rspcode>00</rspcode>
        <tlogid>638351</tlogid>
    </ns2:return>
</ns2:makeCRD2CRDResponse>
*/
	        /*
	        // substitute for 113
	        String localIP;
			try {
				localIP = InetAddress.getLocalHost().getHostAddress();
				System.out.println("localIP: "+localIP);
				
				if (localIP.equals("10.1.204.113")){
					param0.setClearSenderPan(of.createCRD2CRDPaymentReqstInfoClearSenderPan("4578259970000069"));
					param0.setCryptedSenderPan(of.createCRD2CRDPaymentReqstInfoCryptedSenderPan("4578259970000069"));
					param0.setCardExpiry(of.createCRD2CRDPaymentReqstInfoCardExpiry("2005"));
					param0.setClearRecipientPan(of.createCRD2CRDPaymentReqstInfoClearRecipientPan("4578259970000077"));
					param0.setCryptedRecipientPan(of.createCRD2CRDPaymentReqstInfoCryptedRecipientPan("4578259970000077"));

					System.out.println("substitute pans 4578...0069 4578...0077");
				}
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/

			/*
			// through cortex-ws/Payment
			Payment service = new Payment();
	        PaymentPortType port = service.getPaymentHttpport();
			CRD2CRDPaymentRspsInfo rsp=port.makeCRD2CRD(param0);
			*/
			
			// test - insert AFT answer
			/*
			rsp.setActioncode("1");
			rsp.setRejMsg(of.createCRD2CRDPaymentRspsInfoRejMsg("Cortex rejected with mg: AFT"));
			rsp.setTlogid(of.createCRD2CRDPaymentRspsInfoTlogid(null));
			*/
			
			/* 
			// e-mail on error
			  if (!rsp.getRspcode().getValue().toString().equals("00")){
				  String reqInfo="card: "+param0.getDisplaySenderPan().getValue()
						  +" to: "+param0.getDisplayRecipientPan().getValue()
						  +"; amount: "+param0.getAmttxn().getValue().toString();
				  String rspInfo="tlogid="+rsp.getTlogid().getValue().toString()+"; rspcode="+rsp.getRspcode().getValue().toString();
				  String rejMsg=rsp.getRejMsg().getValue().toString();
				  MailAlert.alert("SoapGate makeCRD2CRD error",reqInfo+"\n"+rspInfo+"\n"+rejMsg);
			  }
			  else
				  System.out.println("00");
			*/
			
			
			return rsp;
		}

		@Override
		public MakePaymentRspsInfo makePayment(MakePaymentReqstInfo param0) {
			System.out.println("makePayment");
	        ObjectFactory of = new ObjectFactory();
	        MakePaymentRspsInfo rsp = new MakePaymentRspsInfo(); 

			boolean ivanovCard=SpecialCard.isSpecial(param0.getPan().getValue());
			
			if (ivanovCard){
		        // through apigate
		        Apigate_Service service = new Apigate_Service();
		        Apigate port = service.getApigate();

		        try{
		        	PurchaseRequestType apiReq = new PurchaseRequestType();
		        	CardIdentificationType apiCard = new CardIdentificationType(); 
		        	apiCard.setCardNumber(param0.getPan().getValue());
		        	apiReq.setCardIdentification(apiCard);
		        	apiReq.setCurrency(new Integer(param0.getCurtxn().getValue()).intValue());
		        	apiReq.setAmount(BigDecimal.valueOf(Math.round(param0.getAmttxn().getValue()*100)).toBigInteger());
		        	FinancialTransactionResponseType apiRsp = port.purchase(apiReq);
		        	
		        	rsp.setRspcode(of.createMakePaymentRspsInfoRspcode(apiRsp.getResponseCode()));
		        	rsp.setAuthcode(of.createMakePaymentRspsInfoAuthcode(apiRsp.getAuthorizationIdResponse()));
		        	rsp.setRejMsg(of.createMakePaymentRspsInfoRejMsg(null));
		        	rsp.setActioncode(0);
		        	rsp.setStan(of.createMakePaymentRspsInfoStan(String.valueOf(apiRsp.getSystemTraceAuditNumber())));
		        	
		    		transaction tr= new transaction();
		    		tr.setAmount(apiReq.getAmount().longValue());
		    		tr.setStan(apiRsp.getSystemTraceAuditNumber());
		    		tr.setRrn(apiRsp.getRrn());
		    		tr.setAuthorisationId(apiRsp.getAuthorizationIdResponse());
		    		tr.setTransactionDate(apiRsp.getLocalTransactionDate().toString());
		    		tr.setProcessingCode(Long.valueOf(apiRsp.getProcessingCode()));
		    		
		    		rsp.setTlogid(of.createMakePaymentRspsInfoTlogid(tr.save()));
		    		
		    		//tr.save();
		    		//rsp.setTlogid(of.createMakePaymentRspsInfoTlogid("test CRD2CRDPaymentRspsInfo"));
				} catch (SvfeProcessingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					rsp.setRspcode(of.createMakePaymentRspsInfoRspcode(e.getFaultInfo().getResponseCode()));
					rsp.setRejMsg(of.createMakePaymentRspsInfoRejMsg(e.getFaultInfo().getMessage()));

				} catch (ServiceLevelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				rsp.setRspcode(of.createMakePaymentRspsInfoRspcode("-1"));
				rsp.setRejMsg(of.createMakePaymentRspsInfoRejMsg(e.getFaultInfo().getErrorDesc()));

				}		    		
			}
			else{
			//	fake positive
	        	rsp.setRspcode(of.createMakePaymentRspsInfoRspcode("00"));
	        	rsp.setAuthcode(of.createMakePaymentRspsInfoAuthcode("123456"));
	        	rsp.setRejMsg(of.createMakePaymentRspsInfoRejMsg(null));
	        	rsp.setActioncode(0);
	        	rsp.setStan(of.createMakePaymentRspsInfoStan("654321"));
	        	rsp.setTlogid(of.createMakePaymentRspsInfoTlogid(123456L));
			}
        	
	        
/*
	        	 <ns6:makePayment xmlns:ns6="http://service.transaction.cortexws.d8.lv" xmlns:ns2="http://valueobj.card.cortexws.d8.lv/xsd" xmlns:ns3="http://service.card.cortexws.d8.lv" xmlns:ns4="http://valueobj.currency.cortexws.d8.lv/xsd" xmlns:ns5="http://valueobj.transaction.cortexws.d8.lv/xsd" xmlns:ns7="http://service.currency.cortexws.d8.lv" xmlns:ns8="http://ws.wso2.org/dataservice">
   <ns6:param0>
       <ns5:adddata>. Номер: 76хв800686. НДС не облагается.</ns5:adddata>
       <ns5:amttxn>300.00</ns5:amttxn>
       <ns5:cardExpiry>1906</ns5:cardExpiry>
       <ns5:curtxn>643</ns5:curtxn>
       <ns5:dateLocal>20180123</ns5:dateLocal>
       <ns5:instcode>FORA</ns5:instcode>
       <ns5:mrchNo>410104</ns5:mrchNo>
       <ns5:pan>4256901050021601</ns5:pan>
       <ns5:rrn xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:nil="true"/>
       <ns5:seqno>0</ns5:seqno>
       <ns5:termCode>41010401</ns5:termCode>
       <ns5:timeLocal>115024</ns5:timeLocal>
   </ns6:param0>
</ns6:makePayment>

	        	<pur:purchaseRequest>
        <pur:cardIdentification>
           <!--You have a CHOICE of the next 3 items at this level-->
           <gen:cardNumber>4256911071000062</gen:cardNumber>
       </pur:cardIdentification>
        <pur:amount>1234</pur:amount>
        <pur:currency>643</pur:currency>
         <!--Optional:-->
      </pur:purchaseRequest>
<ns2:return>
        <actioncode xmlns:ax210="http://valueobj.transaction.cortexws.d8.lv/xsd" xmlns:ns="http://service.transaction.cortexws.d8.lv">0</actioncode>
        <authcode>024171</authcode>
        <rejMsg xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:nil="true"/>
        <rspcode>00</rspcode>
        <stan>612069</stan>
        <tlogid>638490</tlogid>
    </ns2:return>
</ns2:makePaymentResponse>

      <ns16:purchaseResponse xmlns:ns0="http://www.bpc.ru/apigate/command/p2pTransfer/" xmlns:ns1="http://www.bpc.ru/apigate/general/" xmlns:ns3="http://www.bpc.ru/apigate/command/changeAccountLimit/" xmlns:ns31="http://www.bpc.ru/apigate/command/changeDefaultAccount/" xmlns:ns53="http://www.bpc.ru/apigate/command/changeCardStatus/" xmlns:ns52="http://www.bpc.ru/apigate/command/changeAccountStatus/" xmlns:ns8="http://www.bpc.ru/apigate/command/changePin/" xmlns:ns13="http://www.bpc.ru/apigate/command/activateCard/" xmlns:ns9="http://www.bpc.ru/apigate/command/debitCard/" xmlns:ns11="http://www.bpc.ru/apigate/command/creditCard/" xmlns:ns10="http://www.bpc.ru/apigate/command/serviceAction/" xmlns:ns54="http://www.bpc.ru/apigate/command/blockCard/" xmlns:ns32="http://www.bpc.ru/apigate/command/p2pDebit/" xmlns:ns39="http://www.bpc.ru/apigate/command/visaSmsDispute/" xmlns:ns16="http://www.bpc.ru/apigate/command/purchase/" xmlns:ns37="http://www.bpc.ru/apigate/command/standInMode/" xmlns:ns18="http://www.bpc.ru/apigate/command/validateCard/" xmlns:ns24="http://www.bpc.ru/apigate/command/resetPinCounter/" xmlns:ns46="http://www.bpc.ru/apigate/command/fundsTransfer/" xmlns:ns23="http://www.bpc.ru/apigate/command/changeCardLimit/" xmlns:ns21="http://www.bpc.ru/apigate/command/addCardLimitException/" xmlns:ns49="http://www.bpc.ru/apigate/command/cashDeposit/" xmlns:ns27="http://www.bpc.ru/apigate/command/bindCardToAccount/" xmlns:ns48="http://www.bpc.ru/apigate/command/p2pCredit/">
         <ns1:responseCode>00</ns1:responseCode>
         <ns1:processingCode>0</ns1:processingCode>
         <ns1:systemTraceAuditNumber>942137</ns1:systemTraceAuditNumber>
         <ns1:localTransactionDate>2018-04-10T17:47:08+03:00</ns1:localTransactionDate>
         <ns1:rrn>000001918196</ns1:rrn>
         <ns1:authorizationIdResponse>918196</ns1:authorizationIdResponse>
      </ns16:purchaseResponse>
      
      
*/

	        /*
	        // through cortex-ws Payment
			Payment service = new Payment();
	        PaymentPortType port = service.getPaymentHttpport();
	        String localIP;
			try {
				localIP = InetAddress.getLocalHost().getHostAddress();
				System.out.println("localIP: "+localIP);
				
				if (localIP.equals("10.1.204.113")){
					param0.setPan(of.createMakePaymentReqstInfoPan("4578259970000069"));
					param0.setCardExpiry(of.createMakePaymentReqstInfoCardExpiry("2005"));
					System.out.println("substitute pan 4578...0069");
				}
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			MakePaymentRspsInfo rsp=port.makePayment(param0);
			  
			//System.out.println(rsp.getRspcode().getValue().toString());
			if (!rsp.getRspcode().getValue().toString().equals("00")){
			 String reqInfo="card: "+param0.getPan().getValue().substring(0, 4)+" XXXX XXXX "+param0.getPan().getValue().substring(12, 16)+"; amount: "+param0.getAmttxn().getValue().toString();
			 String rspInfo="tlogid="+rsp.getTlogid().getValue().toString()+"; rspcode="+rsp.getRspcode().getValue().toString();
			 String rejMsg=rsp.getRejMsg().getValue().toString();
			 MailAlert.alert("SoapGate makePayment error",reqInfo+"\n"+rspInfo+"\n"+rejMsg);
			}
			else
			 System.out.println("00");
			*/
			
	        return rsp;
		}

		@Override
		public FinancialTransactionResponseType creditCard(CreditCardRequestType req)
				throws SvfeProcessingException, ServiceLevelException {
	        Apigate_Service service = new Apigate_Service();
	        Apigate port = service.getApigate();
	        FinancialTransactionResponseType rsp = port.creditCard(req);
			return rsp;
		}

		@Override
		public FinancialTransactionResponseType debitCard(DebitCardRequestType req)
				throws SvfeProcessingException, ServiceLevelException {
	        Apigate_Service service = new Apigate_Service();
	        Apigate port = service.getApigate();
	        FinancialTransactionResponseType rsp = port.debitCard(req);
			return rsp;
		}
		
		

}
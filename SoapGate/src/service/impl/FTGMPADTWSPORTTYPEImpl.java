package service.impl;


import gisgmpsrv.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

@WebService(serviceName = "GMP", endpointInterface = "gisgmpsrv.FTGMPADTWSPORTTYPE", targetNamespace = "http://support.diasoft.ru")
public class FTGMPADTWSPORTTYPEImpl implements FTGMPADTWSPORTTYPE {
	
	public class CustomComparator implements Comparator<ChargeElementType> {
	    @Override
	    public int compare(ChargeElementType o1, ChargeElementType o2) {
	    	String inBillID1 = o1.getGMPChargeDataMainList().getGMPChargeMainListElement().get(0).getChargeType().getSupplierBillID();
	    	String inBillID2 = o2.getGMPChargeDataMainList().getGMPChargeMainListElement().get(0).getChargeType().getSupplierBillID();
	    	return inBillID1.compareTo(inBillID2);
	    }
	}
	
	public DsGMPChargeFindListByParamResp dsGMPChargeFindListByParam(DsGMPChargeFindListByParamReq request) {
		//DsGMPChargeFindListByParamResp resp = new DsGMPChargeFindListByParamResp();
        DsGMPChargeFindListByParamResp mainResp = new DsGMPChargeFindListByParamResp();
		
        FTGMPADTWSSERVICE service1 = new FTGMPADTWSSERVICE();
        System.out.println("Create Web Service...");
        
        HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
        service1.setHandlerResolver(handlerResolver);

        /*
        <ns2:dsGMPChargeFindListByParamReq xmlns:ns2="http://support.diasoft.ru">
         <ns2:DataRequest>
          <ns2:RequestKind>CHARGE</ns2:RequestKind>
          <ns2:PostBlock>
           <ns2:RequestID>1520197200000</ns2:RequestID>
           <ns2:TimeStamp>2018-03-05+03:00</ns2:TimeStamp>
           <ns2:SenderIdentifier>1</ns2:SenderIdentifier>
          </ns2:PostBlock>
         </ns2:DataRequest>
         <ns2:PayerList>
         
          <ns2:PayerListElement>
           <ns2:PayerIdentifier>2100000000123456789012643</ns2:PayerIdentifier>
          </ns2:PayerListElement>

                  
          <ns2:PayerListElement>
           <ns2:PayerIdentifier>0100000000001234567890643</ns2:PayerIdentifier>
          </ns2:PayerListElement>
          
		 </ns2:PayerList>
        </ns2:dsGMPChargeFindListByParamReq>
        */    			

        String requestID = request.getDataRequest().getPostBlock().getRequestID();
        XMLGregorianCalendar timestamp = request.getDataRequest().getPostBlock().getTimeStamp();
        //String SenderIdentifier = request.getDataRequest().getPostBlock().getSenderIdentifier();
		List<PayerListElementType> list = request.getPayerList().getPayerListElement();
        Integer index=0;
        List<String> listBillID = new ArrayList<String>();
        
        System.out.println("Set header...");
        FTGMPADTWSPORTTYPE port1 = service1.getFTGMPADTWSPORT();
        try {
            System.out.println("Call Web Service Operation...");
            /*
             ChargeList>
             
              <ChargeElement>
               <GMPChargeDataMainList>
                <GMPChargeMainListElement>
                 <LinkID>0</LinkID>
                 <AmountToPay>109981</AmountToPay>
                 <ChargeType>
                  <SupplierBillID>32252044180002760007</SupplierBillID>
                  <BillDate>2018-02-21</BillDate>
                  <SupplierOrgInfo>
                   <PayeeName>Починковский районный отдел судебных приставов</PayeeName><PayeeINN>5263047008</PayeeINN><PayeeKPP>522732001</PayeeKPP>
                  </SupplierOrgInfo>
                  <BillFor>Оплата долга по ИП № 2760/18/52044-ИП от 21.02.2018 в отношении МАНАСЯН М. М., Госпошлина, присужденная судом///УИН32252044180002760007;ИП0</BillFor>
                  <TotalAmount>109981</TotalAmount>
                 </ChargeType>
                <ChargeChangeStatus>1</ChargeChangeStatus>
                <TreasureBranch>Отдел № 27 Управления Федерального казначейства по Нижегородской области</TreasureBranch>
                <BudgetClassifierCode>32200000000000000000</BudgetClassifierCode>
                <OKATO>22646460</OKATO>
                <BudgetIndex><PayerStatus>24</PayerStatus><PaymentType>0</PaymentType><TaxPaymentReason>0</TaxPaymentReason><TaxPeriod>0</TaxPeriod><TaxDocNumber>0</TaxDocNumber><TaxDocDate>0</TaxDocDate></BudgetIndex>
                <AltPayerIdentifier>2100000000333333333333643</AltPayerIdentifier>
               </GMPChargeMainListElement>
              </GMPChargeDataMainList>
             <PayeeAccountList>
              <PayeeAccountListElement>
               <SupplierBillID>32252044180002760007</SupplierBillID>
                <PayeeAccountNumber>40302810000001000003</PayeeAccountNumber>
                <BankType><PayeeInstitutionName>Волго Вятское ГУ Банка России г.Н. Новгород</PayeeInstitutionName><PayeeInstitutionBIC>042202001</PayeeInstitutionBIC></BankType>
               </PayeeAccountListElement>
             </PayeeAccountList>
             <PayeeAddressList/>
             <PayeeContactList/>
             <GMPChargeAdditionalDataList>
              <GMPChargeAdditionalDataListElement><SupplierBillID>32252044180002760007</SupplierBillID><LinkAddDataID>0</LinkAddDataID><FieldName>idDebtsum</FieldName><FieldValue>1099.81</FieldValue></GMPChargeAdditionalDataListElement>
...             
              <GMPChargeAdditionalDataListElement><SupplierBillID>32252044180002760007</SupplierBillID><LinkAddDataID>0</LinkAddDataID><FieldName>dataDepAdr</FieldName><FieldValue>607911, Россия, Нижегородская обл., , , с. Починки, ул. Коммунистическая, д. 19а, , </FieldValue></GMPChargeAdditionalDataListElement>
             </GMPChargeAdditionalDataList>
            </ChargeElement>
           
            <ChargeElement>
             <GMPChargeDataMainList>
              <GMPChargeMainListElement>
               <LinkID>0</LinkID>
               <AmountToPay>100000</AmountToPay>
               <ChargeType>
                <SupplierBillID>32251005180008886001</SupplierBillID>
               <BillDate>2018-02-12</BillDate>...
            */
            mainResp.setChargeList(new ChargeListType());
            List<ChargeElementType> mainChargeList = mainResp.getChargeList().getChargeElement();
            
    		for (PayerListElementType elem:list){
    			System.out.println("getPayerIdentifier: "+elem.getPayerIdentifier());
    			
    			DsGMPChargeFindListByParamReq outRequest = new DsGMPChargeFindListByParamReq();
    			outRequest.setDataRequest(new DataRequestType());
    			DataRequestType dr = outRequest.getDataRequest();
    			
    			//System.out.println("dr:"+dr.toString());
    			
    			dr.setRequestKind("CHARGE");
    			dr.setPostBlock(new PostBlockType());
    			PostBlockType pb = dr.getPostBlock();
    			//System.out.println("pb:"+pb.toString());
    			pb.setRequestID(requestID+(index++));
    			pb.setTimeStamp(timestamp);
    			pb.setSenderIdentifier("SoapGate");
    			PayerListType outList = new PayerListType();
    			outList.getPayerListElement().add(elem);
    			outRequest.setPayerList(outList);
    			
    			System.out.println("start request");   			
    			DsGMPChargeFindListByParamResp outResp = port1.dsGMPChargeFindListByParam(outRequest);
                
                List<ChargeElementType> inCharges = outResp.getChargeList().getChargeElement();
                for(ChargeElementType oneCharge: inCharges){
                	GMPChargeMainListElementType mle = oneCharge.getGMPChargeDataMainList().getGMPChargeMainListElement().get(0);
                	String inBillID = mle.getChargeType().getSupplierBillID();
                	System.out.println("check BillID: "+inBillID+(listBillID.contains(inBillID)?" exist":" add"));
                	if (!listBillID.contains(inBillID)){
                		listBillID.add(inBillID);
                		mainChargeList.add(oneCharge);
                	}
                }
    		}
    		
    		Collections.sort(mainChargeList,new CustomComparator());
        } 
        catch (javax.xml.ws.soap.SOAPFaultException soapFaultException) {
        	javax.xml.soap.SOAPFault fault = soapFaultException.getFault();
        	MailAlert.alert("SoapGate GMPChargeFindList SOAPFaultException",fault.getFaultString().substring(0, 4096)+"...");
        }
        
        catch (Exception e) {
        	//DataServiceFault_
		// TODO Auto-generated catch block
        	MailAlert.alert("SoapGate GMPChargeFindList Exception",e.getMessage());
        	e.printStackTrace();
        }
		return mainResp;
	}

	public DsGMPPaymentNotificationInsertAsyncGetByIDResp dsGMPPaymentNotificationInsertAsyncGetByID(
			DsGMPPaymentNotificationInsertAsyncGetByIDReq request) {
		return null;
	}

	public DsGMPPaymentNotificationInsertAsyncResp dsGMPPaymentNotificationInsertAsync(
			DsGMPPaymentNotificationInsertAsyncReq request) {
		return null;
	}

	public DsGMPPaymentNotificationInsertResp dsGMPImportCertificateRequest(DsGMPImportCertificateRequestReq request) {
		return null;
	}

	public java.lang.String dscall(java.lang.String commandtext, java.lang.String commanddata)
			throws DSCALLFAULT_Exception {
		return null;
	}

	public void dscallasync(java.lang.String commandtext, java.lang.String commanddata) {
		return;
	}

	public DsGMPPaymentNotificationInsertResp dsGMPPaymentNotificationInsert(
			DsGMPPaymentNotificationInsertReq request) {
		return null;
	}

	public DsGMPPaymentNotificationModifyResp dsGMPPaymentNotificationModify(
			DsGMPPaymentNotificationModifyReq request) {
		return null;
	}
}
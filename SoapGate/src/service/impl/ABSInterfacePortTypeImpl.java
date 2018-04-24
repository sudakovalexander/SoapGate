package service.impl;


import com.custsystems.integration.abs.CCRate;
import com.custsystems.integration.abs.CCRatesResponse;
import com.custsystems.integration.abs.CCRatesResponseMod;
import com.custsystems.integration.abs.DepositBO;
import com.custsystems.integration.abs.DepositResponse;
import com.custsystems.integration.abs.absinterface.*;

import ru.unitarius.integration.service.cards.MsgFault;
import ru.unitarius.integration.service.cards.PortTypeCardsService;
import ru.unitarius.integration.service.cards.PortTypeCardsServiceService;
import svdbo.DataServiceFault_Exception;
import svdbo.SVDBO;
import svdbo.SVDBOPortType;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

@WebService(serviceName = "ABSInterfaceService", endpointInterface = "com.custsystems.integration.abs.absinterface.ABSInterfacePortType", targetNamespace = "http://custsystems.com/integration/abs/ABSInterface")
public class ABSInterfacePortTypeImpl implements ABSInterfacePortType {
	public com.custsystems.integration.abs.CConvResponse cconv(com.custsystems.integration.abs.CConvBO request)
			throws CconvFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.AccountListResponse accountList(
			com.custsystems.integration.abs.AccountListBO request) throws AccountListFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.CardListResponse cardList(com.custsystems.integration.abs.CardListBO request)
			throws CardListFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.CloseDepositResponse closeDeposit(
			com.custsystems.integration.abs.CloseDepositBO request) throws CloseDepositFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.CustResponse cust(com.custsystems.integration.abs.CustBO request)
			throws CustFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.PDRResponse pdr(com.custsystems.integration.abs.PDRBO request)
			throws PdrFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.OpenDepositStatusResponse openDepositStatus(
			com.custsystems.integration.abs.OpenDepositStatusRequest request) throws OpenDepositStatusFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.CardCustResponse cardCust(com.custsystems.integration.abs.CardCustBO request)
			throws CardCustFaultMsg {
		return null;
	}

	public ContractDepositCancelResponse contractDepositCancel(
			ContractDepositCancelRequest contractDepositCancelParameters) throws ContractDepositCancelFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.CompanyInfoResponse companyInfo(
			com.custsystems.integration.abs.CompanyInfoRequest request) throws CompanyInfoFaultMessage {
		return null;
	}

	public com.custsystems.integration.abs.ClientInfoByPhoneResponse clientInfoByPhone(
			com.custsystems.integration.abs.ClientInfoByPhoneRequest request) throws ClientInfoByPhoneFaultMsg {
		com.custsystems.integration.abs.ClientInfoByPhoneResponse mainResponse=new com.custsystems.integration.abs.ClientInfoByPhoneResponse();
		com.custsystems.integration.abs.ClientInfoByPhoneResponse.Response innerResponse = new com.custsystems.integration.abs.ClientInfoByPhoneResponse.Response();

		/*
		if (!request.getPhoneNumber().equals("1111111111")){	
			innerResponse.setCardNumber("4256901050032418");
		}
		*/
		
		mainResponse.setReqID(request.getReqID());
		mainResponse.setSubSys(request.getSubSys());
		
		try {
			GregorianCalendar gregorianCalendar = new GregorianCalendar();
	        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
			mainResponse.setAnsDateTime(datatypeFactory.newXMLGregorianCalendar(gregorianCalendar));
			
	        PortTypeCardsServiceService service1 = new PortTypeCardsServiceService();
	        PortTypeCardsService port1 = service1.getPortTypeCardsServicePort();
	        
	        ru.unitarius.integration.schema.cards.CardPhoneNumberReqType reqCard=new ru.unitarius.integration.schema.cards.CardPhoneNumberReqType();
	        reqCard.setPhoneNumber(Long.parseLong(request.getPhoneNumber()));
	        ru.unitarius.integration.schema.cards.CardPhoneNumberResType respCard= port1.getCardPhoneNumber(reqCard);
	        innerResponse.setCardNumber(respCard.getCard().getCardNumber().getPAN());
	        
			innerResponse.setClientId(String.valueOf(respCard.getCard().getOwnerID().get(0).getValue()));
			innerResponse.setAccClientId(String.valueOf(respCard.getCard().getOwnerID().get(0).getValue()));
			innerResponse.setAccNumber(respCard.getCard().getAccountNumber());	        
	        

		} catch (DatatypeConfigurationException | MsgFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		mainResponse.setResponse(innerResponse);
		return mainResponse;
	}

	public com.custsystems.integration.abs.PupayResponse pupay(com.custsystems.integration.abs.PupayBO request)
			throws PupayFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.CardInfoRequestResponse cardInfo(
			com.custsystems.integration.abs.CardInfoRequest request) throws CardInfoFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.StmResponse stm(com.custsystems.integration.abs.StmBO request)
			throws StmFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.CreditListResponse creditList(
			com.custsystems.integration.abs.CreditListBO request) throws CreditListFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.Mail2BankULResponse mail2BankUL(
			com.custsystems.integration.abs.Mail2BankULRequest request) throws Mail2BankULFaultMessage {
		return null;
	}

	public com.custsystems.integration.abs.DealPassCreditResponse dealPassCredit(
			com.custsystems.integration.abs.DealPassCreditRequest request) throws DealPassCreditFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.LastOperationInfoResponse lastOperationInfo(
			com.custsystems.integration.abs.LastOperationInfoBO request) throws LastOperationInfoFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.CheckResponse check(com.custsystems.integration.abs.CheckBO request)
			throws CheckFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.PlatporResponse platpor(com.custsystems.integration.abs.PlatporBO request)
			throws PlatporFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.LastOperationResponse lastOperation(
			com.custsystems.integration.abs.LastOperationBO request) throws LastOperationFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.DealPassContractResponse dealPassContract(
			com.custsystems.integration.abs.DealPassContractRequest request) throws DealPassContractFaultMsg {
		return null;
	}

	/*public com.custsystems.integration.abs.DepositResponse depositList(
			com.custsystems.integration.abs.Deposit depositListParameters) throws DepositListFaultMsg {
		return null;
	}*/

	public com.custsystems.integration.abs.OpenDepositResponse openDeposit(
			com.custsystems.integration.abs.OpenDepositBO request) throws OpenDepositFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.CCRatesResponseMod ccrates(com.custsystems.integration.abs.CCRatesBO request)
			throws CcratesFaultMsg {
		CCRatesResponseMod resp= new CCRatesResponseMod();
		
		resp.setReqID(request.getReqID());
		resp.setSubSys(request.getSubSys());
		//CcratesResponse resp2= resp.getResponse();
		//CCRatesResponse resp3 = resp. .getResponse();
		
		//return null;
		/*
		
*/		
		CCRatesResponse resp2= new CCRatesResponse();
		List<CCRate> rlist=resp2.getRates();
		
		addRate(rlist,"USD","840","RUB","810","BUY","SELL");
		addRate(rlist,"EUR","978","RUB","810","BUY","SELL");
		addRate(rlist,"USD","840","EUR","978","CROSS","CROSS");
		//addRate(rlist,"USD","840","EUR","978","BUY","SELL");
		
		resp.setResp(resp2);
		return resp;
	}
	
	private void addRate(List<CCRate> list,String C,String CRC,String CB,String CRB,String type1,String type2){
		
		CCRate rBuy= new CCRate();
		CCRate rSell= new CCRate();
		
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US).format(new Date());
		
		if (type2.equals("CROSS")){
			rBuy.setC(CB);
			rBuy.setCRC(CRB);
			rBuy.setCB(C);
			rBuy.setCRB(CRC);
		}
		else{
			rBuy.setC(C);
			rBuy.setCRC(CRC);
			rBuy.setCB(CB);
			rBuy.setCRB(CRB);
		}

		/*
		rBuy.setC(C);
		rBuy.setCRC(CRC);
		rBuy.setCB(CB);
		rBuy.setCRB(CRB);
		 */
		rBuy.setO(type1);
		rBuy.setSC(new BigDecimal(1));
		//rBuy.setCD(Instant.now().toString());
		
		rBuy.setCD(timeStamp);
		//rBuy.setCD("2017-02-13T16:00:00");
		
		// <isimple-type:CD>2013-10-03T09:08:00</isimple-type:CD>
		

		rSell.setC(C);
		rSell.setCRC(CRC);
		rSell.setCB(CB);
		rSell.setCRB(CRB);
		
		rSell.setO(type2);
		rSell.setSC(new BigDecimal(1));
		rSell.setCD(timeStamp);
		//rSell.setCD("2017-02-13T16:00:00");
		
		SVDBO sv = new SVDBO();
		SVDBOPortType port=sv.getHTTPEndpoint();	
		try {
			String val1=CRB;
			String val2=CRC;
			if (val1.equals("810")) val1="643";
			if (val2.equals("810")) val2="643";
			
			List<svdbo.Return> svResp=port.getCurrencyRate(val1,val2);
			if (svResp.size()>0){
				if (svResp.get(0).getBUYRATE()!=null){
					rBuy.setR((new BigDecimal(svResp.get(0).getBUYRATE())).setScale(4, RoundingMode.HALF_UP));
					list.add(rBuy);
				}
				
				if (svResp.get(0).getSELLRATE()!=null){
					rSell.setR((new BigDecimal(svResp.get(0).getSELLRATE())).setScale(4, RoundingMode.HALF_UP));
					list.add(rSell);
				}
			}
		} catch (DataServiceFault_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public com.custsystems.integration.abs.PaymentScheduleResponse paymentSchedule(
			com.custsystems.integration.abs.PaymentScheduleRequest request) throws PaymentScheduleFaultMsg {
		return null;
	}

	public InqCurrResponse inqCurr(InqCurrRequest inqCurrParameters) throws InqCurrFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.Mails2ClientListResponse mails2ClientList() throws Mails2ClientListFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.AccAccResponse accacc(com.custsystems.integration.abs.AccAccBO request)
			throws AccaccFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.CancelResponse cancel(com.custsystems.integration.abs.CancelBO request)
			throws CancelFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.CustResponse clientEmployeeInfo(
			com.custsystems.integration.abs.CustBO request) throws CustFaultMsg {
		return null;
	}

	public PaymentRequestOutgoingResponse paymentRequestOutgoing(
			PaymentRequestOutgoingRequest paymentRequestOutgoingParameters) throws PaymentRequestOutgoingFaultMsg {
		return null;
	}

	public DealpassCloseResponse dealpassClose(DealpassCloseRequest dealpassCloseParameters)
			throws DealpassCloseFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.AccInfoRequestResponse accInfo(
			com.custsystems.integration.abs.AccInfoRequest request) throws AccInfoFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.DealPassRenewResponse dealPassRenew(
			com.custsystems.integration.abs.DealPassRenewRequest request) throws DealPassRenewFaultMsg {
		return null;
	}

	public com.custsystems.integration.abs.AccCustResponse accCust(com.custsystems.integration.abs.AccCustBO request)
			throws AccCustFaultMsg {
		return null;
	}

	public InqConfResponse inqConf(InqConfRequest inqConfParameters) throws InqConfFaultMsg {
		return null;
	}

	@Override
	public DepositResponse depositList(Deposit depositListParameters) throws DepositListFaultMsg {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DepositResponse deposit(DepositBO request) throws DepositFaultMsg {
		// TODO Auto-generated method stub
		return null;
	}




}

/*
	public DepositResponse depositList(Deposit depositListParameters) throws DepositListFaultMsg {
		System.out.println("depositList");
		DepositListBO dlBO = depositListParameters.getRequest();
		System.out.println("CustomerID: "+dlBO.getCustomerID());
		
		
		// ABS -> CXF 
        ABSInterfaceService service1 = new ABSInterfaceService();
        ABSInterfacePortType port1 = service1.getABSInterfacePort();
		*/
         //ObjectFactory of = new ObjectFactory();
        
        //Deposit depreq=of.createDeposit();
        
        
        /*PortTypeDepositsServiceService service1 = new PortTypeDepositsServiceService();
        PortTypeDepositsService port1 = service1.getPortTypeDepositsServicePort();
        PortTypeDepositsService port2 = service1.getPortTypeDepositsServicePort();
        */
			/*
			// getDepositsList
			DepositListFindByClientType fbc=of.createDepositListFindByClientType();
			//fbc.setClientShortName("Шардакова Л. Н.");
			String ClientID="10000332021";  // <- CustomerID
			
			SubsystemIDLongType dlClientID = new SubsystemIDLongType();
			dlClientID.setValue(Long.valueOf(ClientID));
			dlClientID.setSubsystem(ru.unitarius.integration.schema.common.SubsystemEnum.ABS);
			
			fbc.setClientID(dlClientID);
			
			depreq.setRequest(dlBO);
			.getFindByClientList().add(fbc);
			*/
		/*
        	DepositResponse depresp= port1.depositList(depositListParameters);
        	
			
			List<com.custsystems.integration.abs.Deposit> deplist=depresp.getResponse().getResponse().getDeposits();
			
			for (com.custsystems.integration.abs.Deposit dep :deplist){
				dep.setFILIAL("0");
			}
			*/
			/*
	        int index=0;

	        // CXF -> ABS  
    		DepositListResponse dlr = new DepositListResponse();
    		dlr.setReqID(dlBO.getReqID());
    		dlr.setSubSys(dlBO.getSubSys());
    		dlr.setBranchId(dlBO.getBranchId());
    		//dlr.setCustomerID(ClientID);
    		dlr.setCustomerID(dlBO.getCustomerID());
    		
    		DepositListResponse.Response r = new DepositListResponse.Response(); 

    		System.out.println("> for");
    		for (DepositBasicInfoType depCFX : deplist){
    			System.out.println("for ["+Integer.toString(++index)+"]");
    			com.custsystems.integration.abs.Deposit depABS = new com.custsystems.integration.abs.Deposit();

    			// getDeposit by ID
    	        DepositFindByIDReqType depbyid = of.createDepositFindByIDReqType();
    	        depbyid.setDepositID(depCFX.getDepositID());
    	        //DepositResType depbyidresp = ;
    	        DepositFullInfoType depInfo = port2.getDeposit(depbyid).getDeposit();
    	        List<DepositAccountType> depInfoAccounts = depInfo.getAccountList();
    	        for (DepositAccountType depAccount :depInfoAccounts){
    	        	if (depAccount.isIsMain()){
    	        		depABS.setCA(depAccount.getAccountNumber());
    	        		depABS.setPERCENT(depAccount.getInterestRate().toString());
    	        		
    	    			depABS.setCUR(depInfo.getCurrencyCode());
    	    			depABS.setCRD(depInfo.getCurrencyNumber().toString());
    	    			depABS.setNAME(depInfo.getDepositProductName());
    	    			//depABS.setREST(BigDecimal.valueOf(0.));
    	    			depABS.setDO(depInfo.getDateStart());
    	    			depABS.setED(depInfo.getDateEnd());
    	    			depABS.setFILIAL(depInfo.getBranchBrief());
    	    			depABS.setCID(depInfo.getDepositID().toString());
    	    			depABS.setCN(depInfo.getNumber());
    	    			depABS.setSNAME(depInfo.getStateName());
    	    			
    	    			//response.getWriter().append("deposit [").append(Integer.toString(++index)).append("]: ").append(deposit.getDepositProductName()).append("\n");
    		    		r.getDeposits().add(depABS);
    	        		break;
    	        	}
    	        }
    	        */
    		//dlr.setResponse(r);
    		//dr.setResponse(dlr);
    		
		/*
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("e.getMessage() "+e.getMessage());
			ru.unitarius.integration.schema.common.FaultType ft=e.getFaultInfo();
			System.out.println("ft.getErrorSource() "+ft.getErrorSource());
			System.out.println("ft.getErrorCode() "+ft.getErrorCode());
			System.out.println("ft.getErrorMessage() "+ft.getErrorMessage());
		}
		System.out.println("doGet end");
		
		//return depresp;
		return null;
	}

	public com.custsystems.integration.abs.CreditListResponse creditList(
			com.custsystems.integration.abs.CreditListBO request) throws CreditListFaultMsg {
		
		System.out.println("creditList");
		System.out.println("CustomerID: "+request.getCustomerID());
		
		com.custsystems.integration.abs.CreditListResponse cr = new com.custsystems.integration.abs.CreditListResponse();
		
		/*
		try {
			// CXF -> ABS
			PortTypeLoansServiceService service1 = new PortTypeLoansServiceService();
			
			PortTypeLoansService port1 = service1.getPortTypeLoansServicePort();
			LoanFindListReqType lfreq = new LoanFindListReqType();
			LoansListFindByClientType fbc = new LoansListFindByClientType();
			String ClientID="10000252214";  // <- CustomerID
			
			SubsystemIDLongType dlClientID = new SubsystemIDLongType();
			dlClientID.setValue(Long.valueOf(ClientID));
			fbc.setClientID(dlClientID);
			dlClientID.setSubsystem(ru.unitarius.integration.schema.common.SubsystemEnum.ABS);
			
			lfreq.getFindByClientList().add(fbc);
			LoansFindListResType lfresp;
			lfresp = port1.getLoansList(lfreq);
			
			
			
			// ABS -> CXF
			//cr.setCustomerID(ClientID);
			cr.setCustomerID(request.getCustomerID());
			
			//com.custsystems.integration.abs.CreditListResponse clr = new com.custsystems.integration.abs.CreditListResponse(); 
			com.custsystems.integration.abs.CreditListResponse.Response r = new com.custsystems.integration.abs.CreditListResponse.Response();
			
			System.out.println("> for");
			//int index=0;
			List<LoanBasicInfoType>  loans = lfresp.getLoanList();
			for(LoanBasicInfoType loan : loans){
				//System.out.println("for ["+Integer.toString(++index)+"]");
				com.custsystems.integration.abs.CreditLoanRecord credit = new com.custsystems.integration.abs.CreditLoanRecord();
				credit.setCRTP(loan.getFinOperBrief());
				credit.setN(loan.getNumber());
				r.getLoans().add(credit);
			}
			//clr.setResponse(r);
			cr.setResponse(r);
		} catch (ru.unitarius.integration.service.loans.MsgFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cr;
		
		
	}
*/
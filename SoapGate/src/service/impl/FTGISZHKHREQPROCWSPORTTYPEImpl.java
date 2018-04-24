package service.impl;


import giszhkhsrv.*;
import javax.jws.WebService;

@WebService(serviceName = "ZHKH", endpointInterface = "giszhkhsrv.FTGISZHKHREQPROCWSPORTTYPE", targetNamespace = "http://support.diasoft.ru")
public class FTGISZHKHREQPROCWSPORTTYPEImpl implements FTGISZHKHREQPROCWSPORTTYPE {
	public ExportPaymentDocumentDetails dsGISZHKHChargeFindListByParam(DsPaymentDocumentDetailsRequest request) {
		ExportPaymentDocumentDetails resp = null;
		
		FTGISZHKHREQPROCWSSERVICE service1 = new FTGISZHKHREQPROCWSSERVICE();
        System.out.println("Create Web Service...");
        
        FTGISZHKHREQPROCWSPORTTYPE port1 = service1.getFTGISZHKHREQPROCWSPORT();
        try {
            System.out.println("Call Web Service Operation...");
            resp = port1.dsGISZHKHChargeFindListByParam(request);
            System.out.println("Server said: " + resp);
        	
        } catch (Exception e) {
        	//DataServiceFault_
		// TODO Auto-generated catch block
		e.printStackTrace();
        }
		
		return resp;
	}
	
	/*
	public DsGISZHKHPaymentNotificationInsertAsyncResp dsGISZHKHPaymentNotificationInsertAsync(
			ImportNotificationsOfOrderExecution request) {
		return null;
	}

	public DsGISZHKHPackPaymentNotificationInsertAsyncResp dsGISZHKHPackPaymentNotificationInsertAsync(
			DsGISZHKHPackPaymentNotificationInsertAsyncReq request) {
		return null;
	}

	public DsGISZHKHPaymentNotificationInsertAsyncResp dsGISZHKHSinglePaymentNotificationInsertAsync(
			DsGISZHKHSinglePaymentNotificationInsertAsyncReq request) {
		return null;
	}

	public DsGISZHKHRecipientListByParamResp dsGISZHKHRecipientListByParam(DsGISZHKHRecipientListByParamReq request) {
		return null;
	}

	public CommonResult dsGISZHKHPaymentNotificationGetByID(DsGISZHKHPaymentNotificationGetByIDReq request) {
		return null;
	}

	public java.lang.String dscall(java.lang.String commandtext, java.lang.String commanddata)
			throws DSCALLFAULT_Exception {
		return null;
	}

	public void dscallasync(java.lang.String commandtext, java.lang.String commanddata) {
		return;
	}

	public DsGISZHKHSinglePaymentNotificationGetByIDResp dsGISZHKHSinglePaymentNotificationGetByID(
			DsGISZHKHPaymentNotificationGetByIDReq request) {
		return null;
	}

	public DsGISZHKHPackPaymentNotificationGetByIDResp dsGISZHKHPackPaymentNotificationGetByID(
			DsGISZHKHPackPaymentNotificationGetByIDReq request) {
		return null;
	}

	public DsGISZHKHRecipientDirectoryResp dsGISZHKHRecipientDirectory(DsGISZHKHRecipientDirectoryReq request) {
		return null;
	}*/
}
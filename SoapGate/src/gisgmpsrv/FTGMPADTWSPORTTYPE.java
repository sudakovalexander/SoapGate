package gisgmpsrv;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.4.redhat-1
 * 2017-05-15T10:14:02.419+03:00
 * Generated source version: 3.1.4.redhat-1
 * 
 */
@WebService(targetNamespace = "http://support.diasoft.ru", name = "FTGMPADTWSPORTTYPE")
@XmlSeeAlso({ObjectFactory.class})
public interface FTGMPADTWSPORTTYPE {

    @WebMethod
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "dsGMPChargeFindListByParamResp", targetNamespace = "http://support.diasoft.ru", partName = "result")
    public DsGMPChargeFindListByParamResp dsGMPChargeFindListByParam(
        @WebParam(partName = "request", name = "dsGMPChargeFindListByParamReq", targetNamespace = "http://support.diasoft.ru")
        DsGMPChargeFindListByParamReq request
    );

    @WebMethod
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "dsGMPPaymentNotificationInsertAsyncGetByIDResp", targetNamespace = "http://support.diasoft.ru", partName = "result")
    public DsGMPPaymentNotificationInsertAsyncGetByIDResp dsGMPPaymentNotificationInsertAsyncGetByID(
        @WebParam(partName = "request", name = "dsGMPPaymentNotificationInsertAsyncGetByIDReq", targetNamespace = "http://support.diasoft.ru")
        DsGMPPaymentNotificationInsertAsyncGetByIDReq request
    );

    @WebMethod
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "dsGMPPaymentNotificationInsertAsyncResp", targetNamespace = "http://support.diasoft.ru", partName = "result")
    public DsGMPPaymentNotificationInsertAsyncResp dsGMPPaymentNotificationInsertAsync(
        @WebParam(partName = "request", name = "dsGMPPaymentNotificationInsertAsyncReq", targetNamespace = "http://support.diasoft.ru")
        DsGMPPaymentNotificationInsertAsyncReq request
    );

    @WebMethod
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "dsGMPPaymentNotificationInsertResp", targetNamespace = "http://support.diasoft.ru", partName = "result")
    public DsGMPPaymentNotificationInsertResp dsGMPImportCertificateRequest(
        @WebParam(partName = "request", name = "dsGMPImportCertificateRequestReq", targetNamespace = "http://support.diasoft.ru")
        DsGMPImportCertificateRequestReq request
    );

    @WebMethod(operationName = "DSCALL")
    @RequestWrapper(localName = "DSCALL", targetNamespace = "http://support.diasoft.ru", className = "gisgmpsrv.DSCALL")
    @ResponseWrapper(localName = "DSCALLRESPONSE", targetNamespace = "http://support.diasoft.ru", className = "gisgmpsrv.DSCALLRESPONSE")
    @WebResult(name = "commandresult", targetNamespace = "http://support.diasoft.ru")
    public java.lang.String dscall(
        @WebParam(name = "commandtext", targetNamespace = "http://support.diasoft.ru")
        java.lang.String commandtext,
        @WebParam(name = "commanddata", targetNamespace = "http://support.diasoft.ru")
        java.lang.String commanddata
    ) throws DSCALLFAULT_Exception;

    @WebMethod(operationName = "DSCALLASYNC")
    @Oneway
    @RequestWrapper(localName = "DSCALLASYNC", targetNamespace = "http://support.diasoft.ru", className = "gisgmpsrv.DSCALLASYNC")
    public void dscallasync(
        @WebParam(name = "commandtext", targetNamespace = "http://support.diasoft.ru")
        java.lang.String commandtext,
        @WebParam(name = "commanddata", targetNamespace = "http://support.diasoft.ru")
        java.lang.String commanddata
    );

    @WebMethod
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "dsGMPPaymentNotificationInsertResp", targetNamespace = "http://support.diasoft.ru", partName = "result")
    public DsGMPPaymentNotificationInsertResp dsGMPPaymentNotificationInsert(
        @WebParam(partName = "request", name = "dsGMPPaymentNotificationInsertReq", targetNamespace = "http://support.diasoft.ru")
        DsGMPPaymentNotificationInsertReq request
    );

    @WebMethod
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "dsGMPPaymentNotificationModifyResp", targetNamespace = "http://support.diasoft.ru", partName = "result")
    public DsGMPPaymentNotificationModifyResp dsGMPPaymentNotificationModify(
        @WebParam(partName = "request", name = "dsGMPPaymentNotificationModifyReq", targetNamespace = "http://support.diasoft.ru")
        DsGMPPaymentNotificationModifyReq request
    );
}

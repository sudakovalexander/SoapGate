
package ru.bpc.apigate.command.getaccountdata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.getaccountdata package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAccountDataRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/getAccountData/", "getAccountDataRequest");
    private final static QName _GetAccountDataResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/getAccountData/", "getAccountDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.getaccountdata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAccountDataRequestType }
     * 
     */
    public GetAccountDataRequestType createGetAccountDataRequestType() {
        return new GetAccountDataRequestType();
    }

    /**
     * Create an instance of {@link GetAccountDataResponseType }
     * 
     */
    public GetAccountDataResponseType createGetAccountDataResponseType() {
        return new GetAccountDataResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountDataRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/getAccountData/", name = "getAccountDataRequest")
    public JAXBElement<GetAccountDataRequestType> createGetAccountDataRequest(GetAccountDataRequestType value) {
        return new JAXBElement<GetAccountDataRequestType>(_GetAccountDataRequest_QNAME, GetAccountDataRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountDataResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/getAccountData/", name = "getAccountDataResponse")
    public JAXBElement<GetAccountDataResponseType> createGetAccountDataResponse(GetAccountDataResponseType value) {
        return new JAXBElement<GetAccountDataResponseType>(_GetAccountDataResponse_QNAME, GetAccountDataResponseType.class, null, value);
    }

}

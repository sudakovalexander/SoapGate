
package ru.bpc.apigate.command.getcarddata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.getcarddata package. 
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

    private final static QName _GetCardDataRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/getCardData/", "getCardDataRequest");
    private final static QName _GetCardDataResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/getCardData/", "getCardDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.getcarddata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCardDataRequestType }
     * 
     */
    public GetCardDataRequestType createGetCardDataRequestType() {
        return new GetCardDataRequestType();
    }

    /**
     * Create an instance of {@link GetCardDataResponseType }
     * 
     */
    public GetCardDataResponseType createGetCardDataResponseType() {
        return new GetCardDataResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardDataRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/getCardData/", name = "getCardDataRequest")
    public JAXBElement<GetCardDataRequestType> createGetCardDataRequest(GetCardDataRequestType value) {
        return new JAXBElement<GetCardDataRequestType>(_GetCardDataRequest_QNAME, GetCardDataRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardDataResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/getCardData/", name = "getCardDataResponse")
    public JAXBElement<GetCardDataResponseType> createGetCardDataResponse(GetCardDataResponseType value) {
        return new JAXBElement<GetCardDataResponseType>(_GetCardDataResponse_QNAME, GetCardDataResponseType.class, null, value);
    }

}

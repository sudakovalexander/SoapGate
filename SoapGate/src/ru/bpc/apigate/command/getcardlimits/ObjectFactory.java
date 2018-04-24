
package ru.bpc.apigate.command.getcardlimits;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.getcardlimits package. 
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

    private final static QName _GetCardLimitsRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/getCardLimits/", "getCardLimitsRequest");
    private final static QName _GetCardLimitsResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/getCardLimits/", "getCardLimitsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.getcardlimits
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCardLimitsRequestType }
     * 
     */
    public GetCardLimitsRequestType createGetCardLimitsRequestType() {
        return new GetCardLimitsRequestType();
    }

    /**
     * Create an instance of {@link GetCardLimitsResponseType }
     * 
     */
    public GetCardLimitsResponseType createGetCardLimitsResponseType() {
        return new GetCardLimitsResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardLimitsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/getCardLimits/", name = "getCardLimitsRequest")
    public JAXBElement<GetCardLimitsRequestType> createGetCardLimitsRequest(GetCardLimitsRequestType value) {
        return new JAXBElement<GetCardLimitsRequestType>(_GetCardLimitsRequest_QNAME, GetCardLimitsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardLimitsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/getCardLimits/", name = "getCardLimitsResponse")
    public JAXBElement<GetCardLimitsResponseType> createGetCardLimitsResponse(GetCardLimitsResponseType value) {
        return new JAXBElement<GetCardLimitsResponseType>(_GetCardLimitsResponse_QNAME, GetCardLimitsResponseType.class, null, value);
    }

}

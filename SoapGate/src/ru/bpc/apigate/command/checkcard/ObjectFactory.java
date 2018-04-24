
package ru.bpc.apigate.command.checkcard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.checkcard package. 
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

    private final static QName _CheckCardRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/checkCard/", "checkCardRequest");
    private final static QName _CheckCardResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/checkCard/", "checkCardResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.checkcard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckCardRequestRequestType }
     * 
     */
    public CheckCardRequestRequestType createCheckCardRequestRequestType() {
        return new CheckCardRequestRequestType();
    }

    /**
     * Create an instance of {@link CheckCardRequestResponseType }
     * 
     */
    public CheckCardRequestResponseType createCheckCardRequestResponseType() {
        return new CheckCardRequestResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckCardRequestRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/checkCard/", name = "checkCardRequest")
    public JAXBElement<CheckCardRequestRequestType> createCheckCardRequest(CheckCardRequestRequestType value) {
        return new JAXBElement<CheckCardRequestRequestType>(_CheckCardRequest_QNAME, CheckCardRequestRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckCardRequestResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/checkCard/", name = "checkCardResponse")
    public JAXBElement<CheckCardRequestResponseType> createCheckCardResponse(CheckCardRequestResponseType value) {
        return new JAXBElement<CheckCardRequestResponseType>(_CheckCardResponse_QNAME, CheckCardRequestResponseType.class, null, value);
    }

}


package ru.bpc.apigate.command.activatecard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.bpc.apigate.general.SimpleResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.activatecard package. 
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

    private final static QName _ActivateCardRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/activateCard/", "activateCardRequest");
    private final static QName _ActivateCardResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/activateCard/", "activateCardResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.activatecard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActivateCardRequestType }
     * 
     */
    public ActivateCardRequestType createActivateCardRequestType() {
        return new ActivateCardRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateCardRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/activateCard/", name = "activateCardRequest")
    public JAXBElement<ActivateCardRequestType> createActivateCardRequest(ActivateCardRequestType value) {
        return new JAXBElement<ActivateCardRequestType>(_ActivateCardRequest_QNAME, ActivateCardRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/activateCard/", name = "activateCardResponse")
    public JAXBElement<SimpleResponseType> createActivateCardResponse(SimpleResponseType value) {
        return new JAXBElement<SimpleResponseType>(_ActivateCardResponse_QNAME, SimpleResponseType.class, null, value);
    }

}

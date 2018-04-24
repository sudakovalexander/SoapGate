
package ru.bpc.apigate.command.serviceaction;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.bpc.apigate.general.SimpleResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.serviceaction package. 
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

    private final static QName _ServiceActionRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/serviceAction/", "serviceActionRequest");
    private final static QName _ServiceActionResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/serviceAction/", "serviceActionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.serviceaction
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceActionRequestType }
     * 
     */
    public ServiceActionRequestType createServiceActionRequestType() {
        return new ServiceActionRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceActionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/serviceAction/", name = "serviceActionRequest")
    public JAXBElement<ServiceActionRequestType> createServiceActionRequest(ServiceActionRequestType value) {
        return new JAXBElement<ServiceActionRequestType>(_ServiceActionRequest_QNAME, ServiceActionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/serviceAction/", name = "serviceActionResponse")
    public JAXBElement<SimpleResponseType> createServiceActionResponse(SimpleResponseType value) {
        return new JAXBElement<SimpleResponseType>(_ServiceActionResponse_QNAME, SimpleResponseType.class, null, value);
    }

}


package ru.bpc.apigate.command.createvirtualcard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.createvirtualcard package. 
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

    private final static QName _CreateVirtualCardRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/createVirtualCard/", "createVirtualCardRequest");
    private final static QName _CreateVirtualCardResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/createVirtualCard/", "createVirtualCardResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.createvirtualcard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateVirtualCardRequestType }
     * 
     */
    public CreateVirtualCardRequestType createCreateVirtualCardRequestType() {
        return new CreateVirtualCardRequestType();
    }

    /**
     * Create an instance of {@link CreateVirtualCardResponseType }
     * 
     */
    public CreateVirtualCardResponseType createCreateVirtualCardResponseType() {
        return new CreateVirtualCardResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateVirtualCardRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/createVirtualCard/", name = "createVirtualCardRequest")
    public JAXBElement<CreateVirtualCardRequestType> createCreateVirtualCardRequest(CreateVirtualCardRequestType value) {
        return new JAXBElement<CreateVirtualCardRequestType>(_CreateVirtualCardRequest_QNAME, CreateVirtualCardRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateVirtualCardResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/createVirtualCard/", name = "createVirtualCardResponse")
    public JAXBElement<CreateVirtualCardResponseType> createCreateVirtualCardResponse(CreateVirtualCardResponseType value) {
        return new JAXBElement<CreateVirtualCardResponseType>(_CreateVirtualCardResponse_QNAME, CreateVirtualCardResponseType.class, null, value);
    }

}

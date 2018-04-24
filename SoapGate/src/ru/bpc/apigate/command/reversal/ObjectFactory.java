
package ru.bpc.apigate.command.reversal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.reversal package. 
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

    private final static QName _ReversalRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/reversal/", "reversalRequest");
    private final static QName _ReversalResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/reversal/", "reversalResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.reversal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReversalRequestType }
     * 
     */
    public ReversalRequestType createReversalRequestType() {
        return new ReversalRequestType();
    }

    /**
     * Create an instance of {@link ReversalResponseType }
     * 
     */
    public ReversalResponseType createReversalResponseType() {
        return new ReversalResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReversalRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/reversal/", name = "reversalRequest")
    public JAXBElement<ReversalRequestType> createReversalRequest(ReversalRequestType value) {
        return new JAXBElement<ReversalRequestType>(_ReversalRequest_QNAME, ReversalRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReversalResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/reversal/", name = "reversalResponse")
    public JAXBElement<ReversalResponseType> createReversalResponse(ReversalResponseType value) {
        return new JAXBElement<ReversalResponseType>(_ReversalResponse_QNAME, ReversalResponseType.class, null, value);
    }

}


package ru.bpc.apigate.command.resetpincounter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.bpc.apigate.general.SimpleResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.resetpincounter package. 
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

    private final static QName _ResetPinCounterRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/resetPinCounter/", "resetPinCounterRequest");
    private final static QName _ResetPinCounterResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/resetPinCounter/", "resetPinCounterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.resetpincounter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResetPinCounterRequestType }
     * 
     */
    public ResetPinCounterRequestType createResetPinCounterRequestType() {
        return new ResetPinCounterRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetPinCounterRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/resetPinCounter/", name = "resetPinCounterRequest")
    public JAXBElement<ResetPinCounterRequestType> createResetPinCounterRequest(ResetPinCounterRequestType value) {
        return new JAXBElement<ResetPinCounterRequestType>(_ResetPinCounterRequest_QNAME, ResetPinCounterRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/resetPinCounter/", name = "resetPinCounterResponse")
    public JAXBElement<SimpleResponseType> createResetPinCounterResponse(SimpleResponseType value) {
        return new JAXBElement<SimpleResponseType>(_ResetPinCounterResponse_QNAME, SimpleResponseType.class, null, value);
    }

}

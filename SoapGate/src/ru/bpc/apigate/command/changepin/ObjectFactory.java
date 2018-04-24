
package ru.bpc.apigate.command.changepin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.bpc.apigate.general.SimpleResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.changepin package. 
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

    private final static QName _ChangePinRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/changePin/", "changePinRequest");
    private final static QName _ChangePinResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/changePin/", "changePinResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.changepin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangePinRequestType }
     * 
     */
    public ChangePinRequestType createChangePinRequestType() {
        return new ChangePinRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePinRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/changePin/", name = "changePinRequest")
    public JAXBElement<ChangePinRequestType> createChangePinRequest(ChangePinRequestType value) {
        return new JAXBElement<ChangePinRequestType>(_ChangePinRequest_QNAME, ChangePinRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/changePin/", name = "changePinResponse")
    public JAXBElement<SimpleResponseType> createChangePinResponse(SimpleResponseType value) {
        return new JAXBElement<SimpleResponseType>(_ChangePinResponse_QNAME, SimpleResponseType.class, null, value);
    }

}

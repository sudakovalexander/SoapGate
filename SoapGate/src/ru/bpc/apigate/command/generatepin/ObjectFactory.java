
package ru.bpc.apigate.command.generatepin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.generatepin package. 
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

    private final static QName _GeneratePinRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/generatePin/", "generatePinRequest");
    private final static QName _GeneratePinResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/generatePin/", "generatePinResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.generatepin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeneratePinRequestType }
     * 
     */
    public GeneratePinRequestType createGeneratePinRequestType() {
        return new GeneratePinRequestType();
    }

    /**
     * Create an instance of {@link GeneratePinResponseType }
     * 
     */
    public GeneratePinResponseType createGeneratePinResponseType() {
        return new GeneratePinResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneratePinRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/generatePin/", name = "generatePinRequest")
    public JAXBElement<GeneratePinRequestType> createGeneratePinRequest(GeneratePinRequestType value) {
        return new JAXBElement<GeneratePinRequestType>(_GeneratePinRequest_QNAME, GeneratePinRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneratePinResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/generatePin/", name = "generatePinResponse")
    public JAXBElement<GeneratePinResponseType> createGeneratePinResponse(GeneratePinResponseType value) {
        return new JAXBElement<GeneratePinResponseType>(_GeneratePinResponse_QNAME, GeneratePinResponseType.class, null, value);
    }

}

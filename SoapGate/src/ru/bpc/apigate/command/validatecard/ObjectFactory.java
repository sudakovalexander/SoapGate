
package ru.bpc.apigate.command.validatecard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.bpc.apigate.general.SimpleResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.validatecard package. 
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

    private final static QName _ValidateCardRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/validateCard/", "validateCardRequest");
    private final static QName _ValidateCardResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/validateCard/", "validateCardResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.validatecard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateCardRequestType }
     * 
     */
    public ValidateCardRequestType createValidateCardRequestType() {
        return new ValidateCardRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCardRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/validateCard/", name = "validateCardRequest")
    public JAXBElement<ValidateCardRequestType> createValidateCardRequest(ValidateCardRequestType value) {
        return new JAXBElement<ValidateCardRequestType>(_ValidateCardRequest_QNAME, ValidateCardRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/validateCard/", name = "validateCardResponse")
    public JAXBElement<SimpleResponseType> createValidateCardResponse(SimpleResponseType value) {
        return new JAXBElement<SimpleResponseType>(_ValidateCardResponse_QNAME, SimpleResponseType.class, null, value);
    }

}

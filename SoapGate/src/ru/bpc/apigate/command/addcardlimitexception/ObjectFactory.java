
package ru.bpc.apigate.command.addcardlimitexception;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.bpc.apigate.general.SimpleResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.addcardlimitexception package. 
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

    private final static QName _AddCardLimitExceptionRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/addCardLimitException/", "addCardLimitExceptionRequest");
    private final static QName _AddCardLimitExceptionResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/addCardLimitException/", "addCardLimitExceptionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.addcardlimitexception
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCardLimitExceptionRequestType }
     * 
     */
    public AddCardLimitExceptionRequestType createAddCardLimitExceptionRequestType() {
        return new AddCardLimitExceptionRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCardLimitExceptionRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/addCardLimitException/", name = "addCardLimitExceptionRequest")
    public JAXBElement<AddCardLimitExceptionRequestType> createAddCardLimitExceptionRequest(AddCardLimitExceptionRequestType value) {
        return new JAXBElement<AddCardLimitExceptionRequestType>(_AddCardLimitExceptionRequest_QNAME, AddCardLimitExceptionRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/addCardLimitException/", name = "addCardLimitExceptionResponse")
    public JAXBElement<SimpleResponseType> createAddCardLimitExceptionResponse(SimpleResponseType value) {
        return new JAXBElement<SimpleResponseType>(_AddCardLimitExceptionResponse_QNAME, SimpleResponseType.class, null, value);
    }

}

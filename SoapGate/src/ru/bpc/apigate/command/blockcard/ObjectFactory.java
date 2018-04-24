
package ru.bpc.apigate.command.blockcard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.bpc.apigate.general.ChangeCardStatusRequestType;
import ru.bpc.apigate.general.SimpleResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.blockcard package. 
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

    private final static QName _BlockCardRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/blockCard/", "blockCardRequest");
    private final static QName _BlockCardResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/blockCard/", "blockCardResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.blockcard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeCardStatusRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/blockCard/", name = "blockCardRequest")
    public JAXBElement<ChangeCardStatusRequestType> createBlockCardRequest(ChangeCardStatusRequestType value) {
        return new JAXBElement<ChangeCardStatusRequestType>(_BlockCardRequest_QNAME, ChangeCardStatusRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/blockCard/", name = "blockCardResponse")
    public JAXBElement<SimpleResponseType> createBlockCardResponse(SimpleResponseType value) {
        return new JAXBElement<SimpleResponseType>(_BlockCardResponse_QNAME, SimpleResponseType.class, null, value);
    }

}

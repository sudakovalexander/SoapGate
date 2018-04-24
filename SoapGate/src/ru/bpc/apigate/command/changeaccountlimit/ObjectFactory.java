
package ru.bpc.apigate.command.changeaccountlimit;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.bpc.apigate.general.SimpleResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.changeaccountlimit package. 
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

    private final static QName _ChangeAccountLimitRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/changeAccountLimit/", "changeAccountLimitRequest");
    private final static QName _ChangeAccountLimitResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/changeAccountLimit/", "changeAccountLimitResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.changeaccountlimit
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeAccountLimitRequestType }
     * 
     */
    public ChangeAccountLimitRequestType createChangeAccountLimitRequestType() {
        return new ChangeAccountLimitRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeAccountLimitRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/changeAccountLimit/", name = "changeAccountLimitRequest")
    public JAXBElement<ChangeAccountLimitRequestType> createChangeAccountLimitRequest(ChangeAccountLimitRequestType value) {
        return new JAXBElement<ChangeAccountLimitRequestType>(_ChangeAccountLimitRequest_QNAME, ChangeAccountLimitRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/changeAccountLimit/", name = "changeAccountLimitResponse")
    public JAXBElement<SimpleResponseType> createChangeAccountLimitResponse(SimpleResponseType value) {
        return new JAXBElement<SimpleResponseType>(_ChangeAccountLimitResponse_QNAME, SimpleResponseType.class, null, value);
    }

}

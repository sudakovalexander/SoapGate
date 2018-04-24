
package ru.bpc.apigate.command.bindcardtoaccount;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.bpc.apigate.general.SimpleResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.bindcardtoaccount package. 
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

    private final static QName _BindCardToAccountRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/bindCardToAccount/", "bindCardToAccountRequest");
    private final static QName _BindCardToAccountResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/bindCardToAccount/", "bindCardToAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.bindcardtoaccount
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BindCardToAccountRequestType }
     * 
     */
    public BindCardToAccountRequestType createBindCardToAccountRequestType() {
        return new BindCardToAccountRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindCardToAccountRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/bindCardToAccount/", name = "bindCardToAccountRequest")
    public JAXBElement<BindCardToAccountRequestType> createBindCardToAccountRequest(BindCardToAccountRequestType value) {
        return new JAXBElement<BindCardToAccountRequestType>(_BindCardToAccountRequest_QNAME, BindCardToAccountRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/bindCardToAccount/", name = "bindCardToAccountResponse")
    public JAXBElement<SimpleResponseType> createBindCardToAccountResponse(SimpleResponseType value) {
        return new JAXBElement<SimpleResponseType>(_BindCardToAccountResponse_QNAME, SimpleResponseType.class, null, value);
    }

}

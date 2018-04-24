
package ru.bpc.apigate.command.changecardlimit;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.bpc.apigate.general.SimpleResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.changecardlimit package. 
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

    private final static QName _ChangeCardLimitRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/changeCardLimit/", "changeCardLimitRequest");
    private final static QName _ChangeCardLimitResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/changeCardLimit/", "changeCardLimitResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.changecardlimit
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeCardLimitRequestType }
     * 
     */
    public ChangeCardLimitRequestType createChangeCardLimitRequestType() {
        return new ChangeCardLimitRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeCardLimitRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/changeCardLimit/", name = "changeCardLimitRequest")
    public JAXBElement<ChangeCardLimitRequestType> createChangeCardLimitRequest(ChangeCardLimitRequestType value) {
        return new JAXBElement<ChangeCardLimitRequestType>(_ChangeCardLimitRequest_QNAME, ChangeCardLimitRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/changeCardLimit/", name = "changeCardLimitResponse")
    public JAXBElement<SimpleResponseType> createChangeCardLimitResponse(SimpleResponseType value) {
        return new JAXBElement<SimpleResponseType>(_ChangeCardLimitResponse_QNAME, SimpleResponseType.class, null, value);
    }

}

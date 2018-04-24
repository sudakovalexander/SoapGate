
package ru.bpc.apigate.command.getcardlistbyowner;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.getcardlistbyowner package. 
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

    private final static QName _GetCardListByOwnerRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/getCardListByOwner/", "getCardListByOwnerRequest");
    private final static QName _GetCardListByOwnerResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/getCardListByOwner/", "getCardListByOwnerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.getcardlistbyowner
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCardListByOwnerRequestType }
     * 
     */
    public GetCardListByOwnerRequestType createGetCardListByOwnerRequestType() {
        return new GetCardListByOwnerRequestType();
    }

    /**
     * Create an instance of {@link GetCardListByOwnerResponseType }
     * 
     */
    public GetCardListByOwnerResponseType createGetCardListByOwnerResponseType() {
        return new GetCardListByOwnerResponseType();
    }

    /**
     * Create an instance of {@link Cards }
     * 
     */
    public Cards createCards() {
        return new Cards();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardListByOwnerRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/getCardListByOwner/", name = "getCardListByOwnerRequest")
    public JAXBElement<GetCardListByOwnerRequestType> createGetCardListByOwnerRequest(GetCardListByOwnerRequestType value) {
        return new JAXBElement<GetCardListByOwnerRequestType>(_GetCardListByOwnerRequest_QNAME, GetCardListByOwnerRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardListByOwnerResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/getCardListByOwner/", name = "getCardListByOwnerResponse")
    public JAXBElement<GetCardListByOwnerResponseType> createGetCardListByOwnerResponse(GetCardListByOwnerResponseType value) {
        return new JAXBElement<GetCardListByOwnerResponseType>(_GetCardListByOwnerResponse_QNAME, GetCardListByOwnerResponseType.class, null, value);
    }

}

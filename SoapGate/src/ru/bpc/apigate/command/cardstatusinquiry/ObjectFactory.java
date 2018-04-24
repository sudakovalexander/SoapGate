
package ru.bpc.apigate.command.cardstatusinquiry;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.cardstatusinquiry package. 
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

    private final static QName _CardStatusInquiryRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/cardStatusInquiry/", "cardStatusInquiryRequest");
    private final static QName _CardStatusInquiryResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/cardStatusInquiry/", "cardStatusInquiryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.cardstatusinquiry
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CardStatusInquiryRequestType }
     * 
     */
    public CardStatusInquiryRequestType createCardStatusInquiryRequestType() {
        return new CardStatusInquiryRequestType();
    }

    /**
     * Create an instance of {@link CardStatusInquiryResponseType }
     * 
     */
    public CardStatusInquiryResponseType createCardStatusInquiryResponseType() {
        return new CardStatusInquiryResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStatusInquiryRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/cardStatusInquiry/", name = "cardStatusInquiryRequest")
    public JAXBElement<CardStatusInquiryRequestType> createCardStatusInquiryRequest(CardStatusInquiryRequestType value) {
        return new JAXBElement<CardStatusInquiryRequestType>(_CardStatusInquiryRequest_QNAME, CardStatusInquiryRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStatusInquiryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/cardStatusInquiry/", name = "cardStatusInquiryResponse")
    public JAXBElement<CardStatusInquiryResponseType> createCardStatusInquiryResponse(CardStatusInquiryResponseType value) {
        return new JAXBElement<CardStatusInquiryResponseType>(_CardStatusInquiryResponse_QNAME, CardStatusInquiryResponseType.class, null, value);
    }

}

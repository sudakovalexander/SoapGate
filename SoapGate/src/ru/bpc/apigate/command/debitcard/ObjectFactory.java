
package ru.bpc.apigate.command.debitcard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.bpc.apigate.general.FinancialTransactionResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.debitcard package. 
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

    private final static QName _DebitCardRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/debitCard/", "debitCardRequest");
    private final static QName _DebitCardResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/debitCard/", "debitCardResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.debitcard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DebitCardRequestType }
     * 
     */
    public DebitCardRequestType createDebitCardRequestType() {
        return new DebitCardRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitCardRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/debitCard/", name = "debitCardRequest")
    public JAXBElement<DebitCardRequestType> createDebitCardRequest(DebitCardRequestType value) {
        return new JAXBElement<DebitCardRequestType>(_DebitCardRequest_QNAME, DebitCardRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialTransactionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/debitCard/", name = "debitCardResponse")
    public JAXBElement<FinancialTransactionResponseType> createDebitCardResponse(FinancialTransactionResponseType value) {
        return new JAXBElement<FinancialTransactionResponseType>(_DebitCardResponse_QNAME, FinancialTransactionResponseType.class, null, value);
    }

}

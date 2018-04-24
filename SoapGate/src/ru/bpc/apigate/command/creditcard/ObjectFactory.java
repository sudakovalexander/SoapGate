
package ru.bpc.apigate.command.creditcard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.bpc.apigate.general.FinancialTransactionResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.creditcard package. 
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

    private final static QName _CreditCardRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/creditCard/", "creditCardRequest");
    private final static QName _CreditCardResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/creditCard/", "creditCardResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.creditcard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreditCardRequestType }
     * 
     */
    public CreditCardRequestType createCreditCardRequestType() {
        return new CreditCardRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/creditCard/", name = "creditCardRequest")
    public JAXBElement<CreditCardRequestType> createCreditCardRequest(CreditCardRequestType value) {
        return new JAXBElement<CreditCardRequestType>(_CreditCardRequest_QNAME, CreditCardRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialTransactionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/creditCard/", name = "creditCardResponse")
    public JAXBElement<FinancialTransactionResponseType> createCreditCardResponse(FinancialTransactionResponseType value) {
        return new JAXBElement<FinancialTransactionResponseType>(_CreditCardResponse_QNAME, FinancialTransactionResponseType.class, null, value);
    }

}

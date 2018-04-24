
package ru.bpc.apigate.command.gettransactions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.gettransactions package. 
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

    private final static QName _GetTransactionsRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/getTransactions/", "getTransactionsRequest");
    private final static QName _GetTransactionsResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/getTransactions/", "getTransactionsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.gettransactions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTransactionsRequestType }
     * 
     */
    public GetTransactionsRequestType createGetTransactionsRequestType() {
        return new GetTransactionsRequestType();
    }

    /**
     * Create an instance of {@link GetTransactionsResponseType }
     * 
     */
    public GetTransactionsResponseType createGetTransactionsResponseType() {
        return new GetTransactionsResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransactionsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/getTransactions/", name = "getTransactionsRequest")
    public JAXBElement<GetTransactionsRequestType> createGetTransactionsRequest(GetTransactionsRequestType value) {
        return new JAXBElement<GetTransactionsRequestType>(_GetTransactionsRequest_QNAME, GetTransactionsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransactionsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/getTransactions/", name = "getTransactionsResponse")
    public JAXBElement<GetTransactionsResponseType> createGetTransactionsResponse(GetTransactionsResponseType value) {
        return new JAXBElement<GetTransactionsResponseType>(_GetTransactionsResponse_QNAME, GetTransactionsResponseType.class, null, value);
    }

}

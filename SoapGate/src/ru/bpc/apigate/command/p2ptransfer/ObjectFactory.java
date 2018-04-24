
package ru.bpc.apigate.command.p2ptransfer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.bpc.apigate.general.FinancialTransactionResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.p2ptransfer package. 
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

    private final static QName _P2PTransferRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/p2pTransfer/", "p2pTransferRequest");
    private final static QName _P2PTransferResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/p2pTransfer/", "p2pTransferResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.p2ptransfer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link P2PTransferRequestType }
     * 
     */
    public P2PTransferRequestType createP2PTransferRequestType() {
        return new P2PTransferRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link P2PTransferRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/p2pTransfer/", name = "p2pTransferRequest")
    public JAXBElement<P2PTransferRequestType> createP2PTransferRequest(P2PTransferRequestType value) {
        return new JAXBElement<P2PTransferRequestType>(_P2PTransferRequest_QNAME, P2PTransferRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialTransactionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/p2pTransfer/", name = "p2pTransferResponse")
    public JAXBElement<FinancialTransactionResponseType> createP2PTransferResponse(FinancialTransactionResponseType value) {
        return new JAXBElement<FinancialTransactionResponseType>(_P2PTransferResponse_QNAME, FinancialTransactionResponseType.class, null, value);
    }

}

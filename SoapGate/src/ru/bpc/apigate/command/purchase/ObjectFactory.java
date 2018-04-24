
package ru.bpc.apigate.command.purchase;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.bpc.apigate.general.FinancialTransactionResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.purchase package. 
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

    private final static QName _PurchaseRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/purchase/", "purchaseRequest");
    private final static QName _PurchaseResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/purchase/", "purchaseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.purchase
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PurchaseRequestType }
     * 
     */
    public PurchaseRequestType createPurchaseRequestType() {
        return new PurchaseRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/purchase/", name = "purchaseRequest")
    public JAXBElement<PurchaseRequestType> createPurchaseRequest(PurchaseRequestType value) {
        return new JAXBElement<PurchaseRequestType>(_PurchaseRequest_QNAME, PurchaseRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialTransactionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/purchase/", name = "purchaseResponse")
    public JAXBElement<FinancialTransactionResponseType> createPurchaseResponse(FinancialTransactionResponseType value) {
        return new JAXBElement<FinancialTransactionResponseType>(_PurchaseResponse_QNAME, FinancialTransactionResponseType.class, null, value);
    }

}

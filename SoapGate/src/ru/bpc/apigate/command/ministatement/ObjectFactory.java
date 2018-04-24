
package ru.bpc.apigate.command.ministatement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.command.ministatement package. 
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

    private final static QName _MiniStatementRequest_QNAME = new QName("http://www.bpc.ru/apigate/command/miniStatement/", "miniStatementRequest");
    private final static QName _MiniStatementResponse_QNAME = new QName("http://www.bpc.ru/apigate/command/miniStatement/", "miniStatementResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.command.ministatement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MiniStatementRequestType }
     * 
     */
    public MiniStatementRequestType createMiniStatementRequestType() {
        return new MiniStatementRequestType();
    }

    /**
     * Create an instance of {@link MiniStatementResponseType }
     * 
     */
    public MiniStatementResponseType createMiniStatementResponseType() {
        return new MiniStatementResponseType();
    }

    /**
     * Create an instance of {@link MiniStatementRecords }
     * 
     */
    public MiniStatementRecords createMiniStatementRecords() {
        return new MiniStatementRecords();
    }

    /**
     * Create an instance of {@link MiniStatementRecordType }
     * 
     */
    public MiniStatementRecordType createMiniStatementRecordType() {
        return new MiniStatementRecordType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiniStatementRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/miniStatement/", name = "miniStatementRequest")
    public JAXBElement<MiniStatementRequestType> createMiniStatementRequest(MiniStatementRequestType value) {
        return new JAXBElement<MiniStatementRequestType>(_MiniStatementRequest_QNAME, MiniStatementRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiniStatementResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/command/miniStatement/", name = "miniStatementResponse")
    public JAXBElement<MiniStatementResponseType> createMiniStatementResponse(MiniStatementResponseType value) {
        return new JAXBElement<MiniStatementResponseType>(_MiniStatementResponse_QNAME, MiniStatementResponseType.class, null, value);
    }

}

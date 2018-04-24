
package ru.unitarius.integration.schema.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.unitarius.integration.schema.common package. 
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

    private final static QName _AsyncResponse_QNAME = new QName("http://unitarius.ru/integration/schema/common", "AsyncResponse");
    private final static QName _Fault_QNAME = new QName("http://unitarius.ru/integration/schema/common", "Fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.unitarius.integration.schema.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AsyncResponseType }
     * 
     */
    public AsyncResponseType createAsyncResponseType() {
        return new AsyncResponseType();
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link SubsystemIDLongType }
     * 
     */
    public SubsystemIDLongType createSubsystemIDLongType() {
        return new SubsystemIDLongType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link AsyncResponseErrorType }
     * 
     */
    public AsyncResponseErrorType createAsyncResponseErrorType() {
        return new AsyncResponseErrorType();
    }

    /**
     * Create an instance of {@link BasicErrorType }
     * 
     */
    public BasicErrorType createBasicErrorType() {
        return new BasicErrorType();
    }

    /**
     * Create an instance of {@link EntityErrorType }
     * 
     */
    public EntityErrorType createEntityErrorType() {
        return new EntityErrorType();
    }

    /**
     * Create an instance of {@link FileType }
     * 
     */
    public FileType createFileType() {
        return new FileType();
    }

    /**
     * Create an instance of {@link LocalizedStringType }
     * 
     */
    public LocalizedStringType createLocalizedStringType() {
        return new LocalizedStringType();
    }

    /**
     * Create an instance of {@link EntityAttributeType }
     * 
     */
    public EntityAttributeType createEntityAttributeType() {
        return new EntityAttributeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unitarius.ru/integration/schema/common", name = "AsyncResponse")
    public JAXBElement<AsyncResponseType> createAsyncResponse(AsyncResponseType value) {
        return new JAXBElement<AsyncResponseType>(_AsyncResponse_QNAME, AsyncResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unitarius.ru/integration/schema/common", name = "Fault")
    public JAXBElement<FaultType> createFault(FaultType value) {
        return new JAXBElement<FaultType>(_Fault_QNAME, FaultType.class, null, value);
    }

}

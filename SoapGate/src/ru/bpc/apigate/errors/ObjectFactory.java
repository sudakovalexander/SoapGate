
package ru.bpc.apigate.errors;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bpc.apigate.errors package. 
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

    private final static QName _ServiceLevelFault_QNAME = new QName("http://www.bpc.ru/apigate/errors/", "serviceLevelFault");
    private final static QName _SvfeProcessingFault_QNAME = new QName("http://www.bpc.ru/apigate/errors/", "svfeProcessingFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bpc.apigate.errors
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceLevelFaultType }
     * 
     */
    public ServiceLevelFaultType createServiceLevelFaultType() {
        return new ServiceLevelFaultType();
    }

    /**
     * Create an instance of {@link SvfeProcessingFaultType }
     * 
     */
    public SvfeProcessingFaultType createSvfeProcessingFaultType() {
        return new SvfeProcessingFaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceLevelFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/errors/", name = "serviceLevelFault")
    public JAXBElement<ServiceLevelFaultType> createServiceLevelFault(ServiceLevelFaultType value) {
        return new JAXBElement<ServiceLevelFaultType>(_ServiceLevelFault_QNAME, ServiceLevelFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvfeProcessingFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bpc.ru/apigate/errors/", name = "svfeProcessingFault")
    public JAXBElement<SvfeProcessingFaultType> createSvfeProcessingFault(SvfeProcessingFaultType value) {
        return new JAXBElement<SvfeProcessingFaultType>(_SvfeProcessingFault_QNAME, SvfeProcessingFaultType.class, null, value);
    }

}

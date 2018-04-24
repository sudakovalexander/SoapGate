
package lv.d8.cortexws.common.valueobj.xsd;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lv.d8.cortexws.common.valueobj.xsd package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lv.d8.cortexws.common.valueobj.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CortexWSRqstInfo }
     * 
     */
    public CortexWSRqstInfo createCortexWSRqstInfo() {
        return new CortexWSRqstInfo();
    }

    /**
     * Create an instance of {@link CortexWSRspsInfo }
     * 
     */
    public CortexWSRspsInfo createCortexWSRspsInfo() {
        return new CortexWSRspsInfo();
    }

}

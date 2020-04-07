
package com.jkecsmrti.schemas.jkecsmrtiinterface;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jkecsmrti.schemas.jkecsmrtiinterface package. 
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

    private final static QName _DFHCOMMAREA_QNAME = new QName("http://www.JKECSMRTI.com/schemas/JKECSMRTIInterface", "DFHCOMMAREA");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jkecsmrti.schemas.jkecsmrtiinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DFHCOMMAREA }
     * 
     */
    public DFHCOMMAREA createDFHCOMMAREA() {
        return new DFHCOMMAREA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DFHCOMMAREA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.JKECSMRTI.com/schemas/JKECSMRTIInterface", name = "DFHCOMMAREA")
    public JAXBElement<DFHCOMMAREA> createDFHCOMMAREA(DFHCOMMAREA value) {
        return new JAXBElement<DFHCOMMAREA>(_DFHCOMMAREA_QNAME, DFHCOMMAREA.class, null, value);
    }

    public DFHCOMMAREA createDFHCOMMAREA(be.asist.middleware.data.DFHCOMMAREA value) {
        DFHCOMMAREA area = new DFHCOMMAREA();
        area.setJkepcomNumberOfYears(Short.valueOf(value.getJkepcomNumberOfYears().toString()));
        area.setJkepcomPrincipleData(new BigDecimal(value.getJkepcomPrincipleData()));
        area.setJkepcomQuotedInterestRate(new BigDecimal(value.getJkepcomQuotedInterestRate()));
        return area;
    }

}

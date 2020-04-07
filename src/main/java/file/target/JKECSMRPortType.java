
package file.target;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "JKECSMRPortType", targetNamespace = "file://target.files")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.jkecsmrti.schemas.jkecsmrtiinterface.ObjectFactory.class,
    com.jkecsmrto.schemas.jkecsmrtointerface.ObjectFactory.class
})
public interface JKECSMRPortType {


    /**
     * 
     * @param dfhcommareaPart
     * @return
     *     returns com.jkecsmrto.schemas.jkecsmrtointerface.DFHCOMMAREA
     */
    @WebMethod(operationName = "JKECSMRTOperation", action = "urn:JKECSMR")
    @WebResult(name = "DFHCOMMAREA", targetNamespace = "http://www.JKECSMRTO.com/schemas/JKECSMRTOInterface", partName = "DFHCOMMAREAPart")
    public com.jkecsmrto.schemas.jkecsmrtointerface.DFHCOMMAREA jkecsmrtOperation(
        @WebParam(name = "DFHCOMMAREA", targetNamespace = "http://www.JKECSMRTI.com/schemas/JKECSMRTIInterface", partName = "DFHCOMMAREAPart")
        com.jkecsmrti.schemas.jkecsmrtiinterface.DFHCOMMAREA dfhcommareaPart);

}

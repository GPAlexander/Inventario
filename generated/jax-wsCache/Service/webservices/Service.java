
package webservices;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Service", targetNamespace = "http://WebServices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Service {


    /**
     * 
     * @param id
     * @return
     *     returns webservices.Proveedores
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteProveedor", targetNamespace = "http://WebServices/", className = "webservices.DeleteProveedor")
    @ResponseWrapper(localName = "deleteProveedorResponse", targetNamespace = "http://WebServices/", className = "webservices.DeleteProveedorResponse")
    @Action(input = "http://WebServices/Service/deleteProveedorRequest", output = "http://WebServices/Service/deleteProveedorResponse")
    public Proveedores deleteProveedor(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param direccion
     * @param telefono
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InsertProveedor")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "InsertProveedor", targetNamespace = "http://WebServices/", className = "webservices.InsertProveedor")
    @ResponseWrapper(localName = "InsertProveedorResponse", targetNamespace = "http://WebServices/", className = "webservices.InsertProveedorResponse")
    @Action(input = "http://WebServices/Service/InsertProveedorRequest", output = "http://WebServices/Service/InsertProveedorResponse")
    public String insertProveedor(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "direccion", targetNamespace = "")
        String direccion,
        @WebParam(name = "telefono", targetNamespace = "")
        String telefono);

    /**
     * 
     * @param direccion
     * @param id
     * @param telefono
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpdateProveedor")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpdateProveedor", targetNamespace = "http://WebServices/", className = "webservices.UpdateProveedor")
    @ResponseWrapper(localName = "UpdateProveedorResponse", targetNamespace = "http://WebServices/", className = "webservices.UpdateProveedorResponse")
    @Action(input = "http://WebServices/Service/UpdateProveedorRequest", output = "http://WebServices/Service/UpdateProveedorResponse")
    public String updateProveedor(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "direccion", targetNamespace = "")
        String direccion,
        @WebParam(name = "telefono", targetNamespace = "")
        String telefono);

    /**
     * 
     * @return
     *     returns java.util.List<webservices.Proveedores>
     */
    @WebMethod(operationName = "SelectAlProveedores")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SelectAlProveedores", targetNamespace = "http://WebServices/", className = "webservices.SelectAlProveedores")
    @ResponseWrapper(localName = "SelectAlProveedoresResponse", targetNamespace = "http://WebServices/", className = "webservices.SelectAlProveedoresResponse")
    @Action(input = "http://WebServices/Service/SelectAlProveedoresRequest", output = "http://WebServices/Service/SelectAlProveedoresResponse")
    public List<Proveedores> selectAlProveedores();

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import Modelos.Proveedores;
import Modelos.ProveedoresDao;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Service")
public class Service {
        ProveedoresDao dao= new ProveedoresDao();
    
    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SelectAlProveedores")
    public List<Proveedores> SelectAll() {
        List datos=dao.SelectAll();
        System.out.println(datos);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "InsertProveedor")
    public String InsertProveedor(@WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono) {
        
        String datos=dao.Save(nombre, direccion, telefono);
        
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateProveedor")
    public String UpdateProveedor(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono) {
        //TODO write your implementation code here:
        String datos=dao.editar(id, nombre, telefono, direccion);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteProveedor")
    public Proveedores deleteProveedor(@WebParam(name = "id") int id) {
        Proveedores pro=dao.deleteProveedor(id);
        return pro;
    }



}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import Modelos.Clientes;
import Modelos.ClientesDao;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Alexander Guaran
 */
@WebService(serviceName = "ServiceClientes")
public class ServiceClientes {
 ClientesDao dao= new ClientesDao();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SelectAllClientes")
    public List<Clientes> SelectAllClientes() {
        List datos=dao.SelectAllClientes();
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "InsertCliente")
    public String InsertCliente(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono) {
       String datos=dao.SaveCliente(nombre,apellido, direccion, telefono);
        
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateCliente")
    public String UpdateCliente(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono) {
        String datos=dao.UpdateCliente(id, nombre,apellido, telefono, direccion);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DeleteCliente")
    public Clientes DeleteCliente(@WebParam(name = "id") int id) {
       Clientes cli= dao.deleteCliente(id);
        return cli;
    }
}

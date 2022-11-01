
package Controlador;

import webservices.Clientes;

public class ClientesAppClass {

    public java.util.List<webservices.Clientes> selectAllClientes() {
        webservices.ServiceClientes_Service service = new webservices.ServiceClientes_Service();
        webservices.ServiceClientes port = service.getServiceClientesPort();
        return port.selectAllClientes();
    }

   public String insertCliente(java.lang.String nombre, java.lang.String apellido, java.lang.String direccion, java.lang.String telefono) {
        webservices.ServiceClientes_Service service = new webservices.ServiceClientes_Service();
        webservices.ServiceClientes port = service.getServiceClientesPort();
        return port.insertCliente(nombre, apellido, direccion, telefono);
    }

    public String updateCliente(int id, java.lang.String nombre, java.lang.String apellido, java.lang.String direccion, java.lang.String telefono) {
        webservices.ServiceClientes_Service service = new webservices.ServiceClientes_Service();
        webservices.ServiceClientes port = service.getServiceClientesPort();
        return port.updateCliente(id, nombre, apellido, direccion, telefono);
    }

   public Clientes deleteCliente(int id) {
        webservices.ServiceClientes_Service service = new webservices.ServiceClientes_Service();
        webservices.ServiceClientes port = service.getServiceClientesPort();
        return port.deleteCliente(id);
    }
    
}

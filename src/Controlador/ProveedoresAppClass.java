
package Controlador;

import webservices.Proveedores;


public class ProveedoresAppClass {

   public java.util.List<webservices.Proveedores> selectAlProveedores() {
        webservices.Service_Service service = new webservices.Service_Service();
        webservices.Service port = service.getServicePort();
        return port.selectAlProveedores();
    }

    public  String insertProveedor(java.lang.String nombre, java.lang.String direccion, java.lang.String telefono) {
        webservices.Service_Service service = new webservices.Service_Service();
        webservices.Service port = service.getServicePort();
        return port.insertProveedor(nombre, direccion, telefono);
    }

    public String updateProveedor(int id, java.lang.String nombre, java.lang.String direccion, java.lang.String telefono) {
        webservices.Service_Service service = new webservices.Service_Service();
        webservices.Service port = service.getServicePort();
        return port.updateProveedor(id, nombre, direccion, telefono);
    }

   public Proveedores deleteProveedor(int id) {
        webservices.Service_Service service = new webservices.Service_Service();
        webservices.Service port = service.getServicePort();
        return port.deleteProveedor(id);
    }

    

   
    
    
}

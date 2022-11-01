/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import webservices.Productos;

/**
 *
 * @author Alexander Guaran
 */
public class ProductosAppClass {

   public java.util.List<webservices.Proveedores> selectAlProveedores() {
        webservices.Service_Service service = new webservices.Service_Service();
        webservices.Service port = service.getServicePort();
        return port.selectAlProveedores();
    }

    

   public String updateProducto(int id, java.lang.String nombre, java.lang.String descripcion, int stock, double precio, int idProveedor) {
        webservices.ServiceProductos_Service service = new webservices.ServiceProductos_Service();
        webservices.ServiceProductos port = service.getServiceProductosPort();
        return port.updateProducto(id, nombre, descripcion, stock, precio, idProveedor);
    }

    public String saveProducto(java.lang.String nombre, java.lang.String descripcion, int stock, double precio, int idProveedor) {
        webservices.ServiceProductos_Service service = new webservices.ServiceProductos_Service();
        webservices.ServiceProductos port = service.getServiceProductosPort();
        return port.saveProducto(nombre, descripcion, stock, precio, idProveedor);
    }

    public Productos deleteProducto(int id) {
        webservices.ServiceProductos_Service service = new webservices.ServiceProductos_Service();
        webservices.ServiceProductos port = service.getServiceProductosPort();
        return port.deleteProducto(id);
    }

    public java.util.List<webservices.Productos> selectAllProductos() {
        webservices.ServiceProductos_Service service = new webservices.ServiceProductos_Service();
        webservices.ServiceProductos port = service.getServiceProductosPort();
        return port.selectAllProductos();
    }
    
}

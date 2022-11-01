
package WebServices;

import Modelos.Productos;
import Modelos.ProductosDao;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Alexander Guaran
 */
@WebService(serviceName = "ServiceProductos")
public class ServiceProductos {
        ProductosDao dao= new ProductosDao();


    /**
     * Web service operation
     */
    @WebMethod(operationName = "SelectAllProductos")
    public List<Productos> SelectAllProductos() {
        List datos=dao.SelectAllProductos();
        return datos;    
        
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SaveProducto")
    public String SaveProducto(@WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "stock") int stock, @WebParam(name = "precio") double precio, @WebParam(name = "id_proveedor") int id_proveedor) {
       String datos=dao.SaveProducto(nombre, descripcion, stock, precio, id_proveedor);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateProducto")
    public String UpdateProducto(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "stock") int stock, @WebParam(name = "precio") double precio, @WebParam(name = "id_proveedor") int id_proveedor) {
       String datos=dao.UpdateProducto(id, nombre, descripcion, stock, precio, id_proveedor);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DeleteProducto")
    public Productos DeleteProducto(@WebParam(name = "id") int id) {
        Productos pro=dao.deleteProducto(id);
        return pro;
    }




}

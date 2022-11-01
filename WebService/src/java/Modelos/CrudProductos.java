package Modelos;

import java.util.List;

public interface CrudProductos {
    public List SelectAllProductos();
    public Productos SelectIDProducto(int id);
    public String SaveProducto(String nombre, String descripcion, int stock, double precio, int id_proveedor);
    public String UpdateProducto(int id, String nombre, String descripcion, int stock, double precio, int id_proveedor);
    public Productos deleteProducto(int id); 
}

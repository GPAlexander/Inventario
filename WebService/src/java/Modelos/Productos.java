package Modelos;
public class Productos {
    private int id;
    private String nombre;
    private String descripcion;
    private String stock;
    private String precio;
    private String id_proveedor;
    private String Proveedor_nombre;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(String id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
    public String getProveedor_nombre() {
        return Proveedor_nombre;
    }

    public void setProveedor_nombre(String Proveedor_nombre) {
        this.Proveedor_nombre = Proveedor_nombre;
    }

}

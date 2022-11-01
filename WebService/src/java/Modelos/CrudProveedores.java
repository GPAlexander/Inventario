
package Modelos;

import java.util.List;


public interface CrudProveedores {
    public List SelectAll();
    public Proveedores SelectID(int id);
    public String Save(String nombre, String telefonono, String Direccion);
    public String editar(int id, String nombre, String telefono, String Direccion);
    public Proveedores deleteProveedor(int id);

}

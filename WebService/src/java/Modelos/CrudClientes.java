
package Modelos;

import java.util.List;

/**
 *
 * @author Alexander Guaran
 */
public interface CrudClientes {
    public List SelectAllClientes();
    public Clientes SelectID(int id);
    public String SaveCliente(String nombre, String apellido, String telefono, String direccion);
    public String UpdateCliente(int id, String nombre, String apellido, String telefono, String direccion);
    public Clientes deleteCliente(int id); 
}

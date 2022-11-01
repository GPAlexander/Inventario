package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductosDao implements CrudProductos {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conexion = new Conexion();
    Productos pro = new Productos();
    int resp;
    String msj;

    @Override
    public List SelectAllProductos() {

        List<Productos> datos = new ArrayList<>();
        String query = "SELECT pr.id, pr.nombre, pr.descripcion, pr.stock, pr.precio, pr.id_proveedor, p.nombre as NombreProveedor FROM productos as pr INNER JOIN proveedores as p on pr.id_proveedor=p.id";
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Productos prod = new Productos();

                prod.setId(rs.getInt("id"));
                prod.setNombre(rs.getString("nombre"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setStock(rs.getString("stock"));
                prod.setPrecio(rs.getString("precio"));
                prod.setId_proveedor(rs.getString("id_proveedor"));
                prod.setProveedor_nombre(rs.getString("NombreProveedor"));
                datos.add(prod);
            }
        } catch (Exception e) {
        }
        return datos;

    }

    @Override
    public Productos SelectIDProducto(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String SaveProducto(String nombre, String descripcion, int stock, double precio, int id_proveedor) {
        String query = "INSERT INTO productos(nombre, descripcion, stock, precio, id_proveedor) VALUES (?, ?, ?, ?, ?)";
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setInt(3, stock);
            ps.setDouble(4, precio);
            ps.setInt(5, id_proveedor);
            resp = ps.executeUpdate();
            if (resp == 1) {
                msj = "Usuario Agregado";
            } else {
                msj = "Error";
            }
        } catch (Exception e) {
        }
        return msj;

    }

    @Override
    public String UpdateProducto(int id, String nombre, String descripcion, int stock, double precio, int id_proveedor) {

        String query = "UPDATE productos SET nombre=?, descripcion=?, stock=?, precio=?, id_proveedor=? WHERE id=" + id;
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setInt(3, stock);
            ps.setDouble(4, precio);
            ps.setInt(5, id_proveedor);
            resp = ps.executeUpdate();
            if (resp == 1) {
                msj = "Producto Actualizado";
            } else {
                msj = "Error";
            }

        } catch (Exception e) {

        }

        return msj;

    }

    @Override
    public Productos deleteProducto(int id) {
        String query = "DELETE FROM productos WHERE id=" + id;
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception e) {

        }

        return pro;

    }
}

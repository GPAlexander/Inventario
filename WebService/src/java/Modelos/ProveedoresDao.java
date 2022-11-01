
package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProveedoresDao implements CrudProveedores {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conexion=new Conexion();
    Proveedores pro=new Proveedores();
    int resp;
    String msj;
    
    @Override
    public List SelectAll() {
      List<Proveedores> datos = new ArrayList<>();
      String query="select * from proveedores";
      try{
          con=conexion.getConnection();
          ps=con.prepareStatement(query);
          rs=ps.executeQuery();
          while(rs.next())
          {
              Proveedores prov=new Proveedores();
              prov.setId(rs.getInt("id"));
              prov.setNombre(rs.getString("nombre"));
              prov.setDireccion(rs.getString("direccion"));
              prov.setTelefono(rs.getString("telefono"));

              datos.add(prov);
          }
      }catch(Exception e)
      {
      }
        return datos;
  
      
      
    }

    @Override
    public Proveedores SelectID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Save(String nombre, String telefonono, String Direccion) {
       String query="INSERT INTO proveedores(nombre, direccion, telefono) VALUES (?, ?, ?)";
       try
       {
           con=conexion.getConnection();
           ps=con.prepareStatement(query);
           ps.setString(1, nombre);
           ps.setString(2, telefonono);
           ps.setString(3, Direccion);
          resp= ps.executeUpdate();
           if(resp==1)
           {
               msj="Usuario Agregado";
           }
           else{
              msj="Error";
           }
       }catch(Exception e)
       {}
       return msj;
    }

    @Override
    public String editar(int id, String nombre, String telefono, String Direccion) {
       String query="UPDATE proveedores SET nombre=?, direccion=?, telefono=? WHERE id="+id;
       try
       {
           con=conexion.getConnection();
           ps=con.prepareStatement(query);
           ps.setString(1, nombre);
           ps.setString(2, telefono);
           ps.setString(3, Direccion);
           resp=ps.executeUpdate();
            if(resp==1)
            {
              msj="Usuario Actualizado";  
            }
            else
            {
                msj="Error";
            }
           
       }
       catch(Exception e)
       {
           
       }
       
       return msj;
       
       
    }

    @Override
    public Proveedores deleteProveedor(int id) {
               String query="DELETE FROM proveedores WHERE id="+id;
               try{
                   con=conexion.getConnection();
                   ps=con.prepareStatement(query);
                   ps.executeUpdate();
               }
               catch(Exception e)
               {
                   
               }
               

               return pro;
        
    }
    
}

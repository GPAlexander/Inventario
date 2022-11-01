
package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ClientesDao implements CrudClientes{
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conexion=new Conexion();
    Clientes cli=new Clientes();
    int resp;
    String msj;

    @Override
    public List SelectAllClientes() {
            List<Clientes> datos = new ArrayList<>();
      String query="select * from clientes";
      try{
          con=conexion.getConnection();
          ps=con.prepareStatement(query);
          rs=ps.executeQuery();
          while(rs.next())
          {
              Clientes cli=new Clientes();
              cli.setId(rs.getInt("id"));
              cli.setNombre(rs.getString("nombre"));
               cli.setApellido(rs.getString("apellido"));
              cli.setDireccion(rs.getString("direccion"));
              cli.setTelefono(rs.getString("telefono"));

              datos.add(cli);
          }
      }catch(Exception e)
      {
      }
        return datos;
  
      
        
    }

    @Override
    public Clientes SelectID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String SaveCliente(String nombre, String apellido, String telefono, String direccion) {
         String query="INSERT INTO clientes(nombre, apellido, direccion, telefono) VALUES (?, ?, ?, ?)";
       try
       {
           con=conexion.getConnection();
           ps=con.prepareStatement(query);
           ps.setString(1, nombre);
           ps.setString(2, apellido);
           ps.setString(3, telefono);
           ps.setString(4, direccion);
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
    public String UpdateCliente(int id, String nombre, String apellido, String telefono, String direccion) {
        String query="UPDATE clientes SET nombre=?, apellido=?, direccion=?, telefono=? WHERE id="+id;
       try
       {
           con=conexion.getConnection();
           ps=con.prepareStatement(query);
           ps.setString(1, nombre);
           ps.setString(2, apellido);
           ps.setString(3, direccion);
           ps.setString(4, telefono);

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
    public Clientes deleteCliente(int id) {
       String query="DELETE FROM clientes WHERE id="+id;
               try{
                   con=conexion.getConnection();
                   ps=con.prepareStatement(query);
                   ps.executeUpdate();
               }
               catch(Exception e)
               {
                   
               }
               

               return cli;
        
    }
    
}

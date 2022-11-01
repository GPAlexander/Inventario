
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection con;
    
    public Conexion()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root","");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    public Connection getConnection()
    {
        return con;
    }
}


package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author idalia
 */
public class Conectar {
    
    Connection cn;
    
    public Connection conexion (){
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            cn=DriverManager.getConnection("jdbc:mysql://localhost/bd","root","");
            System.out.println("conectado");
            
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        
        return cn;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package dao;

//Inicio base conexion base datos funcionando con variables
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author freddy 
 */
//* quitar linea
public class conexionLib {
    
    public static Connection conectarnosDB(){
        try{
            //Datos de la conexion
            String dbDriver = "com.mysql.jdbc.Driver";
            String dbURL = "jdbc:mysql://localhost:3306/";
            //Datos de la DB  
            String dbName = "taller_cesde";
            String dbUser = "root";
            String dbPassword = "";
            
            Class.forName(dbDriver);
            Connection conex = DriverManager.getConnection(dbURL + dbName, dbUser, dbPassword);        
            return conex;
            
        }catch(ClassNotFoundException | SQLException ex){
            return null;
        }
    } 
}
//Fin base conexion base datos funcionando con variables 
/*
 
Inicio  Prueba de conexion con la base de datos
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexionLib{
    Connection con= null;
    
    public conexionLib(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/taller_cesde","root","");
            if(con != null){
                System.out.println("Conexion Ok prueba");
            }
        } catch (ClassNotFoundException ex) {
              System.out.println("Mesaje" +ex.getMessage());
        } catch (SQLException e) {
             System.out.println("Mesaje" +e.getMessage());
        }
        
    }
    public Connection getConnection(){
        return con;
    }
}
*/

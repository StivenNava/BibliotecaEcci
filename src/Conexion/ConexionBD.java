
package Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionBD {
    Connection cn = null; 
  
  
  public Connection Conexion (){
      try{
            String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver" ;  
            String cadena = "jdbc:sqlserver://DESKTOP-GLP37S0:1433;DatabaseName=proyectoFinal";
            String usuario = "userdev" ;
            String pass="userdev";
  
          Class.forName(driver);
            cn=DriverManager.getConnection(cadena,usuario,pass);
      }catch (Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
      return cn;
  }
  
//    public static void main(String[] args) {
//        conexionBD con = new 
//    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.CallableStatement;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;
import Modelo.ModelRegistarUsuario;
import java.sql.Connection;
import java.sql.ResultSet;
import Modelo.ModelLogin;
import Modelo.ModelEstudiante;
/**
 *
 * @author kathe
 */
public class CrudUsuarios {
    ResultSet rs;
    private ConexionBD con = new ConexionBD();
    private Connection cn = con.Conexion();
    Boolean response = false;
    String responses = null;
    CallableStatement csta =null;
    
    public Boolean CrearUsuario(ModelRegistarUsuario dts){        
        try{
            csta = cn.prepareCall("{call sp_Crear_Usuario(?,?,?,?,?,?)}");
            csta.setString(1,dts.getNombres());
            csta.setString(2,dts.getApelido());
            csta.setString(3,dts.getEmail());
            csta.setString(4,dts.getContraseña());
            csta.setString(5,dts.getSexo());
            csta.setString(6,dts.getFecha());
            
            csta.execute();                       
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return true;
    }
    public String Login (ModelLogin dts){
        ResultSet rs;
        String response = null;
        try{
            csta = cn.prepareCall("{call sp_Login(?,?)}");
            csta.setString(1,dts.getEmail());
            csta.setString(2,dts.getPass());
            
             rs= csta.executeQuery();
             
             while (rs.next())
                response = rs.getString(1);
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            
        }
        return response;
    }   
    public Boolean crearEstudian(ModelEstudiante dts){
       Boolean Hola = false ;
       return Hola;
    }
}

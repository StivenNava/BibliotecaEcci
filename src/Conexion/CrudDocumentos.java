/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Modelo.ModelDocumento;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CrudDocumentos {
    ResultSet rs;
    private ConexionBD con = new ConexionBD();
    private Connection cn = con.Conexion();
    Boolean response = false;
    String responses = null;
    CallableStatement csta = null;

    public Boolean CrearDocumento(ModelDocumento dts) {
        try {
            csta = cn.prepareCall("{call sp_GetDocumento(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            csta.setString(1, dts.getTitulo());
            csta.setString(2, dts.getTipodeDocumento());
            csta.setString(3, dts.getColeccion());
            csta.setString(4, dts.getPrograma());
            csta.setString(5, dts.getFecha());
            csta.setString(6, dts.getApellidoAutor1());
            csta.setString(7, dts.getNombreAutor1());
            csta.setString(8, dts.getCodigoAutor1());
            csta.setString(9, dts.getApellidoAutor2());
            csta.setString(10, dts.getNombreAutor2());
            csta.setString(11, dts.getCodigoAutor2());
            csta.setString(12, dts.getApellidoAutor3());
            csta.setString(13, dts.getNombreAutor3());
            csta.setString(14, dts.getCodigoAutor3());
            csta.setString(15, dts.getAbstractEspanol());
            csta.setString(16, dts.getAbstractIngles());
            csta.setString(17, dts.getConclusionEspanol());
            csta.setString(18, dts.getConclusionIngles());

            csta.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return true;
    }
    
    public String ValDocumento(String titulo){
        String response = null;
        try {
            csta = cn.prepareCall("{call sp_ValDocumento(?)}");            
            csta.setString(1, titulo);
            
            rs = csta.executeQuery();
            
            while (rs.next()) {
                response = rs.getString(1);
            }
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            response="0";
        }
        
        return response;        
    }
    public Boolean EliminarDocumento(String titulo) {
        try {
            csta = cn.prepareCall("{call sp_EliminarDocumento(?)}");
            csta.setString(1, titulo);

            csta.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return true;    
    }
}

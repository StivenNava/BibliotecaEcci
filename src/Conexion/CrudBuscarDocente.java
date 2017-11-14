
package Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrudBuscarDocente {
    ResultSet rs;
    private ConexionBD con = new ConexionBD();
    private Connection cn = con.Conexion();
    Boolean response = false;
    String responses = null;
    CallableStatement csta = null;   

    public DefaultTableModel MostrarFiltro(Modelo.ModelBuscarDocente dts) {
        DefaultTableModel modelo;

        String[] Titulos = {"Nombres", "Apellidos", "Codigo", "Correo","Asignatura","Fecha"};

        String[] Registro = new String[6];

        modelo = new DefaultTableModel(null, Titulos);
        try {
            csta = cn.prepareCall("{call sp_BuscarDocenteFiltro(?,?)}");
            csta.setString(1, dts.getApellidos());
            csta.setString(2, dts.getCodigo());
            
            
            rs = csta.executeQuery();

            while (rs.next()) {
                Registro[0] = rs.getString("Nombres");
                Registro[1] = rs.getString("Apellidos");
                Registro[2] = rs.getString("Codigo");
                Registro[3] = rs.getString("Correo");
                Registro[4] = rs.getString("Asignatura");
                Registro[5] = rs.getString("Fecha");
                
  

                modelo.addRow(Registro);

            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    public DefaultTableModel Mostrar() {
        DefaultTableModel modelo;

        String[] Titulos = {"Nombres", "Apellidos", "Codigo", "Correo","Asignatura","Fecha"};

        String[] Registro = new String[6];

        modelo = new DefaultTableModel(null, Titulos);
        try {
            csta = cn.prepareCall("{call sp_BuscarDocente}");
                      
            rs = csta.executeQuery();

           while (rs.next()) {
                Registro[0] = rs.getString("Nombres");
                Registro[1] = rs.getString("Apellidos");
                Registro[2] = rs.getString("Codigo");
                Registro[3] = rs.getString("Correo");
                Registro[4] = rs.getString("Asignatura");
                Registro[5] = rs.getString("Fecha");
                

                modelo.addRow(Registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public Boolean EliminarDocente(String codigo) {
        try {
            csta = cn.prepareCall("{call sp_EliminarDocente(?)}");
            csta.setString(1, codigo);

            csta.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return true;    
    }
}

   



package Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrudBuscarEstudiante {
    ResultSet rs;
    private ConexionBD con = new ConexionBD();
    private Connection cn = con.Conexion();
    Boolean response = false;
    String responses = null;
    CallableStatement csta = null;   

    public DefaultTableModel MostrarFiltro(Modelo.ModelBuscarEstudiante dts) {
        DefaultTableModel modelo;

        String[] Titulos = {"Nombres", "Apellido", "Codigo", "Correo","Semestre","Fecha","Carrera"};

        String[] Registro = new String[7];

        modelo = new DefaultTableModel(null, Titulos);
        try {
            csta = cn.prepareCall("{call sp_BuscarEstudianteFiltro(?,?,?)}");
            csta.setString(1, dts.getApellido());
            csta.setString(2, dts.getCodigo());
            csta.setString(3, dts.getCarrera());
            
            rs = csta.executeQuery();

            while (rs.next()) {
                Registro[0] = rs.getString("Nombres");
                Registro[1] = rs.getString("Apellido");
                Registro[2] = rs.getString("Codigo");
                Registro[3] = rs.getString("Correo");
                Registro[4] = rs.getString("Semestre");
                Registro[5] = rs.getString("Fecha");
                Registro[6] = rs.getString("Carrera");
  

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

        String[] Titulos = {"Nombres", "Apellido", "Codigo", "Correo","Semestre","FechaNacimiento","Carrera"};

        String[] Registro = new String[7];

        modelo = new DefaultTableModel(null, Titulos);
        try {
            csta = cn.prepareCall("{call sp_BuscarEstudiante}");
                      
            rs = csta.executeQuery();

           while (rs.next()) {
                Registro[0] = rs.getString("Nombres");
                Registro[1] = rs.getString("Apellido");
                Registro[2] = rs.getString("Codigo");
                Registro[3] = rs.getString("Correo");
                Registro[4] = rs.getString("Semestre");
                Registro[5] = rs.getString("Fecha");
                Registro[6] = rs.getString("Carrera");

                modelo.addRow(Registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    public DefaultComboBoxModel CargarCarrera(){
        DefaultComboBoxModel modelo;        
        modelo = new DefaultComboBoxModel();
        try {
            csta = cn.prepareCall("{call sp_CargarCarrera}");                      
            rs = csta.executeQuery();

           while (rs.next()) {                
                modelo.addElement(rs.getString(1));
            }
           return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    public Boolean EliminarEstudiante(String codigo) {
        try {
            csta = cn.prepareCall("{call sp_EliminarEstudiante(?)}");
            csta.setString(1, codigo);

            csta.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return true;    
    }
}


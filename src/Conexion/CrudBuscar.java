package Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrudBuscar {

    ResultSet rs;
    private ConexionBD con = new ConexionBD();
    private Connection cn = con.Conexion();
    Boolean response = false;
    String responses = null;
    CallableStatement csta = null;

    public Boolean CrearDocumento(Modelo.ModeloBuscar dts) {
        try {
            csta = cn.prepareCall("{call sp_Buscar(?,?,?)}");
            csta.setString(1, dts.getTitulo());
            csta.setString(2, dts.getNombreAutor());
            csta.setString(3, dts.getPalabraClave());

            csta.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return true;
    }

    public DefaultTableModel Mostrar() {
        DefaultTableModel modelo;

        String[] Titulos = {"Titulo", "TipodeDocumento", "Coleccion", "Programa", "Fecha", "ApellidoAutor1", "NombreAutor1", "CodigoAutor1", "ApellidoAutor2", "NombreAutor2", "CodigoAutor2", "ApellidoAutor3", "NombreAutor3", "CodigoAutor3", "AbstractEspanol", "AbstractIngles", "ConclusionEspanol", "ConclusionIngles"};

        String[] Registro = new String[18];

        modelo = new DefaultTableModel(null, Titulos);
        try {
            CallableStatement csta = cn.prepareCall("{}");
            rs = csta.executeQuery();

            while (rs.next()) {
                Registro[0] = rs.getString("Titulo");
                Registro[1] = rs.getString("TipodeDocumento");
                Registro[2] = rs.getString("Coleccion");
                Registro[3] = rs.getString("Programa");
                Registro[4] = rs.getString("Fecha");
                Registro[5] = rs.getString("ApellidoAutor1");
                Registro[6] = rs.getString("NombreAutor1");
                Registro[7] = rs.getString("CodigoAutor1");
                Registro[8] = rs.getString("ApellidoAutor2");
                Registro[9] = rs.getString("NombreAutor2");
                Registro[10] = rs.getString("CodigoAutor2");
                Registro[11] = rs.getString("ApellidoAutor3");
                Registro[12] = rs.getString("NombreAutor2");
                Registro[13] = rs.getString("CodigoAutor2");
                Registro[14] = rs.getString("AbstractEspanol");
                Registro[15] = rs.getString("AbstractIngles");
                Registro[16] = rs.getString("ConclusionEspanol");
                Registro[17] = rs.getString("ConclusionIngles");

                modelo.addRow(Registro);

            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
}

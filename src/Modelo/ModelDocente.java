/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author kathe
 */
public class ModelDocente {
    private String Nombre;
    private String Apellido;
    private String Codigo;
    private String Correo;
    private String Asignatura;
    private String Fecha;

    public ModelDocente() {
        
    }

    public ModelDocente(String Nombre, String Apellido, String Codigo, String Correo, String Asignatura, String Fecha) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Codigo = Codigo;
        this.Correo = Correo;
        this.Asignatura = Asignatura;
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
}

   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author kathe
 */
public class ModelRegistarUsuario {
    private String Nombres;
    private String Apelido;
    private String Email;    
    private String Contraseña;
    private String Sexo;
    private String Fecha;

    public ModelRegistarUsuario() {
    }
        
    public ModelRegistarUsuario(String Nombres, String Apelido, String Email, String Contraseña, String Sexo, String Fecha) {
        this.Nombres = Nombres;
        this.Apelido = Apelido;
        this.Email = Email;
        this.Contraseña = Contraseña;
        this.Sexo = Sexo;
        this.Fecha = Fecha;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }    
}

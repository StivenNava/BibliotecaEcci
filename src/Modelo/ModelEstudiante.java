
package Modelo;


public class ModelEstudiante {
    private String Nombre;
    private String Apellido;
    private String Codigo;
    private String Correo;
    private String Semestre;
    private String Fecha;
    private String Carrera;

    public ModelEstudiante() {
    }

    public ModelEstudiante(String Nombre, String Apellido, String Codigo, String Correo, String Semestre, String Fecha, String Carrera) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Codigo = Codigo;
        this.Correo = Correo;
        this.Semestre = Semestre;
        this.Fecha = Fecha;
        this.Carrera = Carrera;
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

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
}

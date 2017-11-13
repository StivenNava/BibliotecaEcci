
package Modelo;


public class ModelBuscarEstudiante {
    private String Apellido;
    private String Codigo;
    private String Carrera;

    public ModelBuscarEstudiante() {
    }

    public ModelBuscarEstudiante(String Apellido, String Codigo, String Carrera) {
        this.Apellido = Apellido;
        this.Codigo = Codigo;
        this.Carrera = Carrera;
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

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
}

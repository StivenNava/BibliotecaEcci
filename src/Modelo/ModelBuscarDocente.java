
package Modelo;


public class ModelBuscarDocente {
 private String Apellidos;
 private String Codigo;

    public ModelBuscarDocente() {
    }

    public ModelBuscarDocente(String Apellidos, String Codigo) {
        this.Apellidos = Apellidos;
        this.Codigo = Codigo;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
 
}

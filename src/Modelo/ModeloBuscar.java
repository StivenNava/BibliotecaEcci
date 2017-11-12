
package Modelo;


public class ModeloBuscar {
 private String Titulo;
 private String NombreAutor;
 private String PalabraClave;

    public ModeloBuscar() {
    }

    public ModeloBuscar(String Titulo, String NombreAutor, String PalabraClave) {
        this.Titulo = Titulo;
        this.NombreAutor = NombreAutor;
        this.PalabraClave = PalabraClave;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getNombreAutor() {
        return NombreAutor;
    }

    public void setNombreAutor(String NombreAutor) {
        this.NombreAutor = NombreAutor;
    }

    public String getPalabraClave() {
        return PalabraClave;
    }

    public void setPalabraClave(String PalabraClave) {
        this.PalabraClave = PalabraClave;
    }
 
}

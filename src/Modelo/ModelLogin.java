
package Modelo;


public class ModelLogin {
   private String Email; 
   private String Pass; 

    public ModelLogin() {
    }

    public ModelLogin(String Email, String Pass) {
        this.Email = Email;
        this.Pass = Pass;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }       
}

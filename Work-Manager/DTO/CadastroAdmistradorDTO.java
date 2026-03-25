
package DTO;


public class CadastroAdmistradorDTO {
   private String Nome,Email,Senha;
   private int idadmistrador;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public int getIdadmistrador() {
        return idadmistrador;
    }

    public void setIdadmistrador(int idadmistrador) {
        this.idadmistrador = idadmistrador;
    }

}

package DTO;


public class CadastroClientesDTO {
    private String nome, Telefone, Cpf,Rg ,Cidade, Email, Senha, Senha1  ;
    private int idClientes;

    
      @return 
     
    public String getNome() {
        return nome;
    }

    
      @param nome 
     
    public void setNome(String nome) {
        this.nome = nome;
    }

    
      @return 
     
    public String getTelefone() {
        return Telefone;
    }

    
      @param Telefone 
  
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

   
      @return 
    
    public String getCpf() {
        return Cpf;
    }

    
      @param Cpf 
    
    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    
      @return 
     
    public String getRg() {
        return Rg;
    }

   
      @param Rg 
     
    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    
      @return 
     
    public String getCidade() {
        return Cidade;
    }

    
      @param Cidade 
     
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

 
     @return 
     
    public String getEmail() {
        return Email;
    }

    
      @param Email 
    
    public void setEmail(String Email) {
        this.Email = Email;
    }

    
      @return 
     
    public String getSenha() {
        return Senha;
    }

    
     @param Senha 
     
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    
      @return 
     
    public String getSenha1() {
        return Senha1;
    }

  
     @param Senha1 
    
    public void setSenha1(String Senha1) {
        this.Senha1 = Senha1;
    }

    
      @return 
     
    public int getIdClientes() {
        return idClientes;
    }

    
      @param idClientes 
         public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public void setSenha(char[] senha) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
   
}
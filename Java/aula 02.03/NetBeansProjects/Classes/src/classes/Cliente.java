package classes;

public class Cliente {
  private int codigo;
  private String nome;
  private String email;
  private double telefone;
  private double CPF;

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", CPF=" + CPF + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public double getCPF() {
        return CPF;
    }

    public void setCPF(double CPF) {
        this.CPF = CPF;
    }
  
  public void cadastrar() { 
  }
  
   public void alterarDados() {     
  }
}

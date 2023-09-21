package classes;

public class Endereco {
private int codigo;
private double CEP;
private String bairro;
private String rua;
private String cidade;
private double numero;
private String complemento;

    @Override
    public String toString() {
        return "Endereco{" + "codigo=" + codigo + ", CEP=" + CEP + ", bairro=" + bairro + ", rua=" + rua + ", cidade=" + cidade + ", numero=" + numero + ", complemento=" + complemento + '}';
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getCEP() {
        return CEP;
    }

    public void setCEP(double CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
  
  public void buscarEnderecoPeloCEP() {
  }

  public void alterarDados() {
  } 
}

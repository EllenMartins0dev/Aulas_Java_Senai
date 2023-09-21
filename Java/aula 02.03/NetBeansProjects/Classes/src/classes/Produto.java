package classes;

public class Produto {
  private int codigo;
private double valor;
  private String categoria;
private double frete;

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", valor=" + valor + ", categoria=" + categoria + ", frete=" + frete + '}';
    }



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
  
  
  public void atualizarValor() {
  }
   public void atualizarCodigo() {  
  }
   
  public void alterarDados () { 
  }
  
   public void atualizarValidade () {  
  }
   
    public void calcularFrete() {
  } 
}

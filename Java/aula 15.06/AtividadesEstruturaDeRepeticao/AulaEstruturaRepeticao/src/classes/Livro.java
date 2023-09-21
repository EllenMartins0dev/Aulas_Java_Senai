
package classes;


public class Livro {
private String nome;
private double valor;
private int qtEmEstoque;

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQtEmEstoque() {
        return qtEmEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQtEmEstoque(int qtEmEstoque) {
        this.qtEmEstoque = qtEmEstoque;
    }

    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", valor=" + valor + ", qtEmEstoque=" + qtEmEstoque + '}';
    }



}

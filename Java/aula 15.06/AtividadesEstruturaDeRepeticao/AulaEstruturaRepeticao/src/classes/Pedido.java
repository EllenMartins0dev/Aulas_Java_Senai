
package classes;


public class Pedido {
private int qtdeItens;
private double total;

    public int getQtdeItens() {
        return qtdeItens;
    }

    public double getTotal() {
        return total;
    }

    public void setQtdeItens(int qtdeItens) {
        this.qtdeItens = qtdeItens;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Pedido(int qtdeItens, double total) {
        this.qtdeItens = qtdeItens;
        this.total = total;
    }

    
    
    public String toString() {
        return "Pedido{" + "qtdeItens=" + qtdeItens + ", total=" + total + '}';
    }



}

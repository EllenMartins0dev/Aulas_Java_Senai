package classes;

public class ItemPedido {

    private int id;
    private String produto;
    private String status;
    private String descricao;
    private double valor;
    private int quantidade;
    private double total;

    public void atualizarDescricao() {}

    public void atualizarQuantidade() {}

    public ItemPedido(int id, String descricao, double valor, int quantidade, double total, String produto, String status) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
        this.total = total;
        this.produto = produto;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotal() {
        return total;
    }

    public String getProduto() {
        return produto;
    }

    public String getStatus() {
        return status;
    }

    public void add(ItemPedido itemPedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}

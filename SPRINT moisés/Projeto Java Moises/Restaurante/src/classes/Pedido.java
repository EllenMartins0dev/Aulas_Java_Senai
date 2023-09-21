package classes;

import java.util.Date;

public class Pedido {

    private long id;
    private Date data;
    private double total;

    public boolean finalizarPedido() {
        return true;
    }

    public void cancelarPedido() {}



    public long getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public double getTotal() {
        return total;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    

    @Override
    public  String toString() {
        return "Pedido{" + "id=" + id  + ", data=" + data + ", total=" + total + '}';
    }
   
}

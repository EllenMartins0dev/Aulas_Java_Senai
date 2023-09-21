
package classes;


public class Prato {
private String descricao;
private double valorPorPessoa;
private String diaDaSemana;

    public Prato(String descricao, double valorPorPessoa, String diaDaSemana) {
        this.descricao = descricao;
        this.valorPorPessoa = valorPorPessoa;
        this.diaDaSemana = diaDaSemana;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorPorPessoa(double valorPorPessoa) {
        this.valorPorPessoa = valorPorPessoa;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    
    @Override
    public String toString() {
        return "Prato{" + "descricao=" + descricao + ", valorPorPessoa=" + valorPorPessoa + ", diaDaSemana=" + diaDaSemana + '}';
    }

    

}

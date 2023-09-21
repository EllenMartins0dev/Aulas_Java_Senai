
package classes;


public class Tarefa {
private String descricao;
private String prioridade;
private String status;

    public String getDescricao() {
        return descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Tarefa(String descricao, String prioridade, String status) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = status;
    }

    
    @Override
    public String toString() {
        return "Tarefa{" + "descricao=" + descricao + ", prioridade=" + prioridade + ", status=" + status + '}';
    }


}

package classes;

public class Tarefa {

    private String nome;
    private String prioridade;
    private String status;

    public Tarefa(String nome, String prioridade, String status) {
        this.nome = nome;
        this.prioridade = prioridade;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "nome=" + nome + ", prioridade=" + prioridade + ", status=" + status + '}';
    }
    
    
}

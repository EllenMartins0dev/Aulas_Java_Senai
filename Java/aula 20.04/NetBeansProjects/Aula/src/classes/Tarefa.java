package classes;

public class Tarefa {

    private String nome;
    private String prioridades;
    private String status;

    public Tarefa(String nome, String prioridades, String status) {
        this.nome = nome;
        this.prioridades = prioridades;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public String getPrioridades() {
        return prioridades;
    }

    public String getStatus() {
        return status;
    }
    
    
}

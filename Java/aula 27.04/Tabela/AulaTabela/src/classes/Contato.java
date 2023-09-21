package classes;

public class Contato {

    private String nome;
    private String telefone;
    private String categoria;
    private boolean whatsapp;

    public Contato(String nome, String telefone, String categoria, boolean whatsapp) {
        this.nome = nome;
        this.telefone = telefone;
        this.categoria = categoria;
        this.whatsapp = whatsapp;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isWhatsapp() {
        return whatsapp;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", telefone=" + telefone + ", categoria=" + categoria + ", whatsapp=" + whatsapp + '}';
    }
    
    
}

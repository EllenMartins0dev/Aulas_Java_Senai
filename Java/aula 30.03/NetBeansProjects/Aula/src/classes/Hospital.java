package classes;

import java.security.PrivateKey;

public class Hospital {
private String nome;
private String cidade;
private String bairro;
private int numeroEndereco;
private int numeroLeitos;

public void cadastrar(){};
public void desativar(){};

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public int getNumeroLeitos() {
        return numeroLeitos;
    }

    public void setNumeroLeitos(int numeroLeitos) {
        this.numeroLeitos = numeroLeitos;
    }

    
}

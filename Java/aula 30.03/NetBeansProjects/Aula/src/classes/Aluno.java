package classes;

import java.util.Random;

public class Aluno {
private String nome;
private String email;
private int idade;
private int RM;
private int telefone;

public void cadastrar(){};
public void desativar(){};

public void gerarRM(){
    Random gerador = new Random();
    for (int i = 0; i < 10; i++) {
            this.RM += gerador.nextInt();
        }
}
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRM() {
        return RM;
    }

    public void setRM(int RM) {
        this.RM = RM;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}

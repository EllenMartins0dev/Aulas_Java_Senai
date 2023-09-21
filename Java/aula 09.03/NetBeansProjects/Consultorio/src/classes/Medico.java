package classes;

public class Medico {
private int id;
private String nome;
private String email;
private int numeroCrm;
private boolean ativo;
private MedicoEspecialidade medicoEspecialidade;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNumeroCrm() {
        return numeroCrm;
    }

    public void setNumeroCrm(int numeroCrm) {
        this.numeroCrm = numeroCrm;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public MedicoEspecialidade getMedicoEspecialidade() {
        return medicoEspecialidade;
    }

    public void setMedicoEspecialidade(MedicoEspecialidade medicoEspecialidade) {
        this.medicoEspecialidade = medicoEspecialidade;
    }


public void desativar(){
    
}

}

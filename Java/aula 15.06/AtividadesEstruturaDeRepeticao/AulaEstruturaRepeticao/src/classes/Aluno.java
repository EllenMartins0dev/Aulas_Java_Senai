
package classes;


public class Aluno {
private int id;
private String nome;
private String email;
private String ra;
private double media;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getRa() {
        return ra;
    }

    public double getMedia() {
        return media;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", ra=" + ra + ", media=" + media + '}';
    }

   

}

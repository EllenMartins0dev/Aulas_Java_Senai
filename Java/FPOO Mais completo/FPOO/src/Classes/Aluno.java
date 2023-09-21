

package Classes;

/**
 *
 * @author Moises
 */
public class Aluno {
    
    private String nome;
    private String email;
    private String ra;

    public Aluno(String nome, String email, String ra) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
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
    
    

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + '}';
    }
    
    
}


package classes;


public class Funcionario {
private String nome;
private String cargo;
private String departamento;

    public Funcionario(String nome, String cargo, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cargo=" + cargo + ", departamento=" + departamento + '}';
    }


}

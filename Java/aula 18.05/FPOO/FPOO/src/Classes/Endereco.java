package Classes;

/**
 *
 * @author Moises
 */
public class Endereco {

    private String cep;
    private String logradouro;
    private String complemento;

    public Endereco() {
    }

    public Endereco(String cep, String logradouro, String complemento) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
    }

    
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" + "cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento + '}';
    }

}

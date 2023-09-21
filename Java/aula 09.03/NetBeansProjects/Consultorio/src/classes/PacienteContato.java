package classes;

public class PacienteContato {
private int id;
private String telefoneCelular;
private String operadora;
private boolean whatsapp;
private boolean ativo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public boolean isWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(boolean whatsapp) {
        this.whatsapp = whatsapp;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
public void desativar(){
    
}


}

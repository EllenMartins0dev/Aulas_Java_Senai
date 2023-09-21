
package classes;


public class Carro {
private int id;
private String modelo;
private String cor;
private String placa;
private double mediaKmPorLitro;

    public Carro(int id, String modelo, String cor, String placa, double mediaKmPorLitro) {
        this.id = id;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.mediaKmPorLitro = mediaKmPorLitro;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMediaKmPorLitro(double mediaKmPorLitro) {
        this.mediaKmPorLitro = mediaKmPorLitro;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public double getMediaKmPorLitro() {
        return mediaKmPorLitro;
    }

  
    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", modelo=" + modelo + ", cor=" + cor + ", placa=" + placa + ", mediaKmPorLitro=" + mediaKmPorLitro + '}';
    }


}

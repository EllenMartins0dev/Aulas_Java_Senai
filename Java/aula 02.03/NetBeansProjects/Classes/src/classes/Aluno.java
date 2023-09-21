package classes;

public class Aluno {

    private double nota1;
    private double nota2;
    private int faltas;
    private double media;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
   
    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
     public void calcularMedia() {
      this.media = (this.nota1 + this.nota2)/2;
    }
}

package excecoes;

public class Exception01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(10, 5);
        int  resultado = calculadora.dividir();
        System.out.println("O resultado da divisao é:" + resultado);
        
        Calculadora calculadoraErro = new Calculadora(10, 0);
        int resultadoErro = calculadoraErro.dividir();
        
        System.out.println("O resultado da divisão é" + resultadoErro);
    }
}

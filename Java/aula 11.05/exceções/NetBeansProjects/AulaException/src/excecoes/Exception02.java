package excecoes;

public class Exception02 {
    public static void main(String[] args) {
        
        try {
            Calculadora calculadora = new  Calculadora(10, 0);
            int resultado = calculadora.dividir();
            System.out.println("O resultado é" + resultado);
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao realizar a divisao");
            System.err.println("ERRO:"+ e.getMessage());
        }
        
    }
}

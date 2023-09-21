
package TratamentoErros;

import Classes.Calculadora;

/**
 *
 * @author Moises
 * 
 * Exemplo de como tratar a divisão por zero, ou resolver problemas de código
 * inesperado na programação.
 * Utilização de try/catch
 */
public class Exception02 {
    
    public static void main(String[] args) {
        
        try {
            Calculadora calculadora = new Calculadora(10, 0);
            int resultado = calculadora.dividir();
            
            System.out.println("O resultado da divisao e: " + resultado);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao realizar a divisao");
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}

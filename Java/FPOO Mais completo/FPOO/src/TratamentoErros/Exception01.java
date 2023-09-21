
package TratamentoErros;

import Classes.Calculadora;

/**
 *
 * @author Moises
 * 
 * Exemplo de erro que pode acontecer ao utilizar um código inexperado.
 * No caso uma divisão por zero
 */
public class Exception01 {
    
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora(10, 20);
        int resultado = calculadora.dividir();
        System.out.println("O resultado da divisao e: " + resultado);
        
        Calculadora calculadoraErro = new Calculadora(10, 0);
        int resultadoErro = calculadoraErro.dividir();
        System.out.println("O resultado da divisao e: " + resultadoErro);
    }
    
}

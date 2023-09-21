
package TratamentoErros;

import Classes.Calculadora;
import java.util.Scanner;

/**
 *
 * @author Moises
 * 
 * Exemplo de cálculo de dois numeros obtendo as entradas pelo Scanner.
 * Neste caso existe um problema, pois se ocorrer uma exceção o Scanner
 * ficará aberto dependo do Sistema encerrá-lo.
 */
public class Exception03 {
    
    public static void main(String[] args) {
                
        try {
            Scanner entrada = new Scanner(System.in);

            System.out.println("-----Calculadora de Divisao-----");
            
            System.out.println("Informe o primeiro numero");
            int numero1 = entrada.nextInt();
            
            System.out.println("Informe o segundo numero");
            int numero2 = entrada.nextInt();
            
            Calculadora calculadora = new Calculadora(numero1, numero2);
            int resultado = calculadora.dividir();
            
            System.out.println("O resultado da divisao e: " + resultado);
            
            entrada.close();
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao realizar a divisao");
            System.out.println("ERRO: " + e.getMessage());
        }
    }
    
}

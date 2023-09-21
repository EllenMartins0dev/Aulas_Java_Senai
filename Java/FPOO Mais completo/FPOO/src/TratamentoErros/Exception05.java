package TratamentoErros;

import Classes.Calculadora;
import java.util.Scanner;

/**
 *
 * @author Moises
 * 
 * Exemplo de calculo de dois numeros com entrada de dados pelo Scanner.
 * Neste exemplo o metodo utilizado informe que pode ser lançada uma
 * exception, então é tratado com try/catch/finally
 */
public class Exception05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("-----Calculadora de Divisao-----");

        System.out.println("Informe o primeiro numero");
        int numero1 = entrada.nextInt();

        System.out.println("Informe o segundo numero");
        int numero2 = entrada.nextInt();

        Calculadora calculadora = new Calculadora(numero1, numero2);
        
        try {
            int resultado = calculadora.dividirT();            
            System.out.println("O resultado da divisao e: " + resultado);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao realizar a divisao");
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            entrada.close();
            System.out.println("Finalizado o Scanner");
        }
        
    }

}

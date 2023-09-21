package excecoes;

import java.util.Scanner;

public class Exception03 {
    public static void main(String[] args) {
        
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("--Calculadora de Divisao--");
            
            System.out.println("Inforne o primeiro numero");
            int numero1 = entrada.nextInt();
            
            System.out.println("Informe o segundo numero");
            int numero2 = entrada.nextInt();
            
            Calculadora calculadora = new Calculadora(numero1, numero2);
            int resultado = calculadora.dividir();
            
            System.out.println("O resultado da divisao eh:" + resultado);
            
            entrada.close();
            
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao realizar a divisao");
            System.err.println("ERRO:" + e.getMessage());
        }
        
        
    }
}

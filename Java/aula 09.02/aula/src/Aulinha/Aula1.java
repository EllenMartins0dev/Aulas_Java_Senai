/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aulinha;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        int temperatura = scanner.nextInt();
        switch (temperatura) {
            case 32:
                System.out.println("Está muito quente!");
            break;
            case 19:
                System.out.println("Está quente!");
            break;
            case 15:
                System.out.println("Está agradável!");
            break;
            case 10:
                System.out.println("Está um pouco frio.");
            case 7:
                System.out.println("Está muito frio.");
            break;
            
            default:
                System.out.println("Temperatura não informada.");
            
        }
    }
    
}

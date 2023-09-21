

package Aulinha;

import javax.swing.JOptionPane;


public class Aula4 {
    public static void main(String[] args) {
        
        String tituloAlerta = "Temperatura";
        String mensagem = "Qual a temperatura de hoje";
        
        String resposta = JOptionPane.showInputDialog(null, mensagem,
                tituloAlerta, JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("Temperatura: " + resposta);
        
    }
    
}

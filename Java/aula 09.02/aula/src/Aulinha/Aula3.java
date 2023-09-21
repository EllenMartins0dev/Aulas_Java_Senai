

package Aulinha;

import javax.swing.JOptionPane;


public class Aula3 {
    public static void main(String[] args) {
        String tituloAlerta = "ERR0R_MESSAGE";
        String mensagemAlerta = "GIV3 MW Y0UR KR0MER $$!!!! [original 1999]";
        String[] opcoes = { "YES", "Y3S" };
        
        int resposta = JOptionPane.showOptionDialog(null, 
        mensagemAlerta, tituloAlerta,
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
        null, opcoes, opcoes[0]);
        
        System.out.println("RESPOSTA:" + resposta);
                
        
        
        
        
    }

}

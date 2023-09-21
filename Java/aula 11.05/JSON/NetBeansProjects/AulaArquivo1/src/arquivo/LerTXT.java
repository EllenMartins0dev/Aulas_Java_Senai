
package arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LerTXT {
    public static void main(String[] args) {
          String caminhoDoArquivo = System.getProperty("user.dir") + "/src/arquivo/arquivo01.txt";
        FileReader leitorTXT = null;
        
        try {
            leitorTXT = new FileReader(caminhoDoArquivo);
            BufferedReader conteudo = new BufferedReader(leitorTXT);
            
            String linha = conteudo.readLine();
            
            while (linha != null) {                
                System.out.println("linha");
                linha = conteudo.readLine();
            }
            
        } catch (IOException e) {
            System.out.println("Erro ao realizar a leitura do arquivo");
            System.err.println("ERRO: " + e.getMessage());
        } finally {
            try {
                if (leitorTXT != null) {
                    leitorTXT.close();
                }
            } catch (IOException e) {
                System.out.println("Houve erro ao fechar o leitor");
            }
        }
        
    }
}

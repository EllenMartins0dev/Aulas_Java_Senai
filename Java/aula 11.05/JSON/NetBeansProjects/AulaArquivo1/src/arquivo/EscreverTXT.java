
package arquivo;

import java.io.FileWriter;
import java.io.IOException;


public class EscreverTXT {
  public static void main(String[] args) {
        
        String caminhoDoArquivo = System.getProperty("user.dir") + "/src/arquivo/arquivo01.txt";
        FileWriter escritorTxt = null;
        
        try {
            escritorTxt = new FileWriter(caminhoDoArquivo);
            String conteudo = "Nosso time de DEV do SESI é \n DEMAAAAIS";
            escritorTxt.write(conteudo);
            
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo");
            System.err.println("ERRO:"+ e.getMessage());
            
        } finally {
            try {
                if (escritorTxt != null) {
                escritorTxt.close();
            }
            } catch (IOException e) {
            System.out.println("Ocorreu um erro ao fechar o arquivo");
            }
        }
        
    }
}

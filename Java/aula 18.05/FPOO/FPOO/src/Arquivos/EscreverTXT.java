

package Arquivos;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Moises
 */
public class EscreverTXT {
       
    public static void main(String[] args) {
        // Inicializando as variaveis de referencia
        String caminhoDoArquivo = System.getProperty("user.dir") + "/src/Arquivos/arquivo01.txt";
        FileWriter escritorTxt = null;
        
        try {
            escritorTxt = new FileWriter(caminhoDoArquivo);
            String conteudo = "Conteudo do meu arquivo txt\nSomos desenvolvedores excelentes";
            escritorTxt.write(conteudo);
        } catch (IOException e) {
            System.out.println("Erro ao escrever arquivo TXT");
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                if (escritorTxt != null) {
                    escritorTxt.close();
                }
            } catch (IOException ex) {
                System.out.println("Erro ao fechar arquivo");
            }
        }
    }        
}

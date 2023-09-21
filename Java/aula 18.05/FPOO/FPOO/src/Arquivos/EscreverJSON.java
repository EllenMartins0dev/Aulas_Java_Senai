

package Arquivos;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

/**
 *
 * @author Moises
 */
public class EscreverJSON {
    
    public static void main(String[] args) {
        // Inicializando as variaveis de referencia
        String caminhoDoArquivo = System.getProperty("user.dir") + "/src/Arquivos/cidade.json";
        JSONObject arquivo = new JSONObject();
        FileWriter fileWriter = null;
        
        // Escrevendo o conteudo no json object
        arquivo.put("cidade", "Piracicaba");
        arquivo.put("bairro", "Centro");
        arquivo.put("estado", "SP");
        
        try {
            fileWriter = new FileWriter(caminhoDoArquivo);
            String conteudoArquivo = arquivo.toJSONString();
            fileWriter.write(conteudoArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao escrever arquivo JSON");
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();    
                }
            } catch (IOException ex) {
                System.out.println("Erro ao fechar arquivo");
            }
        }
    }
}


package arquivo;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;


public class EscreverJSON {
    public static void main(String[] args) {
        
           String caminhoDoArquivo = System.getProperty("user.dir") +
                   "/src/arquivo/cidade.json";
           
           JSONObject arquivo = new JSONObject();
           FileWriter escritorJSON = null;
        
           arquivo.put("cidade", "Piracicaba");
           arquivo.put("bairro", "Campestre");
           arquivo.put("estado", "SP");
           
           try {
            escritorJSON = new FileWriter(caminhoDoArquivo);
            String conteudo = arquivo.toJSONString();
            escritorJSON.write(conteudo);
            
        } catch (IOException e) {
               System.out.println("Erro ao criar o arquivo");
               System.err.println("ERRO: " + e.getMessage());
        } finally {
               try {
                   if (escritorJSON != null) {
                      escritorJSON.close();
                   }
               } catch (IOException e) {
                   System.err.println("Erro ao fechar escritor");
               }
        }
    }
}

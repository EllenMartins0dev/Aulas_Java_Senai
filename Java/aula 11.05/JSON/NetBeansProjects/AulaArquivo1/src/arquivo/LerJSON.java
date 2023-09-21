
package arquivo;

import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class LerJSON {
    public static void main(String[] args) {
        
           String caminhoDoArquivo = System.getProperty("user.dir") +
                   "/src/arquivo/cidade.json";
           JSONParser conversor = new JSONParser();
           FileReader leitor = null;
           
           
           try {
            leitor = new FileReader(caminhoDoArquivo);
               JSONObject arquivo = (JSONObject) conversor.parse(leitor);
               String cidade = (String) arquivo.get("cidade");
               String bairro = (String) arquivo.get("bairro");
               String estado = (String) arquivo.get("estado");
             
               System.out.println("cidade: " + cidade + "\n" + "bairro: " + bairro + "\n" + "estado: " + estado);
               leitor.close();
               
        } catch (Exception e) {
            
        } finally {
               
        }
           
        
    }
}

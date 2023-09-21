

package Arquivos;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Moises
 */
public class LerJSON {
    
    public static void main(String[] args) {
        // Inicializando as variaveis de referencia
        String caminhoDoArquivo = System.getProperty("user.dir") + "/src/Arquivos/cidade.json";
        JSONParser conversor = new JSONParser();
        FileReader leitor = null;
        
        try {
            leitor = new FileReader(caminhoDoArquivo);
            JSONObject arquivo = (JSONObject) conversor.parse(leitor);
            
            String cidade = (String) arquivo.get("cidade");
            String bairro = (String) arquivo.get("bairro");
            String estado = (String) arquivo.get("estado");
            
            System.out.println("CIDADE: " + cidade);
            System.out.println("ESTADO: " + estado);
            System.out.println("BAIRRO: " + bairro);
        } catch (IOException | ParseException e) {
            System.out.println("Erro ao ler arquivo JSON");
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                if (leitor != null) {
                    leitor.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar arquivo");
            }
        }
    }
}

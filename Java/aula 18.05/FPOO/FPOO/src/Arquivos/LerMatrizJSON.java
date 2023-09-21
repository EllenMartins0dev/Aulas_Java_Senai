

package Arquivos;

import Classes.Aluno;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Moises
 */
public class LerMatrizJSON {
    public static void main(String[] args) {
         // Inicializando as variaveis de referencia
        String caminhoDoArquivo = System.getProperty("user.dir") + "/src/Arquivos/alunos.json";        
        JSONParser conversor = new JSONParser();
        FileReader leitor = null;
        
        try {
            leitor = new FileReader(caminhoDoArquivo);
            JSONArray arquivo = (JSONArray) conversor.parse(leitor);
            
            for (int i = 0; i < arquivo.size(); i++) {
                JSONObject item = (JSONObject) arquivo.get(i);
                String nome = (String) item.get("nome");
                String email = (String) item.get("email");
                String ra = (String) item.get("ra");
                
                Aluno aluno = new Aluno(nome, email, ra);
                System.out.println(aluno);
            }
        }  catch (IOException | ParseException e) {
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

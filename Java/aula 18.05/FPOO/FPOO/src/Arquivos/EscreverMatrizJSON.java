

package Arquivos;

import Classes.Aluno;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Moises
 */
public class EscreverMatrizJSON {
    public static void main(String[] args) {
        // Inicializando as variaveis de referencia
        String caminhoDoArquivo = System.getProperty("user.dir") + "/src/Arquivos/alunos.json";        
        JSONArray arquivo = new JSONArray();
        FileWriter fileWriter = null;
        
        // Criando alunos e vetor
        Aluno aluno1 = new Aluno("Joao", "joao@gmail.com", "1234");
        Aluno aluno2 = new Aluno("Pedro", "pedro@gmail.com", "5678");
        Aluno aluno3 = new Aluno("Maria", "maria@gmail.com", "8907");
        
        Aluno[] alunos = {aluno1, aluno2, aluno3};
        
        // Escrevendo conteudo no array
        for (Aluno aluno : alunos) {
            JSONObject item = new JSONObject();
            item.put("nome", aluno.getNome());
            item.put("email", aluno.getEmail());
            item.put("ra", aluno.getRa());
            
            arquivo.add(item);
        }
        
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

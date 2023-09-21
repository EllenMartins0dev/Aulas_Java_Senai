package Arquivos;

import Classes.Endereco;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LerMatrizJSON2 {

    public static void main(String[] args) {
        String caminho = System.getProperty("user.dir")
                + "/src/Arquivos/enderecos.json";
        JSONParser conversor = new JSONParser();
        FileReader leitor = null;

        try {
            leitor = new FileReader(caminho);
            JSONArray conteudo = (JSONArray) conversor.parse(leitor);

            for (int i = 0; i < conteudo.size(); i++) {
                JSONObject item = (JSONObject) conteudo.get(i);
                String cep = (String) item.get("cep");
                String logradouro = (String) item.get("logradouro");
                String complemento = (String) item.get("complemento");
                
                Endereco endereco = new Endereco(cep, logradouro, complemento);
                System.out.println(endereco);
            }

        } catch (IOException | ParseException e) {
 System.out.println("Erro ao escrever arquivo");
            System.err.println(e.getMessage());
        } finally {
            try {
                if (leitor != null) {
                    leitor.close();
                }
            } catch (Exception e) {
            }
        }

    }
}

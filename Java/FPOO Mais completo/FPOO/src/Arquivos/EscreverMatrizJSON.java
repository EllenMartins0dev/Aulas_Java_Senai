package Arquivos;

import Classes.Endereco;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class EscreverMatrizJSON {

    public static void main(String[] args) {
        // Inicializando as variaveis de referencia
        String caminho = System.getProperty("user.dir") + "/src/Arquivos/enderecos.json";
        JSONArray arquivo = new JSONArray();
        FileWriter fileWriter = null;

        // Criando vetor de endereços com as informações
        Endereco enderecoCaio = new Endereco(
                "13400123", "Rua Dez, 345",
                "Perto do supermercado");
        Endereco enderecoEllen = new Endereco("13900456",
                "Av Batata Frita, 12", "Perto do Sesi");

        Endereco[] enderecos = {
            enderecoCaio, enderecoEllen
        };

        // Escrevendo dados do conteudo
        for (Endereco endereco : enderecos) {
            JSONObject item = new JSONObject();
            item.put("cep", endereco.getCep());
            item.put("logradouro", endereco.getLogradouro());
            item.put("complemento", endereco.getComplemento());

            arquivo.add(item);
        }

        try {
            fileWriter = new FileWriter(caminho);
            String conteudoSalvar = arquivo.toJSONString();
            fileWriter.write(conteudoSalvar);
        } catch (IOException e) {
            System.out.println("Erro ao escrever arquivo");
            System.err.println(e.getMessage());
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (Exception e) {
            }
        }
    }
}

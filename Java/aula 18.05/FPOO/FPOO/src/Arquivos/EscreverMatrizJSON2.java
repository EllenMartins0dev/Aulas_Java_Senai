package Arquivos;

import Classes.Endereco;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class EscreverMatrizJSON2 {

    public static void main(String[] args) {
        //Inicializando as variáveis de referência
        String caminho = System.getProperty("user.dir") + 
                "/src/Arquivos/enderecos.json";
        JSONArray arquivo = new JSONArray();
        FileWriter fileWriter = null;

        //Criando o vetor de endereços com as informações
        Endereco enderecoCaio = new Endereco("134.001-23",
                "Rua Dez, 345", "Perto do supermercado");

        Endereco enderecoEllen = new Endereco("134.004-56",
                "Av. Batata Frita, 12", "Perto do Sesi");

        Endereco[] enderecos = {
            enderecoCaio, enderecoEllen
        };

        //Escrevendo dados do conteudo
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
            } catch (IOException e) {
                System.out.println("Erro o fechar o arquivo");
                System.err.println(e.getMessage());
            }
        }
    }
}

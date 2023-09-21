package Bibliotecas.Http;

import Classes.Endereco;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Moises
 */
public class Http03 {

    public static void main(String[] args) {
        String CEP = "13401739";
        String urlApi = "https://viacep.com.br/ws/" + CEP + "/json/";
        HttpURLConnection connection = null;
        BufferedReader bufferedReader = null;

        try {
            // Cria uma referencia para obj URL e abre a conexao
            URL url = new URL(urlApi);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("accept", "application/json");

            if (connection.getResponseCode() != 200) {
                System.out.println("Erro " + connection.getResponseCode() + " ao obter dados da URL " + url);
            }

            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
            bufferedReader = new BufferedReader(inputStreamReader);

            String linha = bufferedReader.readLine();
            String conteudo = "";

            while (linha != null) {
                conteudo += linha;
                linha = bufferedReader.readLine();
            }

//            System.out.println(conteudo);
            
            /*
            {  "cep": "13401-739",  "logradouro": "Rua Vitalino Michelini",  
            "complemento": "(Jardim Laranjal II)",  "bairro": "Campestre",  
            "localidade": "Piracicaba",  "uf": "SP",  "ibge": "3538709",  
            "gia": "5356",  "ddd": "19",  "siafi": "6875"
            }
            */
            
            Gson gson = new Gson();
            Endereco endereco = gson.fromJson(new String(conteudo.getBytes()), Endereco.class);
            
            System.out.printf("%s%s\n", "Dados encontrados do CEP: ", endereco.getCep());
            System.out.printf("%s%s\n", "Logradouro: ", endereco.getLogradouro());
            System.out.printf("%s%s\n", "Complemento: ", endereco.getComplemento());
            
            
        } catch (IOException e) {
            System.out.println("Erro ao fazer leitura de dados");
            System.err.println("ERRO: " + e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception e) {
                    System.out.println("Erro ao fechar stream");
                }
            }

            if (connection != null) {
                try {
                    connection.disconnect();
                } catch (Exception e) {
                }
            }
        }
    }

}

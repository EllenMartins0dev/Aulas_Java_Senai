package Bibliotecas.Http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Moises
 */
public class Http02 {

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
            
            JSONParser conversor = new JSONParser();
            JSONObject jSONObject = (JSONObject) conversor.parse(conteudo);
            
            /*
            {  "cep": "13401-739",  "logradouro": "Rua Vitalino Michelini",  
            "complemento": "(Jardim Laranjal II)",  "bairro": "Campestre",  
            "localidade": "Piracicaba",  "uf": "SP",  "ibge": "3538709",  
            "gia": "5356",  "ddd": "19",  "siafi": "6875"
            }
            */
            String cepN = (String) jSONObject.get("cep");
            String logradouro = (String) jSONObject.get("logradouro");
            String complemento = (String) jSONObject.get("complemento");
            
            System.out.printf("%s%s\n", "Dados encontrados do CEP: ", cepN);
            System.out.printf("%s%s\n", "Logradouro: ", logradouro);
            System.out.printf("%s%s\n", "Complemento: ", complemento);
            
            
        } catch (IOException | ParseException e) {
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

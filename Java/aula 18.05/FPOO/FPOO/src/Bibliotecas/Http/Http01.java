

package Bibliotecas.Http;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Moises
 * https://www.devmedia.com.br/classe-inputstream-e-outputstream-em-java/32007
 */
public class Http01 {
    public static void main(String[] args) {
        String CEP = "13401739";
        String urlApi = "https://viacep.com.br/ws/" + CEP + "/json/";
        InputStream responseStream = null;

        try {
            // Cria uma referencia para obj URL e abre a conexao
            URL url = new URL(urlApi);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("accept", "application/json");
            
            // Faz a consulta na api
            responseStream = connection.getInputStream();
            
            // Fazenda a leitura do resultado 
            int resultado = responseStream.read();
            
            while (resultado != -1) {
//                System.out.println(resultado);
                System.out.println((char) resultado);
                resultado = responseStream.read();
            }
        } catch (IOException e) {
            System.out.println("Erro ao fazer leitura de dados");
            System.err.println("ERRO: " + e.getMessage());
        } finally {
            if (responseStream != null) {
                try {
                    responseStream.close();
                } catch (Exception e) {
                    System.out.println("Erro ao fechar stream");
                }
            }
        }
    }
}

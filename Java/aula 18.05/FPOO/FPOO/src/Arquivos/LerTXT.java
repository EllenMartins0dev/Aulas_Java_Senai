package Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Moises
 */
public class LerTXT {

    public static void main(String[] args) {
        // Inicializando as variaveis de referencia
        String caminhoDoArquivo = System.getProperty("user.dir") + "/src/Arquivos/arquivo01.txt";
        FileReader leitorTxt = null;

        try {
            leitorTxt = new FileReader(caminhoDoArquivo);
            BufferedReader conteudo = new BufferedReader(leitorTxt);

            String linha = conteudo.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = conteudo.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao fazer a leitura do arquivo TXT");
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            try {
                if (leitorTxt != null) {
                    leitorTxt.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar arquivo TXT");
            }
        }
    }
}

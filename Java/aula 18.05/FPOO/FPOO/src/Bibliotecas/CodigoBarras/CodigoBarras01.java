package Bibliotecas.CodigoBarras;

import java.io.File;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;

/**
 *
 * @author Moises
 */
public class CodigoBarras01 {

    public static void main(String[] args) {
        // Criando as referencias para as variaveis
        String numeroIdentificador = String.valueOf(System.currentTimeMillis());
        String nomeImagem = numeroIdentificador.concat(".png");
        String caminhoImagem = System.getProperty("user.dir") + "/src/Bibliotecas/CodigoBarras/" + nomeImagem;
        Barcode codigoBarras = null;

        try {
            codigoBarras = BarcodeFactory.createCode128(numeroIdentificador);
            File imagem = new File(caminhoImagem);
            BarcodeImageHandler.savePNG(codigoBarras, imagem);
            
        } catch (BarcodeException | OutputException e) {
            System.out.println("Erro ao gerar codigo de barras");
            System.err.println("ERRO " + e.getMessage());
        }
    }
}

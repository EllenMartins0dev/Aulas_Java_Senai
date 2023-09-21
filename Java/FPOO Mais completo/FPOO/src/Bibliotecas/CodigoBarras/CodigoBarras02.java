package Bibliotecas.CodigoBarras;

import java.io.File;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;

public class CodigoBarras02 {
    public static void main(String[] args) {
        String numeroCodigo = String.valueOf(System.currentTimeMillis());
        String nomeDaImagem = numeroCodigo + ".png";
        String caminhoImagem = System.getProperty("user.dir") + 
                "/src/Bibliotecas/CodigoBarras/" + nomeDaImagem;
        Barcode codigoBarras = null;
        
        try {
            codigoBarras = BarcodeFactory.createCode128(numeroCodigo);
            File imagem = new File(caminhoImagem);
            BarcodeImageHandler.savePNG(codigoBarras, imagem);
        } catch (BarcodeException | OutputException e) {
            System.out.println("Erro ao gerar barcode");
            System.err.println(e.getMessage());
        }
    }
}

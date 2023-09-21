

package Classes;

/**
 *
 * @author Moises
 */
public class Calculadora {
    
    private int numero1;
    private int numero2;

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    /**
     * Método que faz a divisão de dois números
     * 
     * @return 
     */
    public int dividir() {
        int resultado = this.numero1 / this.numero2;
        return resultado;
    }
    
    /**
     * Método que faz a divisão entre dois números e pode lançar uma exceção
     * @return
     * @throws Exception 
     */
    public int dividirT() throws Exception {
        int resultado = this.numero1 / this.numero2;
        return resultado;
    }
    
}

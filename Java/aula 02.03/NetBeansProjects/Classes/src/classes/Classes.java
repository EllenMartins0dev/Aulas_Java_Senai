/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente cliente = new Cliente();
        cliente.setCodigo(1);
        cliente.setEmail("Cliente1@gmail.com");
        cliente.setNome("Cliente1");
        cliente.setTelefone(34212334);
        cliente.setCPF(234234234-9);
      
        System.out.println("Cliente" + cliente);
        
         Produto produto = new Produto();
         produto.setCodigo(1);
         produto.setValor(45.99);
         produto.setCategoria("Biscoitos");
         produto.setFrete(30);
         
        System.out.println("Produto" + produto);
        
        
         Endereco endereco = new Endereco();
         endereco.setCodigo(1);
         endereco.setCEP(123432-34);
         endereco.setBairro("Cecap");
         endereco.setRua("Manuel");
         endereco.setCidade("Gomes");
         endereco.setNumero(69);
         endereco.setComplemento("Casa da sua mãe");
 
         System.out.println("Endereco" + endereco);
}
}
      

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor;

/**
 *
 * @author Aluno
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] idades = {10, 12, 34, 56, 89};
        
        for (int i = 0; i < idades.length; i++) {
            int idade = idades[i];
                System.out.println(idade);
            }
        
        Alunos aluno1 = new Alunos();
        aluno1.setNome ("Ana");
        aluno1.setIdade(15);
        aluno1.setCPF("123.234.567-60");
        
        Alunos aluno2 = new Alunos();
        aluno2.setNome ("Pedro");
        aluno2.setIdade(16);
        aluno2.setCPF("125.234.597-80");
     
         Alunos aluno3 = new Alunos();
        aluno3.setNome ("Miguel");
        aluno3.setIdade(14);
        aluno3.setCPF("174.347.4567-13");
        
Alunos[] alunosLista = {aluno1, aluno2, aluno3};
for (int i = 0; i < alunosLista.length; i++) {
    Alunos a = alunosLista[i];
    System.out.println("Aluno:" + a.getNome());
}
        }
    
     

}
    



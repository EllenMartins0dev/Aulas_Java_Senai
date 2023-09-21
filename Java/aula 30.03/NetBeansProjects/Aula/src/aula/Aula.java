/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula;

import classes.Aluno;
import classes.Hospital;
import classes.Pessoa;

/**
 *
 * @author Aluno
 */
public class Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno = new Aluno();
        aluno.setNome("Joao");
        aluno.setIdade(15);
        aluno.setEmail("joaozinhogameplays@gmail.com");
        aluno.setTelefone(992345690);
        aluno.gerarRM();
        
         System.out.println("Nome: " + aluno.getNome());
          System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Email: " + aluno.getEmail());
         System.out.println("Telefone: " + aluno.getTelefone());
        System.out.println("RM aluno: "+ aluno.getRM());
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Daniel");
        pessoa.setIdade(17);
        pessoa.setCPF(46015011-87);
        pessoa.setTelefone(981901976);
        pessoa.setCidade("Piracicaba");
        
        System.out.println("Nome: " + pessoa.getNome());
          System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("CPF: " + pessoa.getCPF());
         System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Cidade: "+ pessoa.getCidade());
        
        Hospital hospital = new Hospital();
        hospital.setNome("Unimed");
        hospital.setCidade("Pindamonhangaba");
        hospital.setBairro("Dr. Francisco Redes");
        hospital.setNumeroEndereco(3456);
        hospital.setNumeroLeitos(2345);
    }
    
}

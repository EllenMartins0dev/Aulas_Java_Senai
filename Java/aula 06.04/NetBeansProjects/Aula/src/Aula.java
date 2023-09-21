/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import Aluno;

/**
 *
 * @author Aluno
 */
public class Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros   = {10,25,50,200,1000};
        double[] notas  = {1.26, 5.78, 9.20, 3.60, 5.32};  
        String[] animais  = {"cachorro", "gato", "leao", "passaro"};  
        boolean[] aprovado  = {true, true, false};
        
        
        //classe Aluno
    Aluno aluno1 = new Aluno();
    aluno1.setNome("Pedro");
    
    Aluno aluno2 = new Aluno();
    aluno2.setEmail("pedrinho@gmail.com");
    
    Aluno[] alunos = {aluno1, aluno2};
    
    
    //classe Carro
    Carro gol = new Carro();
    gol.setModelo("gol");
    
    Carro celta = new Carro();
    celta.setKmRodados(0);
    
    Carro[] carrosVetor = {gol, celta};
    
    
    //classe Animais
    Animal cachorro = new Animal();
    cachorro.setNome("cachorro");
    
     Animal gato = new Animal();
    gato.setNome("gato");
    
    Animal [] animaisVetor = {cachorro, gato};
    
    
    //classe Cidade
    Cidade blumenau = new Cidade();
    blumenau.setNome("Blumenau");
    
     Cidade piracicaba = new Cidade();
    piracicaba.setPrefeito("Luciano Almeida");
    
    Cidade[] cidadesVetor = {blumenau,piracicaba};
    
    }
}


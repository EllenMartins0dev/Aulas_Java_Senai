/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaestruturarepeticao;

import classes.Aluno;
import classes.Carro;
import classes.Pedido;
import classes.Tarefa;

/**
 *
 * @author Aluno
 */
public class AulaEstruturaRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //FOR
        for (int i = 0; i < 101; i++) {
            System.out.println("For 1: " + i);
        }

        for (int i = 100; i > -1; i--) {
            System.out.println("For 2: " + i);
        }

        //WHILE
        int controle = 200;
        while (controle < 501) {
            System.out.println("WHILE 2: " + controle);
            controle++;
        }

        int contador = 500;
        while (contador > 199) {
            System.out.println("WHILE 1: " + contador);
            contador--;
        }

        //Vetor Aluno
        Aluno aluno1 = new Aluno();
        aluno1.setId(1);
        aluno1.setNome("Pedro");
        aluno1.setEmail("pedro@gmail.com");
        aluno1.setRa("123904");
        aluno1.setMedia(5.99);

        Aluno aluno2 = new Aluno();
        aluno2.setId(2);
        aluno2.setNome("Paulo");
        aluno2.setEmail("paulo@gmail.com");
        aluno2.setRa("893120");
        aluno2.setMedia(8.34);

        Aluno aluno3 = new Aluno();
        aluno3.setId(3);
        aluno3.setNome("Carla");
        aluno3.setEmail("carla@gmail.com");
        aluno3.setRa("378341");
        aluno3.setMedia(9.27);

        Aluno aluno4 = new Aluno();
        aluno4.setId(4);
        aluno4.setNome("Paula");
        aluno4.setEmail("paula@gmail.com");
        aluno4.setRa("532092");
        aluno4.setMedia(6.01);

        Aluno aluno5 = new Aluno();
        aluno5.setId(5);
        aluno5.setNome("Elisa");
        aluno5.setEmail("elisa@gmail.com");
        aluno5.setRa("893120");
        aluno5.setMedia(3.62);

        Aluno aluno6 = new Aluno();
        aluno6.setId(6);
        aluno6.setNome("Valdo");
        aluno6.setEmail("valdo@gmail.com");
        aluno6.setRa("097365");
        aluno6.setMedia(2.89);

        Aluno alunos[] = {
            aluno1, aluno2, aluno3, aluno4, aluno5, aluno6
        };

        for (int i = 0; i < alunos.length; i++) {
            Aluno alunoLinha = alunos[i];
            if (alunoLinha.getMedia() > 6.00) {
                System.out.println("Aluno aprovado: " + alunoLinha.getNome());
            }
        }

        // imprime todos os nomes e propriedades
        int qtdeAlunos = alunos.length;
        int index = 0;
        while (index < qtdeAlunos) {
            Aluno alunoLinha = alunos[index];
            index++;
            if (alunoLinha.getMedia() < 6.00) {
                System.out.println("Aluno reprovado:" + alunoLinha.getNome());
            }
        }

        //Vetor Carro
        Carro carro1 = new Carro(10, "Gol", "azul", "RTO-2390", 4);
        Carro carro2 = new Carro(12, "Palio", "cinza", "CVT-1290", 5);
        Carro carro3 = new Carro(13, "Celta", "branco", "DGP-1253,", 9);
        Carro carro4 = new Carro(20, "Mobi", "vermelho", "EWQ-4123", 9);
        Carro carro5 = new Carro(32, "Opala", "amarelo", "JFQ-9563", 3);
        Carro carro6 = new Carro(72, "Parati", "verde", "RCM-2964", 7);

        Carro carros[] = {
            carro1, carro2, carro3, carro4, carro5, carro6
        };

        int qtdeCarros = carros.length;
        int position = 0;
        while (position < qtdeCarros) {
            Carro carroLinha = carros[position];
            position++;
            if (carroLinha.getMediaKmPorLitro() > 6.00) {
                System.out.println("Carros c/ alto rendimento:" + carroLinha.getModelo());
            }
        }

        for (int i = 0; i < carros.length; i++) {
            Carro carroLinha = carros[i];
            if (carroLinha.getMediaKmPorLitro() < 6.00) {
                System.out.println("Carros c/ baixo rendimento: " + carroLinha.getModelo());
            }
        }

        //Vetor Pedidos
        Pedido pedido1 = new Pedido(28, 290.56);
        Pedido pedido2 = new Pedido(16, 678.45);
        Pedido pedido3 = new Pedido(7, 348.90);
        Pedido pedido4 = new Pedido(12, 452.67);
        Pedido pedido5 = new Pedido(4, 264.02);
        Pedido pedido6 = new Pedido(62, 491.53);

        Pedido pedidos[] = {
            pedido1, pedido2, pedido3, pedido4, pedido5, pedido6};

        //Vetor Tarefa
        Tarefa tarefa1 = new Tarefa("Estudar JAVA", "maxima", "em andamento");
        Tarefa tarefa2 = new Tarefa("Praticar soft skills", "maxima", "em andamento");
        Tarefa tarefa3 = new Tarefa("Sair do celular", "maxima", "não iniciada");
        Tarefa tarefa4 = new Tarefa("Dormir 8 horas por dia", "maxima", "não iniciada");
        Tarefa tarefa5 = new Tarefa("Aprender a cozinhar", "media", "não iniciada");
        Tarefa tarefa6 = new Tarefa("Estudar HTML E CSS", "maxima", "em andamento");

        Tarefa tarefas[] = {
          tarefa1, tarefa2, tarefa3, tarefa4, tarefa5, tarefa6  
        };
        
         int qtdeTarefas = tarefas.length;
        int i = 0;
        while (i < qtdeTarefas) {
            Tarefa tarefaLinha = tarefas[i];
            i++;
            if (tarefaLinha.getStatus() == "em andamento") {
                System.out.println("Tarefas que estou fazendo: " + tarefaLinha.getDescricao());
            }
        }
        
        
         for (int o = 0; o < tarefas.length; o++) {
            Tarefa tarefaLinha = tarefas[o];
            if (tarefaLinha.getStatus() == "não iniciada") {
                System.out.println("Tarefas pendentes: " + tarefaLinha.getDescricao());
            }
        }
        
    }

}

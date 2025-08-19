//Diogo Gabriel Gouveia Clemente
//Exemplos usados:String (Diogo)
//notas 7,6,3,4,9,8,9,0,1,2,3,4,5

//4. Faça um programa que:
//● Receba as notas de 10 alunos em cinco provas diferentes e armazene-as em uma matriz 10 x 5.
//● Receba o nome dos 10 alunos e armazene-os em um vetor de string com 10 posições
//● Calcule e exiba o nome do aluno, a média das notas do mesmo e a situação:
//o Aprovado: média maior ou igual a 7
//o Reprovado: média menor que 4

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes_4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int[][] matriz_notas = new int[10][5];
        String[] aluno = new String[10];
        double[] medias = new double[10];
        double soma_turmas = 0;


        for (int i = 0; i < aluno.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            aluno[i] = in.nextLine();
        }


        for (int i = 0; i < 10; i++) {
            int soma = 0;
            for (int j = 0; j < 5; j++) {
                matriz_notas[i][j] = rnd.nextInt(0, 11);
                soma += matriz_notas[i][j];
            }
            medias[i] = soma / 5.0;
            soma_turmas += medias[i];
        }



        for (int i = 0; i < 10; i++) {
            String situacao;
            if (medias[i] >= 7) {
                situacao = "Aprovado";
            } else if (medias[i] < 4) {
                situacao = "Reprovado";
            } else {
                situacao = "Recuperação";
            }

            System.out.println("Aluno: "+aluno[i] +" Média: "+ medias[i]+ "Situação: "+  situacao);
        }


        double media_turma = soma_turmas / 10;
        System.out.println("Média geral da turma: " + media_turma);


        System.out.println("Matriz de notas :");
        for (int i = 0; i < 10; i++) {
            System.out.println(aluno[i] + " -> " + Arrays.toString(matriz_notas[i]));
        }
    }
}


//8. Fazer um algoritmo que:
//a. Leia um conjunto de valores inteiros correspondentes a 80 notas dos alunos de uma turma, notas
//estas que variam de 0 a 10;
//b. Calcule a frequência absoluta e a frequência relativa de cada nota;
//c. Imprima uma tabela contendo os valores das notas (de 0 a 10) e suas respectivas frequências
//absoluta e relativa.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Diogo_Vetores_8 {
    public static void preencher_vetor(){
        Random rand= new Random();
        int [] notas = new int[80];
        int [] frequencias = new int[80];
        int tabela ;



        for (int i = 0 ;i < 80; i++){
            int Nt = rand.nextInt(0,10);
            notas[i]= Nt;

        }
        System.out.println(Arrays.toString(notas));



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand= new Random();
        preencher_vetor();




    }
}
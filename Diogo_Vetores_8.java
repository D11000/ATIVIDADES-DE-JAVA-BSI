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
        int [] notas = new int[11];
        int []FreqAbs =new int[11];
        int []FreqRel = new int[11];
        int [] tabela= new int[11] ;
        int cont=0;



        for (int i = 0 ;i < 11; i++){
            int Nt = rand.nextInt(0,11);
            notas[i]= Nt;
            if ( notas[i] == 0){
                cont++;

            }
            else if (Nt == 1 ) {
                cont++;


            }
            else if (Nt == 2) {
                cont++;

            }
            else if (Nt == 3) {
                FreqAbs[3]++;

            }
            else if (Nt == 4) {
                FreqAbs[4]++;

            }
            else if (Nt == 6) {
                FreqAbs[5]++;

            }
            else if (Nt == 7) {
                FreqAbs[6]++;

            }
            else if (Nt == 8) {
                FreqAbs[7]++;

            }
            else if (Nt ==9) {
                FreqAbs[8]++;

            }
            else if (Nt == 10) {
                FreqAbs[9]++;

            }




        }
        System.out.println(cont);

        System.out.println(Arrays.toString(notas));
        System.out.println(Arrays.toString(FreqAbs));



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand= new Random();
        preencher_vetor();




    }
}
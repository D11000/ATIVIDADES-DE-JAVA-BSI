//Diogo Gabriel Gouveia Clemente
//Exemplos usados:


//6. Na teoria de sistemas define-se o elemento MINMAX de uma matriz como sendo o maior elemento da
//linha onde se encontra o menor elemento da matriz. Faça um programa que carregue uma matriz 4 x 7
//com números reias, calcule e mostre o MINMAX e sua posição (linha e coluna).

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes_6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int minmax=0;
        int[][] mtx = new int[4][7];
        for (int i =0 ;i< 4; i++){
            for (int j=0 ;j< 7; j++){
                mtx[i][j]=rnd.nextInt(0,10);

                System.out.print(mtx[i][j]+"\t");

            }
            System.out.println();

        }



    }
}


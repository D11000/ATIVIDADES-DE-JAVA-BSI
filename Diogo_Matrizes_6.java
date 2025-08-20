//Diogo Gabriel Gouveia Clemente
//Exemplos de teste usados:
//0 	1  Matriz 2X2
//0 	0


//7. Uma matriz quadrada de dimensão n é dita uma matriz permutação se em cada linha e em cada coluna
//houver n-1 elementos nulos e um único elemento igual à 1. Dada uma matriz digitada pelo usuário,
//informe se a mesma é ou não uma matriz permutação.
//Ex.: Matriz permutação:
// 0 0 0 1
// 1 0 0 0
// 0 1 0 0
// 0 0 1 0

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes_7 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz");
        int n = in.nextInt();
        int [][]mtz=new int[n][n];


        int cont=0;


        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){

                mtz[i][j]= rnd.nextInt(0,2);

                System.out.print(mtz[i][j]+ " \t");
            }
            System.out.println();
        }


        boolean col=false;
        boolean lin=false;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(mtz[i][j]==1) {
                    cont++;

                }
                if(cont == 1){
                    lin=true;


                }


            }


        }

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(mtz[i][j]==1) {
                    cont++;

                }
                if(cont == 1){
                    col=true;


                }


            }

        }
        if(col==true&&lin==true){
            System.out.println("A matriz é uma matriz permutação");
        }
        else {
            System.out.println("A matriz NÃO é  uma matriz permutação");
        }








    }





}

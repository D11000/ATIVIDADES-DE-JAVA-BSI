//Diogo Gabriel Gouveia Clemente
//Exemplos de teste usados:;
// 5	;6	;7	;10	;7	;10	;1	i
//;8	;8	;2	;10	;10	;2	;5	i
//;2	;9	;3	;8	;8	;4	;1	i
//;7	;2	;3	;2	;1	;8	;3	i
//linha 0 1 coluna 6
//O MINMAX está na coluna 3 e na linha 0 e é 10


//6. Na teoria de sistemas define-se o elemento MINMAX de uma matriz como sendo o maior elemento da
//linha onde se encontra o menor elemento da matriz. Faça um programa que carregue uma matriz 4 x 7
//com números reias, calcule e mostre o MINMAX e sua posição (linha e coluna).

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int  min= 0;
        int max=0;

        int[][] mtx = new int[4][7];

        int linhaMn = 0;
        int colunaMn=0;

        for (int i =0 ;i< 4; i++) {
            for (int j = 0; j < 7; j++) {
                mtx[i][j] = rnd.nextInt(1, 11);
                System.out.print(";" + mtx[i][j] + "\t");
            }System.out.println("i");

        }
        min= mtx[0][0];
        for (int i =0 ; i <4;i++){
            for (int j =0 ; j <7;j++){
                if(mtx[i][j]< min){
                    min=mtx[i][j];
                    linhaMn=i;
                    colunaMn=j;
                }

            }


        }
        System.out.println("linha"+ linhaMn+" " + min+" "+"coluna"+ colunaMn);
        max= mtx[linhaMn][0];
        int colunaMx=0;
        for (int i=0;i<7;i++){
            if (mtx[linhaMn][i] > max) {
                max = mtx[linhaMn][i];
                colunaMx= i;
            }

        }
        System.out.println("O MINMAX está na coluna " +colunaMx+ " e na linha " + linhaMn + " e é "+max  );




    }





}

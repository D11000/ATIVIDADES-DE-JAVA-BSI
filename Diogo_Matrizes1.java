//Diogo Gabriel
//Exemplos usados: [1,2] [3,4]

//1. Faça um programa que preencha uma matriz 2 x 2, calcule e mostre uma matriz resultante que será a
//matriz digitada multiplicada pelo maior elemento da mesma.
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Diogo_Matrizes1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd= new Random();
        int [] [] m1 =new int[2][2] ;
        int maior=0;
        int [ ][]matrizResultado= new int[2][2];
        for (int i = 0 ; i < m1.length;i++){



            for(int j= 0 ; j <m1.length;j++){
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                m1[i][j]=in.nextInt();
                if (m1[i][j]> maior){
                    maior= m1[i][j];

                }
                matrizResultado[i][j]=m1[i][j]*maior;





            }


        }
        System.out.println(Arrays.deepToString(m1));
        //System.out.println(maior);
        System.out.println(Arrays.deepToString(matrizResultado));




    }
}


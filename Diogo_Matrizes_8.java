//Diogo Gabriel Gouveia Clemente
//Exemplos de teste usados:
//3,00	2,00	2,00	3,00	3,00	2,00	4,00	4,00
//4,00	1,00	3,00	4,00	2,00	1,00	1,00	1,00
//4,00	3,00	4,00	3,00	2,00	1,00	2,00	3,00
//2,00	3,00	3,00	3,00	1,00	3,00	3,00	1,00
//4,00	2,00	3,00	4,00	1,00	2,00	4,00	4,00
//3,00	1,00	1,00	4,00	2,00	1,00	4,00	2,00
//1,00	2,00	4,00	2,00	1,00	2,00	2,00	3,00
//1,00	3,00	2,00	2,00	3,00	1,00	3,00	4,00
//A matriz é simétrica.





//8. Faça um programa que carregue uma matriz 8 x 8 com números reais e mostre uma mensagem dizendo se
//a matriz é ou não simétrica. Uma matriz é simétrica se para todas as posições da mesma, tem-se a relação
//A[i][j] = A[j][i].
import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes_8 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        double [][]mt= new double[8][8];

        boolean simetrica =true;
        for(int i=0;i<mt.length;i++){
            for(int j=0;j<mt[i].length;j++){
                mt[i][j]=rnd.nextInt(1,10);
                System.out.printf("%.2f\t",mt[i][j] );

            }
            System.out.println();


        }

        for(int i=0;i< mt.length;i++){
            for(int j=0;j+1< mt[i].length;j++){

                if (mt[i][j] ==mt[j][i]){
                    simetrica=true;

                }
                else {
                    simetrica=false;

                }



            }

        }
        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        }
        else {
            System.out.println("A matriz não é simétrica.");
        }








    }





}

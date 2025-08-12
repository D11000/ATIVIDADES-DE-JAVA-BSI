//Diogo Gabriel Gouveia Clemente
//Exemplos usados:

//3. A produção diária de uma fábrica é armazenada, semana a semana, em uma tabela com o seguinte
//formato.

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Diogo_Matrizes_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Digite a quantidade de semanas: ");
        int semN= in.nextInt();
        int[][] prod=new int[semN][7];
        int []media=new int[semN];
       double prod_media=0;
        int []acima_media=new int[semN];
        int []dia_prod=new int[7];

        int pro_min=0;
        double med=0;
        for(int i= 0 ; i<semN;i++){
            for(int j=0;j <7;j++){
                System.out.println("Semana " + i + " Dia "+ j);

                prod [i][j]= rnd.nextInt(0 ,100);
                media[i]+=prod[i][j];
                med= media[i];

            }
            System.out.println();

        }
        prod_media=med/semN;
        System.out.println(Arrays.deepToString(prod));
        System.out.println(prod_media);
        for ( int i=0 ; i< semN ; i++){
            for (int j =0 ; j< 7;j++){
                if(prod_media> prod[i][j]){
                    acima_media[i]= prod[i][j];

                }
            }
        }

        System.out.println(Arrays.toString(acima_media));
        for ( int i=0 ; i< semN ; i++){
            for (int j =0 ; j< 7;j++){


                    if ( dia_prod[j] < prod[i][j]){
                        dia_prod[j]=prod[i][j];
                    System.out.println("Semana " + i+ "Dia "+ j);
                    }


            }
        }




    }
}
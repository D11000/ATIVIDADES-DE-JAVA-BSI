//Diogo Gabriel Gouveia Clemente
//Exemplos usados:5 , 2 e 3

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
        int acima_media=0;
        int dia_prodmin=0;
        int []dia= new int[7];
        int []pro_min= new int[7];
        double med=0;
        for(int i= 0 ; i<semN;i++){
            for(int j=0;j <7;j++){
                //System.out.println("Semana " + i + " Dia "+ j);

                prod [i][j]= rnd.nextInt(0 ,100);
                media[i]+=prod[i][j];
                med= media[i];

            }
            System.out.println();

        }
        prod_media=med/semN;
        //ystem.out.println(Arrays.deepToString(prod));
        System.out.println("A produção media é "+prod_media);
        System.out.println();
        for ( int i=0 ; i< semN ; i++){
            for (int j =0 ; j< 7;j++){


                if(prod[i][j]> prod_media){
                    acima_media++;


                }
            }
        }

        System.out.println("Dias com produção acima da media " + acima_media);
        System.out.println();

        for ( int i=0 ; i< semN ; i++){
            for (int j =0 ; j< 7;j++){


                pro_min[j]= Math.min(prod[i][j], prod[i][j]);
                if (prod[i][j] > pro_min[i]){
                    dia_prodmin++;
                }






                System.out.println("Semana " + i+ " Dia "+ dia_prodmin);



            }
            System.out.println();
        }
        //System.out.println(Arrays.toString(pro_min));




    }
}
//Diogo Gabriel Gouveia Clemente
//Exemplos usados:392	389	390	393	387	390	392	388	391	392	388	387	394	392	390	391	386	387	394	389	


//5. O desvio padrão de uma amostra de dados calcula o quanto de variação existe da amostra em relação à
//média.

// Valores baixos indicam que os dados tendem a estar próximos à média, por outro lado, valores
//altos indicam maior dispersão dos dados.

// O gerente de produção da Refrigerator Tabajará está avaliando o
//processo de fabricação de seus refrigerantes em lata, especificamente a etapa de preenchimento do
//conteúdo.

// As latas devem possuir 390 ml, com desvio padrão de + ou – 5 ml. Na análise foram coletadas
//20 amostras aleatórias das 6 linhas de produção da fábrica, medindo-se a quantidade de produto das
//mesmas.

// Você é o programador da empresa, e ficou incumbido de implementar um programa que auxilie

//seu gerente, mostrando ao mesmo a média e o desvio padrão de cada linha de produção.

//Além disso,exiba, se for o caso, qual das linhas de produção precisa ser revisada.


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes_5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int[][] amostra = new int[6][20];
        double media[]= new double[20];
        double media_total= 0;
        double sum = 0;
        double desvio_temp=0;

        double []desvio=new  double[20];
        System.out.println("Tabela de amostras");
        for (int i = 0 ; i< 6 ;i++){
            for (int j =0 ; j< 20 ;j++){

                amostra[i][j]= rnd.nextInt(385 , 395);
                System.out.print(amostra[i][j]+ "\t");
                media[i]+=amostra[i][j];
                sum=media[i];


            }
            System.out.println();


            media_total=sum/20;

            System.out.println("Media de produção da linha "+i+ " ;" + media_total);
            System.out .println();

        }

        media_total=sum/20;

        for(int i=0; i< amostra.length;i++){
            for (int j=0;j<20;j++){
                desvio_temp = amostra[i][j];

            }
        }




        for(int i= 0 ; i<amostra.length; i++){

            desvio[i]=Math.pow(amostra[i][i]-media_total, 2)/amostra.length;


            if( desvio[i] < 0.5){
                System.out.println("Desvio padrão de " + i +" "+ desvio[i]+ "Revisar");

            } System.out.println();

            if (desvio[i]>0.5 ) {
                System.out.println("Desvio padrão de " + i +" "+ desvio[i]+ " Revisar");
                System.out.println();




            }

            else {
                System.out.println("Desvio padrão de " + i +" "+ desvio[i]+ " OK");

            } System.out.println();
        }






    }
}


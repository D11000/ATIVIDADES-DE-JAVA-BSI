//14. O desvio padrão de uma amostra de dados calcula o quanto de variação existe da amostra em relação à
//média.
// Valores baixos indicam que os dados tendem a estar próximos à média, por outro lado, valores
//altos indicam maior dispersão dos dados. O gerente de produção da Refrigerator Tabajará está avaliando o
//processo de fabricação de seus refrigerantes em lata, especificamente a etapa de preenchimento do
//conteúdo.
// As latas devem possuir 390 ml, com desvio padrão de + ou – 5 ml. Na análise foram coletadas 20 amostras aleatórias da linha de produção, medindo-se a quantidade de produto das mesmas.

// Você é o programador da empresa, e ficou incumbido de implementar um programa que auxilie seu gerente,
//mostrando ao mesmo a média e o desvio padrão entre os elementos das amostras. Além disso, exiba se o
//processo deve ou não ser revisado

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Diogo_Vetores_14 {




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd= new Random();
        int[] vet = new int[5];
        double somedia=0;
        double media=0 ;
        double prod= 0 ;



        for (int i=0; i<5; i++){
             int vl = rnd.nextInt(390 , 395);
            vet[i]=vl ;


            somedia+=vet[i];

        }
        System.out.println(Arrays.toString(vet));
        media= somedia/5;
        System.out.println(media);

        for (int i =0; i<vet.length; i++){
            prod  += Math.pow(vet[i]-media, 2);
        }
        prod = Math.sqrt(prod/(vet.length-1));



        if ((media-prod) >= 390 && (media-prod) <= 395){
            System.out.println("Produção conforme os padrões");
            System.out.println("Valor :" + prod);

        }
        else {
            System.out.println("Revisar produção");
            System.out.println("Valor :" + prod);
        }





    }
}
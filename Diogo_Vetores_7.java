//7. Leia um conjunto de N números inteiros (n<=100). Faça a divisão desses números em dois vetores
//seguindo a regra: Vetor1 – Apenas números positivos e pares e Vetor2 – Apenas números ímpares e/ou
//negativos.
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Diogo_Vetores_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand= new Random();

        int n ;
        int [ ] vet1= new int[100];

        int [ ] vet2= new int[100];
        int [ ] vet0= new int[100];
        int idx1 = 0;
        int idx2 = 0;
        int idx0=0;





        for (int i = 0; i < 100; i++) {
            //System.out.println("Digite um numero ");

            n = rand.nextInt( 100);
            if (n==0){
                vet0[idx0++]=n;

            }

            if (n>0 &&  n%2 == 0 ){
                vet1[idx1++]=n;

            }
            else {
                vet2[idx2++]=n;
            }



        }
        System.out.println(Arrays.toString(vet1));
        System.out.println(Arrays.toString(vet2));



    }
}
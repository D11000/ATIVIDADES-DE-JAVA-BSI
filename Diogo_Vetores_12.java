//12. Implemente um algoritmo que verifique se um vetor preenchido pelo usuário está ordenado
//crescentemente ou não.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Diogo_Vetores_12 {




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand= new Random();
        int [] vet = new int[5];
        boolean bool = true;
        for (int i = 0 ;i < vet.length; i++) {
            int pr = rand.nextInt(0, 10);

            vet[i] = pr;
        }

        for ( int i = 0; i  < vet.length - 1;i++){

            if (vet[i] > vet[i+1]) {
                bool = false ;



            }

        }


        System.out.println(Arrays.toString(vet));
        if (!bool){
            System.out.println("O vetor não esta em ordem");
        }
        else{
            System.out.println(" O vetor esta em ordem ");
        }

    }
}
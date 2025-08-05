//13. Faça um programa que leia 10 números digitados pelo usuário e os armazene em um vetor. Após isso,
//ordene esse vetor de forma crescente e mostre o resultado.

import java.util.Arrays;
import java.util.Scanner;

public class Diogo_Vetores_13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vet = new int[10];
        int ord = 0;



        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o valores do vetor:");
            vet[i] = in.nextInt();
        }


        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = 0; j < vet.length - 1 - i; j++) {
                if (vet[j] > vet[j + 1]) {

                    ord = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = ord;
                }
            }
        }



        System.out.println("Ordem crescente: " + Arrays.toString(vet));
    }
}
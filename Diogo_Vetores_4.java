//4. Faça um programa que solicite o preenchimento de um vetor com 10 posições chamado VetorOriginal.
//Em seguida, o programa deve armazenar os números digitados de maneira invertida em vetor chamado
//VetorInvertido.
//VetorOriginal
//10 15 9 14 2 3 6 8 20 11
//VetorInvertido
//11 20 8 6 3 2 14 9 15 10
import java.util.Arrays;
import java.util.Scanner;

public class Diogo_Vetores_4 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        int[] VetorOriginal= new int[10];
        int[] VetorIvertido= new int[10];


        for(int i=0 ; i < VetorOriginal.length ;i++){
            System.out.println("Digite os valores do vetor 1:");
            VetorOriginal[i]=in.nextInt();


        }
        System.out.println("Vetor invertido:");

        for (int i = 0; i < VetorOriginal.length; i++) {
            VetorIvertido[i]= VetorOriginal[VetorOriginal.length-1-i];

        }
        for (int i = 0; i < VetorIvertido.length; i++) {


        }
        System.out.println("Vetor Original   :" + Arrays.toString(VetorOriginal));
        System.out.println("Vetor Invertido  :" + Arrays.toString(VetorIvertido));


    }
}

//14. Faça um programa que calcule e imprima o fatorial do valor N. O valor de N será fornecido de entrada
//pelo usuário. O fatorial de um número positivo N qualquer (representado por N!) é o produto de todos os
//inteiros positivos menores ou iguais à N, ou seja, Fatorial (N) = 1 * 2 * 3 * ... * N. Por exemplo, o
//fatorial de 5 = 1*2*3*4*5 = 120.

import java.util.Scanner;


public class DiogoRep14 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int fat ;
        int num ;

        System.out.println("numero: ");
         num= in.nextInt();
         fat= num;

        if (num <= 0 ){
            System.out.println("Numero negativo ");


        }
        else  {
            for (int i = 1 ; i <= fat ; i++){

                if (i != 1 ){
                     num = num*i;
                    System.out.println(num);



                }
                else {
                    num = fat*i;
                    System.out.println(num);


                }




            }


        }


    }
}

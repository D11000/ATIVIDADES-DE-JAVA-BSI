
//15. Faça um programa em JAVA que imprima os N primeiros termos da serie de Fibonacci. Sabe-se que N é
//fornecido pelo usuário. Fibonacci = 1, 1, 2, 3, 5, 8, 13, 21, ...

import java.util.Scanner;


public class DiogoRep15{
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int N ;
        int i =1 ;
        int F=1;
        int F2=1 ;
        int F3;
        System.out.println("Digite um numero ");
        N= in.nextInt();

        while (i <= N){
             i++;
             F3= F +F2 ;
             F=F2;
             F2= F3;


            System.out.println(F3);

        }



    }
}

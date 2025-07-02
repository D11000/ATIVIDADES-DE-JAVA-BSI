//8. Faça um algoritmo que imprima a soma da sequência apresentada: H = 1 - 1/2 + 1/3 – 1/4 + 1/5... 1/N. O
//        valor de N deve ser positivo e fornecido pelo usuário.

import java.util.Scanner;

public class Diogo_Rep8 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("Digite um numero");
        double N = in.nextInt();
        double H=0;




        for (double i = 1 ; i <N ; i++){
            if ( i%2 !=0 ){

                H= H+ 1/ i;

                System.out.println("O RESULTADO É  : "  +  H);


            }
            else if (i%2 ==0 ) {

                H=  H - 1/ i;
                System.out.println("O RESULTADO É  : " +H );
            }




        }




    }
}

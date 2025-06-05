//2. Faça um algoritmo que dado um número digitado pelo usuário mostre se o mesmo é par ou ímpar.
import java.util.Scanner;
public class LISTA4Diogo {
    public static void main(String[]args){
        Scanner Ent = new Scanner(System.in);
        System.out.println("Digite um numero");
        double NUM = Ent.nextDouble();
        double NC = NUM%2;

        if (NC == 0){
            System.out.println("O numero é par");

        }
        else {
            System.out.println("O numero é impar");
        }







    }


}
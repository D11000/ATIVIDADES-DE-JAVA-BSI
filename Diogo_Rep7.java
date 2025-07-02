//7. Faça um algoritmo que imprima a soma da sequência apresentada: H = 1/1 + 1/2 + 1/3 + ... + 1/N. O valor
//de N deve ser positivo e fornecido pelo usuário.
import java.util.Scanner;

public class Diogo_Rep7 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("Digite um numero");
        double H = in.nextInt();
        double div ;


        for (int i = 1 ; i <H ; i++){


            div = i/H;

            System.out.println("A divisão é "+  div);

        }




    }
}

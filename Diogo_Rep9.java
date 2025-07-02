
//9. Faça um programa que calcule e imprima a soma e a média de N números digitados pelo usuário. O valor
//de N deve ser fornecido pelo usuário.
import java.util.Scanner;

public class Diogo_Rep9 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("Digite um numero");
        int N = in.nextInt();
        int soma ;
        int media ;


        for ( int i = 1 ; i <= N ; i++){
            soma = i + N;
            media= i+N/i;

        System.out.println(" SOMA : "+ soma + " MEDIA: "+ media );
        }




    }
}

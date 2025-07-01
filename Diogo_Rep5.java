//5. Faça um programa que calcule e imprima a soma e a média dos 10 primeiros números positivos.
// Soma =1 + 2 + 3 + ... + 10
import java.util.Scanner;

public class Diogo_Rep5 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);

        double sum ;
        double med ;
        for(double i = 1 ; i <=10 ; i++){

            sum = i+i;

            med = sum/10;
            System.out.println("A soma é "+sum+" a media é "+med);
        }






    }
}

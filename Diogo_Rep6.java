//6. Faça um programa que calcule e imprima a soma e a média dos N primeiros números positivos.
// Soma = 1 + 2 + 3 + ... + N
import java.util.Scanner;

public class Diogo_Rep6 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = in.nextInt();
        double sum ;
        double med ;

      for ( int i = 1 ; i <= num ; i++){
          sum = num+ i;
          med= sum /num ;
          System.out.println("O numero é : " + num +" A soma é : "+ sum +" a media é : "+ med);

      }




    }
}

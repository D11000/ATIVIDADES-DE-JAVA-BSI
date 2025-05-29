//15. Faça um algoritmo que calcule a área de uma circunferência, recebendo o valor do raio. Obs.: Defina PI
//como constante de valor 3.1416.
//A = π.r²

import java.util.Scanner;

public class Diogo15 {
    public static void main (String[]args){
        Scanner ent= new Scanner(System.in);
        System.out.println("Digite o raio");
        double r = ent.nextDouble();
        double pi= 3.14;
        double A= pi*Math.pow(r,2);
        System.out.println("A area é "+ A);


    }
}

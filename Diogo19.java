//19. Implemente m programa que receba um número positivo, calcule e mostre:
// O número digitado elevado ao quadrado;
// O número digitado elevado ao cubo;
// A raiz quadrada do número;
// A raiz cúbica do número.
import java.util.Scanner;


public class Diogo19 {
    public static void main (String[] args){
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um numero positivo");
        double a= ent.nextDouble();
        double quadrado= Math.pow(a,2);
        double cubo= Math.pow(a,3);
        double raizquadrada= Math.sqrt(a);
        double raizcubica= Math.cbrt(a);
        System.out.println(" " +
                "O quadrado do numero é " + quadrado+ " O cubo do numero é "+ cubo+ " a raiz quadrada é "+ raizquadrada+ " raiz cubica é "+ raizcubica );



    }

}

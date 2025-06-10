//8. Crie um algoritmo que receba o valor de x, calcule e imprima o valor de f(x).
//f(x){1,se X <= 1
//     { 2,se 1 < x <= 2
//      {x²,se 2 < x <= 3
//      {x³, se x > 3
import java.util.Scanner;
public class Diogo_Lista3_8 {
    public static void main(String[]args){
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o valor de X");
        double x= ent.nextDouble();
        if(x<=1){
            double fx= 1;
            System.out.println("O valor de F(x) é : " + fx);
        }
        if(1< x && x <=2 ){
            double fx= 2;
            System.out.println("O valor de F(x) é : " + fx);
        }
        if(2 < x && x <=3 ){
            double fx= Math.pow(x,2);

            System.out.println("O valor de F(x) é : " + fx);

        }
        if(x > 3 ){
            double fx= Math.pow(x,3);

            System.out.println("O valor de F(x) é : " + fx);


        }
    }
}

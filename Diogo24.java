import java.util.Scanner;


public class Diogo24 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite os valores");
        double a= ent.nextDouble(), b = ent.nextDouble(),c=ent.nextDouble() ;
        double Delta = Math.pow(b, 2) - 4 * a * c;
        if (Delta < 0) {
            System.out.println("A equação não possui raízes reais.");

        }
        else if (Delta == 0) {

            double x = -b / (2 * a);
            System.out.println("A equação possui uma única raiz real: " + x);
        }

        else {
        double Raiz1 = (-b - Math.sqrt(Delta)) / (2 * a);
        double Raiz2 = (-b + Math.sqrt(Delta)) / (2 * a);
        System.out.println("a valor é " + Raiz1 + Raiz2 );}













    }
}

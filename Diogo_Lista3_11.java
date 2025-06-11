import java.util.Scanner;
public class Diogo_Lista3_11 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o  valor de D");
        double D= ent.nextDouble();
        System.out.println("Digite o valo de Q");
        double Q = ent.nextDouble();
        double pi = 3.14;



        if (D > 100){
            double n=2;
            double S = (4*Q/pi*Math.pow(D,2))*n;

            System.out.println("O valor é " + S );
        }
        else if (D<50) {
            double n=6;
            double S = (4*Q/pi*Math.pow(D,2))*n;
            System.out.println("O valor é " + S );

        }
        else  {
            double n=4;
            double S = (4*Q/pi*Math.pow(D,2))*n;
            System.out.println("O valor é " + S );

        }




    }
}

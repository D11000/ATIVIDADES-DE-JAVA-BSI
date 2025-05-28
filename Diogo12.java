import java.util.Scanner;
import java.text.DecimalFormat;
public class Diogo12 {
    public static void  main (String[] args)
    {
        DecimalFormat df = new DecimalFormat("#");
        double A,B ,C, Voltas,KMs;
        A=2;
        B=3;
        KMs=10;
        C=Math.hypot(A,B);
        Voltas=A+B+C/KMs;
        String formatado =df.format(Voltas) ;
        System.out.println("Dona Maria das Couves deu "+ formatado + " "+"voltas");



    }
}

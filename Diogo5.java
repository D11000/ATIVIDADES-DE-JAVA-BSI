import java.util.Scanner;
public class Diogo5 {
    public static void  main (String[] args)
    {
        Scanner ent = new Scanner(System.in);

        double Sb;
        double gt ;
        double imp;
        double Sg;
        double ScI;
        double Sgf;

        double Sf;
        gt= 0.10;
        imp= 0.05;
        System.out.println("Digte seu salario ");
        Sb= ent.nextDouble();
        Sg=Sb*gt;
        Sgf=Sb+Sg;
        ScI=Sgf*imp;
        Sf=Sb-ScI;
        System.out.println("o salrio final é "+ Sf);







    }
}

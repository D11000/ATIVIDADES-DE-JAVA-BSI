import java.util.Scanner;
public class Diogo7 {
    public static void  main (String[] args)
    {
        Scanner Ent = new Scanner(System.in);
        double base;
        double altura;
        double area;


        System.out.println("digite o valor da base" );
        base=Ent.nextDouble();
        System.out.println("digite o valor da altura" );
        altura= Ent.nextDouble();
        area=altura*base;

        System.out.println("O valor da area e:"+area);


    }

}

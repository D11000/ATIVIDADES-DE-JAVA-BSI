import java.util.Scanner;
public class Diogo4 {
    public static void  main (String[] args)
    {
        int nt1;
        int nt2;
        int nt3;
        int ps1;
        int ps2;
        int ps3;
        int Mp;
        Scanner ent= new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        nt1= ent.nextInt();
        System.out.println("Digite a segunda  nota");
        nt2= ent.nextInt();
        System.out.println("Digite a terceira nota");
        nt3= ent.nextInt();
        System.out.println("Digite a primeiro peso");
        ps1= ent.nextInt();
        System.out.println("Digite a segundo  peso");
        ps2= ent.nextInt();
        System.out.println("Digite a terceiro peso");
        ps3= ent.nextInt();
        Mp= nt1*ps1+nt2*ps2+nt3*ps3/nt1+nt2+nt3;
        System.out.println("A media ponderada é " +Mp);

    }
}

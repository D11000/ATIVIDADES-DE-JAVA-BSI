import java.util.Scanner;


public class Diogo22 {
    public static void main(String[] args)
    {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");

        int a= ent.nextInt();

        System.out.println("Digite o segundo numero.");

        int b= ent.nextInt();

        int Troca= a;
        a=b;
        b=Troca;


        System.out.println("Os numeros antes de ser trocados são " +" "+ a+ " "+ " "+ b );

        System.out.println(".");



    }
}
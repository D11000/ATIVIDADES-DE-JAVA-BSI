import java.util.Scanner;
public class Diogo6 {
    public static void  main (String[] args)
    {
        Scanner Ent = new Scanner(System.in);

        double salario;
        double vendas;
        double comissao;
        double vendacomissionada;
        double salariocalculado;
        double salriofinal ;

        salario= 2000;
        System.out.println("Digite a quantidade de vendas");
        vendas= Ent.nextDouble();
        comissao= 0.04;
        vendacomissionada=vendas*comissao;
        salariocalculado=vendacomissionada*salario;
        salriofinal=salario+salariocalculado;

        System.out.print("O salario final é "+salriofinal);












    }










}

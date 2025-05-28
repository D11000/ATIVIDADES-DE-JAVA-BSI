import java.util.Scanner;

public class Diogo11 {
    public static void  main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double conta1, conta2, salario,multa,contacommulta1, contacommulta2,valordecontafinal,salariofinal;
        conta1= 300;
        conta2= 150;
        salario=2000;
        contacommulta1=conta1*0.02;
        contacommulta2=conta2*0.02;
        conta1=contacommulta1+conta1;
        conta2=contacommulta2+conta2;
        valordecontafinal=conta1+conta2;
        salariofinal= salario-conta1-conta2;
        System.out.println("sobrou de salario :"+salariofinal);

        





    }






}

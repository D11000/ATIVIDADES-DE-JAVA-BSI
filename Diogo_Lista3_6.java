//6. Uma empresa decide dar um aumento de 30% aos funcionários com salário inferior a R$700,00 e 10% aos
//funcionários com salário superior ou igual a R$700,00. Faça um algoritmo que calcule o reajuste e mostre
//o novo salário
import java.util.Scanner;
public class Diogo_Lista3_6 {
    public static void main(String[] args){
        Scanner ent= new Scanner(System.in);
        System.out.println("Digite o valor do salario" );
        double salario = ent.nextDouble();
        if(salario<700){
           double aumento = salario*0.3;
           double salario_final=salario+aumento;
           System.out.println("O aumento para as pessoas que ganham abaixo de 700 reais é:" + salario_final );


        }
        else if (salario >= 700){
            double aumento = salario*0.1;
            double salario_final=salario+aumento;
            System.out.println("O aumento para as pessoas que ganham  700 reais ou mais é:" + salario_final );

        }


    }
}

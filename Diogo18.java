//18. Sabe-se que o valor pago por quilowatt de energia custa um quinto do valor do salário mínimo. Faça um
//algoritmo que receba o valor atual do salário mínimo e a quantidade de quilowatt consumida em uma
//residência, calcule e mostre:
//a. O valor pago por quilowatt;
//b. O valor a ser pago pelo consumo nessa residência;
//c. O valor a ser pago considerando um desconto de 15%.


import java.util.Scanner;


public class Diogo18 {
    public static void main (String[] args){
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o Salario");
        double Salario = ent.nextDouble();
        System.out.println("Digite o consumo");
        double Quilowatt= ent.nextDouble();
        double UQ= 0.2;
        double VP= (Salario/100)*0.2;
        double a = VP*Quilowatt;
        double b =Quilowatt*VP ;
        double desconto= (b/100)*15;
        double c =b-desconto ;
        System.out.println("o Quilowatt Vale "+ a + "o valor a ser pago pelo consmo é "+ b + "e o valor com desconto é"+ c);





    }

}

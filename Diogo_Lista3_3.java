//3. O custo de um carro novo ao consumidor é a soma do custo de fábrica, a porcentagem do distribuidor e os
//impostos. O valor pago pela distribuição e dos impostos é calculado com base no custo de fábrica. As
//porcentagens estão apresentadas na tabela abaixo. Faça um programa que receba o custo de fábrica de um
//carro e mostre o custo ao consumidor
//Custo de Fábrica % Distribuidor %Impostos
//Até R$ 28000.00 5 Isento
//Entre R$28000.01 e R$45000.00 10 15
//Acima de R$45000.00 15 20

import java.util.Scanner;
public class Diogo_Lista3_3 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite  o valor de custo" );
        double custo= ent.nextDouble();

        if (custo <= 28000){
            double taxa_do_distribuidor=0.05;
            double imposto=0;
            double custo_imposto=imposto*custo;
            double custo_ditribuidor= custo*taxa_do_distribuidor;
            double valor_final= custo_ditribuidor+custo_imposto+custo;
            System.out.println("o valor final é" + " "+ valor_final);



        }
        if (custo <= 28001 && custo >= 45000){
            double taxa_do_distribuidor=0.10;
            double imposto=0.15;
            double custo_imposto=imposto*custo;
            double custo_ditribuidor= custo*taxa_do_distribuidor;
            double valor_final= custo_ditribuidor+custo_imposto+custo;
            System.out.println("o valor final é" + " "+ valor_final);


        }
        if ( custo >= 45000){
            double taxa_do_distribuidor=0.15;
            double imposto=0.20;
            double custo_imposto=imposto*custo;
            double custo_ditribuidor= custo*taxa_do_distribuidor;
            double valor_final= custo_ditribuidor+custo_imposto+custo;
            System.out.println("o valor final é" + " "+ valor_final);


        }




    }
}

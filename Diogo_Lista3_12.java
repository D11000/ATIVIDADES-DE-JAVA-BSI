//12. Faça um programa que receba de entrada a data de votação do ano atual e a data de nascimento de uma
//pessoa. As datas podem ser lidas em 3 informações (dia, mês e ano). Faça as devidas comparações e
//verifique se essa pessoa não pode votar, é obrigada a votar ou o voto é facultativo, segundo as regras
//brasileiras.
//Idade Voto
//Menor de 16 Não vota
//16 à 18 e acima de 70 Facultativo
//Entre 18 e 70 Obrigatório

import java.util.Scanner;
public class Diogo_Lista3_12 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o ano atual de votação");
        double Ano_de_votacao = ent.nextDouble();
        //System.out.println("Digite o  dia do seu nascimento");
        //double D= ent.nextDouble();
       // System.out.println("Digite  o mês  do seu nascimento");
        //double M = ent.nextDouble();
        System.out.println("Digite o ano  do seu nascimento");
        double A = ent.nextDouble();
        double Idade= Ano_de_votacao-A;



        if (Idade < 16){


            System.out.println("Não vota "  );
        }
        else if (Idade >  16 && Idade  < 17 || Idade > 70) {

            System.out.println("É facultativo " );

        }
        else if (Idade  >= 18 || Idade <= 70) {

            System.out.println("É OBRIGATORIO    " );

        }







    }
}

//18. Faça um programa que recebe de entrada o código de um produto e a quantidade comprada do mesmo.
//Calcule e mostre:
//a) O preço unitário do produto, segundo Tabela I
//b) Preço total da nota
//c) O valor do desconto, segundo Tabela II, aplicado sobre o valor total da nota
//d) Preço final ao consumidor após desconto
//e) Não se esqueça de verificar a existência do produto

//Código            Valor unitário
//1 a 10                R$10,00
//11 a 20               R$20,00
//21 a 30               R$30,00
//31 a 40               R$40,00

//Total da nota %       Desconto
//Até R$ 250            5%
//Entre R$250 e R$500   10%
//Acima de R$500        15%

import java.util.Scanner;
public class Diogo_Lista3_18 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Dige o codigo");
        int cod= ent.nextInt();
        System.out.println("Dige a quantidade");
        int qtd= ent.nextInt();

        if(cod <=10 ){
            double valor = 10;
            System.out.println("O valor unitario é :" + valor);
            double total = valor *qtd;
            System.out.println("O valor total sem desconto é :" + total);
            if (total <=250){
                System.out.println("O valor de desconto é : 5%");
                double D= total*0.05;
                double Td= total-D;
                System.out.println("O valor total da nota é :"+ Td);

            }
            else if (total > 250 && total <=500) {
                System.out.println("O valor de desconto é : 10%");
                double D= total*0.10;
                double Td= total-D;
                System.out.println("O valor total da nota é :"+ Td);


            }

            else if (total > 500) {
                System.out.println("O valor de desconto é : 15%");
                double D= total*0.15;
                double Td= total-D;
                System.out.println("O valor total da nota é :"+ Td);


            }
        }
        else if(cod > 11 && cod <=20 ){
            double valor = 20;
            System.out.println("O valor unitario é :" + valor);
            double total = valor *qtd;
            System.out.println("O valor total sem desconto é :" + total);
            if (total <=250){
                System.out.println("O valor de desconto é : 5%");
                double D= total*0.05;
                double Td= total-D;
                System.out.println("O valor total da nota é :"+ Td);

            }
            else if (total > 250 && total <=500) {
                System.out.println("O valor de desconto é : 10%");
                double D= total*0.10;
                double Td= total-D;
                System.out.println("O valor total da nota é :"+ Td);


            }

            else if (total > 500) {
                System.out.println("O valor de desconto é : 15%");
                double D= total*0.15;
                double Td= total-D;
                System.out.println("O valor total da nota é :"+ Td);


            }
        }
        else if(cod >=21 && cod <=30 ){
            double valor = 30;
            System.out.println("O valor unitario é :" + valor);
            double total = valor *qtd;
            System.out.println("O valor total sem desconto é :" + total);
            if (total <=250){
                System.out.println("O valor de desconto é : 5%");
                double D= total*0.05;
                double Td= total-D;
                System.out.println("O valor total da nota é :"+ Td);

            }
            else if (total > 250 && total <=500) {
                System.out.println("O valor de desconto é : 10%");
                double D= total*0.10;
                double Td= total-D;
                System.out.println("O valor total da nota é :"+ Td);


            }

            else if (total > 500) {
                System.out.println("O valor de desconto é : 15%");
                double D= total*0.15;
                double Td= total-D;
                System.out.println("O valor total da nota é :"+ Td);


            }
        }
        else if(cod >= 31 &&  cod <=40 ){
            double valor = 40;
            System.out.println("O valor unitario é :" + valor);
            double total = valor *qtd;
            System.out.println("O valor total sem desconto é :" + total);
            if (total <=250){
                System.out.println("O valor de desconto é : 5%");
                double D= total*0.05;
                double Td= total-D;
                System.out.println("O valor total da nota é :"+ Td);

            }
            else if (total > 250 && total <=500) {
                System.out.println("O valor de desconto é : 10%");
                double D= total*0.10;
                double Td= total-D;
                System.out.println("O valor total da nota é :"+ Td);


            }

            else if (total > 500) {
                System.out.println("O valor de desconto é : 15%");
                double D= total*0.15;
                double Td= total-D;
                System.out.println("O valor total da nota é :"+ Td);


            }
        }
        else {
            System.out.println("Codigo inexstente");
        }



    }

}

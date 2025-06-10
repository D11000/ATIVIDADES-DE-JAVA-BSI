//1. Faça um algoritmo que receba a idade de um nadador e mostre a categoria do mesmo. Faça os testes
//necessários em relação a idade inválida.
//Categoria Operação
//Infantil 5 a 7 (inclusive)
//Juvenil 8 a 10 (inclusive)
//Adolescente 11 a 15 (inclusive)
//Adulto 16 a 40 (inclusive)
//Sênior Acima de 40 (inclusive)


import java.util.Scanner;
public class Diogo_Lista3_1 {
    public static void main(String[]args){
        Scanner Ent = new Scanner(System.in);
        System.out.println("Digite sua idade");

        int idade=  Ent.nextInt() ;
        if (idade >= 4 && idade <=7 ){
            System.out.println("Categoria infantil");
        }
        if (idade >= 8 && idade <=10 ){
            System.out.println("Categoria juvenil");


        }
        if (idade >= 11 && idade <=15 ){
            System.out.println("Categoria adolescente");

        }
        if (idade >= 16 && idade <=40 ){
            System.out.println("Categoria adulto");

        }
        if (idade >= 40 ){
            System.out.println("Categoria Senior");




        }
    }


}
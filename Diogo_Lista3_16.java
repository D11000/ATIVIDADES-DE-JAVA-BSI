//16. Implemente um programa que receba um número inteiro positivo representando um ano qualquer e
//imprima se o ano é bissexto ou não. Um ano bissexto é definido quando: (ano % 4 = 0 e (ano % 100 != 0
//ou ano % 400 == 0)).

import java.util.Scanner;
public class Diogo_Lista3_16 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Dige um ano" );
        int ano = ent.nextInt();
        int ver = ano% 4 ;
        int ver2 = ano% 100;
        if (ver == 0){
            if (ver2 != 0){
                System.out.println("É bissexto");
            }
        }
        else {
            System.out.println("Não é bissexto");
        }






    }
}
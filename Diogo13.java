//13. A copa do mundo de futebol da FIFA é uma competição internacional que iniciou em 1930, acontecendo
//desde então de 4 em 4 anos, exceto durante o período das guerras mundiais que impossibilitaram a
//realização 2 copas mundiais. Sabendo dessas informações, faça um algoritmo em JAVA que dado o ano
//atual calcule o número de copas já realizadas e exiba o resultado ao usuário.

import java.util.Scanner;



public class Diogo13 {
    public static void main(String[]args){
        Scanner ent= new Scanner(System.in);
        System.out.println("Digite o ano atual");
        int AA= ent.nextInt();

        int PA= 1930;
        int cal= AA-PA;
        int QC= cal/4;
        int QC2= QC-2;
        System.out.println("Houve "+" "+QC2+" "+" desde de 1930");

    }
}

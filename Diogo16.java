//16. Faça um algoritmo que receba uma quantidade qualquer em minutos e converta em horas e minutos (utilize
//divisão inteira e resto da divisão inteira).

import java.util.Scanner;
public class Diogo16 {
    public static void main (String[]args){
        Scanner ent= new Scanner(System.in);
        System.out.println("Digite o minutos");
        double minutos = ent.nextInt();
        double hora = minutos/60;

        System.out.format("As horas em minutos são "+ "%.1f",hora);





    }
}

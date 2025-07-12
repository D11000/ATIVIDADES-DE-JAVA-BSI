//20. Sabe-se que um país A possui 500000 habitantes e uma taxa de natalidade de 3% ao ano, já o país B
//possui 700000 habitantes e uma taxa de natalidade de 2% ao ano. Escreva um algoritmo, sabendo que
//estamos no ano de 2015, que calcule em que ano a população do país A ultrapassará a população de B.

import java.util.Scanner;


public class DiogoLista4_20{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ano = 2015;
        double populacaoA = 500000;
        double populacaoB = 700000;

        while (populacaoA <= populacaoB) {
            populacaoA = populacaoA + (populacaoA * 0.03);
            populacaoB = populacaoB + (populacaoB * 0.02);
            ano++;
        }

        System.out.println("A população do país A ultrapassará a do país B em " + ano + ".");
        System.out.println("População A: " + (int)populacaoA);
        System.out.println("População B: " + (int)populacaoB);
    }
}
//8. Fazer um algoritmo que:
//a. Leia um conjunto de valores inteiros correspondentes a 80 notas dos alunos de uma turma, notas
//estas que variam de 0 a 10;
//b. Calcule a frequência absoluta e a frequência relativa de cada nota;
//c. Imprima uma tabela contendo os valores das notas (de 0 a 10) e suas respectivas frequências
//absoluta e relativa.

import java.util.Arrays;
import java.util.Random;

public class Diogo_Vetores_8 {
    public static void main(String[] args) {
        final int TOTAL_NOTAS = 80;
        int[] notas = new int[TOTAL_NOTAS];
        int[] FreqAbsol = new int[11];
        double[] FreqRelat = new double[11];

        Random random = new Random();


        for (int i = 0; i < TOTAL_NOTAS; i++) {
            int nota = random.nextInt(11);
            notas[i] = nota;
            FreqAbsol[nota]++;
        }


        for (int i = 0; i <= 10; i++) {
            FreqRelat[i] = ((double) FreqAbsol[i] / TOTAL_NOTAS) * 100;
        }


        System.out.printf("%-6s | %-18s | %-18s%n", "Nota", "Freq. Absoluta", "Freq. Relativa (%)");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%-6d | %-18d | %-18.2f%n", i, FreqAbsol[i], FreqRelat[i]);
        }


        System.out.println("\nNotas geradas: " + Arrays.toString(notas));
    }
}

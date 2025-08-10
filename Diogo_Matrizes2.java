//Diogo Gabriel
//Exemplos usados:
// [1,2,3,4,5]
//[6,7,8,9,0]
//[1,2,3,4,5]


//2. Faça um programa que preencha uma matriz 3 x 5 com números reais. Some os valores de cada linha e
//armazene em um vetor. A seguir, mostre qual a linha que tem maior valor somado.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[][] m1 = new double[3][5]; // números reais
        double[] vetorResultado = new double[3];
        int maior = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                m1[i][j] = in.nextDouble();
                vetorResultado[i] += m1[i][j];
            }
        }



        for (int i = 1; i < vetorResultado.length; i++) {
            if (vetorResultado[i] > vetorResultado[maior]) {
                maior = i;
            }
        }


        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.printf("%8.2f", m1[i][j]);
            }
            System.out.println();
        }


        System.out.println("\nSoma das linhas: " + Arrays.toString(vetorResultado));

        System.out.println("A linha com maior soma é a linha " + maior + " soma = " + vetorResultado[maior] + ")");
    }
}
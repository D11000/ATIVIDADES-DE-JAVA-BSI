//Diogo Gabriel Gouveia Clemente
//Exemplos de teste usados:




//20. Joãozinho está aprendendo sobre matrizes. Hoje ele aprendeu como deixar matrizes na forma escada, e
//está exercitando. Para ajudá-lo, você deve escrever um programa que determine se o resultado dele realmente
//está no formato correto. Uma matriz está na forma escada quando, para cada linha, as condições a seguir
//forem satisfeitas:
//- Se a linha só possuir zeros, então todas as linhas abaixo desta também só possuem zeros.
//- Caso contrário, seja X o elemento diferente de zero mais à esquerda da linha; então, para todas as
//linhas abaixo da linha de X, todos os elementos nas colunas à esquerda de X e na coluna de X são
//iguais a zero.
//ENTRADA: A primeira linha possui dois inteiros N e M, as dimensões da matriz. Cada uma das N linhas
//seguintes contém M inteiros não-negativos, os elementos da matriz.
//SAÍDA: Seu programa deve produzir uma única linha, contendo o caractere ‘S’ caso a matriz esteja no
//formato escada, ou ‘N’, caso contrário.


import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes_20 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rnd=new Random();

        System.out.print("Digite N : ");
        int N = in.nextInt();
        System.out.print("Digite M : ");

        int M = in.nextInt();

        int[][] mat = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mat[i][j] = rnd.nextInt(0,10);
            }
        }

        boolean escada = true;
        int limiteColuna = 0;

        for (int i = 0; i < N; i++) {
            int primeiraNaoZero = -1;
            for (int j = 0; j < M; j++) {
                if (mat[i][j] != 0) {
                    primeiraNaoZero = j;
                    break;
                }
            }

            if (primeiraNaoZero == -1) {

                limiteColuna = M;
            } else {

                for (int j = 0; j < limiteColuna; j++) {
                    if (mat[i][j] != 0) {
                        escada = false;
                        break;
                    }
                }
                limiteColuna = primeiraNaoZero;
            }

            if (!escada) break;
        }

        System.out.println(escada ? "S" : "N");
    }
}







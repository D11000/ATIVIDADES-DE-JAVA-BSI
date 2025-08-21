//Diogo Gabriel Gouveia Clemente
//Exemplos de teste usados:
//Digite número de linhas da matriz B: 5
//Digite número de colunas da matriz B: 4
//Não é possível multiplicar: número de colunas de A é diferente das linhas de B


//Digite número de linhas da matriz B: 4
//Digite número de colunas da matriz B: 5
//
//Matriz resultante C (3x5):
//77 43 29 33 46
//97 93 56 48 96
//25 45 45 43 9


//12. Faça um programa que preencha uma matriz A[3][4], e outra matriz B[linhas][colunas] em que as
//dimensões são digitadas pelo usuário. Após isso, verifique se a operação de multiplicação de matrizes (A
//x B) pode ser realizada, caso seja possível, realize a operação e imprima a matriz resultante.








import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes_12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rnd=new Random();
        int[][] A = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = rnd.nextInt(0,10);
            }
        }


        System.out.print("Digite número de linhas da matriz B: ");
        int linB = in.nextInt();
        System.out.print("Digite número de colunas da matriz B: ");
        int colB = in.nextInt();

        int[][] B = new int[linB][colB];

        for (int i = 0; i < linB; i++) {
            for (int j = 0; j < colB; j++) {
                B[i][j] = rnd.nextInt(0,10);
            }
        }


        if (4 != linB) {
            System.out.println("Não é possível multiplicar: número de colunas de A é diferente das linhas de B");

            return;
        }


        int[][] C = new int[3][colB];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < colB; j++) {
                int mult= 0;
                for (int k = 0; k < 4; k++) {
                    mult+= A[i][k] * B[k][j];
                }
                C[i][j] = mult;
            }
        }


        System.out.println("\nMatriz resultante C (3x" + colB + "):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }


    }





}

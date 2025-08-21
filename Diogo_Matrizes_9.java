//Diogo Gabriel Gouveia Clemente
//Exemplos de teste usados:
//Matriz de custos M = [0 10 16 20
// 15 0 25 18
// 12 14 0 20
// 20 19 35 0]

//9. Os elementos aij de uma matriz An x n representam os custos de transporte da cidade i para a cidade j. O
//caminhão de uma empresa de logística deve passar exatamente uma vez por cada uma da n cidades.
//Sabendo que, uma rota é representada por um vetor de n posições, em que cada posição representa a
//cidade visitada, você deve implementar um algoritmo que calcule o custo da rota de um caminhão da
//empresa. Note que, a rota e a matriz de custo devem ser fornecidas pelo usuário.
//Exemplo: Considere 4 cidades em que os custos de transporte entre as mesmas são representados pela
//matriz de custo M abaixo. Considere ainda uma rota denotada pelo vetor = [ 3 1 0 2] significando que
//o caminhão parte da cidade 3 com destino à cidade 1; sai de 1 e vai para 0; e por fim parte da cidade 0
//para a cidade 2. Portanto, o custo de transporte dessa rota é: M[3][1] + M[1][0] + M[0][2] = 19 + 15 + 16


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes_9 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número de cidades (n): ");
        int n = in.nextInt();
        int[][] mtx = new int[n][n];
        int[] rota = new int[n];



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mtx[i][j] = rnd.nextInt(0,100);

            }
        }

       
        System.out.println("Digite a rota (sequência de " + n + " cidades):");
        for (int i = 0; i < n; i++) {
            rota[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(rota));

        
        int custoTotal = 0;
        for (int i = 0; i < n ; i++) {

            for (int j = 0; j < n ; j++) {

                custoTotal += mtx[i][j];

            }



        }

        System.out.println("Custo total da rota = " + custoTotal);






    }





}

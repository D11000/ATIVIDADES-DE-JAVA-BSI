//Diogo Gabriel Gouveia Clemente
//Exemplos de teste usados:
//n = 4
//Matriz L:
//1 1 0 0
//0 1 1 0
//0 0 1 1
//1 0 0 1
//
//Exemplo rota: [0 1 2 3 2 0] -> possível
//Exemplo rota: [2 3 2 1 0] -> impossível

//10. Considere n cidades numeradas de 0 a n-1 que estão interligadas por uma série de estradas de mão única.
//As ligações entre as cidades são representadas pelos elementos de uma matriz quadrada Lnxn
//, cujos
//elementos lij assumem o valor 1 ou 0, conforme exista ou não estrada direta que saia da cidade i e chegue
//2
//à cidade j. Assim, os elementos da linha i indicam as estradas que saem da cidade i, e os elementos da
//coluna j indicam as estradas que chegam à cidade j. Por convenção lii = 1. A figura abaixo um exemplo
//para n = 4.
//a) Dada uma cidade k, determine quantas estradas saem de k e quantas cidades chegam à k.
//b) Qual das cidades possuem maior número de estradas chegando?
//c) Encontre, se existirem, as cidades isoladas. Ou seja, aquelas em que não chegam nem saem estradas.
//d) Dada uma determinada rota de m cidades, representada por um vetor de inteiros cujos valores estão
//entre 0 e n-1, tal como exercício anterior, verifique se é possível realizar tal rota. No exemplo anterior,
//a rota (m = 5) 2 3 2 1 0 é impossível; já a rota (m = 6) 0 1 2 3 2 0 é possível.










import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes_10 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número de cidades (n): ");
        int n = in.nextInt();

        int[][] L = new int[n][n];



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                L[i][j] = rnd.nextInt(0,2);
            }
        }


        System.out.print("Digite uma cidade  para analisar: ");
        int k = in.nextInt();

        int saidas = 0, chegadas = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (L[k][i] == 1){
                    saidas++;
                }
                if (L[i][k] == 1) {
                    chegadas++;
                }

            }


        }
        System.out.println("Cidade " + k + ": " + saidas + " saem, " + chegadas + " chegam.");


        int maxChegadas = -1;
        int cidadeMax = -1;
        for (int j = 0; j < n; j++) {
            int cont = 0;
            for (int i = 0; i < n; i++) {
                if (L[i][j] == 1) cont++;
            }
            if (cont > maxChegadas) {
                maxChegadas = cont;
                cidadeMax = j;
            }
        }
        System.out.println("Cidade com maior número de estradas chegando: " + cidadeMax + " (" + maxChegadas + ").");


        System.out.print("Cidades isoladas: ");
        boolean temIsolada = false;
        for (int i = 0; i < n; i++) {
            int somaSaidas = 0, somaChegadas = 0;
            for (int j = 0; j < n; j++) {
                somaSaidas += L[i][j];
                somaChegadas += L[j][i];
            }
            if (somaSaidas == 0 && somaChegadas == 0) {
                System.out.print(i + " ");
                temIsolada = true;
            }
        }
        if (!temIsolada) {
            System.out.print("nenhuma");
        }
        System.out.println();


        System.out.print("Digite o tamanho da rota (m): ");
        int m = in.nextInt();
        int[] rota = new int[m];
        System.out.println("Digite a rota (sequência de " + m + " cidades):");
        for (int i = 0; i < m; i++) {
            rota[i] = in.nextInt();
        }

        boolean possivel = true;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                if (L[i][j] == 0) {
                    possivel = false;
                    break;

            }



            }
        }

        if (possivel) {
            System.out.println("A rota é possível.");
        } else {
            System.out.println("A rota é impossível.");
        }




    }





}

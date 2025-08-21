//Diogo Gabriel Gouveia Clemente
//Exemplos de teste usados:
//Armazém 0: 127
//Armazém 1: 136
//Armazém 2: 199
//Armazém 3: 151
//Armazém com maior estoque do produto 2: Armazém 0
//Armazém com menor estoque total: Armazém 0
//Armazém com maior custo de estocagem: Armazém 2



//11. Faça um programa que receba o estoque atual de 3 produtos que estão armazenados em 4 armazéns e
//coloque esses dados em uma matriz 5 x 3. Sendo que a última linha da matriz contém o custo de
//estocagem de uma unidade de cada produto, calcule e mostre:
//a) Quantidade de itens armazenados em cada armazém;
//b) Qual armazém possui maior estoque do produto 2;
//c) Qual armazém possui menor estoque;
//d) Qual armazém possui maior custo de estocagem.










import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes_11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rnd=new Random();
        int[][] matriz = new int[5][3];


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = rnd.nextInt(0 ,100);
            }
        }


        for (int j = 0; j < 3; j++) {
            matriz[4][j] = rnd.nextInt(1,10);
        }



        int[] totalArmazem = new int[4];
        for (int i = 0; i < 4; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
            totalArmazem[i] = soma;
            System.out.println("Armazém " + i + ": " + soma);
        }


        int produto = 1;
        int maiorEstoque = -1, armazemMaior = -1;
        for (int i = 0; i < 4; i++) {
            if (matriz[i][produto] > maiorEstoque) {
                maiorEstoque = matriz[i][produto];
                armazemMaior = i;
            }
        }
        System.out.println("Armazém com maior estoque do produto 2: Armazém " + armazemMaior);


        int menor = totalArmazem[0], armazemMenor = 0;
        for (int i = 1; i < 4; i++) {
            if (totalArmazem[i] < menor) {
                menor = totalArmazem[i];
                armazemMenor = i;
            }
        }
        System.out.println("Armazém com menor estoque total: Armazém " + armazemMenor);


        int maiorCusto = -1, armazemCaro = -1;
        for (int i = 0; i < 4; i++) {
            int custo = 0;
            for (int j = 0; j < 3; j++) {
                custo += matriz[i][j] * matriz[4][j];
            }
            if (custo > maiorCusto) {
                maiorCusto = custo;
                armazemCaro = i;
            }
        }
        System.out.println("Armazém com maior custo de estocagem: Armazém " + armazemCaro);


    }





}

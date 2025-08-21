//Diogo Gabriel Gouveia Clemente
//Exemplos de teste usados:
//Amizade entre n0 e n1: Amizade entre n0 e n2: Amizade entre n0 e n3: Amizade entre n0 e n4: 
//Amizade entre n1 e n0: Amizade entre n1 e n2: Amizade entre n1 e n3: Amizade entre n1 e n4: 
//Amizade entre n2 e n0: Amizade entre n2 e n1: Amizade entre n2 e n3: Amizade entre n2 e n4: 
//Amizade entre n3 e n0: Amizade entre n3 e n1: Amizade entre n3 e n2: Amizade entre n3 e n4: 
//Amizade entre n4 e n0: Amizade entre n4 e n1: Amizade entre n4 e n2: Amizade entre n4 e n3: 
//Quantidade de amigos por pessoa:
//Pessoa n0 possui 3 amigos.
//Pessoa n1 possui 3 amigos.
//Pessoa n2 possui 2 amigos.
//Pessoa n3 possui 1 amigos.
//Pessoa n4 possui 1 amigos.




//15. Uma rede social de amizades pode ser representada por uma matriz quadrada (mesmo número de linhas e
//colunas) de dimensão número de pessoas da rede social. A amizade entre as pessoas presentes nessa rede
//se dá da seguinte forma: suponha que n0, n1, n2... representa uma pessoa e, caso duas pessoas sejam
//amigas, então a posição da matriz será 1, caso contrário será 0 (zero). Considere a matriz de exemplo
//abaixo:
//Essa matriz representa uma rede social entre 5 pessoas: n0, n1, n2, n3 e n4. Além disso, quando a
//posição (i, j) da matriz é 1, então as pessoas ni e nj são amigas entre si. Caso a posição (i, j) da matriz é
//0, então ni e nj não são amigas. Observe que a pessoa n0 é amiga das pessoas n1, n2 e n4, mas não é
//amiga da pessoa n3. Importante: a relação de amizade é simétrica: se ni é amigo de nj, então nj é,
//necessariamente, amigo de ni. Além disso, em redes sociais de amizade, não existe amizade da pessoa
//com ela mesma. Sabendo disso, implemente um algoritmo que:
//a) preencha a matriz de amizades de uma rede social contendo 5 pessoas;
//b) calcule e imprima a quantidade de amigos que cada pessoa possui.



import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes_15 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rnd=new Random();
        int n = 5;
        int[][] amizades = new int[n][n];




        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    amizades[i][j] = 0;
                } else {
                    System.out.print("Amizade entre n" + i + " e n" + j + ": ");
                    amizades[i][j] = rnd.nextInt(0,2);
                }

            }System.out.println();
        }


        System.out.println("Quantidade de amigos por pessoa:");
        for (int i = 0; i < n; i++) {
            int cont = 0;
            for (int j = 0; j < n; j++) {
                if (amizades[i][j] == 1) {
                    cont++;
                }
            }
            System.out.println("Pessoa n" + i + " possui " + cont + " amigos.");
        }


        }


    }








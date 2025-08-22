//Diogo Gabriel Gouveia Clemente
//Exemplos de teste usados:
//Digite o número de linhas (L)2
//Digite o número de colunas (C) 3
//Linha 1: h
//Linha muito curta! Digite exatamente 3 caracteres.
//Linha 1: dio
//Linha 2: edr
//1 3




//19. Harry ganhou um mapa mágico no qual ele pode visualizar o trajeto realizado por seus amigos. Ele agora
//precisa de sua colaboração para, com a ajuda do mapa, determinar onde Hermione se encontra. O mapa tem L
//linhas e C colunas de caracteres, que podem ser ‘.’ (ponto), a letra ‘o’ ( minúscula) ou a letra ‘H’ (maiúscula).
//A posição inicial de Hermione no mapa é indicada pela letra ‘o’, que aparece exatamente uma vez no mapa. A
//letra ‘H’ indica uma posição em que Hermione pode ter passado -- o mapa é impreciso, e nem toda letra ‘H’
//no mapa representa realmente uma posição pela qual Hermione passou. Mas todas as posições pelas quais
//Hermione passou são representadas pela letra ‘H’ no mapa. A partir da posição inicial de Hermione, Harry
//sabe determinar a posição atual de sua amiga, apesar da imprecisão do mapa, porque eles combinaram que
//Hermione somente se moveria de forma que seu movimento apareceria no mapa como estritamente horizontal
//ou estritamente vertical (nunca diagonal). Além disso, Hermione combinou que não se moveria de forma a
//deixar que Harry tivesse dúvidas sobre seu caminho (por exemplo, Hermione não passa duas vezes pela
//mesma posição). Considere o mapa abaixo, com 6 linhas e 7 colunas:
//A posição inicial de Hermione no mapa é (5,3), e sua posição atual é (4,6). As posições marcadas em negrito
//(‘H’) são erros no mapa. Dado um mapa e a posição inicial de Herminone, você deve escrever um programa
//para determinar a posição atual de Herminone.
//ENTRADA A primeira linha contém dois números inteiros L e C, indicando respectivamente o número de
//linhas e o número de colunas. Cada uma das seguintes L linhas contém C caracteres.
//SAÍDA Seu programa deve produzir uma única linha na saída, contendo dois números inteiros: o número da
//linha e o número da coluna da posição atual de Hermione



import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes_19 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rnd=new Random();
        System.out.print("Digite o número de linhas (L)");
        int L = in.nextInt();
        System.out.print("Digite o número de colunas (C) ");
        int C = in.nextInt();
        in.nextLine();


        char[][] mapa = new char[L][C];
        boolean[][] visitado = new boolean[L][C];

        int x = -1, y = -1;


        for (int i = 0; i < L; i++) {
            String linha;
            do {
                System.out.print("Linha " + (i + 1) + ": ");
                linha = in.nextLine();
                if (linha.length() < C) {
                    System.out.println("Linha muito curta! Digite exatamente " + C + " caracteres.");
                }
            } while (linha.length() < C);

            for (int j = 0; j < C; j++) {
                mapa[i][j] = linha.charAt(j);
                if (mapa[i][j] == 'o') {
                    x = i;
                    y = j;
                }
            }
        }


        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};


        while (true) {
            visitado[x][y] = true;
            boolean achou = false;

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx >= 0 && nx < L && ny >= 0 && ny < C
                        && !visitado[nx][ny] && mapa[nx][ny] == 'H') {
                    x = nx;
                    y = ny;
                    achou = true;
                    break;
                }
            }

            if (!achou) break;
        }

        System.out.println((x + 1) + " " + (y + 1));

    }
}







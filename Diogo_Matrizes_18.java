//Diogo Gabriel Gouveia Clemente
//Exemplos de teste usados:
//Numero de rodadas
//5
//vitoria da rodade de Xerxes
//vitoria da rodade de Xerxes
//vitoria da rodade de Dario
//vitoria da rodade de Xerxes
//vitoria da rodade de Xerxes
//xerxes



//18. A brincadeira da Pedra, Papel e Tesoura, muita gente conhece. Mas dá para fazer uma mais legal
//com cinco opções e não só três! Dois jogadores, dario e xerxes, jogam uma partida com N rodadas. Em
//cada rodada os jogadores escolhem uma "mão" entre cinco opções, que vamos representar aqui com os
//números 0, 1, 2, 3 e 4. A figura define exatamente quem ganha a rodada. Por exemplo,
//se dario escolheu 0 e xerxes escolheu 3, então xerxes ganha a rodada, pois existe uma seta na figura
//indo de 3 para 0.
//Depois de N rodadas, o vencedor da partida é o jogador que ganhou mais rodadas. O número N será
//sempre ímpar, para não haver empate na partida. Vamos também considerar que os jogadores nunca
//escolhem a mesma mão numa rodada, para não haver empate na rodada. Você deve escrever um
//programa que determine quem venceu a partida, se foi dario ou xerxes.

//ENTRADA: primeira linha da entrada contém um inteiro N, o número de rodadas na partida. Cada
//uma das N linhas seguintes contém dois inteiros D e X, representando a mão que os
//jogadores dario e xerxes, respectivamente, jogaram em uma rodada.

//SAÍDA: Seu programa deve imprimir uma linha contendo o nome do jogador que venceu a
//partida: dario ou xerxes. Todas as letras devem ser minúsculas, sem nenhum acento!




import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes_18 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rnd=new Random();
        System.out.println("Numero de rodadas");
        int n = in.nextInt();
        int pontosDario = 0;
        int pontosXerxes = 0;
        int resultado =0;

        for (int i = 0; i < n; i++) {
            int d = rnd.nextInt(0,5);
            int x = rnd.nextInt(0,5);


            resultado = (d - x + 5) % 5;

            if (resultado == 1 || resultado == 2) {

                pontosDario++;
            }
            else {

                pontosXerxes++;
            }
        }

        if (pontosDario > pontosXerxes) {
            System.out.println("dario");
        }
        else {
            System.out.println("xerxes");
        }
        System.out.println("=====================Comentario pessoal: Enunciado muito longo pra uma questão de pouco codigo 9^9");
    }
}







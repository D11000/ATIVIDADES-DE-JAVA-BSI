//Diogo Gabriel Gouveia Clemente
//Exemplos de teste usados:
//========================================
//        MARIAS UNIDAS
//========================================
//a. Vender passagem
//b. Mostrar mapa de ocupação do ônibus
//c. Encerrar
//========================================
//Escolha uma opção: a
//Digite 0 para janela ou 1 para corredor: 1
//Digite o número da poltrona (0 a 23): 24
//Número de poltrona inválido!
//========================================
//        MARIAS UNIDAS
//========================================
//a. Vender passagem
//b. Mostrar mapa de ocupação do ônibus
//c. Encerrar
//========================================
//Escolha uma opção: b
//
//Mapa de ocupação:
//----- Janelas -----
//Janela 0: Livre
//Janela 1: Livre
//Janela 2: Livre
//Janela 3: Livre
//Janela 4: Livre
//Janela 5: Livre
//Janela 6: Livre
//Janela 7: Livre
//Janela 8: Livre
//Janela 9: Livre
//Janela 10: Livre
//Janela 11: Livre
//Janela 12: Livre
//Janela 13: Livre
//Janela 14: Livre
//Janela 15: Livre
//Janela 16: Livre
//Janela 17: Livre
//Janela 18: Livre
//Janela 19: Livre
//Janela 20: Livre
//Janela 21: Livre
//Janela 22: Livre
//Janela 23: Livre
//----- Corredor -----
//Corredor 0: Livre
//Corredor 1: Livre
//Corredor 2: Livre
//Corredor 3: Livre
//Corredor 4: Livre
//Corredor 5: Livre
//Corredor 6: Livre
//Corredor 7: Livre
//Corredor 8: Livre
//Corredor 9: Livre
//Corredor 10: Livre
//Corredor 11: Livre
//Corredor 12: Livre
//Corredor 13: Livre
//Corredor 14: Livre
//Corredor 15: Livre
//Corredor 16: Livre
//Corredor 17: Livre
//Corredor 18: Livre
//Corredor 19: Livre
//Corredor 20: Livre
//Corredor 21: Livre
//Corredor 22: Livre
//Corredor 23: Livre
//
//========================================
//        MARIAS UNIDAS
//========================================
//a. Vender passagem
//b. Mostrar mapa de ocupação do ônibus
//c. Encerrar
//========================================
//Escolha uma opção: c



//12. Faça um programa que preencha uma matriz A[3][4], e outra matriz B[linhas][colunas] em que as
//dimensões são digitadas pelo usuário. Após isso, verifique se a operação de multiplicação de matrizes (A
//x B) pode ser realizada, caso seja possível, realize a operação e imprima a matriz resultante.








import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes_13 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rnd=new Random();


        int[][] onibus = new int[2][24];
        boolean rodando = true;

        while (rodando) {
            System.out.println("========================================");
            System.out.println("        MARIAS UNIDAS");
            System.out.println("========================================");
            System.out.println("a. Vender passagem");
            System.out.println("b. Mostrar mapa de ocupação do ônibus");
            System.out.println("c. Encerrar");
            System.out.println("========================================");
            System.out.print("Escolha uma opção: ");
            char opcao = in.next().toLowerCase().charAt(0);

            switch (opcao) {
                case 'a': {

                    boolean cheio = true;
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 24; j++) {
                            if (onibus[i][j] == 0) {
                                cheio = false;
                                break;
                            }
                        }
                    }
                    if (cheio) {
                        System.out.println("Ônibus lotado! Não há poltronas disponíveis.");
                        break;
                    }

                    System.out.print("Digite 0 para janela ou 1 para corredor: ");
                    int tipo = in.nextInt();
                    if (tipo < 0 || tipo > 1) {
                        System.out.println("Tipo inválido!");
                        break;
                    }

                    System.out.print("Digite o número da poltrona (0 a 23): ");
                    int num = in.nextInt();
                    if (num < 0 || num >= 24) {
                        System.out.println("Número de poltrona inválido!");
                        break;
                    }

                    if (onibus[tipo][num] == 0) {
                        onibus[tipo][num] = 1;
                        System.out.println("Venda efetivada! Poltrona " + num + (tipo == 0 ? " (janela)" : " (corredor)"));
                    } else {
                        System.out.println("Poltrona ocupada!");
                    }
                    break;
                }

                case 'b': {
                    System.out.println("\nMapa de ocupação:");
                    System.out.println("----- Janelas -----");
                    for (int i = 0; i < 24; i++) {
                        String status = (onibus[0][i] == 0 ? "Livre" : "Ocupada");
                        System.out.println("Janela " + i + ": " + status);
                    }
                    System.out.println("----- Corredor -----");
                    for (int i = 0; i < 24; i++) {
                        String status = (onibus[1][i] == 0 ? "Livre" : "Ocupada");
                        System.out.println("Corredor " + i + ": " + status);
                    }
                    System.out.println();
                    break;
                }

                case 'c': {

                    rodando = false;
                    break;
                }

                default:
                    System.out.println("Opção inválida!");
            }
        }


    }





}

//Diogo Gabriel Gouveia Clemente
//Exemplos de teste usados:
//==========================================
//        FLORICULTURA MARIASFLOR
//==========================================
//1. CADASTRAR NOVA PLANTA
//2. RETIRAR PLANTA
//3. INSERIR PLANTA
//4. IMPRIMIR RELATÓRIO
//5. SAIR
//==========================================
//Escolha uma opção: 1
//Digite o código da planta: 12
//Digite o nome da planta: ronaldo
//Digite o estoque ideal: 22
//Digite o estoque atual: 12
//Planta cadastrada com sucesso!
//==========================================
//        FLORICULTURA MARIASFLOR
//==========================================
//1. CADASTRAR NOVA PLANTA
//2. RETIRAR PLANTA
//3. INSERIR PLANTA
//4. IMPRIMIR RELATÓRIO
//5. SAIR
//==========================================
//Escolha uma opção: 2
//Digite o código da planta para retirar: 12
//Digite a quantidade a retirar: 5
//Retirada realizada!
//==========================================
//        FLORICULTURA MARIASFLOR
//==========================================
//1. CADASTRAR NOVA PLANTA
//2. RETIRAR PLANTA
//3. INSERIR PLANTA
//4. IMPRIMIR RELATÓRIO
//5. SAIR
//==========================================
//Escolha uma opção: 3
//Digite o código da planta para inserir: 12
//Digite a quantidade comprada: 25
//Inserção realizada!
//==========================================
//        FLORICULTURA MARIASFLOR
//==========================================
//1. CADASTRAR NOVA PLANTA
//2. RETIRAR PLANTA
//3. INSERIR PLANTA
//4. IMPRIMIR RELATÓRIO
//5. SAIR
//==========================================
//Escolha uma opção: 4
//
//=== RELATÓRIO DE ESTOQUE ===
//============================
//==========================================
//        FLORICULTURA MARIASFLOR
//==========================================
//1. CADASTRAR NOVA PLANTA
//2. RETIRAR PLANTA
//3. INSERIR PLANTA
//4. IMPRIMIR RELATÓRIO
//5. SAIR
//==========================================
//Escolha uma opção: 5
//Encerrando o programa...



//14. Uma floricultura conhecedora de sua clientela gostaria de fazer um algoritmo que pudesse controlar
//sempre um estoque mínimo de determinadas plantas, pois todos os dias, pela manhã, o dono faz novas
//aquisições. Crie um algoritmo que possua as seguintes opções:
//==========================================
//FLORICULTURA MARIASFLOR
//==========================================
//1. CADASTRAR NOVA PLANTA
//2. RETIRAR PLANTA
//3. INSERIR PLANTA
//4. IMPRIMIR RELATÓRIO
//5. SAIR
//===========================================
//O algoritmo deve permitir o cadastro de 50 tipos de plantas. Na opção de cadastro, para cada planta, o
//algoritmo deve cadastrar um código (inteiro), o nome (string), o estoque ideal e a quantidade atual em
//estoque. Na opção retirar planta, o sistema deve permitir a retirada do estoque atual de uma planta,
//dado o código digitado pelo usuário, lembre-se de verificar se o estoque é suficiente para atender o
//pedido. Para a opção de inserção, seu algoritmo deve atualizar o estoque atual de uma certa planta,
//dadas as informações de quantidade comprada e do código da planta que são digitadas pelo usuário.
//Na opção de imprimir relatório, seu algoritmo deve imprimir os nomes, os estoques atuais e as
//quantidades a serem compradas das plantas que possuem estoque abaixo do ideal.






import java.util.Random;
import java.util.Scanner;

public class Diogo_Matrizes_14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rnd=new Random();


        int plantas = 50;
        int[] codigos = new int[plantas];
        String[] nomes = new String[plantas];
        int[] estoqueIdeal = new int[plantas];
        int[] estoqueAtual = new int[plantas];
        int totalPlantas = 0;
        boolean rodando = true;

        while (rodando) {
            System.out.println("==========================================");
            System.out.println("        FLORICULTURA MARIASFLOR");
            System.out.println("==========================================");
            System.out.println("1. CADASTRAR NOVA PLANTA");
            System.out.println("2. RETIRAR PLANTA");
            System.out.println("3. INSERIR PLANTA");
            System.out.println("4. IMPRIMIR RELATÓRIO");
            System.out.println("5. SAIR");
            System.out.println("==========================================");
            System.out.print("Escolha uma opção: ");
            int opcao = in.nextInt();
            in.nextLine();

            switch (opcao) {
                case 1: {
                    if (totalPlantas < plantas) {
                        System.out.print("Digite o código da planta: ");
                        codigos[totalPlantas] = in.nextInt();
                        in.nextLine();

                        System.out.print("Digite o nome da planta: ");
                        nomes[totalPlantas] = in.nextLine();

                        System.out.print("Digite o estoque ideal: ");
                        estoqueIdeal[totalPlantas] = in.nextInt();

                        System.out.print("Digite o estoque atual: ");
                        estoqueAtual[totalPlantas] = in.nextInt();

                        totalPlantas++;
                        System.out.println("Planta cadastrada com sucesso!");
                    } else {
                        System.out.println("Limite máximo de plantas atingido!");
                    }
                    break;
                }

                case 2: {
                    System.out.print("Digite o código da planta para retirar: ");
                    int codigo = in.nextInt();
                    int indice = -1;

                    for (int i = 0; i < totalPlantas; i++) {
                        if (codigos[i] == codigo) {
                            indice = i;
                            break;
                        }
                    }

                    if (indice == -1) {
                        System.out.println("Planta não encontrada!");
                    } else {
                        System.out.print("Digite a quantidade a retirar: ");
                        int qtd = in.nextInt();
                        if (qtd <= estoqueAtual[indice]) {
                            estoqueAtual[indice] -= qtd;
                            System.out.println("Retirada realizada!");
                        } else {
                            System.out.println("Estoque insuficiente!");
                        }
                    }
                    break;
                }

                case 3: {
                    System.out.print("Digite o código da planta para inserir: ");
                    int codigo = in.nextInt();
                    int indice = -1;

                    for (int i = 0; i < totalPlantas; i++) {
                        if (codigos[i] == codigo) {
                            indice = i;
                            break;
                        }
                    }

                    if (indice == -1) {
                        System.out.println("Planta não encontrada!");
                    } else {
                        System.out.print("Digite a quantidade comprada: ");
                        int qtd = in.nextInt();
                        estoqueAtual[indice] += qtd;
                        System.out.println("Inserção realizada!");
                    }
                    break;
                }

                case 4: {
                    System.out.println("\n=== RELATÓRIO DE ESTOQUE ===");
                    for (int i = 0; i < totalPlantas; i++) {
                        if (estoqueAtual[i] < estoqueIdeal[i]) {
                            int falta = estoqueIdeal[i] - estoqueAtual[i];
                            System.out.println("Planta: " + nomes[i] +
                                    " | Estoque Atual: " + estoqueAtual[i] +
                                    " | Precisa comprar: " + falta);
                        }
                    }
                    System.out.println("============================");
                    break;
                }

                case 5: {

                    rodando = false;
                    break;
                }

                default:
                    System.out.println("Opção inválida!");
            }
        }





        }


    }







//17. Faça um algoritmo que simule o funcionamento de uma calculadora que contenha as operações
//aritméticas básicas com dois números digitados pelo usuário. O programa implementado deve mostrar
//seguinte menu ao usuário. Não se esqueça de verificar se as operações podem ser realizadas.
//====================
//Calculadora de Fulano
//====================
// Opções:
// 1 - Soma
// 2 - Subtração
// 3 - Multiplicação
// 4 - Divisão
// 5 – Sair
//====================

import java.util.Scanner;

public class DiogoLista4_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("====================");
            System.out.println("Calculadora de Fulano");
            System.out.println("====================");
            System.out.println(" Opções:");
            System.out.println(" 1 - Soma");
            System.out.println(" 2 - Subtração");
            System.out.println(" 3 - Multiplicação");
            System.out.println(" 4 - Divisão");
            System.out.println(" 5 - Sair");
            System.out.println("====================");
            System.out.print("Escolha uma opção: ");
            opcao = in.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = in.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = in.nextDouble();

                if (opcao == 1) {
                    System.out.println("Resultado: " + (num1 + num2));
                } else if (opcao == 2) {
                    System.out.println("Resultado: " + (num1 - num2));
                } else if (opcao == 3) {
                    System.out.println("Resultado: " + (num1 * num2));
                } else if (opcao == 4) {
                    if (num2 == 0) {
                        System.out.println("Erro: divisão por zero.");
                    } else {
                        System.out.println("Resultado: " + (num1 / num2));
                    }
                }
            } else if (opcao == 5) {
                System.out.println("Encerrando a calculadora...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        }
    }
}

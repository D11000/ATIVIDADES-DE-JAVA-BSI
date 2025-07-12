//18. Construa um algoritmo para calcular a média de valores PARES e ÍMPARES, que serão digitados pelo
//usuário. Ao final, o algoritmo deve mostrar estas duas médias bem como o maior número PAR e o menor
//número ÍMPAR digitado. O algoritmo finaliza quando o usuário digitar um valor negativo

import java.util.Scanner;

public class DiogoLista4_18{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int somaPares = 0, somaImpares = 0;
        int contPares = 0, contImpares = 0;
        int maiorPar = Integer.MIN_VALUE;
        int menorImpar = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um número (negativo para sair): ");
            num = in.nextInt();

            if (num < 0) {
                break;
            }

            if (num % 2 == 0) {
                somaPares += num;
                contPares++;
                if (num > maiorPar) {
                    maiorPar = num;
                }
            } else {
                somaImpares += num;
                contImpares++;
                if (num < menorImpar) {
                    menorImpar = num;
                }
            }
        }


        if (contPares > 0) {
            System.out.println("Média dos pares: " + (somaPares / (double) contPares));
            System.out.println("Maior número par: " + maiorPar);
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }

        if (contImpares > 0) {
            System.out.println("Média dos ímpares: " + (somaImpares / (double) contImpares));
            System.out.println("Menor número ímpar: " + menorImpar);
        } else {
            System.out.println("Nenhum número ímpar foi digitado.");
        }
    }
}
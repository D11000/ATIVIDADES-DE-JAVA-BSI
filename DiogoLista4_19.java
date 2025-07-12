//19. Implemente um programa que receba de entrada um número inteiro qualquer, após isso verifique se o
//número inserido é ou não um PALÍNDROMO, ou seja, o número é o mesmo tanto de visto da direita para
//esquerda quanto da esquerda para a direita. Ex: 121, 1441, 34643, etc. Não utilize funções pré-definidas
//no JAVA.

import java.util.Scanner;

public class DiogoLista4_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroOriginal = in.nextInt();

        int numero = numeroOriginal;
        int invertido = 0;


        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }


        if (numeroOriginal == invertido) {
            System.out.println(numeroOriginal + " é um palíndromo.");
        } else {
            System.out.println(numeroOriginal + " não é um palíndromo.");
        }
    }
}

//10. Implemente um algoritmo que receba de entrada N valores digitados pelo usuário. Dentre os valores
//digitados, seu programa deve encontrar o menor e o maior dos valores fornecidos.
import java.util.Scanner;

public class Diogo_Rep10 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero");
        int N = in.nextInt();

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= N; i++) {
            System.out.print("Digite o valor " + i + ": ");
            int vl = in.nextInt();

            if (vl > maior) {
                maior = vl;
            }

            if (vl < menor) {
                menor = vl;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
                System.out.println("Maior: " + maior + " Menor: " + menor);








        }

}

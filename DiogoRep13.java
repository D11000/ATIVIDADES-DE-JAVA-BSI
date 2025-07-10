//13. Faça um algoritmo para identificar se um determinado número fornecido pelo usuário é primo ou não.
//Lembrando que um número primo só é divisível por 1 e por ele mesmo. Exemplos: 2, 5, 7, etc.


import java.util.Scanner;

public class DiogoRep13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean Primo = true;

        if (numero <= 1) {
            Primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    Primo = false;
                    break;

                }
            }
        }

        if (Primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
//24. Suponha que JAVA possua somente as operações de soma e subtração. Dados dois números inteiros
//positivos A e B, determine o quociente e o resto da divisão de A por B.

import java.util.Scanner;

public class DiogoLista4_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor de A (Dividendo): ");
        int A = in.nextInt();

        System.out.print("Digite o valor de B (Divisor): ");
        int B = in.nextInt();

        if (B <= 0) {
            System.out.println("Erro: O divisor deve ser maior que zero.");
            return;
        }

        int quociente = 0;
        int resto = A;

        while (resto >= B) {
            resto = resto - B;
            quociente++;
        }

        System.out.println("Quociente = " + quociente);
        System.out.println("Resto = " + resto);
    }
}

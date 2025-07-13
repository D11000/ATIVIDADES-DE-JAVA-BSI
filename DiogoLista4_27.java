//27. Escreva um programa em JAVA que imprima o triângulo abaixo, em que a altura do triângulo (número de
//linhas) é fornecido pelo usuário.
//#
//##
//###
//####
//#####
//######
import java.util.Scanner;

public class DiogoLista4_27 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("Digite um valor de altura ");
        int alt = In.nextInt();
        for (int i = 1; i <= alt; i++) {

            for (int j = 0; j < alt - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}

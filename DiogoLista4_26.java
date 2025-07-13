//26. Implemente um programa que solicite um valor inteiro positivo (N) ao usuário. Após isso, imprima a
//tabuada dos números de 1 à N
import java.util.Scanner;

public class DiogoLista4_26 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("Digite um valor ");
        int N = In.nextInt();
        for (int i = 1 ; i <= N ; i++ ){
            int tab= i * N;
            System.out.println(i + " X " + N + " = "+ tab );
        }
    }
}

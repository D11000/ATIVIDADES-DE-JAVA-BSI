import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Diogo_Vetores_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite quantos termos deseja: ");
        int n = in.nextInt();
        int [ ] F= new int[n];


        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: ");

        for (int i = 0; i < n; i++) {

            int temp = a + b;
            a = b;
            b = temp;
            F[i]=temp;


        }
        System.out.println(Arrays.toString(F));

    }
}
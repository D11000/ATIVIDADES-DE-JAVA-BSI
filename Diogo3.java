//3. Implemente um algoritmo que receba 3 números reais de entrada. Calcule e mostre o resultado da
//multiplicação dos dois primeiros números dividido pelo terceiro número fornecido pelo usuário. Sabe-se
//que o denominador não pode ser zero, mas neste momento não se preocupe com as validações
import java.util.Scanner;

public class Diogo3 {
    public static void main(String[] args) {
        double a,b,c,d ;
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite esses valores ");

        a=dados.nextDouble();
        b=dados.nextDouble();
        c=dados.nextDouble();
        d= a*b/c;
        System.out.println("O valor é "+d);



    }
}

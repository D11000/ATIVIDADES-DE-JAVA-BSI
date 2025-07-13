//23. Implementar um algoritmo para calcular o sen(X). Sabe-se que o valor de X deverá ser fornecido pelo
//usuário em graus, mas a sequência funciona com o valor em radianos. O valor do seno de X será
//calculado pela soma dos 15 primeiros termos da série a seguir:
//Sen(x)=x-x^3/3!+x^5/5!+x^9/9!+x^11/11!
import java.util.Scanner;

public class DiogoLista4_23 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Digite o valor de X (em graus): ");
        double graus = in.nextDouble();


        double x = graus * Math.PI / 180.0;

        double seno = 0.0;
        int sinal = 1;
        int expoente = 1;

        for (int i = 0; i < 15; i++) {

            long fatorial = 1;
            for (int j = 2; j <= expoente; j++) {
                fatorial *= j;
            }

            double termo = sinal * Math.pow(x, expoente) / fatorial;
            seno += termo;

            sinal *= -1;
            expoente += 2;
        }

        System.out.printf("O seno aproximado de %.2f graus é: %.10f\n", graus, seno);
    }
}
import java.util.Scanner;

public class DiogoLista4_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cad1 = 0, cad2 = 0, cad3 = 0, cad4 = 0;
        int branco = 0, nulo = 0;
        int cod;

        System.out.println("Digite o código do voto (1-4 para candidatos, 5 para branco, 0 para encerrar):");

        do {
            cod = in.nextInt();

            if (cod == 1) {
                cad1++;
            } else if (cod == 2) {
                cad2++;
            } else if (cod == 3) {
                cad3++;
            } else if (cod == 4) {
                cad4++;
            } else if (cod == 5) {
                branco++;
            } else if (cod != 0) {
                nulo++;
            }

        } while (cod != 0);

        System.out.println("\nResultado da eleição:");
        System.out.println("Candidato 1: " + cad1 + " votos");
        System.out.println("Candidato 2: " + cad2 + " votos");
        System.out.println("Candidato 3: " + cad3 + " votos");
        System.out.println("Candidato 4: " + cad4 + " votos");
        System.out.println("Brancos: " + branco + " votos");
        System.out.println("Nulos: " + nulo + " votos");
    }
}
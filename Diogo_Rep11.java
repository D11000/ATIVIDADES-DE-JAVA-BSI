//11. Faça um programa que leia a nota e o nome de N alunos na prova de algoritmos e imprima a maior e a
//menor nota computada e qual aluno tirou tais notas. Além disso, calcule e imprima também a soma e a
//média de todas as notas.
import java.util.Scanner;

public class Diogo_Rep11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int N = in.nextInt();

        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        String alunoMaiorNota = "";
        String alunoMenorNota = "";
        double soma = 0;

        for (int i = 1; i <= N; i++) {
            System.out.println("Digite o nome do aluno " + i + ": ");
            String nome = in.next();

            System.out.println("Digite a nota do aluno " + nome + ": ");
            double nota = in.nextDouble();

            // Atualiza maior nota
            if (nota > maiorNota) {
                maiorNota = nota;
                alunoMaiorNota = nome;
            }

            // Atualiza menor nota
            if (nota < menorNota) {
                menorNota = nota;
                alunoMenorNota = nome;
            }

            // Soma das notas
            soma += nota;
        }

        double media = soma / N;

        System.out.println("\n--- Resultados ---");
        System.out.println("Maior nota: " + maiorNota + " - Aluno: " + alunoMaiorNota);
        System.out.println("Menor nota: " + menorNota + " - Aluno: " + alunoMenorNota);
        System.out.println("Soma das notas: " + soma);
        System.out.printf("Média das notas: %.2f\n", media);

        in.close();
    }
}
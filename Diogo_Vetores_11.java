import java.util.Arrays;
import java.util.Random;

//11. Desenvolva um programa que identifique, armazene em um vetor e mostre os 10 primeiros números
//primos a partir de 100. O algoritmo fica muito mais eficiente utilizando o crivo de Eratóstenes. Como
//desafio, implemente o algoritmo utilizando a “forma tradicional” e depois utilizando o crivo de
//Eratóstenes, compute os tempos de ambas implementações e verifique a diferença entre os mesmos.


import java.util.Random;

public class Diogo_Vetores_11 {

    public static void Veto_tradicional() {
        System.out.println("=== Primos de 2 até 100 (Método Tradicional) ===");

        for (int num = 2; num <= 100; num++) {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(num + " é primo");
            }
        }
    }

    public static void Vetor_crivo() {
        System.out.println("=== Primos de 2 até 100 (Crivo de Eratóstenes) ===");
        int limite = 100;
        boolean[] primo = new boolean[limite + 1];

       
        for (int i = 2; i <= limite; i++) {
            primo[i] = true;
        }


        for (int i = 2; i * i <= limite; i++) {
            if (primo[i]) {
                for (int j = i * i; j <= limite; j += i) {
                    primo[j] = false;
                }
            }
        }


        for (int i = 2; i <= limite; i++) {
            if (primo[i]) {
                System.out.println(i + " é primo");
            }
        }
    }

    public static void main(String[] args) {
        Vetor_crivo();
        Veto_tradicional();
    }
}
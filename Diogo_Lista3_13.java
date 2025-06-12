
//13. Faça um programa que recebe de entrada três valores. Verificar se esses valores podem formar um
//triângulo. Caso não, informar que não forma um triângulo; caso sim, imprima que tipo de triângulo é
//formado (escaleno, isósceles ou equilátero).
import java.util.Scanner;
public class Diogo_Lista3_13 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um valor");
        double ladoA = ent.nextDouble();
        System.out.println("Digite um valor");
        double ladoB = ent.nextDouble();
        System.out.println("Digite um valor");
        double ladoC = ent.nextDouble();
        double condEx = ladoA + ladoB;


        if (condEx < ladoC) {
            if (ladoA == ladoB && ladoC == ladoA && ladoC == ladoB) {
                System.out.println("É um triangulo equilatero ");


            } else if (ladoA == ladoB || ladoC == ladoA || ladoC == ladoB) {
                System.out.println("É um triangulo isoceles ");


            } else {

                System.out.println("É um triangulo escaleno ");

            }


        } else {

            System.out.println("Não é um triangulo ");

        }


    }
}


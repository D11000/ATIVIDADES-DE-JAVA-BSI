//12. No último ano foi realizada um estudo estatístico sobre acidentes de trânsito em 5 cidades brasileiras.
//Para isso os seguintes dados foram coletados:
//a) Nome da cidade (String ou char).
//b) Número de veículos
//c) Número de acidentes de trânsito
//Com esses dados deseja-se saber:
//a) O maior e o menor índice de acidentes e o nome da cidade a que pertencem
//b) A razão entre quantidade de acidentes por quantidade de veículos nas 5 cidades analisadas
//c) A média de veículos nas cinco cidades
//d) A média de acidentes de trânsito nas cidades com menos de 200 veículos
import java.util.Scanner;

public class Diogo_Rep12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         int TOTAL_CIDADES = 5;

        String cidadeMaiorIndice = "", cidadeMenorIndice = "";
        double maiorIndice = -1, menorIndice = Double.MAX_VALUE;

        int somaVeiculos = 0;
        int somaAcidentesMenos200 = 0;
        int cidadesMenos200 = 0;

        for (int i = 1; i <= TOTAL_CIDADES; i++) {
            System.out.println("Cidade " + i + ":");
            System.out.print("Nome da cidade: ");
            String nome = in.next();

            System.out.print("Número de veículos: ");
            int veiculos = in.nextInt();

            System.out.print("Número de acidentes: ");
            int acidentes = in.nextInt();


            double indice = (double) acidentes / veiculos;


            if (indice > maiorIndice) {
                maiorIndice = indice;
                cidadeMaiorIndice = nome;
            }

            if (indice < menorIndice) {
                menorIndice = indice;
                cidadeMenorIndice = nome;
            }


            somaVeiculos += veiculos;


            if (veiculos < 200) {
                somaAcidentesMenos200 += acidentes;
                cidadesMenos200++;
            }


            System.out.printf("Razão acidentes/veículos na cidade %s: %.2f\n\n", nome, indice);
        }

        double mediaVeiculos = (double) somaVeiculos / TOTAL_CIDADES;


        double mediaAcidentesMenos200 = cidadesMenos200 > 0 ?
                (double) somaAcidentesMenos200 / cidadesMenos200 : 0;


       
        System.out.printf("Maior índice de acidentes: %.2f - Cidade: %s\n", maiorIndice, cidadeMaiorIndice);
        System.out.printf("Menor índice de acidentes: %.2f - Cidade: %s\n", menorIndice, cidadeMenorIndice);
        System.out.printf("Média de veículos nas 5 cidades: %.2f\n", mediaVeiculos);
        System.out.printf("Média de acidentes nas cidades com menos de 200 veículos: %.2f\n", mediaAcidentesMenos200);

        in.close();
    }
}
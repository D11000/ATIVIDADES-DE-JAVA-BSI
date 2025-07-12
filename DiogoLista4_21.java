//21. Uma Empresa de fornecimento de energia elétrica faz a leitura mensal dos medidores de consumo. Para
//cada consumidor, são digitados os seguintes dados:
//- Número do consumidor;
//7
//Elaboração Prof. Bruno Nonato Gomes
//INSTITUTO FEDERAL DE MINAS GERAIS
//Campus Sabará
//- Quantidade de kWh consumidos durante o mês;
//- Tipo (código) do consumidor.
//1 – residencial, preço em reais por kWh = 0,3
//2 – comercial, preço em reais por kWh = 0,5
//3 – industrial, preço em reais por kWh = 0,7
//Os dados devem ser lidos até que seja encontrado um consumidor com Número 0 (zero). Escreva um
//programa que calcule e imprima:
//- O custo total para cada consumidor;
//- O total de consumo para os três tipos de consumidor;
//- A média de consumo dos tipos 1 e 2.

import java.util.Scanner;

public class DiogoLista4_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        double totalResidencial = 0;
        double totalComercial = 0;
        double totalIndustrial = 0;
        int contadorTipo1e2 = 0;
        double somaTipo1e2 = 0;

        while (true) {
            System.out.print("Número do consumidor (0 para sair): ");
            int numero = in.nextInt();

            if (numero == 0) {
                break;
            }

            System.out.print("Quantidade de kWh consumidos: ");
            double kwh = in.nextDouble();

            System.out.print("Tipo do consumidor (1-Residencial, 2-Comercial, 3-Industrial): ");
            int tipo = in.nextInt();

            double custo = 0;

            if (tipo == 1) {
                custo = kwh * 0.3;
                totalResidencial += kwh;
                somaTipo1e2 += kwh;
                contadorTipo1e2++;
            } else if (tipo == 2) {
                custo = kwh * 0.5;
                totalComercial += kwh;
                somaTipo1e2 += kwh;
                contadorTipo1e2++;
            }
            else if (tipo == 3) {
                custo = kwh * 0.7;
                totalIndustrial += kwh;
            }
            else {
                System.out.println("Tipo de consumidor inválido! Dados ignorados.");

            }

            System.out.println("Custo total para o consumidor " + numero + ": R$ " + custo);
            System.out.println("--------------------------------------");
        }


        System.out.println("\n=== RELATÓRIO FINAL ===");
        System.out.println("Total de consumo Residencial (Tipo 1): " + totalResidencial + " kWh");
        System.out.println("Total de consumo Comercial (Tipo 2): " + totalComercial + " kWh");
        System.out.println("Total de consumo Industrial (Tipo 3): " + totalIndustrial + " kWh");

        if (contadorTipo1e2 > 0) {
            double media = somaTipo1e2 / contadorTipo1e2;
            System.out.println("Média de consumo dos Tipos 1 e 2: " + media + " kWh");
        } else {
            System.out.println("Nenhum consumo dos Tipos 1 e 2 foi registrado.");
        }
    }
}
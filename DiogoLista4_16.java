//16. Elabore um algoritmo que faça a conversão de um número binário de N bits digitados pelo usuário para o
//número na base octal, base decimal e base hexadecimal. Valide se o valor informado na entrada só
//possui 0’s ou 1’s, ou seja, se é mesmo um número binário. Não utilize funções pré-definidas no
//JAVA.

import java.util.Scanner;

public class DiogoLista4_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número binário: ");
        String binario = in.nextLine();

        boolean binarioValido = true;
        for (int i = 0; i < binario.length(); i++) {
            char c = binario.charAt(i);
            if (c != '0' && c != '1') {
                binarioValido = false;
                break;
            }
        }

        if (!binarioValido) {
            System.out.println("Erro: O número informado não é binário.");
            return;
        }


        int decimal = 0;
        int potencia = 1;
        for (int i = binario.length() - 1; i >= 0; i--) {
            if (binario.charAt(i) == '1') {
                decimal += potencia;
            }
            potencia *= 2;
        }


        String octal = "";
        int tempDecimal = decimal;
        if (tempDecimal == 0) octal = "0";
        while (tempDecimal > 0) {
            int resto = tempDecimal % 8;
            octal = resto + octal;
            tempDecimal /= 8;
        }


        String hexadecimal = "";
        tempDecimal = decimal;
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};
        if (tempDecimal == 0) hexadecimal = "0";
        while (tempDecimal > 0) {
            int resto = tempDecimal % 16;
            hexadecimal = hexChars[resto] + hexadecimal;
            tempDecimal /= 16;
        }


        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
    }
}
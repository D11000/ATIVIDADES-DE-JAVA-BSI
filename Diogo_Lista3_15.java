
//13. Faça um programa que recebe de entrada três valores. Verificar se esses valores podem formar um
//triângulo. Caso não, informar que não forma um triângulo; caso sim, imprima que tipo de triângulo é
//formado (escaleno, isósceles ou equilátero).
import java.util.Scanner;
public class Diogo_Lista3_15 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um  numero de 4 digitos");
        String num = ent.nextLine();
        char DG1= num.charAt(0);
        char DG2= num.charAt(1);
        char DG3= num.charAt(2);
        char DG4= num.charAt(3);
        if (num.length() != 4) {
            System.out.println("Erro: o número deve ter exatamente 4 dígitos!");
        }
        else {



            if (DG1 != '0' && DG1 != '1'){
               System.out.println("Não é binario");
            }
            else if (DG2 != '0'&& DG2 != '1') {

            }
            else if (DG3 != '0'&& DG3 != '1') {

            }
            else if (DG4 != '0'&& DG4 != '1') {

            }

            else
            {
                int bit1,bit2,bit3,bit4;
                if (DG1 == '0'){
                    bit1=0;

                }
                else {
                    bit1=1;
                }
                if (DG2 == '0'){
                    bit2=0;

                }
                else {
                    bit2=1;
                }
                if (DG3 == '0'){
                    bit3=0;

                }
                else {
                    bit3=1;
                }
                if (DG4 == '0'){
                    bit4=0;

                }
                else {
                    bit4=1;

                }

                int numfinal= bit1 + bit2*2 +bit3*4+bit4*8;
                System.out.println("O numero é :"+ numfinal);

            }







        }
    }
}


//14. Implemente um programa que receba um número inteiro de 3 dígitos de entrada. Após isso, verifique se o
//mesmo é palíndromo, ou seja, é o mesmo número lido da direita para esquerda ou vice-versa. Ex.: 121,
//353, etc.
import java.util.Scanner;
public class Diogo_Lista3_14 {
    public static boolean isPalindrome(int num){
        String numStr = String.valueOf(num);
        String revNum = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(revNum);
    }
    public static void main(String[] args) {


        Scanner ent = new Scanner(System.in);
        System.out.println("Digite um valor");
        int num = ent.nextInt();






        if (num >= 100 && num <900) {
            int ver = num % 100;
            int numinvert= 0*10 + ver;
            int numerofinal = numinvert/10;
            if(num== numerofinal){


            }



        }

    }
}


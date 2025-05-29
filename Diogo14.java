//14. Sabe-se que, para iluminar corretamente os cômodos de uma casa, para cada m2, deve-se usar 18 W de
//potência. Faça um programa que receba as dimensões de um cômodo retangular (em metros), calcule e
//mostre a área de mesmo (em m2) e a potência de iluminação necessária para iluminar corretamente o
//cômodo.


import java.util.Scanner;

public class Diogo14 {
    public static void main (String[]args){
        Scanner E = new Scanner(System.in);
        System.out.println("Digite o valor da base");
        int base= E.nextInt();
        System.out.println("Digite o valor da base");
        int altura = E.nextInt();
        int area= base*altura;
        int potencia = area*18;
        System.out.println("A potencia total é "+ potencia+" " );



    }
}

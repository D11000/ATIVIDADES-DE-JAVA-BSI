//17. Faça um programa que receba de entrada um número real, encontre e mostre:
//a. A parte inteira desse número;
//b. A parte fracionária desse número.
import java.util.Scanner;



public class Diogo17 {
    public static void main (String[] args){
        Scanner ent = new Scanner(System.in);
        System.out.println("digite um numero ");
        double Numero_real= ent.nextDouble();
        int Parte_inteira= (int )Math.floor(Numero_real);
        double Parte_decimal= Numero_real- Parte_inteira;
        System.out.println ("A parte inteira é" + Parte_inteira + "e a parte decimal é "+Parte_decimal);


    }
}

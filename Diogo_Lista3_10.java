//10. O IMC (Índice de Massa Corporal) é um critério da Organização Mundial de Saúde para dar uma
//indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = PESO/(ALTURA²).
//Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição.
import java.util.Scanner;
public class Diogo_Lista3_10 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o  peso");
        double peso= ent.nextDouble();
        System.out.println("Digite a altura");
        double altura= ent.nextDouble();
        double convert= altura/100;

        double Icm= peso/Math.pow(convert,2);

        if (Icm <= 18.5){
            System.out.println("Abaixo do peso");
        }
        else if (Icm >= 18.5 &&  Icm <= 25) {
            System.out.println("Peso normal");

        }
        else if (Icm >= 25 &&  Icm <= 30) {
            System.out.println("Acima do peso");

        }
        else if (Icm >= 30) {
            System.out.println("Obeso");

        }




    }
}
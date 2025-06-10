//4. Faça um programa que simule uma calculadora simples. Para isso, o usuário deverá entrar com dois
//números quaisquer e a operação que deseja realizar: '+' soma; ' - ' subtração; ' * ' multiplicação e ' / '
//divisão. Lembre-se das condições para realizar a divisão (condicional aninhada).
import java.util.Scanner;
public class Diogo_Lista3_4 {
    public  static void main(String[] args) {
        Scanner ent= new Scanner(System.in);
        System.out.println("Digite um  numero");

        double numero= ent.nextDouble();
        System.out.println("Digite um operador");
        char operação = ent.next().charAt(0);
        System.out.println("Digite um numero");
        double numero2= ent.nextDouble();
        double solucao;
        switch (operação){
            case '+':
                solucao=numero+numero2;
                System.out.println(" Resultado " + solucao);
                break;
            case '-'  :
                solucao= numero-numero2;
                System.out.println(" Resultado " + solucao);
                break;
            case '*':
                solucao=numero*numero2;
                System.out.println(" Resultado " + solucao);
                break;
            case '/'  :
                solucao= numero/numero2;
                System.out.println(" Resultado " + solucao);
                break;
        }




    }
}

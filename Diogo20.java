//20. Faça um algoritmo que receba o número de horas trabalhadas, o valor do salário mínimo e o número de
//horas extras trabalhadas. Calcule e mostre o salário a receber seguindo as seguintes regras:
//a) O valor a ser pago por hora trabalhada é 0.125 do salário mínimo;
//b) O valor a ser pago por hora extra vale 0.25 do salário mínimo;
//c) o salário bruto equivale ao número de horas trabalhadas vezes o valor pago por hora;
//d) a quantia a receber por horas extras equivale à horas extras realizadas multiplicado pelo valor pago
//por hora extra;
//e) o salário a receber equivale à soma do salário bruto mais a quantia a receber pelas horas extras.
import java.util.Scanner;


public class Diogo20 {
    public static void main (String[] args){
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite um valor de salario");

        double Salario= ent.nextDouble();

        System.out.println("Digite o numero de horas trabalhadas");

        double Horas= ent.nextDouble()
                ;
        System.out.println("Digite o   numero  Horas Extras");

        double HorasEX= ent.nextDouble();

        double valor_de_hora =Salario*0.125;
        double valor_de_horasEx=Salario*0.25;
        double Salario_bruto =Horas* valor_de_horasEx ;
        double Recebido_de_horasEX= HorasEX*valor_de_horasEx;
        double Salario_final=Salario_bruto+Recebido_de_horasEX;
        System.out.println("O salario é :" + Salario_final+valor_de_hora );




    }

}

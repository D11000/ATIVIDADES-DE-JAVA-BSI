//7. Na cidade de Sabará, para transferências de veículos, a SABATRAN cobra uma taxa de 1% para carros
//fabricados antes de 1990 e uma taxa de 1.5% para os fabricados de 1990 em diante. Essa taxa está
//incidindo sobre o valor de tabela do carro. Implemente um algoritmo que lê o ano de fabricação e o preço
//do carro e a seguir calcula e imprime imposto a ser pago.
import java.util.Scanner;
public class Diogo_Lista3_7 {
    public static void main(String[]args){
    Scanner ent = new Scanner(System.in);
    System.out.println("Digite o valor de tabela do carro ");
    double valor_de_tabela = ent.nextDouble();
    System.out.println("Digite a data de fabricação do carro ");
    double data = ent.nextDouble();
    if(data <1990){
        double taxa = valor_de_tabela*0.01;
        double valor_total= taxa*valor_de_tabela;
        System.out.println("O valor de imposto é :  "+ valor_total);

    }
    if (data >= 1990){
        double taxa = valor_de_tabela*0.015;
        double valor_total= taxa*valor_de_tabela;
        System.out.println("O valor de imposto é :  "+ valor_total);


    }



    }
}

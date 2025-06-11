//9. Refaça o exercício referente à equação do segundo grau do roteiro anterior considerando todas as
//condições possíveis, conforme fluxograma abaixo.
import java.util.Scanner;
public class Diogo_Lista3_9 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o valor de X");
        double a= ent.nextDouble();
        double b= ent.nextDouble();
        double c= ent.nextDouble();






        if(a == 0){

            System.out.println("Não é equação do segundo grau" );
            if (b==0){
                System.out.println("Não é equação do primeiro  grau" );


            }
            else {
                double r= -c/b;
                System.out.println("A raiz é "+r );
            }
        }
        else if (a> 0 ){
            double d= b*b -4*a*c;
            if (d  < 0 ){
                System.out.println("Não há raizes reais");


            }
            else if (d > 0 ) {
                double r1= -b- Math.sqrt(d)/2*a;
                double r2= -b+ Math.sqrt(d)/2*a;
                System.out.println("As raizes são  : " + r1 + " " + r2);

            }


        }

    }
}

//10. Implemente um algoritmo que receba de entrada N valores digitados pelo usuário. Dentre os valores
//digitados, seu programa deve encontrar o menor e o maior dos valores fornecidos.
import java.util.Scanner;

public class Diogo_Rep10 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("Digite um numero");
        int N = in.nextInt();
        System.out.println("Digite um valor");
        int maior  ;
        int menor  ;



        for ( int i = 1 ; i <= N ; i++){



            int vl = in.nextInt();



            if (i < N){

            if (vl < i ){

                menor= vl;
                maior= vl;
                System.out.println("Maior "+maior + "Menor "+ menor );}




            }
            else if (vl > N) {
                maior = vl;
                menor= vl;
                System.out.println("Maior "+maior + "Menor "+ menor );
            }


        }





    }
}

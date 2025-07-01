// 4. Escreva um algoritmo que receba números do usuário e imprima o triplo de cada número. O algoritmo
//deve encerrar ao ser digitado o número –999. Obs.: O triplo de -999 não deve ser exibido
import java.util.Scanner;

public class Diogo_Rep4 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        int num = 0;
        
      while (num != -999){
          System.out.println("Digite o número ");
          num = in.nextInt();
          int triplo = num * 3;


          System.out.println("o triplo é "+ triplo);

      }
    }
}

//13. Faça um algoritmo para identificar se um determinado número fornecido pelo usuário é primo ou não.
//Lembrando que um número primo só é divisível por 1 e por ele mesmo. Exemplos: 2, 5, 7, etc.
//import java.util.Scanner;
//
//public class DiogoRep13 {
//    public static void main(String[]args){
//        Scanner in= new Scanner(System.in);
//        int num;
//        boolean primo ;
//        System.out.println("Digite um numero ");
//
//        num = in.nextInt();
//
//        if (num% 4 == 0||num%3==0){
//            System.out.println(num+ " Não é primo");
//        }
//        else if (num/2!=0){
//            if(num/num == 1 && num /1 ==num) {
//                System.out.println(num+ " É primo");
//
//            }
//
//
//
//        }
//           // for (int i =2 ; i < num ; i++){
//                //System.out.println(i+" Debug "+ "***********");
////                if ( num%i == 0){
////
////                    System.out.println("O numero "+num+ " não é primo");
////                    break;
////
////
////
////                }
////                else if (num%i ==1 ) {
////                    num =
////                    System.out.println("O numero "+num+ " é primo");
////
////
////
//
//
//
//
//    }
//}
import java.util.Scanner;

public class DiogoRep13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
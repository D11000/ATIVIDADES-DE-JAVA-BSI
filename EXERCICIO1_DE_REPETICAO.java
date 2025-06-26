import java.util.Scanner;

public class EXERCICIO1_DE_REPETICAO {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int NUMERO;
        do {
            System.out.println("DIGITE 0 PARA SAIR  ");
            System.out.println("DIGITE UM NUMERO  ");
            NUMERO = teclado.nextInt();

            if (NUMERO > 0){
                if (NUMERO % 2 !=0){
                    NUMERO = NUMERO*2;
                    System.out.println(" O numero impar : "+NUMERO);
                }
                else {
                    NUMERO = NUMERO*3;
                    System.out.println("O numero par  : "+NUMERO);
                }
            }
            else if (NUMERO<0) {
                NUMERO = NUMERO* NUMERO;
                System.out.println("O numero negativo: "+NUMERO);
            }
        }

        while (NUMERO != 0);
    }
}
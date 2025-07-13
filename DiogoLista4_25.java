//25. Escrever um algoritmo que gera e escreve os 5 primeiros números perfeitos. Um número perfeito é aquele
//que é igual a soma dos seus divisores. (Ex.: 6 = 1+2+3; 28= 1+2+4+7+14 etc).

public class DiogoLista4_25 {
    public static void main(String[] args) {
        int numero = 2;
        int encontrados = 0;

        System.out.println("Os 5 primeiros números perfeitos são:");

        while (encontrados < 5) {
            int somaDivisores = 0;


            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    somaDivisores += i;
                }
            }


            if (somaDivisores == numero) {
                System.out.println(numero);
                encontrados++;
            }

            numero++;
        }
    }
}


//5. Implemente um algoritmo que preencha com valores inteiros um vetor de 10 posições. Em seguida
//solicite o usuário que digite um valor qualquer e pesquise se o valor informado pelo usuário pertence ou
//não ao vetor preenchido inicialmente. Caso não, mostre a mensagem “O valor X não está presente no
//vetor”; caso sim, mostre a mensagem “O valor X está na posição Y do vetor”. Exemplo:
//Vetor preenchido: [50 60 15 22 33 84 100]
//Valor digitado pelo usuário: 30 -> Mensagem: “Valor 30 não está presente no vetor”
//Valor digitado pelo usuário: 84 -> Mensagem: “Valor 84 está na 6ª posição do vetor”
import java.util.Arrays;
import java.util.Scanner;

public class Diogo_Vetores_5 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        int[] vetor= new int[10];

        for (int i =0 ;i < vetor.length;i++){
            System.out.println("Digite o valor do vetor");
            vetor[i]= in.nextInt();

        }
        System.out.println("Digite o valor da busca");
        int busca = in.nextInt();

        int posicao = -1;

        for (int i =0 ;i < vetor.length;i++){
            if(vetor[i]== busca){


                posicao = i;
                System.out.println("O valor " + busca+ " esta na "+ posicao + " poçição do vetor");
                break;


            }

            else {
                System.out.println("O valor "+ busca+" não está presente no vetor");

            }
        }









    }
}

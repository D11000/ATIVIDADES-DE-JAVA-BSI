//16. Um sistema de informações geográficas computadorizado está representando o perfil de uma montanha
//através de uma sequência de números inteiros, na qual não há dois números consecutivos iguais, como
//ilustrado na figura abaixo para três montanhas. Os números representam a altura da montanha ao longo de
//uma certa direção.

//O gerente do sistema de informações geográficas pesquisou e encontrou uma maneira de identificar se
//uma sequência de números inteiros representa uma montanha com mais de um pico, ou com apenas
//um pico.

// Ele observou que, como não há números consecutivos iguais, se houver três números
//consecutivos na sequência, tal que o número do meio é menor do que os outros dois números, então a
//montanha tem mais de um pico.

// Caso contrário, a montanha tem apenas um pico. De forma mais
//rigorosa, se a sequência é A = [A1;A2;A3; ...; AN], ele quer saber se há uma posição i, para 2 <= i <=
//N - 1, tal que Ai-1 > Ai e Ai < Ai+1.

//Para ajudar o gerente, seu programa deve determinar, dada a sequência de números inteiros
//representando a montanha, se ela tem mais de um pico, ou se tem um pico apenas.

//A primeira linha da entrada contém um inteiro N, representando o tamanho da sequência. A segunda
//linha contém N inteiros Ai, 1 <=1 i <= N, representando a sequência de alturas da montanha.

//Seu programa deve imprimir uma linha contendo o caractere “S” se há mais de um pico, ou o caractere
//“N” se há apenas um pico

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Diogo_Vetores_16 {




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd= new Random();
        System.out.println("Digite a quantidade de sequencias ");
        int n = in.nextInt();
        int []A= new int[n];
        boolean pico = false;




        for ( int i= 0 ; i< A.length;i++){
            A[i]= rnd.nextInt(0  , 100);
        }
        System.out.println(Arrays.toString(A));


        for (int x = 1 ; x<A.length-1 ;x++){
            if (A[x-1] > A[x] && A[x+1] < A[x]) {
                pico = true;

                break;
            }


        }
        if (pico){
            System.out.println("S");
        }
        else {
            System.out.println("N");
        }
        System.out.println(Arrays.toString(A));




    }
}
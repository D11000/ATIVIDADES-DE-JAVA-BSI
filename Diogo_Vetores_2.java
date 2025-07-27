//2. Faça um algoritmo em java que preencha dois vetores de 10 posições e exiba um terceiro vetor resultante
//em que cada posição é a soma das posições dos outros vetores. Exemplo
//vet1 = [10 27 3 -4 -6 -19 6 9 14 53 ]
//vet2 = [ 0 -7 6 4 -5 15 -6 19 1 47 ]
// vet3 = [10 20 9 0 -11 -4 0 28 15 100 ]
import java.util.Arrays;
import java.util.Scanner;
public class Diogo_Vetores_2 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        int[] vet1= new int[10];
        int[] vet2= new int[10];
        int[] vet3= new int[10];
        for(int i=0 ; i < vet1.length ;i++){

            System.out.println("Digite os numeros do vetor 1");
            vet1[i]= in.nextInt();
            System.out.println("Digite os numeros vetor 2");
            vet2[i]= in.nextInt();
            vet3[i]= vet2[i]+vet1[i];



        }
        System.out.println("Vetor 1 = " + Arrays.toString(vet1));
        System.out.println("Vetor 1 = " +Arrays.toString(vet2));
        System.out.println("Vetor 1 = " +Arrays.toString(vet3));




    }
}

//3. Construa um programa JAVA que preenche dois vetores reais de 10 posições, depois crie um terceiro
//vetor cujo conteúdo de cada posição é : 1, se o número armazenado em uma posição do vetor é o mesmo
//armazenado na posição respectiva do 2º, e 0, caso contrário.
import java.util.Arrays;
import java.util.Scanner;
public class Diogo_Vetores_3 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        int[] vetor1= new int[10];
        int[] vetor2= new int[10];
        int[] vetor3= new int[10];

        for(int i=0 ; i < vetor1.length ;i++){
            System.out.println("Digite os valores do vetor 1:");
            vetor1[i]=in.nextInt();

            System.out.println("Digite os valores do vetor 2:");
            vetor2[i]=in.nextInt();

            if (vetor1[i]==vetor2[i]){
                vetor3[i]= 1;

            }
            else {
                vetor3[i]=0;
            }









        }
        System.out.println("Vetor 3 :" + Arrays.toString(vetor3));


    }
}

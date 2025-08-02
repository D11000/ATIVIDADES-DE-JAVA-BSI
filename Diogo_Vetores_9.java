//9. Escreva um programa que leia um conjunto de 50 fichas correspondente à alunos e armazene-as em
//vetores, cada uma contendo, a altura e o código do sexo de uma pessoa (código = 1 se for masculino e 2
//se for feminino), e calcule e imprima:
//- A maior, menor e a médias das alturas da turma;
//- As mulheres com altura acima da média da altura dos homens;
//- Os homens com altura abaixo da média da altura das mulheres;
//- As pessoas com altura abaixo da média da turma

import java.util.Arrays;
import java.util.Random;

public class Diogo_Vetores_9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] altura = new int[5];
        int[] cod = new int[5];
        double media = 0;
        int maior=0;
        int menor =0;


        for (int i = 0; i <5 ; i++){
            altura[i]= rand.nextInt(150 , 200);
            cod[i]= rand.nextInt(1 ,3);
            media += altura[i] / 5;

        }
        maior= Math.max(altura[0],altura[4]);
        menor = Math.min(altura[0], altura[4]);


        System.out.println(Arrays.toString(altura) +"\n"+ Arrays.toString(cod) +"\n" +maior +"\n"+ ""+ menor );
        System.out.println(media);


    }
}

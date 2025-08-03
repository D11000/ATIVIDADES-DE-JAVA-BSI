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
        double media_mulher = 0;
        double media_homem = 0;
        int alturaM=0;
        int alturaH=0;
        int contM=0;
        int contF=0;
        int SmH =0;
        int SmM =0;



        for (int i = 0; i <5 ; i++){
            altura[i]= rand.nextInt(150 , 200);
            cod[i]= rand.nextInt(1 ,3);

            if (cod[i]==1){
                contM=1+contM;
            }

            if (cod[i]==2){
                contF=1+contF;
            }

            if (cod[i]==1 ){
                alturaH=altura[i];
                System.out.println("altura masculina "+alturaH);

                SmH += alturaH;

            }

            if (cod[i]==2 ){
                alturaM=altura[i];
                System.out.println("Altura feminina "+alturaM);
                SmM += alturaM;

            }
            media += (double) altura[i] / altura.length;
            media_homem=  (double) SmH /contM;
            media_mulher=  (double) SmM /contF;
            if ( alturaM>  media_homem){
                if (cod[i]==2) {
                    System.out.println("-----altura fora da media------"+ alturaM);


                }



            }
            if ( alturaH < media_mulher){
                if (cod[i]==1) {
                    System.out.println("-----altura fora da media msc------"+ alturaH);


                }




            }

            if ( altura[i] < media){
                System.out.println("A altura que é menor que a media da tur é "+ altura[i]);
            }
        }
        maior= Math.max(altura[0],altura[4]);
        menor = Math.min(altura[0], altura[4]);


        System.out.println("A maior altura é: "+maior +"\n"+ "A menor altura é : "+ menor );
        System.out.println("A media da turma é  : "+ media);
        System.out.println("Media da altura dos homens "+ media_homem + " " + "Media da altura das mulher "+ media_mulher);
        System.out.println("Alturas : "+Arrays.toString(altura) +"\n"+ "Codigos "+ Arrays.toString(cod)  );




    }

}

//1. Uma turma tem 40 alunos. Faça um programa para ler a idade de todos os alunos e logo em seguida
//imprimir:
//a) Total de alunos com idade menor ou igual a 16 anos
//b) Total de alunos com idade maior que 16 anos
//c) Média das idades
//d) Idade do aluno mais novo
//e) Idade do aluno mais velho
import java.util.Scanner;
public class Diogo_vetores1 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int idade[]= new int[40];
     double media=0, media_final=0;
     int aluno_velho=0  ;
     int aluno_novo=0 ;
     int maior16=0;
     int menor16=0;



         for ( int i = 1 ; i <idade.length ; i++){
             System.out.println("Digite a idade ");

             idade[i]= in.nextInt();


             if(i ==1 ){
                 aluno_velho= idade[i];
                 aluno_novo= idade[i];



             }
             if(idade[i] <= 16 ){
                 menor16++;



             }
             if(idade[i] >  16 ){
                 maior16++;




             }
             media+= idade[i];










         }

        System.out.println("O maior valor "+Math.max(idade[4],aluno_novo));
        System.out.println("O maior valor "+Math.min(aluno_velho,idade[4]));
        System.out.println(" A quantidade maior de 16 é "+maior16);
        System.out.println(" A quantidade menor de 16 é "+menor16);


        media_final= media/4;
        System.out.println("A media é "+ media_final);

    }
}
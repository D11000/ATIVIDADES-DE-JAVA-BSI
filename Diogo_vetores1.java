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
     int idade[]= new int[5];

         for ( int i = 1 ; i <idade.length ; i++){
             System.out.println("Digite a idade ");

             idade[i]= in.nextInt();

             if (idade[i] <= 16){
                 System.out.println(idade[i]);

             }



         }
    }
}
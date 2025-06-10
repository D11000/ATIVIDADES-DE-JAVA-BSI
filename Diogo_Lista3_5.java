//5. Faça um programa que solicite ao usuário que digite um caracter e em seguida imprima se o caracter
//digitado é ou não uma vogal.
import java.util.Scanner;
public class Diogo_Lista3_5 {
    public static void main (String[] args){
        Scanner ent= new Scanner(System.in);
        System.out.println("Digite um caracter");


        String caractere= ent.next();
        String vogal ="a,e,i,o,u";
        switch (caractere){
            case "a":
                System.out.println("É vogal");
                break;
            case "e":
                System.out.println("É vogal");
                break;
            case "i":
                System.out.println("É vogal");
                break;
            case "o":
                System.out.println("É vogal");
                break;
            case "u":
                System.out.println("É vogal");
                break;
            default:
                System.out.println("Não é vogal");
                break;
        };


    }
}

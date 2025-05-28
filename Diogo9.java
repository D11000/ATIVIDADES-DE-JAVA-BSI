import java.util.Scanner;

public class Diogo9 {
    public static void main(String[] args){
        Scanner ent= new Scanner(System.in);
        int D,N;

        System.out.println("DIGITE O NúMERO DE LADOS");
        N= ent.nextInt();
        D=N*(N-3)/2;
        System.out.println("O NúMERO DE LADOS É :"+ D);
    }


}

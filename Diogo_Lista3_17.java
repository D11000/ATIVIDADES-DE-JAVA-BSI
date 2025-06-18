import java.util.Scanner;
public class Diogo_Lista3_17 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Dige um numero");
        int num = ent.nextInt();
        System.out.println("Dige um numero");
        int num2 = ent.nextInt();
        System.out.println("Dige um numero");
        int num3 = ent.nextInt();
        if (num > num2) {
            int temp = num;
            num = num2;
            num2 = temp;

        }
        if(num > num3) {
            int temp = num;
            num = num3;
            num3 = temp;
        }
        if(num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("Ordem crescente : " + num+ num2+num3);
        System.out.println("Ordem decrescente : " + num3+ num2+num);
    }

}

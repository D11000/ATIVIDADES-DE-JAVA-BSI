//19. Faça um algoritmo que receba o salário base e o tempo de serviço de um funcionário. Calcule e mostre:
//(i) O imposto, conforme tabela:
//(ii) A gratificação em porcentagem, conforme tabela:
//(iii) O salário líquido, ou seja, salário base menos imposto mais gratificação
//(iv) A categoria que está na tabela a seguir:
import java.util.Scanner;
public class Diogo_Lista3_19 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do salario");
        double salario = in.nextDouble();
        System.out.println("Digite o tempo de contribuição");
        double tempo = in.nextDouble();

        if (salario < 200 ){
            System.out.println("Isento de imposto"+"O valor é : "+ salario);
        }
        //----------------------------------------------------------//



        if (salario >= 200 && salario < 450){
            double imp = salario*0.03;
            double salimp = salario-imp;
            System.out.println("O valor final é "+salimp);

            if (salimp >500 && tempo <=3 ){
                double grat = salimp * 0.2;
                double salFnl = salimp+grat;
                System.out.println("O Salario final é "+salFnl);
                //---------------------------------//
                if (salFnl <= 350){
                    System.out.println("Classe A");

                }
                else if (salFnl >= 350 && salFnl <= 600) {
                    System.out.println("Classe B");

                }
                else if ( salFnl > 600) {
                    System.out.println("Classe C");

                }
                //--------------------------------//

            }
            else if (salimp > 500 && tempo >3) {
                double grat = salimp * 0.3;
                double salFnl = salimp + grat;
                System.out.println("O Salario final é " + salFnl);
                if (salFnl <= 350){
                    System.out.println("Classe A");

                }
                else if (salFnl >= 350 && salFnl <= 600) {
                    System.out.println("Classe B");

                }
                else if ( salFnl > 600) {
                    System.out.println("Classe C");

                }
                //--------------------------------//

            }
            //------------------------------------------------------//
            else if (salimp <= 500 && tempo <= 3){
                double grat = salimp * 0.23;
                double salFnl = salimp + grat;
                System.out.println("O Salario final é " + salFnl);
                if (salFnl <= 350){
                    System.out.println("Classe A");

                }
                else if (salFnl >= 350 && salFnl <= 600) {
                    System.out.println("Classe B");

                }
                else if ( salFnl > 600) {
                    System.out.println("Classe C");

                }
                //--------------------------------//

            }
            else if (salimp <= 500 && tempo >= 3 && tempo <=6){
                double grat = salimp * 0.35;
                double salFnl = salimp + grat;
                System.out.println("O Salario final é " + salFnl);
                if (salFnl <= 350){
                    System.out.println("Classe A");

                }
                else if (salFnl >= 350 && salFnl <= 600) {
                    System.out.println("Classe B");

                }
                else if ( salFnl > 600) {
                    System.out.println("Classe C");

                }
                //--------------------------------//

            } else if (salimp <= 500 &&  tempo >= 6) {
                double grat = salimp * 0.33;
                double salFnl = salimp + grat;
                System.out.println("O Salario final é " + salFnl);
                if (salFnl <= 350){
                    System.out.println("Classe A");

                }
                else if (salFnl >= 350 && salFnl <= 600) {
                    System.out.println("Classe B");

                }
                else if ( salFnl > 600) {
                    System.out.println("Classe C");

                }
                //--------------------------------//
            }

        }
        //------------------------------------------------//

        if (salario >=450 && salario <= 750  ){
            double imp = salario*0.08;
            double salimp = salario-imp;
            System.out.println("O valor final é "+salimp);
            if (salimp >500 && tempo <=3 ){
                double grat = salimp * 0.2;
                double salFnl = salimp+grat;
                System.out.println("O Salario final é "+salFnl);
                if (salFnl <= 350){
                    System.out.println("Classe A");

                }
                else if (salFnl >= 350 && salFnl <= 600) {
                    System.out.println("Classe B");

                }
                else if ( salFnl > 600) {
                    System.out.println("Classe C");

                }
                //--------------------------------//

            }
            else if (salimp > 500 && tempo >3) {
                double grat = salimp * 0.3;
                double salFnl = salimp + grat;
                System.out.println("O Salario final é " + salFnl);
                if (salFnl <= 350){
                    System.out.println("Classe A");

                }
                else if (salFnl >= 350 && salFnl <= 600) {
                    System.out.println("Classe B");

                }
                else if ( salFnl > 600) {
                    System.out.println("Classe C");

                }
                //--------------------------------//

            }
            //------------------------------------------------------//
            else if (salimp <= 500 && tempo <= 3){
                double grat = salimp * 0.23;
                double salFnl = salimp + grat;
                System.out.println("O Salario final é " + salFnl);
                if (salFnl <= 350){
                    System.out.println("Classe A");

                }
                else if (salFnl >= 350 && salFnl <= 600) {
                    System.out.println("Classe B");

                }
                else if ( salFnl > 600) {
                    System.out.println("Classe C");

                }
                //--------------------------------//

            }
            else if (salimp <= 500 && tempo >= 3 && tempo <=6){
                double grat = salimp * 0.35;
                double salFnl = salimp + grat;
                System.out.println("O Salario final é " + salFnl);
                if (salFnl <= 350){
                    System.out.println("Classe A");

                }
                else if (salFnl >= 350 && salFnl <= 600) {
                    System.out.println("Classe B");

                }
                else if ( salFnl > 600) {
                    System.out.println("Classe C");

                }
                //--------------------------------//

            } else if (salimp <= 500 &&  tempo >= 6) {
                double grat = salimp * 0.33;
                double salFnl = salimp + grat;
                System.out.println("O Salario final é " + salFnl);
                if (salFnl <= 350){
                    System.out.println("Classe A");

                }
                else if (salFnl >= 350 && salFnl <= 600) {
                    System.out.println("Classe B");

                }
                else if ( salFnl > 600) {
                    System.out.println("Classe C");

                }
                //--------------------------------//
            }


        }
        //-------------------------------------------------//



        if ( salario >= 750  ){
            double imp = salario*0.12;
            double salimp = salario-imp;
            System.out.println("O valor final é "+salimp);
            if (salimp >500 && tempo <=3 ){
                double grat = salimp * 0.2;
                double salFnl = salimp+grat;
                System.out.println("O Salario final é "+salFnl);
                if (salFnl <= 350){
                    System.out.println("Classe A");

                }
                else if (salFnl >= 350 && salFnl <= 600) {
                    System.out.println("Classe B");

                }
                else if ( salFnl > 600) {
                    System.out.println("Classe C");

                }
                //--------------------------------//

            }
            else if (salimp > 500 && tempo >3) {
                double grat = salimp * 0.3;
                double salFnl = salimp + grat;
                System.out.println("O Salario final é " + salFnl);
                if (salFnl <= 350){
                    System.out.println("Classe A");

                }
                else if (salFnl >= 350 && salFnl <= 600) {
                    System.out.println("Classe B");

                }
                else if ( salFnl > 600) {
                    System.out.println("Classe C");

                }
                //--------------------------------//

            }
            //------------------------------------------------------//
            else if (salimp <= 500 && tempo <= 3){
                double grat = salimp * 0.23;
                double salFnl = salimp + grat;
                System.out.println("O Salario final é " + salFnl);
                if (salFnl <= 350){
                    System.out.println("Classe A");

                }
                else if (salFnl >= 350 && salFnl <= 600) {
                    System.out.println("Classe B");

                }
                else if ( salFnl > 600) {
                    System.out.println("Classe C");

                }
                //--------------------------------//

            }
            else if (salimp <= 500 && tempo >= 3 && tempo <=6){
                double grat = salimp * 0.35;
                double salFnl = salimp + grat;
                System.out.println("O Salario final é " + salFnl);
                if (salFnl <= 350){
                    System.out.println("Classe A");

                }
                else if (salFnl >= 350 && salFnl <= 600) {
                    System.out.println("Classe B");

                }
                else if ( salFnl > 600) {
                    System.out.println("Classe C");

                }
                //--------------------------------//

            } else if (salimp <= 500 &&  tempo >= 6) {
                double grat = salimp * 0.33;
                double salFnl = salimp + grat;
                System.out.println("O Salario final é " + salFnl);
                if (salFnl <= 350){
                    System.out.println("Classe A");

                }
                else if (salFnl >= 350 && salFnl <= 600) {
                    System.out.println("Classe B");

                }
                else if ( salFnl > 600) {
                    System.out.println("Classe C");

                }
                //--------------------------------//
            }
            //--------------------------------------------------//


        }




    }
}

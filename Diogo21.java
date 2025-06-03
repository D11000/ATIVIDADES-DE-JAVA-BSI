import java.util.Scanner;


public class Diogo21 {
    public static void main(String[] args)
    {
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite a medida do angulo: ");
        double Angulo = ent.nextDouble();

        System.out.println("Digite a altura da parede: ");
        double Altura = ent.nextDouble();

        double Pi = 3.14;
        double seno = Math.sin(Angulo);
        double Convradiano = (Pi*seno)/180;

        double Medida = Altura/Convradiano;

        System.out.format("A medida da escada é igual a : %.2f", Medida);



    }
}
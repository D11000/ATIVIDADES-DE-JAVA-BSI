//22. O valor aproximado de PI pode ser calculado usando os 51 primeiros termos da seguinte série:
//S= 1-1/3³+1/5³+1/7³+1/9³
//Sendo PI =³√Sx23 . Sabendo disso, implemente um algoritmo que calcule e imprima o valor de PI
//utilizando a série apresentada.
public class DiogoLista4_22 {
    public static void main(String[] args) {
        double S = 0.0;
        int sinal = 1;

        for (int i = 1, contador = 0; contador < 51; i += 2, contador++) {
            S += sinal * 1.0 / Math.pow(i, 3);
            sinal *= -1;
        }


        double pi = Math.cbrt(S * 32);

        System.out.printf("Valor aproximado de PI: %.10f\n", pi);
    }
}
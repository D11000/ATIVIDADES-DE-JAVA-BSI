//Vf=Vi(1+R)^T

public class Diogo10 {
    public static void  main (String[] args)
    {


        double Vi,R,T, Vf;
        Vi=2000;
        R=0.05;
        T=24;
        Vf=Vi*Math.pow(1+R,T);
        System.out.println("o valor de investimento é :" +Vf);
    }
}

import  java.awt.Toolkit;
public class relogio {
    public static void main(String[] args) {
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        while (true) {

            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
            Toolkit.getDefaultToolkit().beep();


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }


            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }

            if (minutos == 60) {
                minutos = 0;
                horas++;
            }

            if (horas == 24) {
                horas = 0;
            }
        }
    }
}


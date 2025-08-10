//17. O comitê olímpico está testando uma nova forma de pontuar as competições de arco e flecha, baseada em
//penalidades. O atleta vai atirar N flechas no alvo, em sequência. A penalidade da K-ésima flecha atirada é
//computada imediatamente após ela atingir o alvo, antes do próximo lançamento, e é igual ao número de
//flechas que estão no alvo naquele momento cuja distância ao centro do alvo é menor ou igual à distância
//da K-ésima flecha ao centro, excluindo a própria K-ésima flecha. Quer dizer, a penalidade é o número das
//K  1 flechas lançadas antes da K-ésima flecha que estão mais próximas ou à mesma distância do centro
//do alvo, comparadas com a K-ésima flecha. A penalidade total é a soma das penalidades das N flechas.
//Ganha o atleta que tiver a menor penalidade total ao final. Veja que a penalidade total pode ser zero, se o
//atleta for bom o bastante para acertar numa sequência estritamente decrescente de distâncias ao centro do
//alvo.
//Neste problema, o centro do alvo está na origem (0; 0). Dada a sequência de
//coordenadas dos pontos em que as sucessivas flechas atingiram o alvo, seu
//programa deve computar a penalidade total final do atleta.
//Entrada
//A primeira linha da entrada contém um inteiro N, representando a quantidade
//de flechas lançadas. Cada uma das N linhas seguintes contém dois inteiros, X
//e Y , indicando as coordenadas do ponto em que cada flecha atingiu o alvo,
//definindo a sequência de lançamentos.
//Saída
//Imprima uma linha contendo um inteiro representando a penalidade total do atlet
import java.util.Arrays;
import java.util.Random;


public class Diogo_Vetores_17 {
    public static void main(String[] args) {
        Random rand = new Random();
        int N= rand.nextInt(1,10);
        int [] x= new int[N];
        int [] y= new int[N];
        int [] distancia = new int[N];
        int penalidade =0;
        int penalidadefinal=0;

        for ( int i =0 ;i < N ; i++){
            x[i]= rand.nextInt(1,10) ;
            y[i]=rand.nextInt(1,10);
            distancia[i]= x[i]*x[i]+y[i]*y[i];
        }
        //*DEBUG*
        //System.out.println(Arrays.toString(distancia));
        //System.out.println(N);
        //System.out.println(Arrays.toString(x) + " " +Arrays.toString(y) );

        for(int i = 0;i<N;i++){
            for(int k=0 ; k<N ; k++){
                if (distancia[k] < distancia[i]){
                    penalidade++;
                }

            }
            penalidadefinal+= penalidade;
        }
        System.out.println(penalidadefinal);




    }





}




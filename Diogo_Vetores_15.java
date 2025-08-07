//15. Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os códigos de dez contas
//e seus respectivos saldos. Os códigos devem ser armazenados em um vetor de números inteiros (não pode
//haver mais de uma conta com o mesmo código) e os saldos devem ser armazenados em um vetor de
//números reais. O saldo deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504
//foi armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta posição do vetor
//de saldos. Depois de fazer uma leitura dos valores, deverá aparecer o seguinte menu na tela:

//Menu de Operações
//1. Efetuar depósito
//2. Efetuar saque
//3. Consultar saldo em conta;
//4. Finalizar o programa

//- Para efetuar o depósito, deve-se solicitar o código da conta e o valor a ser depositado. Se a conta não estiver
//cadastrada, deverá aparecer a mensagem “Conta não encontrada!” e voltar ao menu. Se a conta existir,
//atualizar o seu saldo;
//- Para efetuar saque, deve-se solicitar o código da conta e o valor a ser sacado. Se a conta não estiver
//cadastrada, deverá aparecer a mensagem “Conta não encontrada!” e voltar ao menu. Se a conta existir,
//verificar se o seu saldo é suficiente para cobrir o saque. (Suponha que a conta não possa ficar com saldo
//negativo). Se o saldo for suficiente, realizar o saque e voltar ao menu. Caso contrário, mostrar a mensagem
//“Saldo insuficiente!” e voltar ao menu.
//- Para consultar saldo em conta, deve-se solicitar o código da conta a ser pesquisada Se a conta não estiver
//cadastrada, deverá aparecer a mensagem “Conta não encontrada!”; senão, mostrar a conta com seu respectivo
//saldo e voltar ao menu;
//- O programa termina quando for digitada a opção 4 – Finalizar o programa.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Diogo_Vetores_15 {




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd= new Random();
        int []contas= new int[10];
        int [] saldos= new int[10];
        int cod = 0;
        int valor =0;
        int contaV=0;
        int op =0;
        int dep=0;
        int consulta= 0 ;


        for ( int i= 0 ; i< contas.length;i++){
            contas[i]= rnd.nextInt(0 ,1000);




        }
        System.out.println(Arrays.toString(contas));
        System.out.println(Arrays.toString(saldos));










        while (op!=4 ){
            System.out.println("Digite a opção");
            op = in.nextInt();
            contaV=0;

            if (op== 1 ){

                System.out.println("Digite o codigo da conta :");
                cod= in.nextInt();

                for (int j= 0; j < contas.length; j++){
                    if (contas[j]==cod){
                        contaV=1;

                        break;
                    }

                }

                if (contaV==1){
                        //System.out.println("Conta encontrada");
                    System.out.println("Digite o valor do deposito ");
                    valor= in.nextInt();
                   for ( int k= 0 ; k < contas.length;k++)
                    if (cod== contas[k]){
                        saldos[k]= valor+saldos[k];






                    }



                }
                    else {
                        System.out.println("Conta Não encontrada");

                    }







            }

            else if (op == 2) {
                System.out.println("Digite o codigo da conta :");
                cod= in.nextInt();

                for (int j= 0; j < contas.length; j++){
                    if (contas[j]==cod){
                        contaV=1;

                        break;
                    }

                }

                if (contaV==1){
                   // System.out.println("Conta encontrada");
                    System.out.println("Digite o valor do saque ");
                    valor= in.nextInt();
                    for ( int k= 0 ; k < contas.length;k++)
                        if (cod== contas[k]){

                            if (saldos[k] < valor){
                                System.out.println("Saldo insuficiente");


                            }
                            else {
                                saldos[k]= saldos[k]-valor ;

                            }


                        }



                }
                else {
                    System.out.println("Conta Não encontrada");

                }


            }




            else if (op == 3) {
                System.out.println("Digite o codigo da conta que você quer consltar o saldo :");
                cod= in.nextInt();

                for (int j= 0; j < contas.length; j++){
                    if (contas[j]==cod){
                        contaV=1;

                        break;
                    }

                }

                if (contaV==1){
                    //System.out.println("Conta encontrada");


                    for ( int k= 0 ; k < contas.length;k++)
                        if (cod== contas[k]){
                            consulta=saldos[k];
                            System.out.println(consulta);

                            break;
                        }




                }
                else {
                    System.out.println("Conta Não encontrada");

                }
            }


            //System.out.println(Arrays.toString(saldos));



        }



    }
}
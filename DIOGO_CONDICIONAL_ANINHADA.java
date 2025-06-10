//● Crie um programa Java que simule um sistema de acesso a um aplicativo. O
//programa deve pedir ao usuário um nome de usuário (String) e uma senha
//(numérica).
//As condições para acesso devem ser:
//● O nome de usuário deve ser "admin".
//● A senha deve ser "12345".
//○ Se as duas condições forem verdadeiras, exiba a mensagem
//"Acesso concedido. Bem-vindo, admin!".
//○ Se apenas o nome de usuário estiver correto, mas a senha não,
//exiba "Senha incorreta.".
//○ Se o nome de usuário estiver incorreto (independentemente da
//senha), exiba "Usuário não encontrado.".
//Dica: Use a classe Scanner para obter a entrada do usuário e o método .equals()
//(visto ontem) para comparar strings.
import java.util.Scanner;
public class DIOGO_CONDICIONAL_ANINHADA {
    public static void main(String[] args) {
            Scanner ent= new Scanner(System.in);
        System.out.println("Hello, World!");
        int senha_correta= 12345;
        String usuario_correto="admin";
        String usuario= ent.nextLine();
        int senha = ent.nextInt();


        if(usuario.equals(usuario_correto)){
            if (senha== (senha_correta)){
                System.out.println("Acesso consedico. Bem vindo , Admin");
            }
            else {
                System.out.println("Senha incorreta");
            }

        }
        else {
            System.out.println("Usuario não encontrado");

        }






    }
}
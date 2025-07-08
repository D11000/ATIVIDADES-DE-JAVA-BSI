//Realize o cadastro de um usuario com as seguintes informações
//- Nome:Deve possuir mais de 2 caracteres
//- Idade : Deve estar entre 0 e 150
//- Email: Deve possuir o caracter arroba e ".com"
//- Senha : Deva conter número, letra maiscula, letra minuscula e caracter especial('#','*','_','!','@')
//Utilize as funções da classe Character
//-isUpperCase
//-isLowerCase
//isDigit
//---------------------------------------------------------------//
import java.util.Scanner;

public class Manipulacao_String{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String nome;
        do {
            System.out.print("Digite o nome: ");
            nome = in.nextLine();
            if (nome.length() <= 2) {
                System.out.println("O Nome deve ter mais de 2 caracteres.");
            }
        } while (nome.length() <= 2);


        int idade;
        do {
            System.out.print("Digite a idade: ");
            idade = in.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("A Idade deve estar entre 0 e 150.");
            }
        } while (idade < 0 || idade > 150);

        in.nextLine();


        String email;
        do {
            System.out.print("Digite o email: ");
            email = in.nextLine();
            if (!email.contains("@") || !email.contains(".com")) {
                System.out.println("O Email inválido. Deve conter '@' e '.com'.");
            }
        } while (!email.contains("@") && !email.contains(".com"));


        String senha;
        do {
            System.out.print("Digite a senha: ");
            senha = in.nextLine();

            boolean Maiuscula = false;
            boolean Minuscula = false;
            boolean Numero = false;
            boolean Especial = false;

            for (char c : senha.toCharArray()) {
                if (Character.isUpperCase(c)) Maiuscula = true;
                else if (Character.isLowerCase(c)) Minuscula = true;
                else if (Character.isDigit(c)) Numero = true;
                else if ("#*_!@".indexOf(c) != -1) Especial = true;
            }

            if (!Maiuscula || !Minuscula || !Numero || !Especial) {
                System.out.println("Senha inválida. Deve conter: Pelo menos uma letra maiúscula uma letra maiuscula um numero e um caractere especial (#', '*', '_', '!', '@)");

            } else {
                break;
            }

        } while (true);


        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);

    }
}

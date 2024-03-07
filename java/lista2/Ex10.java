package lista2;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        boolean validade = false;
        String senha = "";
        String senhaReal = "abc123";
        Scanner sc = new Scanner(System.in);

        while(!validade) {
            System.out.print("Insira a senha: ");
            senha = sc.nextLine();

            if(senha.equalsIgnoreCase(senhaReal))  {
                System.out.println("Boas vindas ao Java! :D\nVocê acertou a senha...");
                validade = true;
            } else {
                System.out.print("Senha incorreta\n");
            }
        }
        sc.close();
    }
}

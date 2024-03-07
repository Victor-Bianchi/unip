package lista2;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int idadeUsuario = 0;
        int total = 0;
        int cont015 = 0;
        int cont1630 = 0;
        int cont3145 = 0;
        int cont4660 = 0;
        int cont60plus = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite a sua idade: ");
            idadeUsuario = sc.nextInt();
            if (idadeUsuario >= 0 && idadeUsuario <= 15) {
                cont015++;
            } else if (idadeUsuario >= 16 && idadeUsuario <= 30) {
                cont1630++;
            } else if (idadeUsuario >= 31 && idadeUsuario <= 45) {
                cont3145++;
            } else if (idadeUsuario >= 46 && idadeUsuario <= 60) {
                cont4660++;
            } else if (idadeUsuario >= 61) {
                cont60plus++;
            } else {
                System.out.println("Idade inválida! Por favor, insira uma idade verdadeira (desconsiderado, pulado)");
            }
        }
        sc.close();
    
        total = cont015 + cont1630 + cont3145 + cont4660 + cont60plus;
    
        System.out.println(cont015 / total * 100);
        System.out.println(cont1630 / total * 100);
        System.out.println(cont3145 / total * 100);
        System.out.println(cont4660 / total * 100);
        System.out.println(cont60plus / total * 100);
        System.out.println(total);
    }
    
}

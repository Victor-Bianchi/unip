package lista1;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        double valor;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do item: ");
        valor = sc.nextDouble();
        valor = Math.ceil(valor * 0.75);
        System.out.println("O valor final do item com desconto é de: R$ " + valor);
        sc.close();
    }
}

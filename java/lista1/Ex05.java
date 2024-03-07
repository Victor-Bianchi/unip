package lista1;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número (A): ");
        a = sc.nextInt();
        System.out.print("Digite o segundo número (B): ");
        b = sc.nextInt();
        sc.close();

        if(a > b) {
            System.out.println("A é maior que B");
        } else if(a == b) {
            System.out.println("A é igual a B");
        } else {
            System.out.println("A é menor que B");
        }
    }
}

package lista2;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int contador = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o número mínimo: ");
        min = sc.nextInt();
        System.out.print("Insira o número máximo: ");
        max = sc.nextInt();
        sc.close();

        for(int i=min;i<=max;i++) {
            contador += i;
        }

        System.out.println(contador);
    }
}

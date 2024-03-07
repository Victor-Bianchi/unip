package lista2;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
       int max = 0;
        int i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número máximo da contagem: ");
        max = sc.nextInt();
        sc.close();

        while (i <= max) {
            System.out.println(i);
            i++;
        }
    }
}

package lista2;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int numero = 0;
        int soma = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<20;i++) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if(numero % 2 == 0) {
                soma += numero;
            } else {
                continue;
            }
        }
        
        sc.close();
        System.out.println(soma);
    }
}

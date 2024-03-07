package lista2;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int soma = 0;
        int numeroAtual = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Insira um número inteiro e positivo: ");
            numeroAtual = sc.nextInt();
            if(numeroAtual % 2 == 0 && numeroAtual >= 0) {
                soma += numeroAtual;
            }
        } while(numeroAtual >= 0);
        sc.close();
        System.out.println("Soma: " + soma);
    }
}

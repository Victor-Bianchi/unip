package lista1;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int numeroInicial;
        int numeroFinal;
        int somaFinal = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial para fazer a soma: ");
        numeroInicial = sc.nextInt();
        System.out.print("Digite o número final para fazer a soma: ");
        numeroFinal = sc.nextInt();
        sc.close();

        for(int i = numeroInicial;i <= numeroFinal;i++) {
            somaFinal += i;
        }

        System.out.println("O valor final da soma é: " + somaFinal);
    }
}

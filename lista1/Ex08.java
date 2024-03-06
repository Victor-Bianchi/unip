package lista1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {
    /**
     * Escreva um programa em Java que receba, como entrada, um número inteiro N e calcule a soma dos N primeiros números da sequência de Fibonacci.
     * A sequência de Fibonacci é (1, 1, 2, 3, 5, ...).
     * @author Victor Bianchi
     * @param args
     */
    public static void main(String[] args) {
        int numeroEntrada = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número N para o cálculo da sequência de Fibonacci: ");
        numeroEntrada = sc.nextInt();
        sc.close();

        int[] fibonacci = new int[numeroEntrada + 1];
        
        for(int i = 0; i <= numeroEntrada; i++) {
            if(i == 0 || i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
        }

        System.out.println(Arrays.toString(fibonacci));
    }
}

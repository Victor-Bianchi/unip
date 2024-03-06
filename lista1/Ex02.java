package lista1;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        double r;
        double v;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do raio da esfera: ");
        r = sc.nextDouble();
        v = Math.ceil(4 * (Math.PI * Math.pow(r, 3)) / 3);
        System.out.println("O valoume da esfera é: " + v);
        sc.close();
    }
}

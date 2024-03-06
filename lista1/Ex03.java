package lista1;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        double b;
        double h;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da base do triângulo: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor da altura do triângulo: ");
        h = sc.nextDouble();
        area = Math.ceil((b*h)/2);
        System.out.println("A área do triângulo é: " + area);
        sc.close();
    }
}

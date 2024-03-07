package lista1;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        char sexo;
        double h;
        double peso = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu sexo (M|F): ");
        sexo = sc.nextLine().charAt(0);
        
        System.out.print("Digite a sua altura: ");
        h = sc.nextDouble();

        sc.close();

        switch (sexo) {
            case 'M':
                peso = (72.7 * h) - 58;
                break;
            case 'F':
                peso = (62.1 * h) - 44.7;
                break;
            default:
                System.out.println("ERRO: Não foi possível identificar o seu sexo, digite M para masculino e F para feminino.");
                break;
        }

        peso = Math.ceil(peso);
        System.out.println("Seu peso ideal seria: " + peso + " kg");
    }
}
